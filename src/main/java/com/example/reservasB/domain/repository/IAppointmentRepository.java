package com.example.reservasB.domain.repository;


import com.example.reservasB.domain.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {

}

