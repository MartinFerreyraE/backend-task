package org.example.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
  private String prodId;
  private String name;
  private int qty;

  public Product(String prodId, String name, int qty){
    this.prodId = prodId;
    this.name = name;
    this.qty = qty;
  }
}