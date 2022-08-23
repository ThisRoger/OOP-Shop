package api.repository.Shop;

import api.repository.productDatabase;
import api.repository.functions.*;
import utility.ProductsWarehouse;    // import for testing


public class Shop
{
    ProductInformationPrinter itemInfo;
    productDatabase database;
    MenuOptionsSelector menu;
    ScannerTypeSelector userInput;

    public Shop()
    {
        itemInfo = new ProductInformationPrinter();
        database = new productDatabase();
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
            isShopping = menu.menuSelectionAction(userInput.chooseMenuSelectionOption(), itemInfo, database.products, userInput);
        }
        System.out.println("Thanks for Shopping brah <3");
    }
}