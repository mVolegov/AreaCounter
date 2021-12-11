package com.areacounter.AreaCounter.controllers;

import com.areacounter.AreaCounter.models.FeedbackInput;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeedbackInputController {

    @GetMapping("/FeedbackInput")
    public String feedbackInput(Model model) {
        model.addAttribute("feedbackInput", new FeedbackInput());
        return "FeedbackInput";
    }
}
