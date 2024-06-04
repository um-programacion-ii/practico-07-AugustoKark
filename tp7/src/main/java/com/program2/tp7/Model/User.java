package com.program2.tp7.Model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
}
