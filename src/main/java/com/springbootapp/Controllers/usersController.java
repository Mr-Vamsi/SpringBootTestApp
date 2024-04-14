package com.springbootapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usersController {

    @RequestMapping("showReg")
    public String showRegPage() {
        return "Register";
    }

    @RequestMapping("showLogin")
    public String show() {
        return "Login";
    }
}
