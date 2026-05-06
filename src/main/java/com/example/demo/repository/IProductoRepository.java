package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Producto;


public interface IProductoRepository extends JpaRepository<Producto, Long> {
}