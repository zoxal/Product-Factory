package com.example.controller;

import com.example.dto.ProductDTO;
import com.example.service.ProductService;
import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Log
@Data
@RestController
@RequestMapping("/product-factory-app")
public class ProductController {

    private final ProductService productService;


    @GetMapping(value = "/products")
    public List<ProductDTO> getList() {
        return productService.getList();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/product/orders")
    public void createProduct(@RequestBody final ProductDTO product) {
        productService.createProduct(product);
    }
}
