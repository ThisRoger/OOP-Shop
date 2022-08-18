package api.repositories.functions;

import api.repositories.Database;


public class ProductInformation
{
    void showList(Database databaseList)        // ToDo finish this list printing, its kind off a neat idea
    {
        for (int i = 0; i >= 2; i++)
        {
            System.out.println(databaseList.dataBaseList.get(i).getName());
        }
    }

    void showItemDetails(int listPosition, Database databaseList)
    {
        System.out.println("\n\nItem ID: "+databaseList.dataBaseList.get(0).getId());
        System.out.println("Item Name: "+databaseList.dataBaseList.get(0).getName());
        System.out.println("Item Type: "+databaseList.dataBaseList.get(0).getType());
        System.out.println("Item Price: "+databaseList.dataBaseList.get(0).getPrice());
        System.out.println("Item Class: "+databaseList.dataBaseList.get(0).getClass());
    }
}
