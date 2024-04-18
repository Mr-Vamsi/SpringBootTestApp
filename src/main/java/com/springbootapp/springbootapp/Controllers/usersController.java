package com.springbootapp.springbootapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootapp.springbootapp.Services.*;
import com.springbootapp.springbootapp.Entities.*;

@Controller
public class usersController {

    @Autowired
    private usersService service;

    @RequestMapping("/Register")
    public String callRegister() {
        return "RegPage";
    }

    @RequestMapping("/saveReg")
    public String registerUser(@ModelAttribute("Users") users Users) {
        if (!Users.getName().equals(null) || !Users.getEmail().equals(null)) {
            service.saveuser(Users);
            return "LoginPage";
        } else {
            return "RegPage";
        }
    }
}
