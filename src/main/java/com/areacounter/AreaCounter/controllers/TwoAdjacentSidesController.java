package com.areacounter.AreaCounter.controllers;

import com.areacounter.AreaCounter.models.TwoAdjacentSides;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class TwoAdjacentSidesController {

    @GetMapping("/TwoAdjacentSidesMethod")
    public String twoAdjacentSides(Model model) {
        model.addAttribute("twoAdjacentSides", new TwoAdjacentSides());
        return "TwoAdjacentSides";
    }

    @PostMapping("/TwoAdjacentSidesMethod")
    public String twoAdjacentSidesCounter(@ModelAttribute TwoAdjacentSides twoAdjacentSides,
                                          Map<String, String> map) throws Exception {
        double a = twoAdjacentSides.getA();
        double b = twoAdjacentSides.getB();
        double angle = twoAdjacentSides.getAngle();

        double ans = 0.5 * a * b * Math.sin(Math.toRadians(angle));
        String result = Double.toString(ans);

        map.put("area", result);

        return "/TwoAdjacentSides";
    }
}
