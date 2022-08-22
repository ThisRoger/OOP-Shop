package api.repository.functions;

import api.repository.productsDatabase;


public class ProductInformationPrinter
{
    public void showList(productsDatabase databaseList)
    {
        for (int i = 0; i <= (databaseList.products.size()) - 1; i++)
        {
            System.out.println("\n\nItem ID: "+databaseList.products.get(i).getId());
            System.out.println("Item Name: "+databaseList.products.get(i).getName());
            System.out.println("Item Type: "+databaseList.products.get(i).getType());
            System.out.printf("Item Price: %.2fPLN\n", databaseList.products.get(i).getPrice());
            System.out.println("Item Class: "+databaseList.products.get(i).getClass());
        }
    }

}
