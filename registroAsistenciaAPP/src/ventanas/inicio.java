package ventanas;

import java.awt.Color;
import Desvanecimiento.Desvanecimiento;


public class inicio extends javax.swing.JFrame {

    int xMouse, yMouse;
    Desvanecimiento efecto;
    
    public inicio() {
        initComponents();
        setLocationRelativeTo(null);
        efecto = new Desvanecimiento();
        efecto.Abrir(this, 20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparatorDNI = new javax.swing.JSeparator();
        btnLogIn = new javax.swing.JPanel();
        txtLogIn = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        lblEscudoVG = new javax.swing.JLabel();
        jSeparatorDNI1 = new javax.swing.JSeparator();
        lblValleGrande = new javax.swing.JLabel();
        lblIconUser = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        lblYouAreNew = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        Minimizar = new javax.swing.JPanel();
        txtminimizar = new javax.swing.JLabel();
        Exit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        backgroundVG = new javax.swing.JLabel();
        barraSuperior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparatorDNI.setForeground(new java.awt.Color(255, 175, 0));
        jPanel1.add(jSeparatorDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 320, 10));

        btnLogIn.setBackground(new java.awt.Color(1, 147, 51));
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogInMouseExited(evt);
            }
        });

        txtLogIn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtLogIn.setForeground(new java.awt.Color(255, 255, 255));
        txtLogIn.setText("Log In");
        btnLogIn.add(txtLogIn);

        jPanel1.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 130, 40));

        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("********");
        password.setBorder(null);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 300, 40));

        lblEscudoVG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escudoVG.png"))); // NOI18N
        jPanel1.add(lblEscudoVG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 160, -1));

        jSeparatorDNI1.setForeground(new java.awt.Color(255, 175, 0));
        jPanel1.add(jSeparatorDNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 320, 10));

        lblValleGrande.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblValleGrande.setForeground(new java.awt.Color(255, 255, 255));
        lblValleGrande.setText("VALLE GRANDE");
        jPanel1.add(lblValleGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 155, -1));

        lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoUsuario.png"))); // NOI18N
        jPanel1.add(lblIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        txtDNI.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(153, 153, 153));
        txtDNI.setText("Ingresa tu DNI");
        txtDNI.setBorder(null);
        txtDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDNIMousePressed(evt);
            }
        });
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 300, 40));

        lblYouAreNew.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblYouAreNew.setForeground(new java.awt.Color(255, 175, 0));
        lblYouAreNew.setText("You are new?");
        lblYouAreNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblYouAreNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        lblAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAdmin.setText("Admin");
        lblAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 530, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoBlanco.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 489, -1));

        Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.setPreferredSize(new java.awt.Dimension(40, 40));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizarMouseExited(evt);
            }
        });

        txtminimizar.setBackground(new java.awt.Color(255, 255, 255));
        txtminimizar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtminimizar.setText("-");

        javax.swing.GroupLayout MinimizarLayout = new javax.swing.GroupLayout(Minimizar);
        Minimizar.setLayout(MinimizarLayout);
        MinimizarLayout.setHorizontalGroup(
            MinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinimizarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtminimizar)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        MinimizarLayout.setVerticalGroup(
            MinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MinimizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtminimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 50));

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.setPreferredSize(new java.awt.Dimension(40, 40));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });

        txtExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtExit.setText("X");

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
        Exit.setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(txtExit)
                .addGap(16, 16, 16))
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        backgroundVG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2020-01-16.jpg"))); // NOI18N
        backgroundVG.setText("jLabel4");
        jPanel1.add(backgroundVG, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, -1, -1));

        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        
        //Aqui tenemos dos opciones para Cerrar, el codigo que esta en comentario es para Cerrar sin la libreria con el efecto desvanecimiento
        //System.exit(0);
        efecto.Cerrar(this, 20);
        
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exit.setBackground(Color.red);
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exit.setBackground(Color.white);
        txtExit.setForeground(Color.black);
    }//GEN-LAST:event_ExitMouseExited

    private void btnLogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseEntered

        btnLogIn.setBackground(new Color(255 ,175 ,0));
        txtLogIn.setForeground(Color.black);
        
    }//GEN-LAST:event_btnLogInMouseEntered

    private void btnLogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseExited

        btnLogIn.setBackground(new Color(1, 147 ,51));
        txtLogIn.setForeground(Color.white);
        
    }//GEN-LAST:event_btnLogInMouseExited

    private void txtDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDNIMousePressed
        
        if (txtDNI.getText().equals("Ingresa tu DNI")) {
            txtDNI.setText("");
            txtDNI.setForeground(Color.black);
        }
        if (String.valueOf(password.getPassword()).isEmpty()) {
            password.setText("********");
            password.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_txtDNIMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
        
        if (String.valueOf(password.getPassword()).equals("********")) {
            password.setText("");
            password.setForeground(Color.black);
        }
        
        if (txtDNI.getText().isEmpty()){
        txtDNI.setText("Ingresa tu DNI");
        txtDNI.setForeground(Color.gray);
        }
        
        
    }//GEN-LAST:event_passwordMousePressed

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        //Aqui tenemos dos opciones para minimizar, el codigo que esta en comentario es para minimizar sin la libreria con el efecto desvanecimiento
        //this.setExtendedState(1);
        efecto.Ocultar(this, 20);
        
    }//GEN-LAST:event_MinimizarMouseClicked

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseEntered
        
        Minimizar.setBackground(new Color(7 ,90 ,144));
        txtminimizar.setForeground(Color.white);
        
    }//GEN-LAST:event_MinimizarMouseEntered

    private void MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseExited
        
        Minimizar.setBackground(Color.white);
        txtminimizar.setForeground(Color.black);
        
    }//GEN-LAST:event_MinimizarMouseExited

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        
        //aqui esta el codigo para abrir el jFrom despues de ser minimizado, el codigo es de la libreria de desvanecer
        efecto.Mostrar(this, 20);
        
    }//GEN-LAST:event_formWindowDeiconified

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Exit;
    private javax.swing.JPanel Minimizar;
    private javax.swing.JLabel background;
    private javax.swing.JLabel backgroundVG;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPanel btnLogIn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparatorDNI;
    private javax.swing.JSeparator jSeparatorDNI1;
    private javax.swing.JLabel lblAdmin;
    public javax.swing.JLabel lblEscudoVG;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JLabel lblValleGrande;
    private javax.swing.JLabel lblYouAreNew;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtLogIn;
    private javax.swing.JLabel txtminimizar;
    // End of variables declaration//GEN-END:variables
}
