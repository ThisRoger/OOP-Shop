package api.repositories.functions;


public class CreateId
{
    private static int id = 1;
    public static int newId()
    {
        return id++;
    }
}
