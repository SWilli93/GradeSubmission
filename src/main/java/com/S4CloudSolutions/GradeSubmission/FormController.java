package com.S4CloudSolutions.GradeSubmission;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }
}
