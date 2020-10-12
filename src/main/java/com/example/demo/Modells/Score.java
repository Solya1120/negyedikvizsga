package com.example.demo.Modells;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


@Entity
@Table(name = "Score")
@Getter
@Setter
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_seq")
    private Integer id;

    @NotNull
    @Positive
    private Integer score;

    @NotNull
    private Integer rank;
}