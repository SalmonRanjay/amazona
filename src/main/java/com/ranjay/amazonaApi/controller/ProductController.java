package com.ranjay.amazonaApi.controller;

import com.ranjay.amazonaApi.models.Product;
import com.ranjay.amazonaApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

  private final ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/")
  public List<Product> getAllProducts(){
    return productService.getAllProducts();
  }
}
