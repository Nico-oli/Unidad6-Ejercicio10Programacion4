package com.example.demo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProductoCreateRequestDto(
    
    @NotBlank String nombre,
    @NotNull @Positive Double precio,
    String descripcion

) {
    
}
