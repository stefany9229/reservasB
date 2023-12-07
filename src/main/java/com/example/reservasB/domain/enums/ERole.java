package com.example.reservasB.domain.enums;

import lombok.Getter;

@Getter
public enum ERole {

    CLIENT("CLIENT"),
    PROFESSIONAL("PROFESSIONAL");

ERole(String name){
    this.name = name;
}
private String name;
}
