package com.example.reservasB.enums;

import lombok.Getter;

@Getter
public enum ERole {

    USER("USER"),
    PROFESSIONAL("PROFESSIONAL");

ERole(String name){
    this.name = name;
}
private String name;
}
