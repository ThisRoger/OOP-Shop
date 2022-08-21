package api.repository.functions;


public class CreateId
{
    private static int id = 1001;
    public static int newId()
    {
        return id++;
    }
}
