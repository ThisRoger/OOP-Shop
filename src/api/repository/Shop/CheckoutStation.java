package api.repository.Shop;

import api.repository.productsDatabase;
import api.repository.functions.ItemEraser;
import java.util.List;


public class CheckoutStation
{
    double sumUp(productsDatabase database, List<Integer> shopping)
    {
        double totalSum = 0;
        for (int i = 0; i <= (shopping.size()-1); i++)
        {
            for (int j = 0; j <= (database.products.size()-1); j++)
            {
                if(shopping.get(i).equals(database.products.get(j).getId()))
                {
                    totalSum += database.products.get(j).getPrice();
                }
            }
        }
        ItemEraser del = new ItemEraser();
        del.shoppingDeletion(database, shopping);
        return totalSum;
    }
}
