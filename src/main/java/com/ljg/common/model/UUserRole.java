package com.ljg.common.model;

import net.sf.json.JSONObject;

import java.io.Serializable;

/**
 * 用户{@link UUser} 和角色 {@link URole} 中间表
 *
 * @author w24164
 * @create 2018-02-07 14:24
 */
public class UUserRole  implements Serializable {
    private static final long serialVersionUID = 1L;
    /**{@link UUser.id}*/
    private Long uid;
    /**{@link URole.id}*/
    private Long rid;

    public UUserRole(Long uid,Long rid) {
        this.uid = uid;
        this.rid = rid;
    }
    public UUserRole() {
    }
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }
    public String toString(){
        return JSONObject.fromObject(this).toString();
    }
}