package api.repository.functions;

import api.models.*;
import java.util.List;


public class NewProductCreator
{
    public void addNewProduct(int selectedProduct, ScannerTypeSelector userInput, List<Product> productList)
    {
        // creating and adding the selected product
        switch (selectedProduct) {
            case 1 -> //Eggs
                    productList.add( new Eggs
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 2 -> // Bread
                    productList.add( new Bread
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 3 -> // Shirt
                    productList.add( new Shirt
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 4 -> // Trousers
                    productList.add( new Trousers
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 5 -> // Pencil
                    productList.add( new Pencil
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 6 -> // Pen
                    productList.add( new Pen
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
            case 7 -> // Calculator
                    productList.add( new Calculator
                            (userInput.setProductName(), userInput.setProductType(), userInput.setProductPrice()) );
        }
    }
}
