package discogsjava.exception;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 02/02/13
 * Time: 01:09
 */
public class StatusCodeNotFoundException extends StatusCodeException
{

    public StatusCodeNotFoundException()
    {
    }

    //Constructor that accepts a message
    public StatusCodeNotFoundException(String message)
    {
        super(message);
    }

}
