package api.repository.functions;

import api.models.Product;
import java.util.Collections;
import java.util.List;


public class ItemEraser
{
    public void shoppingDeletion(List<Product> databaseList, List<Integer> shopping)
    {
        Collections.sort(shopping);

        for (int i = (shopping.size()-1); i >= 0; i--)
        {
            for (int j = (databaseList.size()-1); j >= 0 ; j--)
            {
                if (shopping.get(i).equals(databaseList.get(j).getId()))
                {
                    databaseList.remove(j);
                }
            }
        }

    }

    public void singleDeletion(List <Product> productList, ProductInformationPrinter itemInfo, ScannerTypeSelector userInput)
    {
        itemInfo.showList(productList);
        System.out.print("\n-------------------------------------------------------");

        int item;
        boolean isDeletable = false;

        while(!isDeletable)
        {
            System.out.print("\nSelect which item ID do you want to delete: ");
            item = userInput.selectProductId();
            for (int i = 1000; i <= (999+(productList.size())); i++)
            {
                if (item == productList.get((i-1000)).getId())  // checks if ID exists in database list
                {
                    productList.remove(i-1000);
                    System.out.print("\nItem successfully deleted.");
                    isDeletable = true;
                }
            }
        }







    }
}
