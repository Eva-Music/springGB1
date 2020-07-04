package org.lesson2.spring.mvc.services;

import org.lesson2.spring.mvc.model.Product;
import org.lesson2.spring.mvc.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getAllProducts(){
        return productsRepository.findAll();
    }

    public Product addNewProduct(Product product){
        return productsRepository.addProduct(product);
    }

    public Product getById(Integer id){
        return productsRepository.getById(id);
    }
}
