package discogsjava.exception;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 02/02/13
 * Time: 01:07
 */
public class StatusCodeUnprocessableEntityException extends StatusCodeException
{

    public StatusCodeUnprocessableEntityException()
    {
    }

    //Constructor that accepts a message
    public StatusCodeUnprocessableEntityException(String message)
    {
        super(message);
    }

}
