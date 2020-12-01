package com.ranjay.amazonaApi.service;

import com.ranjay.amazonaApi.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
  private List<Product> allProducts = List.of(
      new Product(1,
          "Nike Slim Shirt",
          "Shirts",
          "/images/p1.jpg",
          120l,
          "Nike",
          (float) 4.5,
          10,
          "high quality product"),
      new Product(2,
          "Adidas Fit Shirt",
          "Shirts",
          "/images/p2.jpg",
          100l,
          "Adidas",
          4.0f,
          10,
          "high quality product"),
      new Product(
          '4',
          "Lacoste Free Shirt",
          "Shirts",
          "/images/p3.jpg",
           220l,
          "Lacoste",
          4.8f,
          17,
          "high quality product"
          )

  );

  public List<Product> getAllProducts() {
    return allProducts;
  }


}
