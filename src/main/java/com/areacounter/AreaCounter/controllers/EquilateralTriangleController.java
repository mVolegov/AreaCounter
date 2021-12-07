package com.areacounter.AreaCounter.controllers;

import com.areacounter.AreaCounter.models.EquilateralTriangle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class EquilateralTriangleController {

    @GetMapping("/EquilateralTriangleMethod")
    public String equilateralTriangle(Model model) {
        model.addAttribute("equilateralTriangle", new EquilateralTriangle());
        return "/EquilateralTriangle";
    }

    @PostMapping("/EquilateralTriangleMethod")
    public String equilateralTriangleCounter(@ModelAttribute EquilateralTriangle equilateralTriangle,
                                             Map<String, String> map) throws Exception {
        double a = equilateralTriangle.getA();
        double ans = a * a * Math.sqrt(3) / 4;
        String result = Double.toString(ans);

        map.put("area", result);

        return "EquilateralTriangle";
    }
}
