package isaccanedo.springframework.services;

import isaccanedo.springframework.commands.ProductForm;
import isaccanedo.springframework.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
