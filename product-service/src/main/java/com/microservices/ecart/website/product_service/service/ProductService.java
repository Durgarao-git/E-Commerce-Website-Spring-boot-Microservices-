package com.microservices.ecart.website.product_service.service;

import com.microservices.ecart.website.product_service.dto.ProductRequest;
import com.microservices.ecart.website.product_service.dto.ProductResponse;
import com.microservices.ecart.website.product_service.model.Product;
import com.microservices.ecart.website.product_service.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ProductRepository productRepository;

    Logger logger=LoggerFactory.getLogger(ProductService.class);

    public ProductResponse createProduct(ProductRequest productRequest){
        Product product=modelMapper.map(productRequest, Product.class);
        Product savedProduct=productRepository.save(product);

        logger.info("Product is Created");
        return (modelMapper.map(savedProduct,ProductResponse.class));
    }

    public List<ProductResponse> getAllProducts(){
        List<ProductResponse> products=productRepository.findAll().stream()
                .map(product -> modelMapper.map(product, ProductResponse.class)).collect(Collectors.toList());

        return products;
    }
}
