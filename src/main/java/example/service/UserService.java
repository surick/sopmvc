package example.service;

import example.dao.dbDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-05 13:55
 */
public class UserService {
    public static String check(String username,String password){
        try {
            Connection conn = dbDao.getConnection();
            PreparedStatement p = conn.prepareStatement("select * from user where USER_NAME=? and USER_PWD=?");
            p.setString(1, username);
            p.setString(2, password);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                String user_name = rs.getString("USER_NAME");
                dbDao.close(rs, p, conn);
                return user_name;
            }
            dbDao.close(rs, p, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
