package com.areacounter.AreaCounter.controllers;

import com.areacounter.AreaCounter.models.CircumscribedCircleRadius;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class CircumscribedCircleRadiusController {

    @GetMapping("/CircumscribedCircleRadiusMethod")
    public String circumscribedCircleRadius(Model model) {
        model.addAttribute("circumscribedCircleRadius", new CircumscribedCircleRadius());
        return "/CircumscribedCircleRadius";
    }

    @PostMapping("/CircumscribedCircleRadiusMethod")
    public String circumscribedCircleRadiusCounter(@ModelAttribute CircumscribedCircleRadius circumscribedCircleRadius,
                                                   Map<String, String> map) throws Exception {
        double a = circumscribedCircleRadius.getA();
        double b = circumscribedCircleRadius.getB();
        double c = circumscribedCircleRadius.getC();
        double r = circumscribedCircleRadius.getR();

        double ans = (a * b * c) / (4 * r);
        String result = Double.toString(ans);

        map.put("area", result);

        return "/CircumscribedCircleRadius";
    }
}
