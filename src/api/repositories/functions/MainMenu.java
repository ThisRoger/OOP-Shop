package api.repositories.functions;

import api.repositories.Database;
import java.util.Scanner;


public class MainMenu
{
    public static void shopMenu()
    {
        Scanner scanner = new Scanner(System.in);
        NewProductSelection createItem = new NewProductSelection();
        ProductInformation itemInfo = new ProductInformation();
        Database database = new Database();
        NewItemConfig config = new NewItemConfig();

        int selection;

        System.out.print("Select which product do you want to add:\n\nEggs: 1           Bread: 2\n");
        System.out.print("Shirt: 3          Trousers: 4\n\n");

        selection = scanner.nextInt();
        createItem.addNewProduct(selection, config, database);
        itemInfo.showItemDetails(0, database);



    }
}
