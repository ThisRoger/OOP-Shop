package api.repository.Shop;

import api.models.Product;
import api.repository.functions.*;
import java.util.List;


public class MenuOptionsSelector
{

    boolean menuSelectionAction(int menuSelection, ProductInformationPrinter itemInfo,
                                List<Product> productList, ScannerTypeSelector userInput)
    {
        switch (menuSelection)
        {
                    case 1 -> new ShoppingBasket().shopping(productList, itemInfo, userInput);
                    case 2 -> itemInfo.showList(productList);
                    case 3 -> new NewProductCreator().addNewProduct(userInput.newItemSelection(), userInput, productList);
                    case 4 -> new ItemEraser().singleDeletion(productList, itemInfo, userInput);
                    case 5 -> new DatabaseInformationPrinter().databaseStatusCall(productList);
                    case 6 -> new ItemEditor().selectEditableItem(productList, itemInfo, userInput);
            case 7 -> {
                return false;
            }
        }
    return true;
    }
}
