package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "USER")
public class User implements Serializable {
    @Column(name = "username", nullable = false, unique = true)
    private String username = "";

    @Column(name = "password", nullable = false)
    private String password = "";


}
