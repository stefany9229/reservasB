package com.example.reservasB.application.service;

import com.example.reservasB.domain.dto.UserDTO;
import com.example.reservasB.domain.enums.ERole;
import com.example.reservasB.domain.model.User;
import com.example.reservasB.domain.repository.IAppointmentRepository;
import com.example.reservasB.domain.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class DataLoader implements ApplicationRunner {


    private final UserService userService;
    private final IAppointmentRepository appointmentRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

    List<User> users= new ArrayList<>();

        UserDTO user1=new UserDTO("Maria","Maria",List.of(ERole.PROFESSIONAL));
        users.add(userService.save(user1));
        UserDTO user2=new UserDTO("Alberto","Pérez",List.of(ERole.PROFESSIONAL,ERole.CLIENT));
        users.add(userService.save(user2));
        UserDTO user3=new UserDTO("Lucrecia","Furlan",List.of(ERole.CLIENT));
        users.add(userService.save(user3));
        UserDTO user4=new UserDTO("Ernesto","Muñoz",List.of(ERole.PROFESSIONAL,ERole.CLIENT));
        users.add(userService.save(user4));


    }
}
