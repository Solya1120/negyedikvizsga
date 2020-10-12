package com.example.demo.Modells;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Wares")
@Getter
@Setter
public class Wares {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_seq")
    private Integer id;

    @NotNull
    @Size(min = 4, message= "Nem elég hosszú a termék neve.")
    private String object;

    @NotNull
    @Min(value = 1000)
    private Integer price;
}