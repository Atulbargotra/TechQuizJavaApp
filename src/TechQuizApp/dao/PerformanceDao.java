/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.dao;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.PerformancePojo;
import TechQuizApp.pojo.StudentScore;
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
public class PerformanceDao {

    public static ArrayList<String> getAllStudent() throws SQLException {
        ArrayList<String> studentIdList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select distinct userid from performance");
        while (rs.next()) {
            String id = rs.getString(1);
            studentIdList.add(id);
        }

        return studentIdList;
    }

    public static ArrayList<String> getAllExamId(String studentid) throws SQLException {
        ArrayList<String> examIdList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        String smt = "select examid from performance where userid = ?";
        PreparedStatement ps = conn.prepareStatement(smt);
        ps.setString(1,studentid);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String exid = rs.getString(1);
            examIdList.add(exid);
        }
        return examIdList;
    }
    public static StudentScore getScore(String studentId,String examId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        String smt = "select per,language from performance where userid = ? and examid = ?";
        PreparedStatement ps = conn.prepareStatement(smt);
        ps.setString(1,studentId);
        ps.setString(2,examId);
        ResultSet rs = ps.executeQuery();
        StudentScore obj = new StudentScore();
        while (rs.next()) {
           Double per = rs.getDouble(1);
           String lang = rs.getString(2);
            obj.setPer(per);
            obj.setLanguage(lang);
        }
        return obj;
    }
    public static ArrayList<PerformancePojo>getalldata () throws SQLException{
        String qry = "select * from performance";
        ArrayList<PerformancePojo>performancelist = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(qry);
        while(rs.next())
        {
            String userid = rs.getString("userid");
            String examid = rs.getString("examid");
            String language = rs.getString("language");
            int right = rs.getInt("right");
            int wrong = rs.getInt("wrong");
            int unattempted = rs.getInt("unattempted");
            double per = rs.getDouble("per");
            PerformancePojo p = new PerformancePojo(examid,language,userid,right,wrong,unattempted,per);
            performancelist.add(p);
        }
return performancelist;
        }
    public static boolean addPerformance(PerformancePojo obj)throws SQLException{
         Connection conn = DBConnection.getConnection();
         String qry = "insert into performance values(?,?,?,?,?,?,?)";
         PreparedStatement ps = conn.prepareStatement(qry);
         ps.setString(1,obj.getUserid());
          ps.setString(2,obj.getExamid());
           ps.setInt(3,obj.getRight());
            ps.setInt(4,obj.getWrong());
             ps.setInt(5,obj.getUnattempted());
             ps.setDouble(6,obj.getPer());
             ps.setString(7,obj.getLanguage());
             int c = ps.executeUpdate();
             return c==1;
    }
    }

