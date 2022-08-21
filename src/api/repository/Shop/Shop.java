package api.repository.Shop;

import api.repository.Database;
import java.util.Scanner;

import api.repository.functions.*;
import tests.DatabaseCollection;    // import for testing


public class Shop
{
    public void shopMenu()
    {

        System.out.print("Welcome to the Tesco Zone!\nOnly the freshest products.\n\n");

        // creating all necessary objects
        NewProductSelection createItem = new NewProductSelection();
        ProductInformation itemInfo = new ProductInformation();
        NewItemConfig config = new NewItemConfig();
        Scanner scanner = new Scanner(System.in);
        DeleteItem delete = new DeleteItem();
        Database database = new Database();
        MainMenu menu = new MainMenu();
        EditItem edit = new EditItem();

        DatabaseCollection.testCollection(database);        // Testing by adding a few products into the database list


        boolean isShopping = true;

        while(isShopping)
        {
            isShopping = menu.MenuSelectionAction(menu.MenuSelection(scanner), database,itemInfo, scanner,
                    config, createItem, delete, edit);
        }
        System.out.println("Thanks for Shopping brah <3");







    }
}
