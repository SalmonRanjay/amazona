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
          10,
          "Nike",
          (float) 4.5,
          10,
          "high quality product"),
      new Product(2,
          "Adidas Fit Shirt",
          "Shirts",
          "/images/p2.jpg",
          100l,
          4,
          "Adidas",
          4.0f,
          10,
          "high quality product"),
      new Product(
          3,
          "Lacoste Free Shirt",
          "Shirts",
          "/images/p3.jpg",
          220l,
          11,
          "Lacoste",
          4.8f,
          17,
          "high quality product"
      ),
      new Product(
          4,
          "Nike Slim Pant",
          "Pants",
          "/images/p4.jpg",
          78l,
          15,
          "Nike",
          4.5f,
          14,
          "high quality product"

      ),
      new Product(
          5,
          "Puma Slim Pant",
          "Pants",
          "/images/p5.jpg",
          65l,
          5,
          "Puma",
          4.5f,
          15,
          "high quality product"
      ),
      new Product(
          6,
          "Adidas Fit Pant",
          "Pants",
          "/images/p6.jpg",
          139l,
          12,
          "Adidas",
          4.5f,
          15,
          "high quality product"

      )

  );

  public List<Product> getAllProducts() {
    return allProducts;
  }


}
