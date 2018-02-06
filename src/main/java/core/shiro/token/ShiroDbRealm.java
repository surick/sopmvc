package core.shiro.token;

import common.exception.user.NonuniquenessException;
import common.exception.user.RepeatException;
import common.model.user.UUser;
import common.service.user.UUserService;
import common.utils.MathUtil;
import common.utils.enums.AccountStaEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 登录认证+授权
 *
 * @author w24164
 * @create 2018-02-06 9:01
 */
public class ShiroDbRealm extends AuthorizingRealm {
    @Autowired
    private UUserService userService;

    /**
     * 用户登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
            throws AuthenticationException
    {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        UUser user = userService.login(token.getUsername(),new String(token.getPassword()));

        if (user == null)
        {
            throw new IncorrectCredentialsException();
        }else if (AccountStaEnum.disabled.getState() != user.getuState()) {
            throw new DisabledAccountException();
        }else {
            //update last login time
            user.setulastLoginTime(new Date());
            userService.updateByPrimaryKeySelective(user);
        }
        return new SimpleAuthenticationInfo(user,user.getuPassword(),getName());
    }

    /**
     * @Title: regist
     * @Description: 用户注册
     * @return: void
     * @throws UserException
     */
    public void registering(UUser uuser) throws UserException, NonuniquenessException, RepeatException {
        /*
         * 检查是否已注册
         */
        if (userService.isRegister(uuser.getuName()))
        {
            throw new RepeatException(AccountStaEnum.registerRepeat.getInfo());
        }

        uuser.setuPassword(MathUtil.getMd5(uuser.getuPassword()));
        if (userService.register(uuser) != 1)
        {
            /*
             * TODO
             * 该异常不是很准确
             */
            throw new NonuniquenessException(AccountStaEnum.registerExistence.getInfo());
        }
    }

    /* (non Javadoc)
     * @Title: doGetAuthorizationInfo
     * @Description: TODO
     * @param arg0
     * @return
     * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0)
    {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * 清空当前用户权限信息
     */
    public  void clearCachedAuthorizationInfo() {
        PrincipalCollection principalCollection = SecurityUtils.getSubject().getPrincipals();
        SimplePrincipalCollection principals = new SimplePrincipalCollection(
                principalCollection, getName());
        super.clearCachedAuthorizationInfo(principals);
    }
    /**
     * 指定principalCollection 清除
     */
    public void clearCachedAuthorizationInfo(PrincipalCollection principalCollection) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(
                principalCollection, getName());
        super.clearCachedAuthorizationInfo(principals);
    }

}
