package discogsjava.exception;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 31/01/13
 * Time: 20:45
 */
public class DiscogsException extends Exception
{

    public DiscogsException()
    {
    }

    //Constructor that accepts a message
    public DiscogsException(String message)
    {
        super(message);
    }

}
