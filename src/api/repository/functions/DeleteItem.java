package api.repository.functions;

import api.repository.Database;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class DeleteItem
{
    public void shoppingDeletion(Database database, List<Integer> shopping)
    {
        Collections.sort(shopping);

        for (int i = (shopping.size()-1); i >= 0; i--)
        {
            for (int j = (database.dataBaseList.size()-1); j >= 0 ; j--)
            {
                if (shopping.get(i).equals(database.dataBaseList.get(j).getId()))
                {
                    database.dataBaseList.remove(j);
                }
            }
        }

    }

    public void singleDeletion(Database database, ProductInformation itemInfo, Scanner scanner)
    {
        itemInfo.showList(database);
        System.out.print("\n-------------------------------------------------------");

        int item;
        boolean isDeletable = false;

        while(!isDeletable)
        {
            System.out.print("\nSelect which item ID do you want to delete: ");
            item = scanner.nextInt();
            for (int i = 1000; i <= (999+(database.dataBaseList.size())); i++)
            {
                if (item == database.dataBaseList.get((i-1000)).getId())  // checks if ID exists in database list
                {
                    database.dataBaseList.remove(i-1000);
                    System.out.print("\nItem successfully deleted.");
                    isDeletable = true;
                }
            }
        }







    }
}
