package com.example.demo.services.interfaz;

import com.example.demo.dto.request.ProductoCreateRequestDto;
import com.example.demo.dto.response.ProductoResponseDto;


public interface IProductoCreateService {
    ProductoResponseDto create(ProductoCreateRequestDto dto);
}
