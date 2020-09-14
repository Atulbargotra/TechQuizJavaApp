/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.gui;

import TechQuizApp.dao.ExamDao;
import TechQuizApp.dao.QuestionDao;
import TechQuizApp.pojo.AnswerPojo;
import TechQuizApp.pojo.ExamPojo;
import TechQuizApp.pojo.QuestionPojo;
import TechQuizApp.pojo.QuestionStore;
import TechQuizApp.pojo.UserProfile;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author atulb
 */
public class edit extends javax.swing.JFrame {

    private int qno = 1;
    private int pos = 0;
    private QuestionStore qstore;
    private HashMap<String, String> options;
    private String question, option1, option2, option3, option4, correctoption;
    private ExamPojo obj;
    QuestionPojo q;
    private ArrayList<QuestionPojo> al;

    /**
     * Creates new form edit
     */
    public edit() {
        initComponents();
        username.setText("Hello " + UserProfile.getUsername());
        setLocationRelativeTo(null);
        qstore = new QuestionStore();
        options = new HashMap<>();
        options.put("Option 1", "Answer1");
        options.put("Option 2", "Answer2");
        options.put("Option 3", "Answer3");
        options.put("Option 4", "Answer4");
    }

    public edit(ExamPojo obj) {
        this();
        this.obj = obj;
        try {
            al = QuestionDao.getQuestionByExamId(obj.getExamid());
        } catch (SQLException ex) {
            Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadquestions();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        qarea = new javax.swing.JTextArea();
        qnum = new javax.swing.JLabel();
        op1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        op2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        op3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        op4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correctOPtion = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_User_25px_2.png"))); // NOI18N

        logout.setForeground(new java.awt.Color(204, 204, 204));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Exit_25px.png"))); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });

        qarea.setBackground(new java.awt.Color(54, 33, 89));
        qarea.setColumns(20);
        qarea.setForeground(new java.awt.Color(204, 204, 204));
        qarea.setRows(5);
        qarea.setBorder(null);
        jScrollPane1.setViewportView(qarea);

        qnum.setForeground(new java.awt.Color(204, 204, 204));
        qnum.setText("Question number -");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Option 1");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Option 2");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Option 3");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Option 4");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Checkmark_23px.png"))); // NOI18N
        jLabel8.setText("Correct Answer");

