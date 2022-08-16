package api;

import api.models.Eggs;
import api.models.Type;

public class Main
{

    public static void main(String[] args)
    {

        System.out.print("Witaj w strefie Biedronki!\nTylko najświeższe owoce.\nSwieże jaja, eleganckie wypieki.\n\n");
        boolean isShopping = true;

        Eggs eggs = new Eggs(1, 12, Type.FOOD, "Eggs very smaczne");

        System.out.printf("The ID of the product is: %d\n", eggs.getId());
        System.out.printf("The type of the product is: %s\n", eggs.getType());

    }

}
