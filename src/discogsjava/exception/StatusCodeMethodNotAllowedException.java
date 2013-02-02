package discogsjava.exception;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 02/02/13
 * Time: 01:07
 */
public class StatusCodeMethodNotAllowedException extends StatusCodeException
{

    public StatusCodeMethodNotAllowedException()
    {
    }

    //Constructor that accepts a message
    public StatusCodeMethodNotAllowedException(String message)
    {
        super(message);
    }

}
