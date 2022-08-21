package api.repository.functions;

import api.repository.Database;


public class ProductInformation
{
    public void showList(Database databaseList)
    {
        for (int i = 0; i <= (databaseList.dataBaseList.size()) - 1; i++)
        {
            System.out.println("\n\nItem ID: "+databaseList.dataBaseList.get(i).getId());
            System.out.println("Item Name: "+databaseList.dataBaseList.get(i).getName());
            System.out.println("Item Type: "+databaseList.dataBaseList.get(i).getType());
            System.out.printf("Item Price: %.2fPLN\n", databaseList.dataBaseList.get(i).getPrice());
            System.out.println("Item Class: "+databaseList.dataBaseList.get(i).getClass());
        }
    }

}
