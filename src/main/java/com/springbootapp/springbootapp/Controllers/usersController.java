package com.springbootapp.springbootapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootapp.springbootapp.Services.*;
import com.springbootapp.springbootapp.Entities.*;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class usersController {

    @Autowired
    private usersService service;

    @RequestMapping("/Register")
    public String callRegister() {
        return "RegPage";
    }

    @RequestMapping("/login")
    public String callLogin() {
        return "LoginPage";
    }

    @RequestMapping("/saveReg")
    public String registerUser(@ModelAttribute("Users") users Users) {
        if (!Users.getPassword().equals(null) || !Users.getEmail().equals(null)) {
            service.saveuser(Users);
            return "LoginPage";
        } else {
            return "RegPage";
        }
    }

    @RequestMapping("/userLogin")
    public String requestMethodName(@RequestParam String email, @RequestParam String password, ModelMap modelMap) {
        users user = service.validateLogin(email, password);
        if (user != null) {
            modelMap.addAttribute("userName", user.getName());
            return "home";
        } else {
            modelMap.addAttribute("error", "please check the Email / Password");
            return "LoginPage";
        }
    }

}
