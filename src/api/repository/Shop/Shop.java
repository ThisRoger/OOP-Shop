package api.repository.Shop;

import api.models.Product;
import api.repository.ProductDatabase;
import api.repository.functions.*;
import utility.ProductsWarehouse;

import java.util.List;


public class Shop
{

    private final ProductInformationPrinter itemInfo;
    private final ProductDatabase database;
    private final ScannerTypeSelector userInput;

    public Shop()
    {
        itemInfo = new ProductInformationPrinter();
        database = new ProductDatabase();
        userInput = new ScannerTypeSelector();
    }

    public void startShopping()
    {
        System.out.print("Welcome to the Tesco Zone!\nOnly the freshest products.\n\n");
        ProductsWarehouse.testCollection(database);        // Testing by adding a few products into the database list
        boolean isShopping = true;

        while(isShopping)
        {
            isShopping = menuSelectionAction(userInput.chooseMenuSelectionOption(), itemInfo, database.getProducts(), userInput);
        }
        System.out.println("Thanks for Shopping brah <3");
    }



    boolean menuSelectionAction(int menuSelectedOption, ProductInformationPrinter itemInfo, List<Product> products,
                                ScannerTypeSelector userInput)
    {
        switch (menuSelectedOption)
        {
                    case 1 -> new ShoppingBasket().shopping(products, itemInfo, userInput);
                    case 2 -> itemInfo.showList(products);
                    case 3 -> new NewProductCreator().addNewProduct(userInput.newItemSelection(), userInput, products);
                    case 4 -> new ItemEraser().singleDeletion(products, itemInfo, userInput);
                    case 5 -> new DatabaseInformationPrinter().databaseStatusCall(products);
                    case 6 -> new ItemEditor().selectEditableItem(products, itemInfo, userInput);
            case 7 -> {
                return false;
            }
        }
    return true;
    }
}
