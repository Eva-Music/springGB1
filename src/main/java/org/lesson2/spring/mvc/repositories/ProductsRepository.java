package org.lesson2.spring.mvc.repositories;

import org.lesson2.spring.mvc.model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductsRepository {
    private List<Product> products;
    private Integer autoId = 1;

    @PostConstruct
    public void init() {
        this.products = new ArrayList<>();
        this.products.add(new Product(autoId++, "Watermelon", 20.4));
        this.products.add(new Product(autoId++, "Meat", 80.1));
        this.products.add(new Product(autoId++, "Milk", 10.0));
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }

    public Product addProduct(Product product) {
        Integer id = product.getId();
        if (id == null){
            product.setId(autoId++);
        }
        if (isExist(id)) {
            modifyProduct(product, id);
        }
        else{
            products.add(product);
        }
        return product;
    }

    public Product getById(Integer id) {
        return isExist(id) ? products.stream().filter(x -> x.getId().equals(id))
                .collect(Collectors.toList()).get(0) :
                new Product(0, "0", 0.0);
    }

    public void modifyProduct(Product product, Integer id){
        products.set(id-1, product);
    }

    public boolean isExist(Integer id) {
        return products.stream().anyMatch(x -> x.getId().equals(id));
    }
}

