package api.models;

public enum Type
{
    FOOD("This is food."),
    CLOTHING("This is clothing."),
    LITERATURE("This is literature.");

   private final String name;

   private Type(String name)        // constructor
   {
       this.name = name;
   }

   public String getSize()  // getter
   {
       return name;
   }
}
