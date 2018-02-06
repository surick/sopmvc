package common.mapper.user;

import common.model.user.UUser;
import org.apache.ibatis.annotations.Param;

public interface UUserMapper {
    UUser loginByNamePswd(@Param("uName") String uName, @Param("pswd") String pswd);

    String findUsernameByUsername(@Param("uName") String username);

    int register(UUser uuser);

    int updateByPrimaryKeySelective(UUser user);
}
