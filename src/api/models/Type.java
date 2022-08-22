package api.models;


public enum Type
{
    FOOD("This is food."),
    CLOTHING("This is clothing."),
    UTILITIES("Those are utilities.");

   private final String name;

   Type(String name)
   {
       this.name = name;
   }
}
