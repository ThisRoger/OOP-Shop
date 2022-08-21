package api.repository.functions;


import api.models.Type;
import api.repository.Database;

public class DatabaseInformation
{
    public void callInformation(Database database)
    {

        System.out.printf("\nAmount of items in shop: %d" ,database.dataBaseList.size());
        int worth=0;
        for (int i = 0; i <= (database.dataBaseList.size()-1); i++)
        {
            worth+= database.dataBaseList.get(i).getPrice();
        }

        int clothesAmount = 0;
        for (int i = 0; i <= (database.dataBaseList.size()-1); i++)
        {
            if(database.dataBaseList.get(i).getType().equals(Type.CLOTHING))
            {
                clothesAmount++;
            }
        }

        int foodAmount = 0;
        for (int i = 0; i <= (database.dataBaseList.size()-1); i++)
        {
            if(database.dataBaseList.get(i).getType().equals(Type.FOOD))
            {
                foodAmount++;
            }
        }

        int utilitiesAmount = 0;
        for (int i = 0; i <= (database.dataBaseList.size()-1); i++)
        {
            if(database.dataBaseList.get(i).getType().equals(Type.UTILITIES))
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
