package api.repository.Shop;

import api.repository.Database;
import api.repository.functions.ProductInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ShoppingBrowsing
{
    List<Integer> shopping = new ArrayList<Integer>();

    void shopping(Database database, ProductInformation itemInfo, Scanner scanner)
    {
        itemInfo.showList(database);


        boolean isBrowsing = true;
        boolean canAddItem;
        boolean notFound;
        int chosenId;
        String choice;
        System.out.println("\n-------------------------------------------------------");


        while(isBrowsing)
        {
            System.out.print("\nPlease input item ID that you wish to buy: ");
            chosenId = scanner.nextInt();   //input ID
            canAddItem = true;
            notFound = true;

            for (int i = 1000; i <= (999+(database.dataBaseList.size())); i++)
            {
                    if (chosenId == database.dataBaseList.get((i-1000)).getId())  // checks if ID exists in database list
                    {
                        for (int j = 0; j < (shopping.size()); j++)
                        {
                            if (chosenId == shopping.get(j))   // checks if ID exists in shopping list
                            {
                                System.out.print("\nError, item already in shopping list!");
                                canAddItem = false;
                                notFound = false;
                                break;
                            }
                        }
                        if (canAddItem)     // allows adding the item to the shopping list if no errors were encountered
                        {
                            shopping.add(chosenId);
                            System.out.printf("\nItem ID = %d has been added to the basket.", chosenId);
                            notFound = false;
                            break;
                        }

                    }
            }
            if(notFound)       // prints if item ID wasn't detected at all
            {
                System.out.print("\nError, item not found!");
            }

            do  // checks if user wishes to continue shopping
            {
                System.out.print("\nContinue shopping?\nYES or NO:  ");
                choice = scanner.next();
                choice = choice.toUpperCase();
            }while (!choice.equals("YES") && !choice.equals("NO"));

            if (choice.equals("NO"))
            {
                if (shopping.size() > 0)
                {
                    System.out.print("\nProszę umieścić produkty w strefie pakowania...");

                    Checkout checkout = new Checkout();
                    ShoppingBrowsing browse = new ShoppingBrowsing();



                    double sum = checkout.sumUp(database, shopping);
                    System.out.printf("\nTotal sum: %.2fPLN", sum);
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
