package com.example.Samyak.placement_interaction_system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping(path="/admin")
    public String adminDashboard() {
        return "adminDashboard";  // Returns adminDashboard.html
    }

    @GetMapping(path="/manageUsers")
    public String manageUsers() {
        return "manageusers";  // Returns manageUsers.html
    }

    // Other admin-related functionalities (e.g., managing job postings)
}