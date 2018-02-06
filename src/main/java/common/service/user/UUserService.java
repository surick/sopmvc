package common.service.user;

import common.model.user.UUser;

/**
 * 用户服务类
 *
 * @author w24164
 * @create 2018-02-06 9:04
 */
public interface UUserService
{
    /** login by username and userPassword　*/
    UUser login(String username, String pswd);

    /** checking for the existence of username */
    boolean isRegister(String username);

    /** register by username and userPassword　*/
    int register(UUser uuser);

    /** update userInfo*/
    int updateByPrimaryKeySelective(UUser user);

}