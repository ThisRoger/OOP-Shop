package api.repository.Shop;

import api.models.Product;
import api.repository.functions.ItemEraser;
import java.util.List;


public class CheckoutStation
{
    double sumUp(List<Product> databaseList, List<Integer> shopping)
    {
        double totalSum = 0;
        for (int i = 0; i <= (shopping.size()-1); i++)
        {
            for (int j = 0; j <= (databaseList.size()-1); j++)
            {
                if(shopping.get(i).equals(databaseList.get(j).getId()))
                {
                    totalSum += databaseList.get(j).getPrice();
                }
            }
        }
        ItemEraser del = new ItemEraser();
        del.deleteItemsAfterShopping(databaseList, shopping);
        return totalSum;
    }
}
