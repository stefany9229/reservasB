package com.example.reservasB.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Appointment {

    @Id
    @SequenceGenerator(
            name = "appointment_id_sequence",
            sequenceName = "appointment_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "appointment_id_sequence"
    )
    private Integer id;

    private LocalDateTime fecha;

    @ManyToOne
    private User client;

    @ManyToOne
    private User professional;
}
