package com.bagbyco.jbbagby.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("info")
public class InfoController {

    @GetMapping
    private String renderInfoIndex(Model model){
        model.addAttribute("title", "Information");
        return"info/index";
    }

    @GetMapping("experience")
    private String renderInfoExperience(Model model){
        model.addAttribute("title", "Experience");
        return "info/experience";
    }

    @GetMapping("education")
    private String renderInfoEducation(Model model){
        model.addAttribute("title", "Education");
        return "info/education";
    }

    @GetMapping("other")
    private String renderInfoHobbies(Model model){
        model.addAttribute("title", "Hobbies");
        return("/info/other");
    }
}
