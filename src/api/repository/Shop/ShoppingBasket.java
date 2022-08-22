package api.repository.Shop;

import api.repository.productsDatabase;
import api.repository.functions.ProductInformationPrinter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ShoppingBasket
{
    List<Integer> shopping = new ArrayList<Integer>();

    void shopping(productsDatabase database, ProductInformationPrinter itemInfo, Scanner scanner)
    {
        itemInfo.showList(database);

        boolean isBrowsing = true;
        boolean canAddItem;
        boolean wasItemFound;
        int chosenId;
        String continueShopping;

        System.out.println("\n-------------------------------------------------------");

        while(isBrowsing)
        {
            System.out.print("\nPlease input item ID that you wish to buy: ");
            chosenId = scanner.nextInt();   //input ID
            canAddItem = true;
            wasItemFound = true;

            for (int i = 1000; i <= (999+(database.products.size())); i++)
            {
                    if (chosenId == database.products.get((i-1000)).getId())  // checks if ID exists in database list
                    {
                        for (int j = 0; j < (shopping.size()); j++)
                        {
                            if (chosenId == shopping.get(j))   // checks if ID exists in shopping list
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

            do  // checks if user wishes to continue shopping
            {
                System.out.print("\nContinue shopping?\nYES or NO:  ");
                continueShopping = scanner.next();
                continueShopping = continueShopping.toUpperCase();
            }while (!continueShopping.equals("YES") && !continueShopping.equals("NO"));

            if (continueShopping.equals("NO"))
            {
                if (shopping.size() > 0)
                {
                    System.out.print("\nProszę umieścić produkty w strefie pakowania...");

                    CheckoutStation checkout = new CheckoutStation();

                    double basketSum = checkout.sumUp(database, shopping);
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
