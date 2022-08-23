package api.repository.functions;

import api.models.Type;
import java.util.Scanner;


public class ScannerTypeSelector {
    Scanner userInput;


    public ScannerTypeSelector() {
        userInput = new Scanner(System.in);
    }   // constructor

    private double readUserNumberInput()    // used for some methods below to check the validity of the users input
                                            // and checks if it's not a number or is it smaller than 1
    {
        double thisNumber = 0;
        do {
            try {
                thisNumber = Double.parseDouble(userInput.next());
            } catch (NumberFormatException error) {
                System.out.print("\nError, input not recognized, try again.\nInput: ");
                continue;
            }
            if (thisNumber <= 0)
            {
                System.out.print("\nError, incorrect number, try again.\nInput: ");
            }
        }
        while(thisNumber <= 0);
        return thisNumber;
    }

    public int chooseMenuSelectionOption()  // selects which main menu option
    {
        int returnInteger = 0;
        System.out.print("\n-------------------------------------------------------\n");
        System.out.print("Select what action you want to perform:\n\nStart shopping:  1        Browse the catalog: 2\n");
        System.out.print("Create new item: 3        Delete single item: 4\n");
        System.out.print("Database status: 5        Edit existing item: 6\nLeave the shop:  7\n\nInput: ");

        do {
            try {
                returnInteger = Integer.parseInt(userInput.next());
            } catch (NumberFormatException error) {
                System.out.print("\nError, input not recognized, try again.\nInput: ");
                continue;
            }
            if (returnInteger > 7 || returnInteger <= 0)
            {
                System.out.print("\nError, incorrect number, try again.\nInput: ");
            }
        }
        while(returnInteger > 7 || returnInteger <= 0);

        return returnInteger;
    }

    double setProductPrice()         // selects product price (is a double)
    {
        System.out.print("\nPlease input the product price in PLN: ");
        return readUserNumberInput();
    }

    public int selectProductId()            // selects product ID (double to integer)
    {

        return (int) readUserNumberInput();
    }

    String setProductName()          // selects product name (string)
    {
        {
            String name;
            do
            {
                System.out.print("\nPlease input the product name: ");
                name = userInput.nextLine();
            }while(name.isBlank());

            return name;
        }
    }

    Type setProductType()            // selects product type (returns Type)
    {
        String productType;
        do
        {
            System.out.println("Please input the product type (FOOD/UTILITIES/CLOTHING): ");
            productType = userInput.next();
            productType = productType.toUpperCase();
        }
        while (     !productType.equals(Type.FOOD.toString())
                &&  !productType.equals(Type.UTILITIES.toString())
                &&  !productType.equals(Type.CLOTHING.toString()));

        return Type.valueOf(productType);
    }

    public int newItemSelection()    // selects which item should be added
    {
        int itemSelection;
        System.out.println("Select which product do you want to add:\n\nEggs: 1           Bread: 2\n");
        System.out.println("Shirt: 3          Trousers: 4\n");
        System.out.println("Pencil: 5         Pen: 6\n");
        System.out.println("Calculator: 7\n");
        System.out.print("Your input: ");

        do
        {
            itemSelection = (int) readUserNumberInput();


        }while (itemSelection > 7);

        return itemSelection;
    }

    public String continueShopping()       // checks if user wishes to continue shopping
    {
        String selectedOption;
            do
            {
                System.out.print("\nContinue shopping?\nYES or NO:  ");
                selectedOption = userInput.next();
                selectedOption = selectedOption.toUpperCase();
            }
            while (!selectedOption.equals("YES") && !selectedOption.equals("NO"));
    return selectedOption;
    }
}
            
