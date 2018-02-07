package com.ljg.common.dao;

import com.ljg.common.model.URolePermission;

import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-07 14:19
 */
public interface URolePermissionMapper {
    int insert(URolePermission record);

    int insertSelective(URolePermission record);

    List<URolePermission> findRolePermissionByPid(Long id);

    List<URolePermission> findRolePermissionByRid(Long id);

    List<URolePermission> find(URolePermission entity);

    int deleteByPid(Long id);
    int deleteByRid(Long id);
    int delete(URolePermission entity);

    int deleteByRids(Map<String,Object> resultMap);
}
