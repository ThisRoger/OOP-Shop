package tests;
import api.models.*;
import api.models.Type;
import api.repository.Database;

/*
* This class adds 7 items to the Database List, which allows the user to do some shopping without the need  of adding
* new items manually (still possible through the shop menu)
*/

public class DatabaseCollection
{
    public static void testCollection(Database dataList)
    {
        dataList.dataBaseList.add(new Eggs("Świeże Jajca marki Iks De", Type.FOOD, 5.99));

        dataList.dataBaseList.add(new Bread("Świeży Chleb Spuchniak", Type.FOOD, 8.99));

        dataList.dataBaseList.add(new Shirt("Koszsulka zwykła świeżo wyprasowana", Type.CLOTHING, 25.55));

        dataList.dataBaseList.add(new Trousers("Spodnie Levi's Ultimate Smash", Type.CLOTHING, 1001.01));

        dataList.dataBaseList.add(new Pencil("A pencil", Type.UTILITIES, 0.50));

        dataList.dataBaseList.add(new Pen("Cool Super dude Pen Master", Type.UTILITIES, 2.69));

        dataList.dataBaseList.add(new Calculator("Texas Industries TI-84", Type.UTILITIES, 149.99));





    }
}
