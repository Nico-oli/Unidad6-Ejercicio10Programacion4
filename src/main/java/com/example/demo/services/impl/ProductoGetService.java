package com.example.demo.services.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.response.ProductoResponseDto;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.repository.IProductoRepository;
import com.example.demo.services.interfaz.IProductoGetService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductoGetService implements IProductoGetService{
    
    private final IProductoRepository productoRepository;

    @Override
    public Page<ProductoResponseDto> getAllPage(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        return productoRepository.findAll(pageable)
                .map(producto -> ProductMapper.responseDto(producto));
    }

    @Override
    public List<ProductoResponseDto> getAll() {
        return ProductMapper.listResponse(productoRepository.findAll());
    }
}
