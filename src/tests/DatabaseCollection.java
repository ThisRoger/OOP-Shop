package tests;
import api.models.*;
import api.models.Type;
import api.repository.productsDatabase;

/*
* This class adds 7 items to the Database List, which allows the user to do some shopping without the need  of adding
* new items manually (still possible through the shop menu)
*/

public class DatabaseCollection
{
    public static void testCollection(productsDatabase dataList)
    {
        dataList.products.add(new Eggs("Świeże Jajca marki Iks De", Type.FOOD, 5.99));

        dataList.products.add(new Bread("Świeży Chleb Spuchniak", Type.FOOD, 8.99));

        dataList.products.add(new Shirt("Koszsulka zwykła świeżo wyprasowana", Type.CLOTHING, 25.55));

        dataList.products.add(new Trousers("Spodnie Levi's Ultimate Smash", Type.CLOTHING, 1001.01));

        dataList.products.add(new Pencil("A pencil", Type.UTILITIES, 0.50));

        dataList.products.add(new Pen("Cool Super dude Pen Master", Type.UTILITIES, 2.69));

        dataList.products.add(new Calculator("Texas Industries TI-84", Type.UTILITIES, 149.99));





    }
}
