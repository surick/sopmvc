package com.ljg.common.model;

import net.sf.json.JSONObject;

import java.io.Serializable;

/**
 * 角色{@link URole}和 权限{@link UPermission}中间表
 *
 * @author w24164
 * @create 2018-02-07 14:22
 */
public class URolePermission  implements Serializable {
    private static final long serialVersionUID = 1L;
    /**{@link URole.id}*/
    private Long rid;
    /**{@link UPermission.id}*/
    private Long pid;

    public URolePermission() {
    }
    public URolePermission(Long rid,Long pid) {
        this.rid = rid;
        this.pid = pid;
    }
    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
    public String toString(){
        return JSONObject.fromObject(this).toString();
    }
}
