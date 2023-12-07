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
public class AppointmentCreateDTO {

    private Integer idClient;
    private Integer idProfessional;
    private LocalDate date;
    private LocalTime time;
}
