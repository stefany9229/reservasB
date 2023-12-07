package com.example.reservasB.application.controller;

import com.example.reservasB.application.expection.NotAllowedException;
import com.example.reservasB.application.expection.ResourceNotFoundException;
import com.example.reservasB.application.service.AppointmentService;
import com.example.reservasB.domain.dto.AppointmentCreateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;


    @GetMapping
    public ResponseEntity<?> getAllAppointments() {
        return new ResponseEntity<>(appointmentService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createAppointment(@RequestBody AppointmentCreateDTO appointmentCreateDTO) throws NotAllowedException, ResourceNotFoundException {
        appointmentService.save(appointmentCreateDTO);
        return  new ResponseEntity<>(null, HttpStatus.CREATED);
    }


}
