package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate primary key value
	    private Long id;  // This is your primary key


	    private String name;
	    private String gender;
	    private String dob;
	    private String date;
	    private String address;
	    private String email;
	    private String phone;
	    private String reason;
	    private String appointmentDate;
	    private String doctor;

	    // Getters and setters for all fields
	    public Long getId() {
	        return id;
	    }
	    public void setId(Long id) {
	        this.id = id;
	    }
	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public String getGender() { return gender; }
	    public void setGender(String gender) { this.gender = gender; }

	    public String getDob() { return dob; }
	    public void setDob(String dob) { this.dob = dob; }

	    public String getDate() { return date; }
	    public void setDate(String date) { this.date = date; }

	    public String getAddress() { return address; }
	    public void setAddress(String address) { this.address = address; }

	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }

	    public String getPhone() { return phone; }
	    public void setPhone(String phone) { this.phone = phone; }

	    public String getReason() { return reason; }
	    public void setReason(String reason) { this.reason = reason; }

	    public String getAppointmentDate() { return appointmentDate; }
	    public void setAppointmentDate(String appointmentDate) { this.appointmentDate = appointmentDate; }

	    public String getDoctor() { return doctor; }
	    public void setDoctor(String doctor) { this.doctor = doctor; }
	}




