package api.repository.Shop;

import api.repository.ProductDatabase;
import api.repository.functions.ProductInformationPrinter;
import api.repository.functions.ScannerTypeSelector;
import java.util.ArrayList;
import java.util.List;


public class ShoppingBasket
{

    List<Integer> shopping = new ArrayList<>();

    void shopping(ProductDatabase products, ProductInformationPrinter itemInfo, ScannerTypeSelector userInput)
    {
        itemInfo.showList(products.getProducts());

        boolean isBrowsing = true;
        boolean canAddItem;
        boolean wasItemFound;
        int chosenId;
        String continueShopping;

        System.out.println("\n-------------------------------------------------------");

        while(isBrowsing)
        {
            System.out.print("\nPlease input item ID that you wish to buy: ");
            chosenId = userInput.selectProductId();   //input ID
            canAddItem = true;
            wasItemFound = true;

            for (int i = 1000; i <= (999+(products.getProducts().size())); i++)
            {
                    if (chosenId == products.getProducts().get((i-1000)).getId())  // checks if ID exists in database list
                    {
                        for (Integer integer : shopping) {
                            if (chosenId == integer)   // checks if ID exists in shopping list
                            {
                                System.out.print("\nError, item already in shopping list!");
                                canAddItem = false;
                                wasItemFound = false;
                                break;
                            }
                        }
                        if (canAddItem)     // allows adding the item to the shopping list if no errors were encountered
                        {
                            shopping.add(chosenId);
                            System.out.printf("\nItem ID = %d has been added to the basket.", chosenId);
                            wasItemFound = false;
                            break;
                        }
                    }
            }
            if(wasItemFound)       // prints if item ID wasn't detected at all
            {
                System.out.print("\nError, item not found!");
            }

            continueShopping = userInput.continueShopping();

            if (continueShopping.equals("NO"))
            {
                if (shopping.size() > 0)
                {
                    System.out.print("\nProszę umieścić produkty w strefie pakowania...");

                    CheckoutStation checkout = new CheckoutStation();

                    double basketSum = checkout.sumUp(products.getProducts(), shopping);
                    System.out.printf("\nTotal sum: %.2fPLN", basketSum);
                    System.out.print("\n\nTransaction completed! Thank you for shopping at Tesco!\n\n");
                }
                else
                {
                    System.out.print("\nShopping list is empty. Returning to main menu...\n\n");
                }
                isBrowsing = false;

            }
        }
    }
}
