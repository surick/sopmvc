package common.exception.user;

/**
 * 用户异常标准类
 *
 * @author w24164
 * @create 2018-02-06 9:25
 */
public class UserException extends Exception
{
    private static final long serialVersionUID = 1L;

    public UserException(String message)
    {
        super(message);
    }

    public UserException(int state,String message)
    {
        super(message);
    }

}