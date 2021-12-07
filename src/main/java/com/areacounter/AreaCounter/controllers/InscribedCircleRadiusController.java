package com.areacounter.AreaCounter.controllers;

import com.areacounter.AreaCounter.models.InscribedCircleRadius;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class InscribedCircleRadiusController {

    @GetMapping("/InscribedCircleRadiusMethod")
    public String inscribedCircleRadius(Model model) {
        model.addAttribute("inscribedCircleRadius", new InscribedCircleRadius());
        return "/InscribedCircleRadius";
    }

    @PostMapping("/InscribedCircleRadiusMethod")
    public String inscribedCircleRadiusCounter(@ModelAttribute InscribedCircleRadius inscribedCircleRadius,
                                               Map<String, String> map) throws Exception {
        double a = inscribedCircleRadius.getA();
        double b = inscribedCircleRadius.getB();
        double c = inscribedCircleRadius.getC();
        double r = inscribedCircleRadius.getR();

        double p = (a + b + c) / 2;
        double ans = p * r;
        String result = Double.toString(ans);

        map.put("area", result);

        return "/InscribedCircleRadius";
    }
}
