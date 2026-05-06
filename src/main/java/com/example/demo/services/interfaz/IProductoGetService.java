package com.example.demo.services.interfaz;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.dto.response.ProductoResponseDto;

public interface IProductoGetService {
   Page<ProductoResponseDto> getAllPage(int page, int size);
   List<ProductoResponseDto> getAll();
}
