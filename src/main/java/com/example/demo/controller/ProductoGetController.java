package com.example.demo.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.response.ProductoResponseDto;
import com.example.demo.services.interfaz.IProductoGetService;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoGetController {

    private final IProductoGetService getService;
    
    @GetMapping("/Page")
    public ResponseEntity<Page<ProductoResponseDto>> getAllPage(@RequestParam(defaultValue = "0") int page,
                                                            @RequestParam(defaultValue = "3") int size) {
                                                        
        return ResponseEntity.ok(getService.getAllPage(page, size));
        
    }
    

    @GetMapping()
    public ResponseEntity<List<ProductoResponseDto>> getAll(){
        return ResponseEntity.ok().body(getService.getAll());
    }

}
