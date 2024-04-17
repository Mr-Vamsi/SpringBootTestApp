package com.springbootapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springbootapp.Entities.users;
import com.springbootapp.Services.usersService;

@Controller
public class usersController {
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
