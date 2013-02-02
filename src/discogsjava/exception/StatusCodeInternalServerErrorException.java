package discogsjava.exception;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 02/02/13
 * Time: 01:07
 */
public class StatusCodeInternalServerErrorException extends StatusCodeException
{

    public StatusCodeInternalServerErrorException()
    {
    }

    //Constructor that accepts a message
    public StatusCodeInternalServerErrorException(String message)
    {
        super(message);

    }

}
