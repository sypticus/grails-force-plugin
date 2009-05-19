

/**
 * SforceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

    package com.sforce.soap.partner;

    /*
     *  SforceService java interface
     */

    public interface SforceService {
          

        /**
          * Auto generated method signature
          * Merge and update a set of sObjects based on object id
                    * @param merge
                
                    * @param sessionHeader
                
                    * @param callOptions
                
                    * @param assignmentRuleHeader
                
                    * @param mruHeader
                
                    * @param debuggingHeader
                
                    * @param emailHeader
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.MergeResponse merge(

                        com.sforce.soap.partner.Merge merge,com.sforce.soap.partner.SessionHeader sessionHeader,com.sforce.soap.partner.CallOptions callOptions,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader,com.sforce.soap.partner.MruHeader mruHeader,com.sforce.soap.partner.DebuggingHeader debuggingHeader,com.sforce.soap.partner.EmailHeader emailHeader)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Returns standard information relevant to the current user
                    * @param getUserInfo
                
                    * @param sessionHeader0
                
                    * @param callOptions1
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.GetUserInfoResponse getUserInfo(

                        com.sforce.soap.partner.GetUserInfo getUserInfo,com.sforce.soap.partner.SessionHeader sessionHeader0,com.sforce.soap.partner.CallOptions callOptions1)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe the layout of the SoftPhone
                    * @param describeSoftphoneLayout
                
                    * @param sessionHeader2
                
                    * @param callOptions3
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeSoftphoneLayoutResponse describeSoftphoneLayout(

                        com.sforce.soap.partner.DescribeSoftphoneLayout describeSoftphoneLayout,com.sforce.soap.partner.SessionHeader sessionHeader2,com.sforce.soap.partner.CallOptions callOptions3)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Update a set of sObjects
                    * @param update
                
                    * @param sessionHeader4
                
                    * @param callOptions5
                
                    * @param assignmentRuleHeader6
                
                    * @param mruHeader7
                
                    * @param debuggingHeader8
                
                    * @param emailHeader9
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.UpdateResponse update(

                        com.sforce.soap.partner.Update update,com.sforce.soap.partner.SessionHeader sessionHeader4,com.sforce.soap.partner.CallOptions callOptions5,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader6,com.sforce.soap.partner.MruHeader mruHeader7,com.sforce.soap.partner.DebuggingHeader debuggingHeader8,com.sforce.soap.partner.EmailHeader emailHeader9)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Set a user's password
                    * @param setPassword
                
                    * @param sessionHeader10
                
                    * @param callOptions11
                
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.InvalidNewPasswordFault : 
         */

         
                     public com.sforce.soap.partner.SetPasswordResponse setPassword(

                        com.sforce.soap.partner.SetPassword setPassword,com.sforce.soap.partner.SessionHeader sessionHeader10,com.sforce.soap.partner.CallOptions callOptions11)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.InvalidNewPasswordFault;

        

        /**
          * Auto generated method signature
          * Logout the current user, invalidating the current session.
                    * @param logout
                
                    * @param sessionHeader12
                
                    * @param callOptions13
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.LogoutResponse logout(

                        com.sforce.soap.partner.Logout logout,com.sforce.soap.partner.SessionHeader sessionHeader12,com.sforce.soap.partner.CallOptions callOptions13)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Get a set of sObjects
                    * @param retrieve
                
                    * @param sessionHeader14
                
                    * @param callOptions15
                
                    * @param queryOptions
                
                    * @param mruHeader16
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.MalformedQueryFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.RetrieveResponse retrieve(

                        com.sforce.soap.partner.Retrieve retrieve,com.sforce.soap.partner.SessionHeader sessionHeader14,com.sforce.soap.partner.CallOptions callOptions15,com.sforce.soap.partner.QueryOptions queryOptions,com.sforce.soap.partner.MruHeader mruHeader16)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.MalformedQueryFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Create a Query Cursor, including deleted sObjects
                    * @param queryAll
                
                    * @param sessionHeader17
                
                    * @param callOptions18
                
                    * @param queryOptions19
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.MalformedQueryFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
         */

         
                     public com.sforce.soap.partner.QueryAllResponse queryAll(

                        com.sforce.soap.partner.QueryAll queryAll,com.sforce.soap.partner.SessionHeader sessionHeader17,com.sforce.soap.partner.CallOptions callOptions18,com.sforce.soap.partner.QueryOptions queryOptions19)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.MalformedQueryFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.InvalidQueryLocatorFault;

        

        /**
          * Auto generated method signature
          * Get the IDs for updated sObjects
                    * @param getUpdated
                
                    * @param sessionHeader20
                
                    * @param callOptions21
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.GetUpdatedResponse getUpdated(

                        com.sforce.soap.partner.GetUpdated getUpdated,com.sforce.soap.partner.SessionHeader sessionHeader20,com.sforce.soap.partner.CallOptions callOptions21)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Undelete a set of sObjects
                    * @param undelete
                
                    * @param sessionHeader22
                
                    * @param callOptions23
                
                    * @param debuggingHeader24
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.UndeleteResponse undelete(

                        com.sforce.soap.partner.Undelete undelete,com.sforce.soap.partner.SessionHeader sessionHeader22,com.sforce.soap.partner.CallOptions callOptions23,com.sforce.soap.partner.DebuggingHeader debuggingHeader24)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Create a set of new sObjects
                    * @param create
                
                    * @param sessionHeader25
                
                    * @param callOptions26
                
                    * @param assignmentRuleHeader27
                
                    * @param mruHeader28
                
                    * @param debuggingHeader29
                
                    * @param emailHeader30
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.CreateResponse create(

                        com.sforce.soap.partner.Create create,com.sforce.soap.partner.SessionHeader sessionHeader25,com.sforce.soap.partner.CallOptions callOptions26,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader27,com.sforce.soap.partner.MruHeader mruHeader28,com.sforce.soap.partner.DebuggingHeader debuggingHeader29,com.sforce.soap.partner.EmailHeader emailHeader30)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Send outbound email
                    * @param sendEmail
                
                    * @param sessionHeader31
                
                    * @param callOptions32
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.SendEmailResponse sendEmail(

                        com.sforce.soap.partner.SendEmail sendEmail,com.sforce.soap.partner.SessionHeader sessionHeader31,com.sforce.soap.partner.CallOptions callOptions32)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Search for sObjects
                    * @param search
                
                    * @param sessionHeader33
                
                    * @param callOptions34
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.MalformedSearchFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.SearchResponse search(

                        com.sforce.soap.partner.Search search,com.sforce.soap.partner.SessionHeader sessionHeader33,com.sforce.soap.partner.CallOptions callOptions34)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.MalformedSearchFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Create a Query Cursor
                    * @param query
                
                    * @param sessionHeader35
                
                    * @param callOptions36
                
                    * @param queryOptions37
                
                    * @param mruHeader38
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.MalformedQueryFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
         */

         
                     public com.sforce.soap.partner.QueryResponse query(

                        com.sforce.soap.partner.Query query,com.sforce.soap.partner.SessionHeader sessionHeader35,com.sforce.soap.partner.CallOptions callOptions36,com.sforce.soap.partner.QueryOptions queryOptions37,com.sforce.soap.partner.MruHeader mruHeader38)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.MalformedQueryFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.InvalidQueryLocatorFault;

        

        /**
          * Auto generated method signature
          * Get the IDs for deleted sObjects
                    * @param getDeleted
                
                    * @param sessionHeader39
                
                    * @param callOptions40
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.GetDeletedResponse getDeleted(

                        com.sforce.soap.partner.GetDeleted getDeleted,com.sforce.soap.partner.SessionHeader sessionHeader39,com.sforce.soap.partner.CallOptions callOptions40)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Submit an entity to a workflow process or process a workitem
                    * @param process
                
                    * @param sessionHeader41
                
                    * @param callOptions42
                
                    * @param debuggingHeader43
                
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.ProcessResponse process(

                        com.sforce.soap.partner.Process process,com.sforce.soap.partner.SessionHeader sessionHeader41,com.sforce.soap.partner.CallOptions callOptions42,com.sforce.soap.partner.DebuggingHeader debuggingHeader43)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Reset a user's password
                    * @param resetPassword
                
                    * @param sessionHeader44
                
                    * @param callOptions45
                
                    * @param emailHeader46
                
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.ResetPasswordResponse resetPassword(

                        com.sforce.soap.partner.ResetPassword resetPassword,com.sforce.soap.partner.SessionHeader sessionHeader44,com.sforce.soap.partner.CallOptions callOptions45,com.sforce.soap.partner.EmailHeader emailHeader46)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe the Global state
                    * @param describeGlobal
                
                    * @param sessionHeader47
                
                    * @param callOptions48
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeGlobalResponse describeGlobal(

                        com.sforce.soap.partner.DescribeGlobal describeGlobal,com.sforce.soap.partner.SessionHeader sessionHeader47,com.sforce.soap.partner.CallOptions callOptions48)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe the layout of an sObject
                    * @param describeLayout
                
                    * @param sessionHeader49
                
                    * @param callOptions50
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeLayoutResponse describeLayout(

                        com.sforce.soap.partner.DescribeLayoutE describeLayout,com.sforce.soap.partner.SessionHeader sessionHeader49,com.sforce.soap.partner.CallOptions callOptions50)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe the tabs that appear on a users page
                    * @param describeTabs
                
                    * @param sessionHeader51
                
                    * @param callOptions52
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeTabsResponse describeTabs(

                        com.sforce.soap.partner.DescribeTabs describeTabs,com.sforce.soap.partner.SessionHeader sessionHeader51,com.sforce.soap.partner.CallOptions callOptions52)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Gets server timestamp
                    * @param getServerTimestamp
                
                    * @param sessionHeader53
                
                    * @param callOptions54
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.GetServerTimestampResponse getServerTimestamp(

                        com.sforce.soap.partner.GetServerTimestamp getServerTimestamp,com.sforce.soap.partner.SessionHeader sessionHeader53,com.sforce.soap.partner.CallOptions callOptions54)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Logs out and invalidates session ids
                    * @param invalidateSessions
                
                    * @param sessionHeader55
                
                    * @param callOptions56
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.InvalidateSessionsResponse invalidateSessions(

                        com.sforce.soap.partner.InvalidateSessions invalidateSessions,com.sforce.soap.partner.SessionHeader sessionHeader55,com.sforce.soap.partner.CallOptions callOptions56)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe an sObject
                    * @param describeSObject
                
                    * @param sessionHeader57
                
                    * @param callOptions58
                
                    * @param localeOptions
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeSObjectResponse describeSObject(

                        com.sforce.soap.partner.DescribeSObject describeSObject,com.sforce.soap.partner.SessionHeader sessionHeader57,com.sforce.soap.partner.CallOptions callOptions58,com.sforce.soap.partner.LocaleOptions localeOptions)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Login to the Salesforce.com SOAP Api
                    * @param login
                
                    * @param loginScopeHeader
                
                    * @param callOptions59
                
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.LoginFault : 
         */

         
                     public com.sforce.soap.partner.LoginResponse login(

                        com.sforce.soap.partner.Login login,com.sforce.soap.partner.LoginScopeHeader loginScopeHeader,com.sforce.soap.partner.CallOptions callOptions59)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.LoginFault;

        

        /**
          * Auto generated method signature
          * Gets the next batch of sObjects from a query
                    * @param queryMore
                
                    * @param sessionHeader60
                
                    * @param callOptions61
                
                    * @param queryOptions62
                
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
         */

         
                     public com.sforce.soap.partner.QueryMoreResponse queryMore(

                        com.sforce.soap.partner.QueryMore queryMore,com.sforce.soap.partner.SessionHeader sessionHeader60,com.sforce.soap.partner.CallOptions callOptions61,com.sforce.soap.partner.QueryOptions queryOptions62)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.InvalidQueryLocatorFault;

        

        /**
          * Auto generated method signature
          * Describe a number sObjects
                    * @param describeSObjects
                
                    * @param sessionHeader63
                
                    * @param callOptions64
                
                    * @param localeOptions65
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeSObjectsResponse describeSObjects(

                        com.sforce.soap.partner.DescribeSObjects describeSObjects,com.sforce.soap.partner.SessionHeader sessionHeader63,com.sforce.soap.partner.CallOptions callOptions64,com.sforce.soap.partner.LocaleOptions localeOptions65)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Empty a set of sObjects from the recycle bin
                    * @param emptyRecycleBin
                
                    * @param sessionHeader66
                
                    * @param callOptions67
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.EmptyRecycleBinResponse emptyRecycleBin(

                        com.sforce.soap.partner.EmptyRecycleBin emptyRecycleBin,com.sforce.soap.partner.SessionHeader sessionHeader66,com.sforce.soap.partner.CallOptions callOptions67)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Update or insert a set of sObjects based on object id
                    * @param upsert
                
                    * @param sessionHeader68
                
                    * @param callOptions69
                
                    * @param assignmentRuleHeader70
                
                    * @param mruHeader71
                
                    * @param debuggingHeader72
                
                    * @param emailHeader73
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.UpsertResponse upsert(

                        com.sforce.soap.partner.Upsert upsert,com.sforce.soap.partner.SessionHeader sessionHeader68,com.sforce.soap.partner.CallOptions callOptions69,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader70,com.sforce.soap.partner.MruHeader mruHeader71,com.sforce.soap.partner.DebuggingHeader debuggingHeader72,com.sforce.soap.partner.EmailHeader emailHeader73)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * convert a set of leads
                    * @param convertLead
                
                    * @param sessionHeader74
                
                    * @param callOptions75
                
                    * @param debuggingHeader76
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.ConvertLeadResponse convertLead(

                        com.sforce.soap.partner.ConvertLead convertLead,com.sforce.soap.partner.SessionHeader sessionHeader74,com.sforce.soap.partner.CallOptions callOptions75,com.sforce.soap.partner.DebuggingHeader debuggingHeader76)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Delete a set of sObjects
                    * @param delete
                
                    * @param sessionHeader77
                
                    * @param callOptions78
                
                    * @param userTerritoryDeleteHeader
                
                    * @param emailHeader79
                
                    * @param debuggingHeader80
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DeleteResponse delete(

                        com.sforce.soap.partner.Delete delete,com.sforce.soap.partner.SessionHeader sessionHeader77,com.sforce.soap.partner.CallOptions callOptions78,com.sforce.soap.partner.UserTerritoryDeleteHeader userTerritoryDeleteHeader,com.sforce.soap.partner.EmailHeader emailHeader79,com.sforce.soap.partner.DebuggingHeader debuggingHeader80)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        
       //
       }
    