        correctOPtion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Option 2", "Option 3", "Option 4", " " }));
        correctOPtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctOPtionActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(54, 33, 89));
        cancel.setForeground(new java.awt.Color(153, 153, 153));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        btn_next.setBackground(new java.awt.Color(54, 33, 89));
        btn_next.setForeground(new java.awt.Color(153, 153, 153));
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(54, 33, 89));
        jButton4.setForeground(new java.awt.Color(153, 153, 153));
        jButton4.setText("Done");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(qnum)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_next)
                        .addGap(107, 107, 107)
                        .addComponent(jButton4)
                        .addGap(94, 94, 94))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(op3)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(correctOPtion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(op1)
                                        .addGap(227, 227, 227)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(username))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(qnum)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(correctOPtion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btn_next)
                    .addComponent(cancel))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        loginscreen1 obj = new loginscreen1();
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        logout.setForeground(Color.WHITE);
        Font f = new Font("Segoe UI Black", Font.PLAIN, 14);
        logout.setFont(f);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        logout.setForeground(new Color(204, 204, 204));
        Font f = new Font("Segoe UI ", Font.BOLD, 14);
        logout.setFont(f);
    }//GEN-LAST:event_logoutMouseExited

    private void correctOPtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctOPtionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correctOPtionActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        AdminOptionsFrame f = new AdminOptionsFrame();
        this.dispose();
        f.setVisible(true);

    }//GEN-LAST:event_cancelActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        if (validateInput() == false) {
            JOptionPane.showMessageDialog(null, "Please fill all the input fields", "Cannot add Questions", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String optionName = options.get(correctoption);
        QuestionPojo newquestion = new QuestionPojo(obj.getExamid(), qno, question, option1, option2, option3, option4, optionName, obj.getLanguage());
        QuestionPojo question = qstore.getQuestionBYQno(qno);
        if (question == null) {
            qstore.addQuestion(newquestion);
        } else {
            if (newquestion.equals(question) == false) {
                int apos = qstore.removeAnswers(question);
                qstore.setQuestionAt(apos, newquestion);
            }
        }

        pos++;
        if (pos >= al.size()) {
            pos = 0;
        }
        qno++;
        if (qno > al.size()) {
            qno = 1;
        }
        qnum.setText("Question no" + qno);
        nextQuestion();

    }//GEN-LAST:event_btn_nextActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {

            QuestionDao.updateQuestions(qstore, obj.getExamid());
            JOptionPane.showMessageDialog(null, "Your Questions have been sucessfully added to database", "Exam Added", JOptionPane.INFORMATION_MESSAGE);
            AdminOptionsFrame obj = new AdminOptionsFrame();
            this.dispose();
            obj.setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error while connecting to database", "Exception", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_next;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> correctOPtion;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField op1;
    private javax.swing.JTextField op2;
    private javax.swing.JTextField op3;
    private javax.swing.JTextField op4;
    private javax.swing.JTextArea qarea;
    private javax.swing.JLabel qnum;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    private void loadquestions() {

        q = al.get(pos);
        String question = q.getQuestion();
        String answer1 = q.getAnswer1();
        String answer2 = q.getAnswer2();
        String answer3 = q.getAnswer3();
        String answer4 = q.getAnswer4();
        String correctAnswer = q.getCorrectAnswer();
        qarea.setText(question);
        qnum.setText("Question no:" + qno);
        op1.setText(answer1);
        op2.setText(answer2);
        op3.setText(answer3);
        op4.setText(answer4);
        if (correctAnswer.equals("Answer1")) {
            correctOPtion.setSelectedIndex(0);
        } else if (correctAnswer.equals("Answer2")) {
            correctOPtion.setSelectedIndex(1);
        } else if (correctAnswer.equals("Answer3")) {
            correctOPtion.setSelectedIndex(2);
        } else if (correctAnswer.equals("Answer4")) {
            correctOPtion.setSelectedIndex(3);
        }

    }

    private void nextQuestion() {
        q = al.get(pos);
        String examid = q.getExamId();
        String questionn = q.getQuestion();
        String answer1 = q.getAnswer1();
        String answer2 = q.getAnswer2();
        String answer3 = q.getAnswer3();
        String answer4 = q.getAnswer4();
        String correctAnswer = q.getCorrectAnswer();
        qarea.setText(questionn);
        op1.setText(answer1);
        op2.setText(answer2);
        op3.setText(answer3);
        op4.setText(answer4);
        if (correctAnswer.equals("Answer1")) {
            correctOPtion.setSelectedIndex(0);
        } else if (correctAnswer.equals("Answer2")) {
            correctOPtion.setSelectedIndex(1);
        } else if (correctAnswer.equals("Answer3")) {
            correctOPtion.setSelectedIndex(2);
        } else if (correctAnswer.equals("Answer4")) {
            correctOPtion.setSelectedIndex(3);
        }
        QuestionPojo question = qstore.getQuestionBYQno(qno);
        if (question == null) {
            return;

        }

        String questionn2 = question.getQuestion();
        String answer12 = question.getAnswer1();
        String answer22 = question.getAnswer2();
        String answer32 = question.getAnswer3();
        String answer42 = question.getAnswer4();
        String correctAnswer2 = question.getCorrectAnswer();
        if (correctAnswer2 == "Answer1") {
            correctOPtion.setSelectedIndex(0);
        } else if (correctAnswer2 == "Answer2") {
            correctOPtion.setSelectedIndex(1);
        } else if (correctAnswer2 == "Answer3") {
            correctOPtion.setSelectedIndex(2);
        } else if (correctAnswer2 == "Answer4") {
            correctOPtion.setSelectedIndex(3);
        }
        qarea.setText(questionn2);
        op1.setText(answer12);
        op2.setText(answer22);
        op3.setText(answer32);
        op4.setText(answer42);

    }

    public boolean validateInput() {
        question = qarea.getText().trim();
        option1 = op1.getText().trim();
        option2 = op2.getText().trim();
        option3 = op3.getText().trim();
        option4 = op4.getText().trim();
        correctoption = correctOPtion.getSelectedItem().toString();
        if (question.isEmpty() || option1.isEmpty() || option2.isEmpty() || option3.isEmpty() || option4.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
