package com.ljg.common.dao;

import com.ljg.common.model.UUserRole;

import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-07 14:20
 */
public interface UUserRoleMapper {
    int insert(UUserRole record);

    int insertSelective(UUserRole record);

    int deleteByUserId(Long id);

    int deleteRoleByUserIds(Map<String, Object> resultMap);

    List<Long> findUserIdByRoleId(Long id);
}
