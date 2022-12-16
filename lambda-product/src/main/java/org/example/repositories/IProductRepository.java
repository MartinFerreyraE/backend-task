package org.example.repositories;

import java.util.Collection;

import org.example.models.Product;

public interface IProductRepository {
  Product save(Product product);
  Collection<Product> getAll();
}