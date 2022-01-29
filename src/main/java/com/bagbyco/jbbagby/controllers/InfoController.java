package com.bagbyco.jbbagby.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("info")
public class InfoController {

    @GetMapping("main")
    private String renderInfoIndex(Model model){
        model.addAttribute("title", "Information");
        return"info/main";
    }

    @GetMapping("experience")
    private String renderInfoPage(Model model){
        model.addAttribute("title", "Experience");
        return "info/experience";
    }

    @GetMapping("education")
    private String renderStatsPage(Model model){
        model.addAttribute("title", "Education");
        return "info/education";
    }
}
