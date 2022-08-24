package utility;
import api.models.*;
import api.models.Type;
import api.repository.ProductDatabase;

/*
* This class adds 7 items to the Database List, which allows the user to do some shopping without the need  of adding
* new items manually (still possible through the shop menu)
*/

public class ProductDelivery
{
    public static void testCollection(ProductDatabase dataList)
    {
        dataList.setProducts(new Eggs("Świeże Jajca marki Iks De", Type.FOOD, 5.99));

        dataList.setProducts(new Bread("Świeży Chleb Spuchniak", Type.FOOD, 8.99));

        dataList.setProducts(new Shirt("Koszsulka zwykła świeżo wyprasowana", Type.CLOTHING, 25.55));

        dataList.setProducts(new Trousers("Spodnie Levi's Ultimate Smash", Type.CLOTHING, 1001.01));

        dataList.setProducts(new Pencil("A pencil", Type.UTILITIES, 0.50));

        dataList.setProducts(new Pen("Cool Super dude Pen Master", Type.UTILITIES, 2.69));

        dataList.setProducts(new Calculator("Texas Industries TI-84", Type.UTILITIES, 149.99));





    }
}
