package discogsjava.exception;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 02/02/13
 * Time: 00:57
 */
public class StatusCodeException extends DiscogsException
{

    public StatusCodeException()
    {
    }

    //Constructor that accepts a message
    public StatusCodeException(String message)
    {
        super(message);
    }
}
