package api.models;

import api.repository.functions.CreateId;


public abstract class Product
{
    private int id;     // nie do końca rozumiem o co chodzi z ustawieniem ID jako final
    private double price;
    private Type type;
    private String name;

    public Product(String name, Type type, double price)
    {
        setId(CreateId.newId());
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
