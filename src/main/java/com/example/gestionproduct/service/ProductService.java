package com.example.gestionproduct.service;

import java.util.List;

import com.example.gestionproduct.repository.crud.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionproduct.models.Product;

@Service
public class ProductService {

    @Autowired
    private ProductCrudRepository productRepository;

    public List<Product> listarProductos(String PalabraClave) {
        if (PalabraClave != null) {
            return (List<Product>) productRepository.findProducts(PalabraClave);
        }
        return (List<Product>) productRepository.findAll();
    }

    public Product guardarProducto(Product product) {
        return productRepository.save(product);
    }

    public Product obtenerProductoPorID(Long id) {
        return productRepository.findById(id).get();
    }

    public void eliminarProducto(Long id) {
        productRepository.deleteById(id);
    }
}
