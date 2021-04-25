package com.testswing.demo.controller;

import com.testswing.demo.utils.DemoUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String index(Model model ) {
        DemoUtils.openPdfFile();
        model.addAttribute("test", "Phrase de bienvenue - Test de configuration");
        model.addAttribute("title", "Voitures");
        return "index";
    }
}
