package api.repository.functions;

import api.models.Type;
import api.repository.productsDatabase;
import java.util.Scanner;


public class ItemEditor
{
    public void selectEditableItem(productsDatabase database, ProductInformationPrinter itemInfo, Scanner scanner, NewProductCreator config)
    {
        itemInfo.showList(database);
        System.out.print("\n-------------------------------------------------------");

        int item;
        boolean isEditable = true;

        while(isEditable)
        {
            System.out.print("\nSelect which item ID do you want to edit: ");
            item = scanner.nextInt();
            for (int i = 1000; i <= (999+(database.products.size())); i++)
            {
                if (item == database.products.get((i - 1000)).getId())  // checks if ID exists in database list
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

    void editSelectedItem(int selection, productsDatabase database, Scanner scanner, NewProductCreator config)
    {
        database.products.get(selection).setName(config.setProductName(scanner));
        database.products.get(selection).setType(Type.valueOf(config.setProductType(scanner)));
        database.products.get(selection).setPrice(config.setProductPrice(scanner));

        System.out.print("\n\nItem was updated successfully!");
    }
}
