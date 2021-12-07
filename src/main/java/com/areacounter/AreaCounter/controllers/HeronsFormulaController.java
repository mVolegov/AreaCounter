package com.areacounter.AreaCounter.controllers;

import com.areacounter.AreaCounter.models.HeronsFormula;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class HeronsFormulaController {

    @GetMapping("/HeronsFormulaMethod")
    public String heronsFormula(Model model) {
        model.addAttribute("heronsFormula", new HeronsFormula());
        return "HeronsFormula";
    }

    @PostMapping("/HeronsFormulaMethod")
    public String heronsFormulaCounter(@ModelAttribute HeronsFormula heronsFormula, Map<String, String> map) throws Exception {
        double a = heronsFormula.getA();
        double b = heronsFormula.getB();
        double c = heronsFormula.getC();

        double p = (a + b + c) / 2;
        double ans = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        String result = Double.toString(ans);

        map.put("area", result);

        return "HeronsFormula";
    }
}
