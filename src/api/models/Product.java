package api.models;

import api.repositories.functions.CreateId;
// I just wanted my entire project to be green

public abstract class Product
{
    private int id;
    private int price;
    private Type type;
    private String name;

    public Product(String name, Type type, int price)
    {
        setId(CreateId.newId());
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
