package com.scmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/user")
public class UserController {


//user Dashboard
@RequestMapping(value="/dashboard", method=RequestMethod.GET)
public String userDashboard() {
    return "user/dashboard";
}

@RequestMapping(value = "/profile", method=RequestMethod.GET)
public String requestMethodName() {
    return "user/profile";
}




//user add contacts page
}
