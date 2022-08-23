package api.repository;

import api.models.Product;
import java.util.ArrayList;
import java.util.List;


public class productDatabase
{
    public List<Product> products = new ArrayList<>();   // product list

    public List<Product> getProducts()
    {
        return products;
    }

}
