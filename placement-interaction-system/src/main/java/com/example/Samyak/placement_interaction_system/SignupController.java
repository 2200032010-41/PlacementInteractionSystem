package com.example.Samyak.placement_interaction_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class SignupController {

    @Autowired
    private StudentRepository studentRepository;

    // Display the signup form
    @GetMapping("/signup")
    public String showSignupPage(Model model) {
        model.addAttribute("student", new Student()); // Create a new Student object for the form
        return "signup"; // Returns signup.html
    }

    // Handle signup form submission and save data to MySQL
    @PostMapping("/signup")
    public String handleSignup(@Valid @ModelAttribute Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            // Return to signup page with error messages
            return "signup"; // Return to the signup page if there are validation errors
        }

        // Save new student data to database
        studentRepository.save(student);

        // Redirect to success page
        return "redirect:/signupSuccess"; // Redirect to the signup success page
    }

    // Display signup success page
    @GetMapping("/signupSuccess")
    public String showSignupSuccessPage(Model model) {
        model.addAttribute("message", "Signup successful!");
        return "signupSuccess"; // Returns signupSuccess.html
    }
}
