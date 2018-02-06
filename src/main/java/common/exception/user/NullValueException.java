package common.exception.user;

/**
 *
 *
 * @author w24164
 * @create 2018-02-06 9:26
 */
public class NullValueException extends UserException
{
    private static final long serialVersionUID = 1L;

    public NullValueException(int state, String message)
    {
        super(state, message);
    }

    public NullValueException(String message)
    {
        super(message);
    }

}
