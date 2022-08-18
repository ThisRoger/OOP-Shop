package api.repositories.functions;

import java.util.Scanner;
import api.models.Type;


public class NewItemConfig
{
    Scanner scanner = new Scanner(System.in);




    String setProductName()     // setter
    {
        String name;
        do
        {
            System.out.println("Please input the product name: ");
            name = scanner.nextLine();
        }while(name.isBlank());

        return name;
    }

    String setProductType()     // setter
    {
        String productType;
        do
        {
            System.out.println("Please input the product type (FOOD/LITERATURE/CLOTHING): ");
            productType = scanner.next();
            productType = productType.toUpperCase();
        }
        while (     !productType.equals(Type.FOOD.toString())
                &&  !productType.equals(Type.LITERATURE.toString())
                &&  !productType.equals(Type.CLOTHING.toString()));

        return productType;
    }

    int setProductPrice()     // setter
    {
        int price;
        do
        {
            System.out.print("Please input the product price in PLN: ");
            price = scanner.nextInt();

        }while (price <= 0);

        return price;
    }


}
