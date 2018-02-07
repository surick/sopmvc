package com.ljg.permission.bo;

import com.ljg.common.model.URole;
import com.ljg.common.utils.StringUtils;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-07 14:35
 */
public class URoleBo extends URole implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户ID (用String， 考虑多个ID，现在只有一个ID)
     */
    private String userId;
    /**
     * 是否勾选
     */
    private String marker;

    public boolean isCheck(){
        return StringUtils.equals(userId,marker);
    }
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
