package common.exception.user;

/**
 * 违反唯一约束条件
 *
 * @author w24164
 * @create 2018-02-06 9:25
 */
public class NonuniquenessException extends UserException
{
    private static final long serialVersionUID = 1L;

    public NonuniquenessException(int state, String message)
    {
        super(state, message);
    }

    public NonuniquenessException(String message)
    {
        super(message);
    }


}
