package org.example.services;

import java.util.List;

import org.example.models.Product;

public interface IAthenaService {
  String submitQuery(String myQuery);
  void waitForQueryToComplete(String queryExecutionId);
    List<Product> processQueryResult(String queryExecutionId);
}