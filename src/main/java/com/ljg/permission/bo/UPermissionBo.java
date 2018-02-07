package com.ljg.permission.bo;

import com.ljg.common.model.UPermission;
import com.ljg.common.utils.StringUtils;

import java.io.Serializable;

/**
 * 权限选择
 *
 * @author w24164
 * @create 2018-02-07 14:34
 */
public class UPermissionBo extends UPermission implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 是否勾选
     */
    private String marker;
    /**
     * role Id
     */
    private String roleId;

    public boolean isCheck(){
        return StringUtils.equals(roleId,marker);
    }
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
    public String getRoleId() {
        return roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}
