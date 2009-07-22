

/**
 * SforceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5  Built on : Apr 30, 2009 (06:07:24 EDT)
 */

    package com.sforce.soap.partner;

    /*
     *  SforceService java interface
     */

    public interface SforceService {
          

        /**
          * Auto generated method signature
          * Update or insert a set of sObjects based on object id
                    * @param upsert
                
                    * @param sessionHeader
                
                    * @param callOptions
                
                    * @param assignmentRuleHeader
                
                    * @param mruHeader
                
                    * @param allowFieldTruncationHeader
                
                    * @param debuggingHeader
                
                    * @param packageVersionHeader
                
                    * @param emailHeader
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.UpsertResponse upsert(

                        com.sforce.soap.partner.Upsert upsert,com.sforce.soap.partner.SessionHeader sessionHeader,com.sforce.soap.partner.CallOptions callOptions,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader,com.sforce.soap.partner.MruHeader mruHeader,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader,com.sforce.soap.partner.DebuggingHeader debuggingHeader,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader,com.sforce.soap.partner.EmailHeader emailHeader)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Update a set of sObjects
                    * @param update
                
                    * @param sessionHeader0
                
                    * @param callOptions1
                
                    * @param assignmentRuleHeader2
                
                    * @param mruHeader3
                
                    * @param allowFieldTruncationHeader4
                
                    * @param debuggingHeader5
                
                    * @param packageVersionHeader6
                
                    * @param emailHeader7
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.UpdateResponse update(

                        com.sforce.soap.partner.Update update,com.sforce.soap.partner.SessionHeader sessionHeader0,com.sforce.soap.partner.CallOptions callOptions1,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader2,com.sforce.soap.partner.MruHeader mruHeader3,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader4,com.sforce.soap.partner.DebuggingHeader debuggingHeader5,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader6,com.sforce.soap.partner.EmailHeader emailHeader7)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Search for sObjects
                    * @param search
                
                    * @param sessionHeader8
                
                    * @param callOptions9
                
                    * @param packageVersionHeader10
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.MalformedSearchFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.SearchResponse search(

                        com.sforce.soap.partner.Search search,com.sforce.soap.partner.SessionHeader sessionHeader8,com.sforce.soap.partner.CallOptions callOptions9,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader10)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.MalformedSearchFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Reset a user's password
                    * @param resetPassword
                
                    * @param sessionHeader11
                
                    * @param callOptions12
                
                    * @param emailHeader13
                
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.ResetPasswordResponse resetPassword(

                        com.sforce.soap.partner.ResetPassword resetPassword,com.sforce.soap.partner.SessionHeader sessionHeader11,com.sforce.soap.partner.CallOptions callOptions12,com.sforce.soap.partner.EmailHeader emailHeader13)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Get a set of sObjects
                    * @param retrieve
                
                    * @param sessionHeader14
                
                    * @param callOptions15
                
                    * @param queryOptions
                
                    * @param mruHeader16
                
                    * @param packageVersionHeader17
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.MalformedQueryFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.RetrieveResponse retrieve(

                        com.sforce.soap.partner.Retrieve retrieve,com.sforce.soap.partner.SessionHeader sessionHeader14,com.sforce.soap.partner.CallOptions callOptions15,com.sforce.soap.partner.QueryOptions queryOptions,com.sforce.soap.partner.MruHeader mruHeader16,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader17)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.MalformedQueryFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Submit an entity to a workflow process or process a workitem
                    * @param process
                
                    * @param sessionHeader18
                
                    * @param callOptions19
                
                    * @param allowFieldTruncationHeader20
                
                    * @param debuggingHeader21
                
                    * @param packageVersionHeader22
                
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.ProcessResponse process(

                        com.sforce.soap.partner.Process process,com.sforce.soap.partner.SessionHeader sessionHeader18,com.sforce.soap.partner.CallOptions callOptions19,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader20,com.sforce.soap.partner.DebuggingHeader debuggingHeader21,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader22)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Undelete a set of sObjects
                    * @param undelete
                
                    * @param sessionHeader23
                
                    * @param callOptions24
                
                    * @param allowFieldTruncationHeader25
                
                    * @param debuggingHeader26
                
                    * @param packageVersionHeader27
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.UndeleteResponse undelete(

                        com.sforce.soap.partner.Undelete undelete,com.sforce.soap.partner.SessionHeader sessionHeader23,com.sforce.soap.partner.CallOptions callOptions24,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader25,com.sforce.soap.partner.DebuggingHeader debuggingHeader26,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader27)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Gets the next batch of sObjects from a query
                    * @param queryMore
                
                    * @param sessionHeader28
                
                    * @param callOptions29
                
                    * @param queryOptions30
                
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
         */

         
                     public com.sforce.soap.partner.QueryMoreResponse queryMore(

                        com.sforce.soap.partner.QueryMore queryMore,com.sforce.soap.partner.SessionHeader sessionHeader28,com.sforce.soap.partner.CallOptions callOptions29,com.sforce.soap.partner.QueryOptions queryOptions30)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.InvalidQueryLocatorFault;

        

        /**
          * Auto generated method signature
          * Get the IDs for deleted sObjects
                    * @param getDeleted
                
                    * @param sessionHeader31
                
                    * @param callOptions32
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.GetDeletedResponse getDeleted(

                        com.sforce.soap.partner.GetDeleted getDeleted,com.sforce.soap.partner.SessionHeader sessionHeader31,com.sforce.soap.partner.CallOptions callOptions32)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Logout the current user, invalidating the current session.
                    * @param logout
                
                    * @param sessionHeader33
                
                    * @param callOptions34
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.LogoutResponse logout(

                        com.sforce.soap.partner.Logout logout,com.sforce.soap.partner.SessionHeader sessionHeader33,com.sforce.soap.partner.CallOptions callOptions34)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Delete a set of sObjects
                    * @param delete
                
                    * @param sessionHeader35
                
                    * @param callOptions36
                
                    * @param packageVersionHeader37
                
                    * @param userTerritoryDeleteHeader
                
                    * @param emailHeader38
                
                    * @param allowFieldTruncationHeader39
                
                    * @param debuggingHeader40
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DeleteResponse delete(

                        com.sforce.soap.partner.Delete delete,com.sforce.soap.partner.SessionHeader sessionHeader35,com.sforce.soap.partner.CallOptions callOptions36,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader37,com.sforce.soap.partner.UserTerritoryDeleteHeader userTerritoryDeleteHeader,com.sforce.soap.partner.EmailHeader emailHeader38,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader39,com.sforce.soap.partner.DebuggingHeader debuggingHeader40)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Create a Query Cursor, including deleted sObjects
                    * @param queryAll
                
                    * @param sessionHeader41
                
                    * @param callOptions42
                
                    * @param queryOptions43
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.MalformedQueryFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
         */

         
                     public com.sforce.soap.partner.QueryAllResponse queryAll(

                        com.sforce.soap.partner.QueryAll queryAll,com.sforce.soap.partner.SessionHeader sessionHeader41,com.sforce.soap.partner.CallOptions callOptions42,com.sforce.soap.partner.QueryOptions queryOptions43)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.MalformedQueryFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.InvalidQueryLocatorFault;

        

        /**
          * Auto generated method signature
          * convert a set of leads
                    * @param convertLead
                
                    * @param sessionHeader44
                
                    * @param callOptions45
                
                    * @param allowFieldTruncationHeader46
                
                    * @param debuggingHeader47
                
                    * @param packageVersionHeader48
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.ConvertLeadResponse convertLead(

                        com.sforce.soap.partner.ConvertLead convertLead,com.sforce.soap.partner.SessionHeader sessionHeader44,com.sforce.soap.partner.CallOptions callOptions45,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader46,com.sforce.soap.partner.DebuggingHeader debuggingHeader47,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader48)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Set a user's password
                    * @param setPassword
                
                    * @param sessionHeader49
                
                    * @param callOptions50
                
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.InvalidNewPasswordFault : 
         */

         
                     public com.sforce.soap.partner.SetPasswordResponse setPassword(

                        com.sforce.soap.partner.SetPassword setPassword,com.sforce.soap.partner.SessionHeader sessionHeader49,com.sforce.soap.partner.CallOptions callOptions50)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.InvalidNewPasswordFault;

        

        /**
          * Auto generated method signature
          * Create a set of new sObjects
                    * @param create
                
                    * @param sessionHeader51
                
                    * @param callOptions52
                
                    * @param assignmentRuleHeader53
                
                    * @param mruHeader54
                
                    * @param allowFieldTruncationHeader55
                
                    * @param debuggingHeader56
                
                    * @param packageVersionHeader57
                
                    * @param emailHeader58
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.CreateResponse create(

                        com.sforce.soap.partner.Create create,com.sforce.soap.partner.SessionHeader sessionHeader51,com.sforce.soap.partner.CallOptions callOptions52,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader53,com.sforce.soap.partner.MruHeader mruHeader54,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader55,com.sforce.soap.partner.DebuggingHeader debuggingHeader56,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader57,com.sforce.soap.partner.EmailHeader emailHeader58)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe the layout of the SoftPhone
                    * @param describeSoftphoneLayout
                
                    * @param sessionHeader59
                
                    * @param callOptions60
                
                    * @param packageVersionHeader61
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeSoftphoneLayoutResponse describeSoftphoneLayout(

                        com.sforce.soap.partner.DescribeSoftphoneLayout describeSoftphoneLayout,com.sforce.soap.partner.SessionHeader sessionHeader59,com.sforce.soap.partner.CallOptions callOptions60,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader61)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Logs out and invalidates session ids
                    * @param invalidateSessions
                
                    * @param sessionHeader62
                
                    * @param callOptions63
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.InvalidateSessionsResponse invalidateSessions(

                        com.sforce.soap.partner.InvalidateSessions invalidateSessions,com.sforce.soap.partner.SessionHeader sessionHeader62,com.sforce.soap.partner.CallOptions callOptions63)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe an sObject
                    * @param describeSObject
                
                    * @param sessionHeader64
                
                    * @param callOptions65
                
                    * @param packageVersionHeader66
                
                    * @param localeOptions
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeSObjectResponse describeSObject(

                        com.sforce.soap.partner.DescribeSObject describeSObject,com.sforce.soap.partner.SessionHeader sessionHeader64,com.sforce.soap.partner.CallOptions callOptions65,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader66,com.sforce.soap.partner.LocaleOptions localeOptions)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe the tabs that appear on a users page
                    * @param describeTabs
                
                    * @param sessionHeader67
                
                    * @param callOptions68
                
                    * @param packageVersionHeader69
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeTabsResponse describeTabs(

                        com.sforce.soap.partner.DescribeTabs describeTabs,com.sforce.soap.partner.SessionHeader sessionHeader67,com.sforce.soap.partner.CallOptions callOptions68,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader69)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe a number sObjects
                    * @param describeSObjects
                
                    * @param sessionHeader70
                
                    * @param callOptions71
                
                    * @param packageVersionHeader72
                
                    * @param localeOptions73
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeSObjectsResponse describeSObjects(

                        com.sforce.soap.partner.DescribeSObjects describeSObjects,com.sforce.soap.partner.SessionHeader sessionHeader70,com.sforce.soap.partner.CallOptions callOptions71,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader72,com.sforce.soap.partner.LocaleOptions localeOptions73)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Returns standard information relevant to the current user
                    * @param getUserInfo
                
                    * @param sessionHeader74
                
                    * @param callOptions75
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.GetUserInfoResponse getUserInfo(

                        com.sforce.soap.partner.GetUserInfo getUserInfo,com.sforce.soap.partner.SessionHeader sessionHeader74,com.sforce.soap.partner.CallOptions callOptions75)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Empty a set of sObjects from the recycle bin
                    * @param emptyRecycleBin
                
                    * @param sessionHeader76
                
                    * @param callOptions77
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.EmptyRecycleBinResponse emptyRecycleBin(

                        com.sforce.soap.partner.EmptyRecycleBin emptyRecycleBin,com.sforce.soap.partner.SessionHeader sessionHeader76,com.sforce.soap.partner.CallOptions callOptions77)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe the Global state
                    * @param describeGlobal
                
                    * @param sessionHeader78
                
                    * @param callOptions79
                
                    * @param packageVersionHeader80
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeGlobalResponse describeGlobal(

                        com.sforce.soap.partner.DescribeGlobal describeGlobal,com.sforce.soap.partner.SessionHeader sessionHeader78,com.sforce.soap.partner.CallOptions callOptions79,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader80)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Send outbound email
                    * @param sendEmail
                
                    * @param sessionHeader81
                
                    * @param callOptions82
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.SendEmailResponse sendEmail(

                        com.sforce.soap.partner.SendEmail sendEmail,com.sforce.soap.partner.SessionHeader sessionHeader81,com.sforce.soap.partner.CallOptions callOptions82)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Create a Query Cursor
                    * @param query
                
                    * @param sessionHeader83
                
                    * @param callOptions84
                
                    * @param queryOptions85
                
                    * @param mruHeader86
                
                    * @param packageVersionHeader87
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.MalformedQueryFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.InvalidQueryLocatorFault : 
         */

         
                     public com.sforce.soap.partner.QueryResponse query(

                        com.sforce.soap.partner.Query query,com.sforce.soap.partner.SessionHeader sessionHeader83,com.sforce.soap.partner.CallOptions callOptions84,com.sforce.soap.partner.QueryOptions queryOptions85,com.sforce.soap.partner.MruHeader mruHeader86,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader87)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.MalformedQueryFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.InvalidQueryLocatorFault;

        

        /**
          * Auto generated method signature
          * Login to the Salesforce.com SOAP Api
                    * @param login
                
                    * @param loginScopeHeader
                
                    * @param callOptions88
                
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
             * @throws com.sforce.soap.partner.LoginFault : 
         */

         
                     public com.sforce.soap.partner.LoginResponse login(

                        com.sforce.soap.partner.Login login,com.sforce.soap.partner.LoginScopeHeader loginScopeHeader,com.sforce.soap.partner.CallOptions callOptions88)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault
          ,com.sforce.soap.partner.LoginFault;

        

        /**
          * Auto generated method signature
          * Merge and update a set of sObjects based on object id
                    * @param merge
                
                    * @param sessionHeader89
                
                    * @param callOptions90
                
                    * @param assignmentRuleHeader91
                
                    * @param mruHeader92
                
                    * @param allowFieldTruncationHeader93
                
                    * @param debuggingHeader94
                
                    * @param packageVersionHeader95
                
                    * @param emailHeader96
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.InvalidFieldFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.MergeResponse merge(

                        com.sforce.soap.partner.Merge merge,com.sforce.soap.partner.SessionHeader sessionHeader89,com.sforce.soap.partner.CallOptions callOptions90,com.sforce.soap.partner.AssignmentRuleHeader assignmentRuleHeader91,com.sforce.soap.partner.MruHeader mruHeader92,com.sforce.soap.partner.AllowFieldTruncationHeader allowFieldTruncationHeader93,com.sforce.soap.partner.DebuggingHeader debuggingHeader94,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader95,com.sforce.soap.partner.EmailHeader emailHeader96)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.InvalidFieldFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Gets server timestamp
                    * @param getServerTimestamp
                
                    * @param sessionHeader97
                
                    * @param callOptions98
                
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.GetServerTimestampResponse getServerTimestamp(

                        com.sforce.soap.partner.GetServerTimestamp getServerTimestamp,com.sforce.soap.partner.SessionHeader sessionHeader97,com.sforce.soap.partner.CallOptions callOptions98)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Get the IDs for updated sObjects
                    * @param getUpdated
                
                    * @param sessionHeader99
                
                    * @param callOptions100
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.GetUpdatedResponse getUpdated(

                        com.sforce.soap.partner.GetUpdated getUpdated,com.sforce.soap.partner.SessionHeader sessionHeader99,com.sforce.soap.partner.CallOptions callOptions100)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe the layout of an sObject
                    * @param describeLayout
                
                    * @param sessionHeader101
                
                    * @param callOptions102
                
                    * @param packageVersionHeader103
                
             * @throws com.sforce.soap.partner.InvalidSObjectFault : 
             * @throws com.sforce.soap.partner.InvalidIdFault : 
             * @throws com.sforce.soap.partner.UnexpectedErrorFault : 
         */

         
                     public com.sforce.soap.partner.DescribeLayoutResponse describeLayout(

                        com.sforce.soap.partner.DescribeLayoutE describeLayout,com.sforce.soap.partner.SessionHeader sessionHeader101,com.sforce.soap.partner.CallOptions callOptions102,com.sforce.soap.partner.PackageVersionHeader packageVersionHeader103)
                        throws java.rmi.RemoteException
             
          ,com.sforce.soap.partner.InvalidSObjectFault
          ,com.sforce.soap.partner.InvalidIdFault
          ,com.sforce.soap.partner.UnexpectedErrorFault;

        

        
       //
       }
    