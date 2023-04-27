package com.cbl.cibreport.usermanagement.services;

import com.cbl.cibreport.usermanagement.models.SecUser;

public interface IUserService {
    SecUser LoginService(String username, String password);
}
