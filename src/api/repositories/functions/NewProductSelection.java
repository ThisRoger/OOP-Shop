package api.repositories.functions;

import api.models.*;
import api.repositories.Database;


class NewProductSelection
{
    void addNewProduct(int selectedProduct, NewItemConfig config, Database database)
    {

        switch (selectedProduct) {
            case 1 -> { //Eggs

                Eggs newItem = new Eggs(config.setProductName(), Type.valueOf(config.setProductType()), config.setProductPrice());
                database.dataBaseList.add(newItem);
            }
            case 2 -> { //Bread

                Bread newItem = new Bread(config.setProductName(), Type.valueOf(config.setProductType()), config.setProductPrice());
                database.dataBaseList.add(newItem);
            }
            case 3 -> { //Shirt

                Shirt newItem = new Shirt(config.setProductName(), Type.valueOf(config.setProductType()), config.setProductPrice());
                database.dataBaseList.add(newItem);
            }
            case 4 -> { //Trousers

                Trousers newItem = new Trousers(config.setProductName(), Type.valueOf(config.setProductType()), config.setProductPrice());
                database.dataBaseList.add(newItem);
            }
        }
    }
}
