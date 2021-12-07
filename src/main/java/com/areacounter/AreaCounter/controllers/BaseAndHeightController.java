package com.areacounter.AreaCounter.controllers;

import com.areacounter.AreaCounter.models.BaseAndHeight;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class BaseAndHeightController {

    @GetMapping("/BaseAndHeightMethod")
    public String baseAndHeight(Model model) {
        model.addAttribute("baseAndHeight", new BaseAndHeight());
        return "BaseAndHeight";
    }

    @PostMapping("/BaseAndHeightMethod")
    public String baseAndHeightCounter(@ModelAttribute BaseAndHeight baseAndHeight, Map<String, String> map) throws Exception {
        double base = baseAndHeight.getBase();
        double height = baseAndHeight.getHeight();
        double ans = 0.5 * base * height;
        String result = Double.toString(ans);

        map.put("area", result);

        return "BaseAndHeight";
    }
}
