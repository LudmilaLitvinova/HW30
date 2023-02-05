package com.example.hw30.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

/**
 * @author Ludmila Litvinova on 04.02
 */

@RequestMapping("/")
@Controller
@Slf4j
public class WelcomeController {

    @GetMapping("welcome")
    public String getPageWelcome(Model model) {
        model.addAttribute("localDate", LocalDate.now());
        return "blogs/welcome";
    }

    @GetMapping("info")
    public String getPageInfo(Model model) {
        model.addAttribute("localDate", LocalDate.now());
        model.addAttribute("time", System.currentTimeMillis());
        return "blogs/info";
    }
}
