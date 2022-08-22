package api.repository.functions;

import api.models.*;
import api.repository.productsDatabase;
import java.util.Scanner;


public class NewProductSelection
{
    public void addNewProduct(int selectedProduct, NewProductCreator config, productsDatabase database, Scanner scanner)
    {
        // creating and adding the selected product
        switch (selectedProduct) {
            case 1 -> { //Eggs

                database.products.add(new Eggs
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 2 -> { // Bread

                database.products.add(new Bread
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 3 -> { // Shirt

                database.products.add(new Shirt
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 4 -> { // Trousers

                database.products.add(new Trousers
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 5 -> { // Pencil

                database.products.add(new Pencil
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 6 -> { // Pen

                database.products.add(new Pen
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
            case 7 -> { // Calculator

                database.products.add(new Calculator
                        (config.setProductName(scanner), Type.valueOf(config.setProductType(scanner)), config.setProductPrice(scanner)));
            }
        }
    }
}
