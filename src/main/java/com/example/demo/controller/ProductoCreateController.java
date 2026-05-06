package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.ProductoCreateRequestDto;
import com.example.demo.dto.response.ProductoResponseDto;
import com.example.demo.services.interfaz.IProductoCreateService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoCreateController {

    private final IProductoCreateService productoCreate;
    
    @PostMapping()
    public ResponseEntity<ProductoResponseDto> crated(@Valid @RequestBody ProductoCreateRequestDto dto) {
        return ResponseEntity.ok().body(productoCreate.create(dto));
    }
}
