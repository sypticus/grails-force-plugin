/**
 * SforceServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class SforceServiceTestCase extends junit.framework.TestCase {
    public SforceServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testSoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.sforce.soap.partner.SforceServiceLocator().getSoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.sforce.soap.partner.SforceServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1SoapLogin() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.LoginResult value = null;
            value = binding.login(new java.lang.String(), new java.lang.String());
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.LoginFault e3) {
            throw new junit.framework.AssertionFailedError("LoginFault Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test2SoapDescribeSObject() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.DescribeSObjectResult value = null;
            value = binding.describeSObject(new java.lang.String());
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test3SoapDescribeSObjects() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.DescribeSObjectResult[] value = null;
            value = binding.describeSObjects(new java.lang.String[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test4SoapDescribeGlobal() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.DescribeGlobalResult value = null;
            value = binding.describeGlobal();
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test5SoapDescribeLayout() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.DescribeLayoutResult value = null;
            value = binding.describeLayout(new java.lang.String(), new java.lang.String[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test6SoapDescribeSoftphoneLayout() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.DescribeSoftphoneLayoutResult value = null;
            value = binding.describeSoftphoneLayout();
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test7SoapDescribeTabs() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.DescribeTabSetResult[] value = null;
            value = binding.describeTabs();
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test8SoapCreate() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.SaveResult[] value = null;
            value = binding.create(new com.sforce.soap.partner.sobject.SObject[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e3);
        }
        catch (com.sforce.soap.partner.fault.InvalidFieldFault e4) {
            throw new junit.framework.AssertionFailedError("InvalidFieldFault Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test9SoapUpdate() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.SaveResult[] value = null;
            value = binding.update(new com.sforce.soap.partner.sobject.SObject[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e3);
        }
        catch (com.sforce.soap.partner.fault.InvalidFieldFault e4) {
            throw new junit.framework.AssertionFailedError("InvalidFieldFault Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test10SoapUpsert() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.UpsertResult[] value = null;
            value = binding.upsert(new java.lang.String(), new com.sforce.soap.partner.sobject.SObject[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e3);
        }
        catch (com.sforce.soap.partner.fault.InvalidFieldFault e4) {
            throw new junit.framework.AssertionFailedError("InvalidFieldFault Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test11SoapMerge() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.MergeResult[] value = null;
            value = binding.merge(new com.sforce.soap.partner.MergeRequest[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e3);
        }
        catch (com.sforce.soap.partner.fault.InvalidFieldFault e4) {
            throw new junit.framework.AssertionFailedError("InvalidFieldFault Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test12SoapDelete() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.DeleteResult[] value = null;
            value = binding.delete(new java.lang.String[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test13SoapUndelete() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.UndeleteResult[] value = null;
            value = binding.undelete(new java.lang.String[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test14SoapEmptyRecycleBin() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.EmptyRecycleBinResult[] value = null;
            value = binding.emptyRecycleBin(new java.lang.String[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test15SoapRetrieve() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.sobject.SObject[] value = null;
            value = binding.retrieve(new java.lang.String(), new java.lang.String(), new java.lang.String[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e3);
        }
        catch (com.sforce.soap.partner.fault.MalformedQueryFault e4) {
            throw new junit.framework.AssertionFailedError("MalformedQueryFault Exception caught: " + e4);
        }
        catch (com.sforce.soap.partner.fault.InvalidFieldFault e5) {
            throw new junit.framework.AssertionFailedError("InvalidFieldFault Exception caught: " + e5);
        }
            // TBD - validate results
    }

    public void test16SoapProcess() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.ProcessResult[] value = null;
            value = binding.process(new com.sforce.soap.partner.ProcessRequest[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test17SoapConvertLead() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.LeadConvertResult[] value = null;
            value = binding.convertLead(new com.sforce.soap.partner.LeadConvert[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test18SoapGetDeleted() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.GetDeletedResult value = null;
            value = binding.getDeleted(new java.lang.String(), java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test19SoapGetUpdated() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.GetUpdatedResult value = null;
            value = binding.getUpdated(new java.lang.String(), java.util.Calendar.getInstance(), java.util.Calendar.getInstance());
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test20SoapQuery() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.QueryResult value = null;
            value = binding.query(new java.lang.String());
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e3);
        }
        catch (com.sforce.soap.partner.fault.MalformedQueryFault e4) {
            throw new junit.framework.AssertionFailedError("MalformedQueryFault Exception caught: " + e4);
        }
        catch (com.sforce.soap.partner.fault.InvalidFieldFault e5) {
            throw new junit.framework.AssertionFailedError("InvalidFieldFault Exception caught: " + e5);
        }
            // TBD - validate results
    }

    public void test21SoapQueryAll() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.QueryResult value = null;
            value = binding.queryAll(new java.lang.String());
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e3);
        }
        catch (com.sforce.soap.partner.fault.MalformedQueryFault e4) {
            throw new junit.framework.AssertionFailedError("MalformedQueryFault Exception caught: " + e4);
        }
        catch (com.sforce.soap.partner.fault.InvalidFieldFault e5) {
            throw new junit.framework.AssertionFailedError("InvalidFieldFault Exception caught: " + e5);
        }
            // TBD - validate results
    }

    public void test22SoapQueryMore() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.QueryResult value = null;
            value = binding.queryMore(new java.lang.String());
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidQueryLocatorFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidQueryLocatorFault Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test23SoapSearch() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.SearchResult value = null;
            value = binding.search(new java.lang.String());
        }
        catch (com.sforce.soap.partner.fault.MalformedSearchFault e1) {
            throw new junit.framework.AssertionFailedError("MalformedSearchFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e2) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidSObjectFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidSObjectFault Exception caught: " + e3);
        }
        catch (com.sforce.soap.partner.fault.InvalidFieldFault e4) {
            throw new junit.framework.AssertionFailedError("InvalidFieldFault Exception caught: " + e4);
        }
            // TBD - validate results
    }

    public void test24SoapGetServerTimestamp() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.GetServerTimestampResult value = null;
            value = binding.getServerTimestamp();
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test25SoapSetPassword() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.SetPasswordResult value = null;
            value = binding.setPassword(new java.lang.String(), new java.lang.String());
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e2);
        }
        catch (com.sforce.soap.partner.fault.InvalidNewPasswordFault e3) {
            throw new junit.framework.AssertionFailedError("InvalidNewPasswordFault Exception caught: " + e3);
        }
            // TBD - validate results
    }

    public void test26SoapResetPassword() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.ResetPasswordResult value = null;
            value = binding.resetPassword(new java.lang.String());
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
        catch (com.sforce.soap.partner.fault.InvalidIdFault e2) {
            throw new junit.framework.AssertionFailedError("InvalidIdFault Exception caught: " + e2);
        }
            // TBD - validate results
    }

    public void test27SoapGetUserInfo() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.GetUserInfoResult value = null;
            value = binding.getUserInfo();
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

    public void test28SoapSendEmail() throws Exception {
        com.sforce.soap.partner.SoapBindingStub binding;
        try {
            binding = (com.sforce.soap.partner.SoapBindingStub)
                          new com.sforce.soap.partner.SforceServiceLocator().getSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            com.sforce.soap.partner.SendEmailResult[] value = null;
            value = binding.sendEmail(new com.sforce.soap.partner.Email[0]);
        }
        catch (com.sforce.soap.partner.fault.UnexpectedErrorFault e1) {
            throw new junit.framework.AssertionFailedError("UnexpectedErrorFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
