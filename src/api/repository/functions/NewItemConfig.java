package api.repository.functions;

import java.util.Scanner;
import api.models.Type;


public class NewItemConfig
{

     public int setSelection(Scanner scanner)    // setter, chooses which item is to be added
    {
        int item;

        do
        {
            System.out.println("Select which product do you want to add:\n\nEggs: 1           Bread: 2\n");
            System.out.println("Shirt: 3          Trousers: 4\n");
            System.out.println("Pencil: 5         Pen: 6\n");
            System.out.println("Calculator: 7\n");
            System.out.print("Your input: ");
            item = scanner.nextInt();
        }while (item <= 0 || item > 7);

        return item;
    }

    String setProductName(Scanner scanner)     // setter, don't try to mix the order of this function, you'll break it.
    {
        String name;
        name = scanner.nextLine();      // don't delete this line, else the sout will print twice
        do
        {
            System.out.print("\nPlease input the product name: ");
            name = scanner.nextLine();
        }while(name.isBlank());

        return name;
    }

    String setProductType(Scanner scanner)     // setter
    {
        String productType;
        do
        {
            System.out.println("Please input the product type (FOOD/UTILITIES/CLOTHING): ");
            productType = scanner.next();
            productType = productType.toUpperCase();
        }
        while (     !productType.equals(Type.FOOD.toString())
                &&  !productType.equals(Type.UTILITIES.toString())
                &&  !productType.equals(Type.CLOTHING.toString()));

        return productType;
    }

    double setProductPrice(Scanner scanner)     // setter
    {
        double price;
        do
        {
            System.out.print("Please input the product price in PLN: ");
            price = scanner.nextDouble();

        }while (price <= 0);

        return price;
    }


}
