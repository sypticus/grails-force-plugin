import com.sforce.soap.partner.*;
import com.sforce.soap.partner.fault.*;
import com.sforce.soap.partner.sobject.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;

import org.springframework.beans.factory.InitializingBean;
import org.codehaus.groovy.grails.commons.ConfigurationHolder;

class SalesForceBaseService implements InitializingBean {
	
	def String userName
  def String pwd
  def Soap port
  def LoginResult loginResponse
  def boolean loggedIn
	
    void afterPropertiesSet() {
	   this.userName = ConfigurationHolder.config.salesforce.user
	   this.pwd = ConfigurationHolder.config.salesforce.password
	   this.loggedIn = login()
    }	
  

   // ----------------------- PRIVATE HELPER METHODS -----------------------------
 
    protected SObject fetch(String query){
	    if (!this.loggedIn) {
				if (!login()) {
					return null;
				}
			}
  	   if (query == null){
  		   return null
  	   }
       QueryResult qr = null;
      
       // call the query saving the results in qr
       try {
           qr = this.port.query(query);
       } catch (Exception e) {
    	   e.printStackTrace()
    	    login()
           qr = this.port.query(query);
       }
       if (qr != null){
    	   List<SObject> records = qr.getRecords();
           if (!records.isEmpty()) {
               for (SObject sobj : records) {
            	   return sobj;
               }
            }
       } else {
    	   return null;
       }
    }
   
   protected List<SObject> fetchAll(String query){
	    if (!this.loggedIn) {
				if (!login()) {
					return null;
				}
			}
			
  	 if (query == null){
  		   return null
  	 } 
     try { 
			 println "FetchAll Query: " + query
       QueryResult qr = this.port.query(query);
       if (qr != null){
          return qr.getRecords();
       }
		 } catch (Exception e) {
       	e.printStackTrace()
     }
			return null;
   }
  
   protected SaveResult create(SObject o){
	    if (!this.loggedIn) {
				if (!login()) {
					return null
				}
			}
			if (o == null){
				println "SObject passed for creation was null"
				return null
			}
	  try { 
	    SObject[] objects = new SObject[1];
	    objects[0] = o;
	    SaveResult[] saveResults = this.port.create(objects); 
	    if (saveResults != null){
	         // loop through the results, checking for errors
					 println "We have a SaveResult..."
	         for(SaveResult srt : saveResults){
	             if (srt.isSuccess()) {
	            	   println "Create Success"
	                 return srt;
	             } else {
	            	  for (Error er : srt.getErrors()){
	            		  log.error(er.getMessage())
						         System.out.println(er.getMessage())
					         }
	             }
	         }
	     } else {
		      log.error("The create SaveResult was null")
		      System.out.println("The create SaveResult was null"); 
	     }
	  } catch (Exception ex) { 
	    ex.printStackTrace()
    }
	  return null;
   }
   
   protected SaveResult update(SObject o){
	     if (!this.loggedIn) {
				if (!login()) {
					return null;
				}
			}
			try{
       SObject[] updates = new SObject[1];
       updates[0] = o;
       SaveResult[] saveResults = this.port.update(updates);
       if (saveResults != null){
	         for (SaveResult srt : saveResults) {
	             if (srt.isSuccess()) {
	            	   println "Update Success"
	                 return srt;
	             } else {
	            	  for (Error er : srt.getErrors()){
						        System.out.println(er.getMessage())
					        }
	             }
	          }
	       } else {
		        System.out.println("The create SaveResult was null"); 
	       }
	    } catch (Exception ex){
  	    ex.printStackTrace()
      }
	  return null;
  }
   
   protected delete(String id){
	    if (!this.loggedIn) {
				if (!login()) {
					return;
				}
			}
  	 def String[] deletes = new String[1]
  	 deletes[0] = id
  	 this.port.delete(deletes)
   }
   
   private delete(String[] ids){
	    if (!this.loggedIn) {
				if (!login()) {
					return;
				}
			}
  	 this.port.delete(ids)
   }
   
  
   protected boolean login(){
		// Provide feed back while we create the web service binding
		System.out.println("Creating the binding to the web service...");

		try {
			this.port = (SoapBindingStub) new SforceServiceLocator().getSoap();
		} catch (ServiceException ex) {
			System.out
					.println("ERROR: createing binding to soap service, error was: \n"
							+ ex.getMessage());
			System.out.print("Hit return to continue...");
			return false;
		}

		this.port.setTimeout(600000);

		// Attempt the login giving the user feedback
		System.out.println("LOGGING IN NOW....");
		try {
			this.loginResponse = this.port.login(this.userName, this.pwd);
		} catch (LoginFault lf) {
			System.out.println(lf.getExceptionMessage());
			return false;
		} catch (ApiFault af) {
			System.out.println(af.getExceptionMessage());
		} catch (RemoteException re) {
			System.out.println(re.getMessage());
			re.printStackTrace();
			return false;
		}

		this.port._setProperty(SoapBindingStub.ENDPOINT_ADDRESS_PROPERTY, this.loginResponse.getServerUrl());

		// Create a new session header object and set the session id to that
		// returned by the login
		SessionHeader sh = new SessionHeader();
		sh.setSessionId(this.loginResponse.getSessionId());
		this.port.setHeader(new SforceServiceLocator().getServiceName().getNamespaceURI(), "SessionHeader", sh);

    this.loggedIn = true;

		return this.loggedIn;
  }

}
