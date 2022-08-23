package api.repository.Shop;

import api.repository.ProductDatabase;
import api.repository.functions.*;
import utility.ProductsWarehouse;    // import for testing


public class Shop
{
    private final ProductInformationPrinter itemInfo;
    private final ProductDatabase database;
    private final MenuOptionsSelector menu;
    private final ScannerTypeSelector userInput;

    {
        itemInfo = new ProductInformationPrinter();
        database = new ProductDatabase();
        userInput = new ScannerTypeSelector();
        menu = new MenuOptionsSelector();
    }

    public void startShopping()
    {
        System.out.print("Welcome to the Tesco Zone!\nOnly the freshest products.\n\n");
        ProductsWarehouse.testCollection(database);        // Testing by adding a few products into the database list
        boolean isShopping = true;

        while(isShopping)
        {
            isShopping = menu.menuSelectionAction(userInput.chooseMenuSelectionOption(), itemInfo, database.getProducts(), userInput);
        }
        System.out.println("Thanks for Shopping brah <3");
    }
}