package com.re.hackathon.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "watch")
@Data
@NoArgsConstructor

public class Watch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "model name cannot be blank")
    private String modelName;

    @NotBlank(message = "brand cannot be blank")
    private String brand;

    @Positive(message = "price must be > 0")
    private double price;

    private String movement_type;

    private String Status;

}
