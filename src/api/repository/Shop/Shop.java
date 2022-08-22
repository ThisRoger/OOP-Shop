package api.repository.Shop;

import api.repository.productsDatabase;
import java.util.Scanner;
import api.repository.functions.*;
import utility.ProductsWarehouse;    // import for testing


public class Shop
{
    ProductInformationPrinter itemInfo;
    NewProductCreator itemCreate;
    Scanner scanner;
    productsDatabase database;
    MenuOptionsSelector menu;

    public Shop()
    {
        itemInfo = new ProductInformationPrinter();
        itemCreate = new NewProductCreator();
        scanner = new Scanner(System.in);
        database = new productsDatabase();
        menu = new MenuOptionsSelector();
    }

    public void startShopping()
    {
        System.out.print("Welcome to the Tesco Zone!\nOnly the freshest products.\n\n");
        ProductsWarehouse.testCollection(database);        // Testing by adding a few products into the database list
        boolean isShopping = true;

        while(isShopping)
        {
            isShopping = menu.menuSelectionAction(menu.MenuSelection(scanner), database, itemInfo, scanner, itemCreate);
        }
        System.out.println("Thanks for Shopping brah <3");
    }
}