import org.codehaus.groovy.grails.commons.GrailsClassUtils as GCU
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.codehaus.groovy.control.*
import org.springframework.core.io.FileSystemResource
import org.codehaus.groovy.grails.commons.GrailsApplication

target(createSFArtifact: "Creates a specific Grails artifact") {

    Ant.mkdir(dir: "${basedir}/${artifactPath}")

    // Extract the package name if one is given.
    def pkg = null
    def pos = name.lastIndexOf('.')
    if (pos != -1) {
        pkg = name[0..<pos]
        name = name[(pos + 1)..-1]
    }

    // Convert the package into a file path.
    def pkgPath = ''
    if (pkg) {
        pkgPath = pkg.replace('.' as char, '/' as char)

        // Make sure that the package path exists! Otherwise we won't
        // be able to create a file there.
        Ant.mkdir(dir: "${basedir}/${artifactPath}/${pkgPath}")

        // Future use of 'pkgPath' requires a trailing slash.
        pkgPath += '/'
    }

    // Convert the given name into class name and property name
    // representations.
    className = GCU.getClassNameRepresentation(name)
    propertyName = GCU.getPropertyNameRepresentation(name)
    artifactFile = "${basedir}/${artifactPath}/${pkgPath}${className}${typeName}.groovy"


    if (new File(artifactFile).exists()) {
        Ant.input(addProperty: "${name}.${typeName}.overwrite", message: "${artifactName} ${className}${typeName}.groovy already exists. Overwrite? [y/n]")
        if (Ant.antProject.properties."${name}.${typeName}.overwrite" == "n")
            return
    }

    // first check for presence of template in application
    templateFile = "${basedir}/src/templates/artifacts/${artifactName}.groovy"
    if (!new File(templateFile).exists()) {
        // now check for template provided by plugins
        def pluginTemplateFiles = resolveResources("plugins/*/src/templates/artifacts/${artifactName}.groovy")
        if (pluginTemplateFiles) {
            templateFile = pluginTemplateFiles[0].path
        } else {
            // template not found in application, use default template
            templateFile = "${grailsHome}/src/grails/templates/artifacts/${artifactName}.groovy"
        }
    }
    Ant.copy(file: templateFile, tofile: artifactFile, overwrite: true)
    Ant.replace(file: artifactFile,
            token: "@artifact.name@", value: "${className}${typeName}")
    if (pkg) {
        Ant.replace(file: artifactFile, token: "@artifact.package@", value: "package ${pkg}\n\n")
    }
    else {
        Ant.replace(file: artifactFile, token: "@artifact.package@", value: "")
    }

    // When creating a domain class, "typename" is empty. So, in order
    // to make the status message sensible, we have to pass something
    // else in.
    event("CreatedFile", [artifactFile])
    event("CreatedArtefact", [ typeName ?: "Domain Class", className])
}
