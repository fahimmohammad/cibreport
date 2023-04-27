package com.cbl.cibreport.usermanagement.services;

import com.cbl.cibreport.usermanagement.models.SecUser;
import com.cbl.cibreport.usermanagement.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;


    @Override
    public SecUser LoginService(String username, String password) {
        return userRepository.CheckUserLogin(username,password);

    }
}
