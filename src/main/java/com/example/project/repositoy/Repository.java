package com.example.project.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Appointment;



public interface Repository extends JpaRepository<Appointment,Long>  {

}
