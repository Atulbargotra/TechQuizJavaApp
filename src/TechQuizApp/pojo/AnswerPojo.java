/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.pojo;

import java.util.Objects;

/**
 *
 * @author atulb
 */
public class AnswerPojo {

    @Override
    public String toString() {
        return "AnswerPojo{" + "examid=" + examid + ", subject=" + subject + ", qno=" + qno + ", chosenanswer=" + chosenanswer + ", correctAnswer=" + correctAnswer + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
         AnswerPojo other = (AnswerPojo) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examid, other.examid)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.chosenanswer, other.chosenanswer)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        return true;
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getChosenanswer() {
        return chosenanswer;
    }

    public void setChosenanswer(String chosenanswer) {
        this.chosenanswer = chosenanswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public AnswerPojo() {
    }

    public AnswerPojo(String examid, String subject, int qno, String chosenanswer, String correctAnswer) {
        this.examid = examid;
        this.subject = subject;
        this.qno = qno;
        this.chosenanswer = chosenanswer;
        this.correctAnswer = correctAnswer;
    }
    private String examid;
    private String subject;
    private int qno;
    private String chosenanswer;
    private String correctAnswer;
    
    
}
