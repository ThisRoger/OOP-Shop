package api.repository.functions;

import api.models.Product;
import java.util.List;


public class ItemEditor
{
    public void selectEditableItem(List<Product> productList, ProductInformationPrinter itemInfo, ScannerTypeSelector userInput)
    {
        itemInfo.showList(productList);
        System.out.print("\n-------------------------------------------------------");

        int item;
        boolean isEditable = true;

        while(isEditable)
        {
            System.out.print("\nSelect which item ID do you want to edit.\nInput: ");
            item = userInput.selectProductId();
            for (int i = 1000; i <= (999+(productList.size())); i++)
            {
                if (item == productList.get((i - 1000)).getId())  // checks if ID exists in database list
                {
                    editSelectedItem((i-1000), productList, userInput);      // passes index to next function
                    isEditable = false;
                }
            }
            if(isEditable)  // Item ID wasn't found
            {
                System.out.println("Error, item not found!");
            }
        }
    }

    void editSelectedItem(int selection, List <Product> productList, ScannerTypeSelector userInput)
    {
        productList.get(selection).setName(userInput.setProductName());
        productList.get(selection).setType(userInput.setProductType());
        productList.get(selection).setPrice(userInput.setProductPrice());

        System.out.print("\n\nItem was updated successfully!");
    }
}
