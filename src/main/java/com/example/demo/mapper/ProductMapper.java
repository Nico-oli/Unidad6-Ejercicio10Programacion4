package com.example.demo.mapper;

import java.util.List;

import com.example.demo.dto.request.ProductoCreateRequestDto;
import com.example.demo.dto.response.ProductoResponseDto;
import com.example.demo.models.Producto;

public class ProductMapper {
    

    public static Producto toEntity(ProductoCreateRequestDto dto){

        Producto producto = Producto.builder()
                    .nombre(dto.nombre())
                    .precio(dto.precio())
                    .descripcion(dto.descripcion())
                    .build();
        return producto;
    }

    public static ProductoResponseDto responseDto(Producto producto){
        ProductoResponseDto dto = new ProductoResponseDto(producto.getNombre(), producto.getPrecio(), producto.getDescripcion());
        return dto;
    }


    public static List<ProductoResponseDto> listResponse(List<Producto> productos){

        return productos.stream().map(producto -> responseDto(producto)).toList();

    }



}
