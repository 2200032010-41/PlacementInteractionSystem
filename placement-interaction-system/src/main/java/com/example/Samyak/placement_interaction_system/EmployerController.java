package com.example.Samyak.placement_interaction_system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class EmployerController {

    // Mapping for the employer dashboard
    @GetMapping("/employerDashboard")
    public String employerDashboard() {
        return "employerDashboard";  // Returns employerDashboard.html
    }

    // Mapping to display the job posting form
    @GetMapping("/postJob")
    public String showPostJobForm() {
        return "postJob";  // Returns postJob.html
    }

    // Mapping for logout
    @GetMapping("/logout")
    public String logout() {
        return "logout"; // Returns logout.html
    }
}
