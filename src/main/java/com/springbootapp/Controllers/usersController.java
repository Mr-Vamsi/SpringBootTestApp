package com.springbootapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usersController {
    @RequestMapping("/Register")
    public String callRegister() {
        return "RegPage";
    }
}
