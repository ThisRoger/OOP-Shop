package api.repository.Shop;

import api.repository.Database;
import api.repository.functions.*;

import java.util.Scanner;


public class MainMenu
{
    int MenuSelection(Scanner scanner)
    {
        System.out.print("\n-------------------------------------------------------\n");
        System.out.print("Select what action you want to perform:\n\nEnter the shop:  1        Browse the catalog: 2\n");
        System.out.print("Create new item: 3        Delete single item: 4\n");
        System.out.print("Database status: 5        Edit existing item: 6\nLeave the shop:  7\n\nInput: ");
        int selection;

        do {
            selection = scanner.nextInt();
        }while(selection <= 0 || selection > 7);

        return selection;
    }

    boolean MenuSelectionAction(int menuSelection, Database database, ProductInformation itemInfo, Scanner scanner,
                                NewItemConfig config, NewProductSelection createItem, DeleteItem deletion, EditItem edit)
    {
        switch (menuSelection)
        {
                    case 1 -> {

                        ShoppingBrowsing buy = new ShoppingBrowsing();
                        buy.shopping(database, itemInfo, scanner);
                    }
                    case 2 -> {

                        itemInfo.showList(database);
                        System.out.println();
                    }
                    case 3 -> {
                        // add a new product to the database list
                        createItem.addNewProduct(config.setSelection(scanner), config, database, scanner);
                    }
                    case 4 ->{

                        deletion.singleDeletion(database, itemInfo, scanner);
                    }
                    case 5 -> {

                        DatabaseInformation dataInfo = new DatabaseInformation();
                        dataInfo.callInformation(database);
                    }
                    case 6 -> {

                        edit.selectEditableItem(database, itemInfo, scanner, config);
                    }
                    case 7 -> {

                        return false;
                    }

        }
    return true;
    }
}
