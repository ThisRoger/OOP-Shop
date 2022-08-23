package api.repository.functions;

import api.models.Product;
import api.models.Type;
import api.repository.productsDatabase;

import java.util.List;


public class DatabaseInformationPrinter
{
    int warehouseClothesStatus(List<Product> productsList)
    {
        int clothesAmount = 0;
        for (int i = 0; i <= (productsList.size()-1); i++)
        {
            if(productsList.get(i).getType().equals(Type.CLOTHING))
            {
                clothesAmount++;
            }
        }
        return clothesAmount;
    }

    int warehouseFoodStatus(List<Product> productsList)
    {
        int foodAmount = 0;
        for (int i = 0; i <= (productsList.size()-1); i++)
        {
            if(productsList.get(i).getType().equals(Type.FOOD))
            {
                foodAmount++;
            }
        }
        return foodAmount;
    }

    int warehouseUtilitiesStatus(List<Product> productsList)
    {
        int utilitiesAmount = 0;
        for (int i = 0; i <= (productsList.size()-1); i++)
        {
            if(productsList.get(i).getType().equals(Type.UTILITIES))
            {
                utilitiesAmount++;
            }
        }
        return utilitiesAmount;
    }

    double warehouseWorthStatus(List<Product> productList)
    {
        double worth=0;
        for (int i = 0; i <= (productList.size()-1); i++)
        {
            worth+= productList.get(i).getPrice();
        }
        return worth;
    }

    public void databaseStatusCall(List<Product> productList)
    {

        System.out.printf("\nAmount of items in shop: %d" ,productList.size());
        System.out.printf("\nAmount of FOOD products in shop: %d", warehouseFoodStatus(productList));
        System.out.printf("\nAmount of CLOTHING products in shop: %d", warehouseClothesStatus(productList));
        System.out.printf("\nAmount of UTILITIES products in shop: %d", warehouseUtilitiesStatus(productList));
        System.out.printf("\nShop's worth in PLN: %.2fPLN\n\n", warehouseWorthStatus(productList));
    }
}
