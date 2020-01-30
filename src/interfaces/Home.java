
package interfaces;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import operations.Lecturer;
import operations.Person;
import operations.Student;
import java.awt.*;

public class
Home extends javax.swing.JFrame {


    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameTxtBx = new javax.swing.JTextField();
        passwordTxtBx = new javax.swing.JPasswordField();
        signinBtn = new javax.swing.JButton();
        signupLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University Management System");
        jLabel1.setPreferredSize(new java.awt.Dimension(542, 120));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel3.setText("Password");

        usernameTxtBx.setBackground(new java.awt.Color(240, 240, 240));
        usernameTxtBx.setOpaque(false);
        usernameTxtBx.setBackground(new java.awt.Color(255, 255, 255, 0));
        usernameTxtBx.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        usernameTxtBx.setForeground(new java.awt.Color(102, 102, 102));
        usernameTxtBx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTxtBx.setText("Enter your Username");
        usernameTxtBx.setName("usernameTxtBx"); // NOI18N
        usernameTxtBx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTxtBxFocusGained(evt);
            }
        });
        usernameTxtBx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTxtBxMouseClicked(evt);
            }
        });
        usernameTxtBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtBxActionPerformed(evt);
            }
        });
        usernameTxtBx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTxtBxKeyPressed(evt);
            }
        });

        passwordTxtBx.setBackground(new java.awt.Color(240, 240, 240));
        passwordTxtBx.setOpaque(false);
        passwordTxtBx.setBackground(new java.awt.Color(255, 255, 255, 0));
        passwordTxtBx.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        passwordTxtBx.setForeground(new java.awt.Color(102, 102, 102));
        passwordTxtBx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxtBx.setText("EnteryourPassword");
        passwordTxtBx.setName("passwordTxtBx"); // NOI18N
        passwordTxtBx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTxtBxMouseClicked(evt);
            }
        });
        passwordTxtBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtBxActionPerformed(evt);
            }
        });
        passwordTxtBx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTxtBxKeyPressed(evt);
            }
        });

        signinBtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 30)); // NOI18N
        signinBtn.setText("Sign in");
        signinBtn.setName("signinBtn"); // NOI18N
        signinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinBtnActionPerformed(evt);
            }
        });

        signupLbl.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        signupLbl.setForeground(new java.awt.Color(0, 0, 255));
        signupLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupLbl.setText("Not a Registered User? Sign up Here");
        signupLbl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                signupLblFocusGained(evt);
            }
        });
        signupLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signupLblMousePressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/Images/new.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(240, 240, 240)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(passwordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(200, 200, 200)
                                                .addComponent(signinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(usernameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(230, 230, 230)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(13, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(290, 290, 290)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(signupLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(150, 150, 150)
                                                .addComponent(passwordTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(220, 220, 220)
                                                .addComponent(signinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(usernameTxtBx, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(signupLbl))
                                .addContainerGap(21, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 600, 460));

        pack();
    }// </editor-fold>

    private void signinBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Student student = new Student();
        Lecturer lecturer = new Lecturer();
        Person person=new Person();
        int ID = student.login_student(usernameTxtBx.getText(), passwordTxtBx.getText());
        Profile profile=new Profile();

        if (ID == 0) {
            ID = lecturer.login_lecturer(usernameTxtBx.getText(), passwordTxtBx.getText());
            if (ID == 0) {
                JOptionPane.showMessageDialog(null, "Username or Password is incorrect!!!");

            } else {
                this.dispose();
                try {
                    person.setUser_name(usernameTxtBx.getText());
                    person.showPersonDetails(ID,lecturer.role1,lecturer.role2);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            this.dispose();
            try {
                person.showPersonDetails(ID,student.role1,student.role2);
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        System.exit(0);
    }

    private void usernameTxtBxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void signupLblMouseClicked(java.awt.event.MouseEvent evt) {
        Signup signup=new Signup();
        this.dispose();
        signup.setVisible(true);
    }

    private void usernameTxtBxFocusGained(java.awt.event.FocusEvent evt) {


    }

    private void usernameTxtBxMouseClicked(java.awt.event.MouseEvent evt) {
        if(usernameTxtBx.getText().equals("Enter your Username")){
            usernameTxtBx.setText(null);
            usernameTxtBx.setFont(new java.awt.Font("Tahoma", 1, 16));
            usernameTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }

    private void passwordTxtBxMouseClicked(java.awt.event.MouseEvent evt) {
        if(passwordTxtBx.getText().equals("EnteryourPassword")){
            passwordTxtBx.setText(null);
            passwordTxtBx.setFont(new java.awt.Font("Tahoma", 1, 16));
            passwordTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }

    private void usernameTxtBxKeyPressed(java.awt.event.KeyEvent evt) {
        if(usernameTxtBx.getText().equals("Enter your Username")){
            usernameTxtBx.setText(null);
            usernameTxtBx.setFont(new java.awt.Font("Tahoma", 1, 16));
            usernameTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }

    private void passwordTxtBxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void signupLblFocusGained(java.awt.event.FocusEvent evt) {
        signupLbl.setForeground(new java.awt.Color(0, 0, 102));
    }

    private void signupLblMousePressed(java.awt.event.MouseEvent evt) {
        signupLbl.setForeground(Color.BLACK);
    }

    private void signupLblMouseEntered(java.awt.event.MouseEvent evt) {
        signupLbl.setForeground(new java.awt.Color(0, 0, 102));
        signupLbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void signupLblMouseExited(java.awt.event.MouseEvent evt) {
        signupLbl.setForeground(new java.awt.Color(0, 0, 255));
        signupLbl.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    private void passwordTxtBxKeyPressed(java.awt.event.KeyEvent evt) {
        if(passwordTxtBx.getText().equals("EnteryourPassword")){
            passwordTxtBx.setText(null);
            passwordTxtBx.setFont(new java.awt.Font("Tahoma", 1, 16));
            passwordTxtBx.setForeground(new java.awt.Color(51, 51, 51));
        }
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);


            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passwordTxtBx;
    private javax.swing.JButton signinBtn;
    private javax.swing.JLabel signupLbl;
    private javax.swing.JTextField usernameTxtBx;
    // End of variables declaration
}
