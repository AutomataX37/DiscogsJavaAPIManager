package discogsjava.exception;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 02/02/13
 * Time: 01:09
 */
public class StatusCodeForbiddenException extends StatusCodeException
{

    public StatusCodeForbiddenException()
    {
    }

    //Constructor that accepts a message
    public StatusCodeForbiddenException(String message)
    {
        super(message);
    }

}
