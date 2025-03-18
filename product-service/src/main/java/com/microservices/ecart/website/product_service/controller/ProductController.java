package com.microservices.ecart.website.product_service.controller;

import com.microservices.ecart.website.product_service.dto.ProductRequest;
import com.microservices.ecart.website.product_service.dto.ProductResponse;
import com.microservices.ecart.website.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest){
        return new ResponseEntity<>(productService.createProduct(productRequest),HttpStatus.CREATED);
    }

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<ProductResponse>> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }
}
