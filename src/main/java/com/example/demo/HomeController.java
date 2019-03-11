package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("myvarOne", "Say hello to the left.");
        model.addAttribute("myvarTwo", "Say hello to the right.");
        return "hometemplate";
    }
}

