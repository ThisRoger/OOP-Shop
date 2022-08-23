package api.repository;

import api.models.Product;
import java.util.ArrayList;
import java.util.List;


public class ProductDatabase
{
    private final List<Product> products = new ArrayList<>();   // product list

    public List<Product> getProducts()
    {
        return products;
    }

    public void setProducts(Product products)
    {
        this.products.add(products);
    }
}
