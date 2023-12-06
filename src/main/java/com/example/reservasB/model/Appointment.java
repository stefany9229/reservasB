package com.example.reservasB.model;

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
            name = "appointment _id_sequence",
            sequenceName = "appointment _id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "appointment _id_sequence"
    )

    private Integer id;

    private LocalDateTime fecha;

    @ManyToOne
    private User client;

    @ManyToOne
    private User professional;
}
