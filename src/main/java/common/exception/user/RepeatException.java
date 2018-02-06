package common.exception.user;

/**
 * 已存在的数据
 *
 * @author w24164
 * @create 2018-02-06 9:27
 */
public class RepeatException extends UserException{
    private static final long serialVersionUID = 1L;

    public RepeatException(int state, String message)
    {
        super(state, message);
    }

    public RepeatException(String message)
    {
        super(message);
    }
}
