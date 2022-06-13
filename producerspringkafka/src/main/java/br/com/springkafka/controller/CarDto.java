package br.com.springkafka.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CarDto {

    private String id;
    private String name;
    private String brand;
}
