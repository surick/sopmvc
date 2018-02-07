package com.ljg.user.service;

import com.ljg.common.model.UUser;
import com.ljg.core.mybatis.page.Pagination;
import com.ljg.permission.bo.URoleBo;
import com.ljg.permission.bo.UserRoleAllocationBo;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-07 15:38
 */
public interface UUserService {

    int deleteByPrimaryKey(Long id);

    UUser insert(UUser record);

    UUser insertSelective(UUser record);

    UUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);

    UUser login(String email ,String pswd);

    UUser findUserByEmail(String email);

    Pagination<UUser> findByPage(Map<String, Object> resultMap, Integer pageNo,
                                 Integer pageSize);

    Map<String, Object> deleteUserById(String ids);

    Map<String, Object> updateForbidUserById(Long id, Long status);

    Pagination<UserRoleAllocationBo> findUserAndRole(ModelMap modelMap,
                                                     Integer pageNo, Integer pageSize);

    List<URoleBo> selectRoleByUserId(Long id);

    Map<String, Object> addRole2User(Long userId, String ids);

    Map<String, Object> deleteRoleByUserIds(String userIds);
}

