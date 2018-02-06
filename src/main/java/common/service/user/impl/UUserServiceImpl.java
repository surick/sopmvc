package common.service.user.impl;

import common.mapper.user.UUserMapper;
import common.model.user.UUser;
import common.service.user.UUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 * @author w24164
 * @create 2018-02-06 9:06
 */
@Service
public class UUserServiceImpl implements UUserService {
    private static Logger log = LoggerFactory.getLogger(UUserServiceImpl.class);
    @Autowired
    private UUserMapper userMapper;

    @Override
    public UUser login(String username, String pswd)
    {
        try
        {
            return userMapper.loginByNamePswd(username,pswd);
        } catch (Exception e)
        {
            log.debug("\n\n |======UUserServiceImpl===login===>"+e+"<=============| \n");
        }
        return null;
    }


    @Override
    public int register(UUser uuser)
    {
        try
        {
            return userMapper.register(uuser);
        } catch (Exception e)
        {
            log.debug("\n\n |======UUserServiceImpl===register===>"+e+"<=============| \n");
        }
        return -1;
    }


    @Override
    public int updateByPrimaryKeySelective(UUser user)
    {
        return userMapper.updateByPrimaryKeySelective(user);
    }


    @Override
    public boolean isRegister(String username)
    {
        try
        {
            return username.equals(userMapper.findUsernameByUsername(username));

        } catch (Exception e)
        {
            log.debug("\n\n |======UUserServiceImpl===isRegister===>"+e+"<=============| \n");
            return false;
        }
    }
}
