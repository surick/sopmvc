package core.shiro.token;

import common.model.user.UUser;
import common.utils.MathUtil;
import common.utils.VisitorUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.omg.CORBA.UserException;

/**
 * Token管理工具类
 *
 * @author w24164
 * @create 2018-02-06 9:03
 */
public class TokenManager {
    /**
     *
     * @Title: login
     * @Description: shiro 登录 (密码md5封装加密)
     * @param uuser
     * @param rememberMe
     * @return:
     */
    public static void login(UUser uuser) throws UserException
    {
        if (VisitorUtil.isSecurity(uuser))
        {
            UsernamePasswordToken token =
                    new UsernamePasswordToken(uuser.getuName(), MathUtil.getCharMd5(uuser.getuPassword()));
//        token.setRememberMe(true);//默认记住登录
            SecurityUtils.getSubject().login(token);
        }

    }

    /**
     *
     * @Title: getToken
     * @Description:获取当前登录用户的user对象
     * @return
     * @return: UUser
     */
    public static UUser getToken()
    {
        return (UUser)SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * @Title: logout
     * @Description: 账户退出
     * @return: void
     */
    public static void logout()
    {
        if (VisitorUtil.isLogin())
        {
            SecurityUtils.getSubject().logout();
        }
    }
}
