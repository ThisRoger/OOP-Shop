package api.repository.Shop;

import api.repository.Database;
import api.repository.functions.DeleteItem;
import java.util.List;


public class Checkout
{
    double sumUp(Database database, List<Integer> shopping)
    {
        double totalSum = 0;
        for (int i = 0; i <= (shopping.size()-1); i++)
        {
            for (int j = 0; j <= (database.dataBaseList.size()-1); j++)
            {
                if(shopping.get(i).equals(database.dataBaseList.get(j).getId()))
                {
                    totalSum += database.dataBaseList.get(j).getPrice();
                }
            }
        }
        DeleteItem del = new DeleteItem();
        del.shoppingDeletion(database, shopping);
        return totalSum;
    }
}
