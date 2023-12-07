package com.example.reservasB.domain.dto;


import com.example.reservasB.domain.enums.ERole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private Integer id;
    private String nombre;
    private String apellido;
    private List<ERole> roles;

    public UserDTO(String nombre, String apellido, List<ERole> roles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.roles = roles;
    }
}
