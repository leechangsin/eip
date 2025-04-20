package com.eip.eip.controller.forwardController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("currentTab", "home");
        return "index";
    }

    @GetMapping("/practice")
    public String practice(Model model) {
        model.addAttribute("currentTab", "practice");
        return "practice";
    }

    @GetMapping("/practice/detail/{id}")
    public String practiceDetail(@PathVariable String id, Model model) {
        model.addAttribute("currentTab", "practice");
        model.addAttribute("examId", id);
        return "practiceDetail";
    }

    @GetMapping("/schedule")
    public String schedule(Model model) {
        model.addAttribute("currentTab", "schedule");
        return "schedule";
    }

    @GetMapping("/note")
    public String note(Model model) {
        model.addAttribute("currentTab", "note");
        return "note";
    }

    @GetMapping("/log")
    public String log(Model model) {
        model.addAttribute("currentTab", "log");
        return "log";
    }
} 