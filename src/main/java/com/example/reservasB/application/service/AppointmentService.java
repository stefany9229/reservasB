package com.example.reservasB.application.service;

import com.example.reservasB.application.expection.NotAllowedException;
import com.example.reservasB.application.expection.ResourceNotFoundException;
import com.example.reservasB.domain.dto.AppointmentCreateDTO;
import com.example.reservasB.domain.dto.AppointmentResponseDTO;
import com.example.reservasB.domain.enums.ERole;
import com.example.reservasB.domain.model.Appointment;
import com.example.reservasB.domain.model.User;
import com.example.reservasB.domain.repository.IAppointmentRepository;
import com.example.reservasB.domain.repository.IUserRepository;
import com.example.reservasB.utils.mappers.MapperAppointment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AppointmentService {

    private final IAppointmentRepository appointmentRepository;
    private final IUserRepository userRepository;

    public List<AppointmentResponseDTO> findAll() {
        return appointmentRepository.findAll().stream()
                .map(a -> MapperAppointment.mapperAppointmentDTO(a))
                .collect(Collectors.toList());
    }

    public Appointment save(AppointmentCreateDTO aDTO) throws ResourceNotFoundException, NotAllowedException {
        User client = userRepository.findById(aDTO.getIdClient()).orElseThrow(() -> new ResourceNotFoundException("Cliente no existe"));
        User professioal = userRepository.findById(aDTO.getIdProfessional()).orElseThrow(() -> new ResourceNotFoundException("Cliente no existe"));

        if (!professioal.getRoles().contains(ERole.PROFESSIONAL)) {
            throw new NotAllowedException("Debe escoger un profesional válido");
        }

        Appointment appointment= Appointment.builder()
                .professional(professioal)
                .client(client)
                .fecha(MapperAppointment.combineLocalDateAndTime(aDTO.getDate(),aDTO.getTime()))
                .build();
        appointmentRepository.save(appointment);
        return appointment;
    }
}
