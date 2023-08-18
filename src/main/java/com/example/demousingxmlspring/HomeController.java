package com.example.demousingxmlspring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String home(){
        System.out.println("this is home url");
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println("this is login url");
        return "login";
    }
}
