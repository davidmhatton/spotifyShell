package com.mentoring.spotifyshell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomepageController {

    @GetMapping("/shell")
    public String index(@RequestParam(name = "name", defaultValue = "Mysterious User") String name, Model model) {
        model.addAttribute(name);

        return "spotshell";
    }
}
