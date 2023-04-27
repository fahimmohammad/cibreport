package com.cbl.cibreport.usermanagement.controllers;

import com.cbl.cibreport.report.common.BaseController;
import com.cbl.cibreport.usermanagement.models.SecUser;
import com.cbl.cibreport.usermanagement.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController extends BaseController {

    @Autowired
    IUserService userService;

    @GetMapping("/")
    public String login() {
       // model.addAttribute("userlogin", new  SecUser());
        return "home/login";
    }

    @PostMapping("/login")
    public String login( @ModelAttribute(name="loginForm") SecUser login, Model m){
        String uname = login.getUser();
        String pass = login.getPassword();
        SecUser userdata = userService.LoginService(login.getUser(),login.getPassword());
        if(userdata.getEmployeeID()!=null) {
            m.addAttribute("uname", login.getUser());
            m.addAttribute("pass", login.getPassword());
            return "index";
        }
        m.addAttribute("error", "Incorrect Username & Password");
        return "index";
    }
}
