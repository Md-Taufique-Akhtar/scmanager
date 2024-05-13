package com.scmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.scmanager.entities.User;
import com.scmanager.forms.UserForm;
import com.scmanager.services.UserService;




@Controller
public class PageController {
    @Autowired
    private UserService userService;

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
// contact page
@RequestMapping("/contact")
public String contactPage(){
    return new  String("contact");
}

@RequestMapping("/login")
public String loginPage(){
    return new  String("login");
}

@RequestMapping("/register")
public String registerPage(Model model){
    UserForm userForm=new UserForm();
    model.addAttribute("userForm", userForm);
    userForm.setAbout("Write your self...");
  
    return "register";
}


//processing register
@RequestMapping(value="/do-register", method = RequestMethod.POST)
public String processRegister(@ModelAttribute UserForm userForm){
    System.out.println("processing register");
    //fetch form data
    //validate form data
    //save to database
    
//user service
User user=User.builder()
// User user = User.builder()
        .name(userForm.getName())
        .email(userForm.getEmail())
        .password(userForm.getPassword())
        .about(userForm.getAbout())
        .phoneNumber(userForm.getPhoneNumber())
        .profilePic(
        "https://www.learncodewithdurgesh.com/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fdurgesh_sir.35c6cb78.webp&w=1920&q=75")
.build();
    User savedUser=  userService.SaveUser(user);
    System.out.println("saved User");
    //message="Registration successfull"
    //redirect to login
      //UserForm
      System.out.println(userForm);
      
      

    return "redirect:/register";
}


}


