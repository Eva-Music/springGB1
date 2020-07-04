package org.lesson2.spring.mvc.controllers;

import org.lesson2.spring.mvc.model.Product;
import org.lesson2.spring.mvc.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/products")
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("")
    public String showAllProducts(Model model) {
        model.addAttribute("products", productsService.getAllProducts());
        return "all_products";
    }

    @GetMapping("/add")
    public String addProduct() {
        return "add_product_form";
    }

    @PostMapping("/add")
    public String saveStudent(@ModelAttribute Product product) {
        productsService.addNewProduct(product);
        return "redirect:/products/";
    }


    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", productsService.getById(id));

        return "edit_product_form";
    }

    @PostMapping("/edit")
    public String modifyProduct(@ModelAttribute Product product){
      productsService.addNewProduct(product);
        return "redirect:/products/";
    }

    @GetMapping("json/{id}")
    @ResponseBody
    public Product showJson(@PathVariable Integer id){
        return productsService.getById(id);
    }
}
