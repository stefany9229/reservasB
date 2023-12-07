package com.example.reservasB.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentResponseDTO {

    private Integer idAppointment;
    private LocalDate date; // solo fecha, por ejemplo, 10/11/2023
    private LocalTime time; // solo hora, por ejemplo, 10:00
    private String clientName;
    private String professionalName;

}
