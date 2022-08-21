package api.models;


// I don't really know what happened here
public enum Type
{
    FOOD("This is food."),
    CLOTHING("This is clothing."),
    UTILITIES("Those are utilities.");

   private final String name;

   private Type(String name)        // constructor
   {
       this.name = name;
   }
}
