package com.example.demo.Modells;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


@Entity
@Table(name = "CurrentGame")
@Getter
@Setter
public class CurrentGame {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_seq")
    private Integer id;

    private String color;

    @NotNull
    @Positive
    private Integer balance;

    @NotNull
    @Positive
    private Integer sumBalance;

    @NotNull
    private Integer userId;
}