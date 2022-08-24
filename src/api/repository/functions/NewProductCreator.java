package api.repository.functions;

import api.models.*;
import api.repository.ProductDatabase;


public class NewProductCreator
{
    public void addNewProduct(int selectedProduct, ScannerTypeSelector userInput, ProductDatabase products)
    {
        // creating and adding the selected product
        switch (selectedProduct) {
            case 1 -> //Eggs
                    products.setProducts( new Eggs
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 2 -> // Bread
                    products.setProducts( new Bread
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 3 -> // Shirt
                    products.setProducts( new Shirt
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 4 -> // Trousers
                    products.setProducts( new Trousers
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 5 -> // Pencil
                    products.setProducts( new Pencil
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 6 -> // Pen
                    products.setProducts( new Pen
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 7 -> // Calculator
                    products.setProducts( new Calculator
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
        }
    }
}
