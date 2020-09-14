/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.pojo;

/**
 *
 * @author atulb
 */
public class PerformancePojo {
    private String examid;
    private String language;
    private String userid;
    private int right;
    private int wrong;
    private int unattempted;
    private double per;

    
    public PerformancePojo()
    {
        
    }
    
    
    
    public PerformancePojo(String examid, String language, String userid, int right, int wrong, int unattempted, double per) {
        this.examid = examid;
        this.language = language;
        this.userid = userid;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.per = per;
    }

    
    
    
    @Override
    public String toString() {
        return "Performancepojo{" + "examid=" + examid + ", language=" + language + ", userid=" + userid + ", right=" + right + ", wrong=" + wrong + ", unattempted=" + unattempted + ", per=" + per + '}';
    }

    
    
    
    public void setExamid(String examid) {
        this.examid = examid;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public void setPer(double per) {
        this.per = per;
    }

    
    public String getExamid() {
        return examid;
    }

    public String getLanguage() {
        return language;
    }

    public String getUserid() {
        return userid;
    }

    public int getRight() {
        return right;
    }

    public int getWrong() {
        return wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public double getPer() {
        return per;
    }
                    
           
    
    
}
    
