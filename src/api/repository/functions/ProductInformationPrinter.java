package api.repository.functions;

import api.models.Product;
import java.util.List;


public class ProductInformationPrinter
{
    public void showList(List<Product> databaseList)
    {
        for (int i = 0; i <= (databaseList.size()) - 1; i++)
        {
            System.out.println("\n\nItem ID: "+databaseList.get(i).getId());
            System.out.println("Item Name: "+databaseList.get(i).getName());
            System.out.println("Item Type: "+databaseList.get(i).getType());
            System.out.printf("Item Price: %.2fPLN\n", databaseList.get(i).getPrice());
            System.out.println("Item Class: "+databaseList.get(i).getClass());
        }
    }

}
