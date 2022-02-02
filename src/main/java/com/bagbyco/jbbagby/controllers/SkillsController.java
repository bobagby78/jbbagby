package com.bagbyco.jbbagby.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("skills")
public class SkillsController {

    @GetMapping
    private String renderSkillsIndex(Model model){
        model.addAttribute("title", "Skills");
        return "/skills/index";
    }

    @GetMapping("programming")
    private String renderSkillsProgramming (Model model){
        model.addAttribute("title", "Programming Skills");
        return "/skills/programming";
    }
    @GetMapping("databases")
    private String renderSkillsDatabases (Model model){
        model.addAttribute("title", "Database Skills");
        return "/skills/databases";
    }

    @GetMapping("frameworks")
    private String renderSkillsFrameworks (Model model){
        model.addAttribute("title", "Framework Skills");
        return "/skills/frameworks";
    }


}
