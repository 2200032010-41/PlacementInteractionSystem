package com.example.Samyak.placement_interaction_system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/studentDashboard")
    public String studentDashboard() {
        return "studentDashboard";  // Returns studentDashboard.html
    }

    // Mapping for viewing job opportunities
    @GetMapping("/viewJobs")
    public String viewJobOpportunities() {
        return "viewJobOpportunities";  // Returns viewJobOpportunities.html
    }

    // Mapping for viewing applications
    @GetMapping("/viewApplications")
    public String viewMyApplications() {
        return "myApplications";  // Returns myApplications.html
    }

    // Mapping for reviewing applications
    @GetMapping("/reviewApplications")
    public String reviewApplications() {
        return "reviewApplications";  // Returns reviewApplications.html
    }
}
