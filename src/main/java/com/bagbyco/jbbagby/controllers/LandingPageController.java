package com.bagbyco.jbbagby.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {

    @GetMapping
    private String renderIndex(Model model){
        model.addAttribute("title", "Jon B Bagby");
        return "/index";
    }

}
