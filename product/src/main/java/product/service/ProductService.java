package product.service;

import product.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProducts();

    public Product getProductByName(String name);
}
