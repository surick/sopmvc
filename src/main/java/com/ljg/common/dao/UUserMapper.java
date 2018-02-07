package com.ljg.common.dao;

import com.ljg.common.model.UUser;
import com.ljg.permission.bo.URoleBo;

import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-07 14:20
 */
public interface UUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UUser record);

    int insertSelective(UUser record);

    UUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);

    UUser login(Map<String, Object> map);

    UUser findUserByEmail(String email);

    List<URoleBo> selectRoleByUserId(Long id);

}