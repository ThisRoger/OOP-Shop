package api.repository.functions;

import api.models.Type;
import api.repository.Database;
import java.util.Scanner;


public class EditItem
{
    public void selectEditableItem(Database database, ProductInformation itemInfo, Scanner scanner, NewItemConfig config)
    {
        itemInfo.showList(database);
        System.out.print("\n-------------------------------------------------------");

        int item;
        boolean isEditable = true;

        while(isEditable)
        {
            System.out.print("\nSelect which item ID do you want to edit: ");
            item = scanner.nextInt();
            for (int i = 1000; i <= (999+(database.dataBaseList.size())); i++)
            {
                if (item == database.dataBaseList.get((i - 1000)).getId())  // checks if ID exists in database list
                {
                    editSelectedItem((i-1000), database, scanner, config);      // passes index to next function
                    isEditable = false;
                }
            }
            if(isEditable)  // Item ID wasn't found
            {
                System.out.print("\nError, item not found!");
            }
        }
    }

    void editSelectedItem(int selection, Database database, Scanner scanner, NewItemConfig config)
    {
        database.dataBaseList.get(selection).setName(config.setProductName(scanner));
        database.dataBaseList.get(selection).setType(Type.valueOf(config.setProductType(scanner)));
        database.dataBaseList.get(selection).setPrice(config.setProductPrice(scanner));

        System.out.print("\n\nItem was updated successfully!");
    }
}
