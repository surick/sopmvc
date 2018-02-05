package example.dao;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-05 15:39
 */
public class dbDao {
    public static String URL;
    public static String USERNAME;
    public static String PASSWORD;
    public static String DRIVER;

    private static ResourceBundle rb = ResourceBundle.getBundle("example.dao.db-config");

    private dbDao(){}

    static{
        URL = rb.getString("jdbc.url");
        USERNAME = rb.getString("jdbc.username");
        PASSWORD = rb.getString("jdbc.password");
        DRIVER = rb.getString("jdbc.driver");
        try {
            Class.forName(DRIVER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接数据库失败1");
        }
        return conn;
    }

    public static void close(ResultSet rs, Statement stat, Connection conn){
        try {
            if(rs!=null)rs.close();
            if(stat!=null)stat.close();
            if(conn!=null)conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
