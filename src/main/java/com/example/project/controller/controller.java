package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.example.project.model.Appointment;
import com.example.project.repositoy.Repository;


@Controller
public class controller {
	 @Autowired
	    private Repository appointmentRepository;
	@GetMapping("/")
	public String hospital() {
		return "hospital";}
	@GetMapping("/form")
public String form() {
    return "form";  // Return the Thymeleaf template name (e.g., form.html)
}
	@PostMapping("/form")
    public String handleFormSubmission(@ModelAttribute Appointment appointment) {
        // Process the data (e.g., save to database, send an email, etc.)
		appointmentRepository.save(appointment);
        
        // Redirect back to the hospital page after form submission
        return "redirect:/submit";  // This will redirect to the homepage (hospital.html)
    }
	@GetMapping("/submit")
    public String showSuccessPage() {
        return "submit";  // This corresponds to the success page template
    }
	
	 @GetMapping("/appointment")
	    public String viewAppointments(Model model) {
	        // Fetch all appointments from the database
	        model.addAttribute("appointment", appointmentRepository.findAll());
	        return "appointment"; // This is the view to display the appointments
	    }
	

}
