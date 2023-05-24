package onlinemusicshop.service;

import onlinemusicshop.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    void create(Product product);

    }
