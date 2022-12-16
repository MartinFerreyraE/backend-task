package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.example.models.Product;
import org.example.repositories.IProductRepository;
import org.example.repositories.ProductRepository;

@Configuration
public class RepositoriesConfigurator {
  @Bean
  public IProductRepository initProductRepository(){
    ProductRepository productRepository = new ProductRepository();
    productRepository.save(
      new Product("46718563-764281", "fanta", 3)
    );
    productRepository.save(
      new Product("16742891-465469", "dulce de leche", 1)
    );

    return productRepository;
  }
}