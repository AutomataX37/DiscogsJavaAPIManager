package discogsjava.exception;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 02/02/13
 * Time: 01:07
 */
public class StatusCodeUnauthorizedException extends StatusCodeException
{

    public StatusCodeUnauthorizedException()
    {
    }

    //Constructor that accepts a message
    public StatusCodeUnauthorizedException(String message)
    {
        super(message);
    }

}
