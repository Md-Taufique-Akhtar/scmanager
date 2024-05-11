package com.scmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page handler");
        model.addAttribute("name", "Substring Technology");
        model.addAttribute("YoutubeChannel", "Dominator Circle");
        model.addAttribute("githubRepo", "https://github.com/Md-Taufique-Akhtar");
        return "home";
    }


    //about route
// @RequestMapping("/about")
// public String aboutPage(){
//     System.out.println("About page loading");
//     return "about";
// }
// @RequestMapping("/services")
// public String servicesPage(){
//     System.out.println("Services page loading");
//     return "services";
// }


@RequestMapping("/about")
public String aboutPage(Model model ) {
model.addAttribute("isLogin", false);
    System.out.println("About Page Loading");
return "about";
}

@RequestMapping("/services")
public String servicesPage() {
    System.out.println("services Page Loading");
return "services";
}

}


