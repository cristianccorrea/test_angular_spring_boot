package com.example.gestionproduct.repository.crud;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.gestionproduct.models.Product;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product, Long> {
    @Query(value = "SELECT p.* FROM product p WHERE p.nombre LIKE %?1% OR p.marca LIKE %?1% OR p.hechoen LIKE %?1% OR p.precio LIKE %?1%", nativeQuery = true)
    public List<Product> findProducts(String PalabraClave);
}
