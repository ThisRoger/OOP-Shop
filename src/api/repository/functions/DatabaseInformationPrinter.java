package api.repository.functions;

import api.models.Type;
import api.repository.productsDatabase;


public class DatabaseInformationPrinter
{
    public void databaseStatusCall(productsDatabase database)
    {

        System.out.printf("\nAmount of items in shop: %d" ,database.products.size());
        int worth=0;
        for (int i = 0; i <= (database.products.size()-1); i++)
        {
            worth+= database.products.get(i).getPrice();
        }

        int clothesAmount = 0;
        for (int i = 0; i <= (database.products.size()-1); i++)
        {
            if(database.products.get(i).getType().equals(Type.CLOTHING))
            {
                clothesAmount++;
            }
        }

        int foodAmount = 0;
        for (int i = 0; i <= (database.products.size()-1); i++)
        {
            if(database.products.get(i).getType().equals(Type.FOOD))
            {
                foodAmount++;
            }
        }

        int utilitiesAmount = 0;
        for (int i = 0; i <= (database.products.size()-1); i++)
        {
            if(database.products.get(i).getType().equals(Type.UTILITIES))
            {
                utilitiesAmount++;
            }
        }
        System.out.printf("\nAmount of FOOD products in shop: %d", foodAmount);
        System.out.printf("\nAmount of CLOTHING products in shop: %d", clothesAmount);
        System.out.printf("\nAmount of UTILITIES products in shop: %d", utilitiesAmount);
        System.out.printf("\nShop's worth in PLN: %dPLN\n\n", worth);

    }
}
