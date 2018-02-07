package com.ljg.common.dao;

import com.ljg.common.model.URole;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-07 14:19
 */
public interface URoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(URole record);

    int insertSelective(URole record);

    URole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(URole record);

    int updateByPrimaryKey(URole record);

    Set<String> findRoleByUserId(Long id);

    List<URole> findNowAllPermission(Map<String, Object> map);

    void initData();
}