package com.example.Samyak.placement_interaction_system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("loginForm", new LoginForm()); // Create a new LoginForm object for the form
        return "login"; // Returns login.html
    }

    @PostMapping("/login")
    public String handleLoginForm(@Valid @ModelAttribute LoginForm loginForm, BindingResult result, Model model) {
        // Validate password length
        String password = loginForm.getPassword();
        
        if (password.length() < 9) {
            model.addAttribute("errorMessage", "Incorrect password. User doesn't exist.");
            return "login"; // Return to login page with error message
        }

        // Check credentials
        boolean loginSuccess = processLogin(loginForm.getName(), password);

        if (loginSuccess) {
            return "studentDashboard"; // Redirect to student dashboard
        } else {
            model.addAttribute("errorMessage", "Incorrect username or password.");
            return "login"; // Return to login page with error message
        }
    }

    private boolean processLogin(String name, String password) {
        // Hardcoded credentials for demonstration purposes
        String validUsername = "Ram"; // Example username
        String validPassword = "Ram@200441"; // Example password

        return name.equals(validUsername) && password.equals(validPassword);
    }
}
