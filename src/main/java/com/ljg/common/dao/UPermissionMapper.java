package com.ljg.common.dao;

import com.ljg.common.model.UPermission;
import com.ljg.permission.bo.UPermissionBo;

import java.util.List;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-07 14:18
 */
public interface UPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UPermission record);

    int insertSelective(UPermission record);

    UPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UPermission record);

    int updateByPrimaryKey(UPermission record);

    List<UPermissionBo> selectPermissionById(Long id);
    //根据用户ID获取权限的Set集合
    Set<String> findPermissionByUserId(Long id);
}