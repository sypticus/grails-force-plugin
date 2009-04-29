import com.sforce.soap.partner.*
import com.sforce.soap.partner.sobject.SObject
import org.apache.axis.message.MessageElement
import com.riptideforce.sfdc.model.*

class SalesForceServiceTests extends GroovyTestCase  {
	static transactional = false 
	
	def salesForceService;
	def salesForceCodeGenService;
	
	 void testDescribeObjectNames() {
			 String[] names = salesForceCodeGenService.getObjectNames();
	     assert names != null
	 }
	
	void testAccountCreateAndFetch() {
		def Account acct = new Account()
		acct.Name = "RiptideForce.com"
		SObject so = acct.buildSObject()
		def SaveResult result = salesForceService.create(so)
		def query = "select Name, numberOfEmployees, ID, Industry from Account where ID = '" + result.getId() + "'";
		def savedObj = salesForceService.fetch(query)
		assert savedObj.getId() == result.getId()
	}
	
	void testAccountCreateFetchAndMap() {
		def Account acct = new Account()
		acct.Name = "RiptideForce.com"
		SObject so = acct.buildSObject()
		def SaveResult result = salesForceService.create(so)
		def query = "select Name, numberOfEmployees, ID, Industry from Account where ID = '" + result.getId() + "'";
		def savedObj = salesForceService.fetch(query)
		def testAcct = Account.buildAccount(savedObj)
		println "TestAcct Id = " + testAcct.Id
		println "SavedObj Id = " + savedObj.getId()
		assert savedObj.getId() == testAcct.Id
	}
	
	void testAccountCreateAndUpdateAndDelete() {
		def Account acct = new Account()
		acct.Name = "RiptideForce.com"
		SObject so = acct.buildSObject()
		def SaveResult result = salesForceService.create(so)
		acct.Id = result.getId()
		assert acct.Id != null
		acct.NumberOfEmployees = "80"
		result = salesForceService.update(acct.buildSObject())
		def String[] ids = new String[1]
		ids[0] = acct.Id
		salesForceService.delete(ids)
	}
	
	void testAccountQuery() {
		def query = "select Name, numberOfEmployees, Id, Industry from Account";
		def results = salesForceService.fetchAll(query)
		assert results != null
			for (int i = 0; i < results.size(); i++) {
				MessageElement[] records = results.get(i).get_any();
				if (results.get(i).getId() != null)
					println "id =" + results.get(i).getId()
				for (int j = 0; j < records.length; j++) {
					MessageElement record = records[j];
						println record.getName() + " = " + record.getValue()
				}
		}
	}
	
	void testGetAllAccounts(){
		List<Account> accts = salesForceService.getAllAccounts();
		assert accts != null
		Account acct = salesForceService.getAccountById(accts.get(1).Id)
		assert acct != null
		assert acct.Id == accts.get(1).Id
		println "Account toString(): \n" + acct.toString()
	}
	
}