/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.dao;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.ExamPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author atulb
 */
public class ExamDao {

    public static String getExamId() throws SQLException {
        String qry = "select count(*) as totalrows from exam";
        int rowCount = 0;
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(qry);
        if (rs.next()) {
            rowCount = rs.getInt(1);
        }
        String newId = "EX-" + (rowCount + 1);
        return newId;

    }

    public static boolean addExam(ExamPojo newExam) throws SQLException {
        String qry = "insert into exam values(?,?,?)";
        Connection conn = DBConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, newExam.getExamid());
        ps.setString(2, newExam.getLanguage());
        ps.setInt(3, newExam.getTotal_questions());
        int ans = ps.executeUpdate();
        return (ans == 1);

    }

    public static boolean isPaperPresent(String subject) throws SQLException {
        String qry = "select examid from exam where language = ?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,subject);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    public static ArrayList<String>getExamIdBySubject(String subject ,String username)throws SQLException{
        String qry = "select examid from exam where language = ? minus select examid from performance where userid =?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,subject);
        ps.setString(2,username);
        ResultSet rs = ps.executeQuery();
        ArrayList<String>al= new ArrayList<>();
        while(rs.next()){
            al.add(rs.getString(1));
        }
        return al;
    }
    public static int getQuestionCountByExam(String examid)throws SQLException{
        String qry ="select total_questions from exam where examid = ?";
        int count = 0;
         Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,examid);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
             count = rs.getInt(1);
        }
       
        return count;
    }
     public static ArrayList<String>getExamIds(String subject )throws SQLException{
        String qry = "select examid from exam where language = ? ";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,subject);
        ResultSet rs = ps.executeQuery();
        ArrayList<String>al= new ArrayList<>();
        while(rs.next()){
            al.add(rs.getString(1));
        }
        return al;
    }

}
