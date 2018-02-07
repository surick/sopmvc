package com.ljg.core.shiro.token;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * Shiro Token
 *
 * @author w24164
 * @create 2018-02-07 15:09
 */
public class ShiroToken extends UsernamePasswordToken implements java.io.Serializable{

    private static final long serialVersionUID = -6451794657814516274L;

    public ShiroToken(String username, String pswd) {
        super(username,pswd);
        this.pswd = pswd ;
    }


    /** 登录密码[字符串类型] 因为父类是char[] ] **/
    private String pswd ;

    public String getPswd() {
        return pswd;
    }


    public void setPswd(String pswd) {
        this.pswd = pswd;
    }





}