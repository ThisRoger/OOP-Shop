package api.repository.Shop;

import api.models.Product;
import api.repository.productsDatabase;
import api.repository.functions.*;

import java.util.List;
import java.util.Scanner;


public class MenuOptionsSelector
{
    int MenuSelection(Scanner scanner)
    {
        System.out.print("\n-------------------------------------------------------\n");
        System.out.print("Select what action you want to perform:\n\nEnter the shop:  1        Browse the catalog: 2\n");
        System.out.print("Create new item: 3        Delete single item: 4\n");
        System.out.print("Database status: 5        Edit existing item: 6\nLeave the shop:  7\n\nInput: ");
        int selectedOption;

        do {
            selectedOption = scanner.nextInt();
        }while(selectedOption <= 0 || selectedOption > 7);

        return selectedOption;
    }

    boolean menuSelectionAction(int menuSelection, productsDatabase database, ProductInformationPrinter itemInfo,
                                Scanner scanner, NewProductCreator config, List<Product> productsList)
    {
        switch (menuSelection)
        {
                    case 1 -> new ShoppingBasket().shopping(database, itemInfo, scanner);
                    case 2 -> itemInfo.showList(database);
                    case 3 -> new NewProductSelection().addNewProduct(config.setSelection(scanner), config, database, scanner);
                    case 4 -> new ItemEraser().singleDeletion(database, itemInfo, scanner);
                    case 5 -> new DatabaseInformationPrinter().databaseStatusCall(productsList);
                    case 6 -> new ItemEditor().selectEditableItem(database, itemInfo, scanner, config);
            case 7 -> {
                return false;
            }
        }
    return true;
    }
}
