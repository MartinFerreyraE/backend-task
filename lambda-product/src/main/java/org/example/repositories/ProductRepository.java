package org.example.repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.example.models.Product;

public class ProductRepository implements IProductRepository {
  private List<Product> products;

  public ProductRepository(){
    this.products = new ArrayList<>();
  }

  @Override
  public Product save(Product product) {
    this.products.add(product);
    return product;
  }

  @Override
  public Collection<Product> getAll() {
    return this.products;
  }
  
}