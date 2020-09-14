/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.dao;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author atulb
 */
public class UserDao {

    public static boolean validateUser(UserPojo user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid = ? and password = ? and usertype = ?");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean adduser(UserPojo user) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid = ?");
        boolean status = true;
        ps.setString(1, user.getUserId());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            status = false;
        } else {
            PreparedStatement ps2 = conn.prepareStatement("insert into users values(?,?,?)");
            ps2.setString(1, user.getUserId());
            ps2.setString(2, user.getPassword());
            ps2.setString(3, user.getUserType());
            ps2.executeUpdate();
        }
        return status;

    }
    public static boolean changePass(String userid,String password)throws SQLException{
         Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users set password = ? where userid = ?");
        ps.setString(1,password);
        ps.setString(2, userid);
        int count = ps.executeUpdate();
        return count==1;
    }
     public static boolean validateUser2(String username) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid = ?");
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return true;
        } else {
            return false;
        }

    }
}
