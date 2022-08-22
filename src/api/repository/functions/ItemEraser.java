package api.repository.functions;

import api.repository.productsDatabase;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ItemEraser
{
    public void shoppingDeletion(productsDatabase database, List<Integer> shopping)
    {
        Collections.sort(shopping);

        for (int i = (shopping.size()-1); i >= 0; i--)
        {
            for (int j = (database.products.size()-1); j >= 0 ; j--)
            {
                if (shopping.get(i).equals(database.products.get(j).getId()))
                {
                    database.products.remove(j);
                }
            }
        }

    }

    public void singleDeletion(productsDatabase database, ProductInformationPrinter itemInfo, Scanner scanner)
    {
        itemInfo.showList(database);
        System.out.print("\n-------------------------------------------------------");

        int item;
        boolean isDeletable = false;

        while(!isDeletable)
        {
            System.out.print("\nSelect which item ID do you want to delete: ");
            item = scanner.nextInt();
            for (int i = 1000; i <= (999+(database.products.size())); i++)
            {
                if (item == database.products.get((i-1000)).getId())  // checks if ID exists in database list
                {
                    database.products.remove(i-1000);
                    System.out.print("\nItem successfully deleted.");
                    isDeletable = true;
                }
            }
        }







    }
}
