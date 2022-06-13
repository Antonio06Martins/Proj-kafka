package br.com.antonio.kafka.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarDto {

    private String id;
    private String model;
    private String color;

}
