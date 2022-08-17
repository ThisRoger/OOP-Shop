package api;

import api.models.Eggs;
import api.models.Type;
import java.util.Scanner;


public class Database
{
    private static int id = 1;
    static Integer[]  dataBase = new Integer[100];

    public static int newID()
    {
        return id++;
    }

    public static void addItem()
    {
        System.out.print("Select which product do you want to add:\n\nEggs: 1           Bread: 2\n");
        System.out.print("Shirt: 3          Trousers: 4\n\n");

        int selection=0;
        Scanner scanner = new Scanner(System.in);
        selection = scanner.nextInt();

        switch (selection)
        {
            case 1: //Eggs
                System.out.print("Please input the product name: ");
                String productName = scanner.next();
                System.out.print("Please input the product type (FOOD/LITERATURE/CLOTHING): ");
                String productType = scanner.next();
                System.out.print("Please input the product price: ");
                int productPrice = scanner.nextInt();
                Eggs newItem = new Eggs(productPrice, Type.valueOf(productType), productName);
                dataBase[id] = newItem.getId();

        }
    }
}
