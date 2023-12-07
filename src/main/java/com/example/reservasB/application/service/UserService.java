package com.example.reservasB.application.service;

import com.example.reservasB.domain.dto.UserDTO;
import com.example.reservasB.domain.model.User;
import com.example.reservasB.domain.repository.IUserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {


    private final IUserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(UserDTO userDTO) {
        User user = User.builder()
                .apellido(userDTO.getApellido())
                .nombre(userDTO.getNombre())
                .roles(userDTO.getRoles())
                .build();
        return userRepository.save(user);
    }

}
