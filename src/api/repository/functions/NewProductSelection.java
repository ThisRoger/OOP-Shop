package api.repository.functions;

import api.models.*;
import api.repository.Database;
import java.util.Scanner;


public class NewProductSelection
{
    public void addNewProduct(int selectedProduct, NewItemConfig config, Database database, Scanner scanner)
    {
        // creating and adding the selected product
        switch (selectedProduct) {
            case 1 -> { //Eggs

                database.dataBaseList.add(new Eggs
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 2 -> { // Bread

                database.dataBaseList.add(new Bread
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 3 -> { // Shirt

                database.dataBaseList.add(new Shirt
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 4 -> { // Trousers

                database.dataBaseList.add(new Trousers
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 5 -> { // Pencil

                database.dataBaseList.add(new Pencil
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 6 -> { // Pen

                database.dataBaseList.add(new Pen
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 7 -> { // Calculator

                database.dataBaseList.add(new Calculator
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
        }
    }
}
