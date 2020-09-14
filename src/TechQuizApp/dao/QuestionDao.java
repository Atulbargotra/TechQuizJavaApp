/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.dao;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.PerformancePojo;
import TechQuizApp.pojo.QuestionPojo;
import TechQuizApp.pojo.QuestionStore;
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
public class QuestionDao {

    public static void addQuestion(QuestionStore obj) throws SQLException {
        String qry = "insert into question values(?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ArrayList<QuestionPojo> al = obj.getAllQuestions();
        for (QuestionPojo qp : al) {
            ps.setString(1, qp.getExamId());
            ps.setInt(2, qp.getQno());
            ps.setString(3, qp.getQuestion());
            ps.setString(4, qp.getAnswer1());
            ps.setString(5, qp.getAnswer2());
            ps.setString(6, qp.getAnswer3());
            ps.setString(7, qp.getAnswer4());
            ps.setString(8, qp.getCorrectAnswer());
            ps.setString(9, qp.getLanguage());
            ps.executeUpdate();

        }

    }

    public static ArrayList<QuestionPojo> getQuestionByExamId(String exid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "select * from question where examid = ? order by qno";
        ArrayList<QuestionPojo> questionlist = new ArrayList<>();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, exid);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            //String examid = rs.getString("examid");
            int qno = rs.getInt("qno");
            String question = rs.getString("question");
            String answer1 = rs.getString("answer1");
            String answer2 = rs.getString("answer2");
            String answer3 = rs.getString("answer3");
            String answer4 = rs.getString("answer4");
            String correctAnswer = rs.getString("correctanswer");
            String language = rs.getString("language");

            QuestionPojo q = new QuestionPojo(exid, qno, question, answer1, answer2, answer3, answer4, correctAnswer, language);
            questionlist.add(q);
        }
        return questionlist;
    }

    public static boolean updateQuestions(QuestionStore obj, String exid) throws SQLException {
        String qry = "update question set question = ?,answer1 =?,answer2 =?,answer3 = ?,answer4=?,correctanswer=? where examid = ? and qno=?";
        Connection conn = DBConnection.getConnection();
        int i=0;
        PreparedStatement ps = conn.prepareStatement(qry);
        ArrayList<QuestionPojo> al = obj.getAllQuestions();
        for (QuestionPojo qp : al) {
            ps.setString(1, qp.getQuestion());
            ps.setString(2, qp.getAnswer1());
            ps.setString(3, qp.getAnswer2());
            ps.setString(4, qp.getAnswer3());
            ps.setString(5, qp.getAnswer4());
            ps.setString(6, qp.getCorrectAnswer());
            ps.setString(7, exid);
            ps.setInt(8, qp.getQno());
            i = ps.executeUpdate();
            System.out.println(i);
        }
        return i == 1;
    }
}
