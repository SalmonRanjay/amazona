package com.ranjay.amazonaApi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  @JsonProperty("_id") private int id;
  private String name;
  private String category;
  private String image;
  private Long price;
  private int countInStock;
  private String brand;
  private float rating;
  private int numReviews;
  private String description;


}
