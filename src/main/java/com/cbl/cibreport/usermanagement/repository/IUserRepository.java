package com.cbl.cibreport.usermanagement.repository;

import com.cbl.cibreport.usermanagement.models.SecUser;

public interface IUserRepository {
    SecUser CheckUserLogin(String username, String password);
}
