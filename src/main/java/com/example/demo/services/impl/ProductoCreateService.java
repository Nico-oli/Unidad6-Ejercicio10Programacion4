package com.example.demo.services.impl;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.ProductoCreateRequestDto;
import com.example.demo.dto.response.ProductoResponseDto;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.models.Producto;
import com.example.demo.repository.IProductoRepository;
import com.example.demo.services.interfaz.IProductoCreateService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductoCreateService implements IProductoCreateService {

    private final IProductoRepository productoRepository;

    @Override
    public ProductoResponseDto create(ProductoCreateRequestDto dto){ 
        Producto producto = ProductMapper.toEntity(dto);
        productoRepository.save(producto);
        return ProductMapper.responseDto(producto);
    }
}
