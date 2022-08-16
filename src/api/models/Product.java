package api.models;

abstract class Product
{
    private int ID = 0;
    private int id;
    private int price;
    private Type type;
    private String name;

    public Product(int id, int price, Type type, String name)
    {
        ID++;
        this.id = id;
        this.price = price;
        this.type = type;
        this.name = name;
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
