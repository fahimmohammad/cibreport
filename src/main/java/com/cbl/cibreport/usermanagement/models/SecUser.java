package com.cbl.cibreport.usermanagement.models;

import java.util.Date;

public class SecUser {
    private Long ID;
    private String Password;
    private String User;
    private String EmployeeID;
    private String UserProfileName;
    private int UserGroupID;
    private String GroupName;
    private String Status;
    private String IsLock;
    private String IsVerify;
    private String Creator;
    private Date CreationDate;
    private String EmailAddress;

    private String BranchID;
    private String BranchName;
    private String UserType;
    private String ZoneID;
    private String ZoneName;
    private String LoginAttempt;
    private int ApplicationID;
    private String ApplicationName;
    private int DesignationID;
    private String DesignationName;
    private int DepartmentID;
    private String DepartmentName;
    private Date LastLoginTime;
    private String IsFirstTimeLogin;
    private String ErrorMessage;

    public SecUser() {
        super();
    }

    public SecUser(String username, String password) {
        super();
        this.User = username;
        this.Password = password;
    }
    public Long getID() { return ID; }
    public void setID(Long ID) { this.ID = ID;}

    public String getPassword() { return Password; }
    public void setPassword(String password) {  Password = password; }

    public String getUser() {return User; }
    public void setUser(String user) { User = user; }

    public String getEmployeeID() { return EmployeeID; }
    public void setEmployeeID(String employeeID) {this.EmployeeID = employeeID; }

    public String getUserProfileName() {return UserProfileName; }
    public void setUserProfileName(String userProfileName) { this.UserProfileName = userProfileName;}

    public int getUserGroupID() { return UserGroupID; }
    public void setUserGroupID(int userGroupID) { UserGroupID = userGroupID; }

    public String getGroupName() { return GroupName; }
    public void setGroupName(String groupName) { GroupName = groupName; }

    public String getStatus() { return Status; }
    public void setStatus(String status) { Status = status; }

    public String getIsLock() { return IsLock; }
    public void setIsLock(String isLock) { IsLock = isLock; }

    public String getIsVerify() { return IsVerify; }
    public void setIsVerify(String isVerify) { IsVerify = isVerify; }

    public String getCreator() { return Creator; }
    public void setCreator(String creator) { Creator = creator; }

    public Date getCreationDate() { return CreationDate; }
    public void setCreationDate(Date creationDate) { CreationDate = creationDate; }

    public String getEmailAddress() { return EmailAddress; }
    public void setEmailAddress(String emailAddress) { EmailAddress = emailAddress; }

    public String getBranchID() { return BranchID; }
    public void setBranchID(String branchID) { BranchID = branchID; }

    public String getBranchName() { return BranchName; }
    public void setBranchName(String branchName) { BranchName = branchName; }

    public String getUserType() { return UserType; }
    public void setUserType(String userType) { UserType = userType;  }

    public String getZoneID() { return ZoneID;}
    public void setZoneID(String zoneID) { ZoneID = zoneID; }

    public String getZoneName() { return ZoneName; }
    public void setZoneName(String zoneName) { ZoneName = zoneName; }

    public String getLoginAttempt() { return LoginAttempt; }
    public void setLoginAttempt(String loginAttempt) { LoginAttempt = loginAttempt;}

    public int getApplicationID() { return ApplicationID; }
    public void setApplicationID(int applicationID) { ApplicationID = applicationID; }

    public String getApplicationName() { return ApplicationName; }
    public void setApplicationName(String applicationName) { ApplicationName = applicationName; }

    public int getDesignationID() { return DesignationID; }
    public void setDesignationID(int designationID) { DesignationID = designationID; }

    public String getDesignationName() { return DesignationName; }
    public void setDesignationName(String designationName) { DesignationName = designationName; }

    public int getDepartmentID() { return DepartmentID; }
    public void setDepartmentID(int departmentID) { DepartmentID = departmentID; }

    public String getDepartmentName() { return DepartmentName; }
    public void setDepartmentName(String departmentName) { DepartmentName = departmentName; }

    public Date getLastLoginTime() { return LastLoginTime; }
    public void setLastLoginTime(Date lastLoginTime) { LastLoginTime = lastLoginTime; }

    public String getIsFirstTimeLogin() { return IsFirstTimeLogin; }
    public void setIsFirstTimeLogin(String isFirstTimeLogin) { IsFirstTimeLogin = isFirstTimeLogin; }

    public String getErrorMessage() { return ErrorMessage; }
    public void setErrorMessage(String errorMessage) { ErrorMessage = errorMessage; }
}
