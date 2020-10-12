package com.example.demo.Modells;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "User")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_seq")
    private Integer id;

    @NotNull
    @Size(min = 4, message= "Nem elég hosszú a felhasználónév.")
    private String username;

    @NotNull
    @Size(min = 4, message= "Nem elég hosszú a jelszó.")
    private String password;
    private Integer regTime;
}