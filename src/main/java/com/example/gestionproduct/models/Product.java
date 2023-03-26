package com.example.gestionproduct.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, length = 60)
    private String nombre;
    @Column(nullable = false, length = 60)
    private String marca;
    @Column(nullable = false, length = 60)
    private String hechoen;
    @Column(nullable = false)
    private BigDecimal precio;
    @Column(nullable = false)
    private int stock;

    public Product(Long id, String nombre, String marca, String hechoen, BigDecimal precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.hechoen = hechoen;
        this.precio = precio;
        this.stock = stock;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHechoen() {
        return hechoen;
    }

    public void setHechoen(String hechoen) {
        this.hechoen = hechoen;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
