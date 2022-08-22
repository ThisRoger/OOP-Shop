package api.repository.functions;


public class ProductIdentityGenerator
{
    private static int id = 1001;

    public static int newId()
    {
        return id++;
    }
}
