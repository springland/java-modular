package product.service.impl;

import product.model.Product;
import product.service.ProductService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductServiceImpl implements ProductService {

    private List<Product> products ;

    public ProductServiceImpl()
    {
        products = Stream.of(
                Product.builder().name("A").desc("Product-A").build(),
                Product.builder().name("B").desc("Product-B").build(),
                Product.builder().name("C").desc("Product-C").build()
        ).collect(Collectors.toList());

    }
    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product getProductByName(String name) {
        return null;
    }
}
