/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.gui;

import TechQuizApp.dao.ExamDao;
import TechQuizApp.dao.QuestionDao;
import TechQuizApp.pojo.ExamPojo;
import TechQuizApp.pojo.QuestionPojo;
import TechQuizApp.pojo.QuestionStore;
import TechQuizApp.pojo.UserProfile;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author atulb
 */
public class questionsetter extends javax.swing.JFrame {

    private ExamPojo newExam;
    private QuestionStore qstore;
    private HashMap<String, String> options;
    private int qno;
    private String question, option1, option2, option3, option4, correctoption;

    public questionsetter(ExamPojo newExam) {
        this();
        this.newExam = newExam;
        qremaining.setText(this.newExam.getTotal_questions() + " Questions remaining");

    }

    public questionsetter() {
        initComponents();
        setLocationRelativeTo(null);
        username.setText("Hello " + UserProfile.getUsername());
        qstore = new QuestionStore();
        options = new HashMap<>();
        options.put("Option 1", "Answer1");
        options.put("Option 2", "Answer2");
        options.put("Option 3", "Answer3");
        options.put("Option 4", "Answer4");
        qno = 1;
        qnum.setText(qnum.getText() + qno);

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
        jLabel2 = new javax.swing.JLabel();
        qr = new javax.swing.JLabel();
        qremaining = new javax.swing.JLabel();
        qnum = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        qarea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        op1 = new javax.swing.JTextField();
        op2 = new javax.swing.JTextField();
        op3 = new javax.swing.JTextField();
        op4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correctOPtion = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Clipboard_96px.png"))); // NOI18N

        qr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qr.setForeground(new java.awt.Color(204, 204, 204));

        qremaining.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        qremaining.setForeground(new java.awt.Color(153, 153, 153));

        qnum.setForeground(new java.awt.Color(204, 204, 204));
        qnum.setText("Question number -");

        qarea.setBackground(new java.awt.Color(54, 33, 89));
        qarea.setColumns(20);
        qarea.setForeground(new java.awt.Color(204, 204, 204));
        qarea.setRows(5);
        qarea.setBorder(null);
        jScrollPane1.setViewportView(qarea);

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

        btn_next.setBackground(new java.awt.Color(54, 33, 89));
        btn_next.setForeground(new java.awt.Color(153, 153, 153));
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(54, 33, 89));
        jButton3.setForeground(new java.awt.Color(153, 153, 153));
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jButton3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(qnum)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(correctOPtion, 0, 84, Short.MAX_VALUE)
                                            .addComponent(op2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(op4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(65, 65, 65))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(qr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qremaining, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btn_next)
                        .addGap(78, 78, 78)
                        .addComponent(jButton4)))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(qr))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(logout)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(61, 61, 61))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(username)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(qremaining, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(qnum)))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(correctOPtion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_next)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correctOPtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctOPtionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correctOPtionActionPerformed

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

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        if (validateInput() == false) {
            JOptionPane.showMessageDialog(null, "Please fill all the input fields", "Cannot add Questions", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String optionName = options.get(correctoption);
        QuestionPojo obj = new QuestionPojo(newExam.getExamid(), qno, question, option1, option2, option3, option4,optionName,newExam.getLanguage());
        qstore.addQuestion(obj);
        clearAll();
        qremaining.setText((newExam.getTotal_questions() - qno) + " Questions Remaining");
        qno++;
        if (qno > newExam.getTotal_questions()) {
            disableAll();
            JOptionPane.showMessageDialog(null, "Your Question have been sucessfully added\nPress Done to add it to database", "Exam Added", JOptionPane.INFORMATION_MESSAGE);
        } else {
            qnum.setText("Quesstion number " + qno);
        }

    }//GEN-LAST:event_btn_nextActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(qno<=newExam.getTotal_questions())
        {
            int remainingQuestions = newExam.getTotal_questions()-qno+1;
            JOptionPane.showMessageDialog(null, "You still have "+remainingQuestions+"Questions remaining.", "Cannot Add Exam", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        try{
            ExamDao.addExam(newExam);
            QuestionDao.addQuestion(qstore);
            JOptionPane.showMessageDialog(null, "Your Questions have been sucessfully added to database", "Exam Added", JOptionPane.INFORMATION_MESSAGE);
            AdminOptionsFrame obj = new AdminOptionsFrame();
            this.dispose();
            obj.setVisible(true);
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error while connecting to database","Exception", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setapaper obj = new setapaper();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(questionsetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questionsetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questionsetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questionsetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questionsetter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> correctOPtion;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel qr;
    private javax.swing.JLabel qremaining;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
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

    public void clearAll() {
        qarea.setText("");
        op1.setText("");
        op2.setText("");
        op3.setText("");
        op4.setText("");
        correctOPtion.setSelectedIndex(0);

    }

    public void disableAll() {
        qarea.setEnabled(false);
        op1.setEnabled(false);
        op2.setEnabled(false);
        op3.setEnabled(false);
        op4.setEnabled(false);
        correctOPtion.setEnabled(false);
        btn_next.setEnabled(false);

    }

}
