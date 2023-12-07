package com.example.reservasB.utils.mappers;

import com.example.reservasB.domain.dto.AppointmentResponseDTO;
import com.example.reservasB.domain.model.Appointment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public  class MapperAppointment {

    public static AppointmentResponseDTO mapperAppointmentDTO(Appointment a){
       //DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        AppointmentResponseDTO dto= AppointmentResponseDTO.builder()
                .idAppointment(a.getId())
                .time(a.getFecha().toLocalTime())
                .date(a.getFecha().toLocalDate())
                .clientName(a.getClient().getNombre() +" " + a.getClient().getApellido())
                .professionalName(a.getProfessional().getNombre() + " " +a.getProfessional().getApellido())
                .build();
        return dto;
    }

    public static LocalDateTime combineLocalDateAndTime(LocalDate date, LocalTime time) {
        return LocalDateTime.of(date, time);
    }
}
