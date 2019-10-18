package main;

import function.FileChooser;
import function.Method;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.filechooser.FileFilter;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        open();
    }

    private void open() {
        setIconImage(new ImageIcon(getClass().getResource("/icon/icon.png")).getImage());
        Method.setTextFieldSyle(txtUser, "Nombre de Usuario");
        Method.setTextFieldSyle(txtIP, "Dirección IP");
        showStatus(ms);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIP = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        cmdLogin = new my_swing.Button();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIP.setBackground(new java.awt.Color(204, 204, 204));
        txtIP.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 18)); // NOI18N
        txtIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        txtIP.setSelectionColor(new java.awt.Color(131, 188, 227));
        txtIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIPKeyTyped(evt);
            }
        });
        jPanel1.add(txtIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 260, 45));

        txtUser.setBackground(new java.awt.Color(204, 204, 204));
        txtUser.setFont(new java.awt.Font("Khmer SBBIC Serif", 1, 18)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        txtUser.setSelectionColor(new java.awt.Color(131, 188, 227));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 260, 45));

        cmdLogin.setBackground(new java.awt.Color(102, 102, 102));
        cmdLogin.setForeground(new java.awt.Color(255, 255, 255));
        cmdLogin.setText("Entrar");
        cmdLogin.setColorClick(new java.awt.Color(152, 196, 239));
        cmdLogin.setColorOver(new java.awt.Color(31, 121, 208));
        cmdLogin.setFillBorder(20);
        cmdLogin.setFocusable(false);
        cmdLogin.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 204, 37));

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));
        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 24, -1, 100));

        lbStatus.setFont(new java.awt.Font("Khmer SBBIC Serif", 0, 14)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(204, 0, 0));
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, 424, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escriba un nombre de usuario, seguido de una IP para entrar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 360, -1));

        jLabel3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/blur_bgrnd.jpg"))); // NOI18N
        jLabel3.setEnabled(false);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Iniciar Sesión");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        try {
            if (txtUser.getText().equals("") || !txtUser.getName().equals("have")) {
                txtUser.grabFocus();
                showStatus("Por favor, introduzca su nombre de usuario");
            } else {
                if (txtUser.getText().trim().length() > 15) {
                    txtUser.grabFocus();
                    showStatus("El nombre de usuario no puede tener más de 15 caracteres");
                } else {
                    String IP = txtIP.getText().trim();
                    if (txtIP.getText().equals("") || !txtIP.getName().equals("have")) {
                        IP = "localhost";
                        System.err.println("have");
                    }
                    String userName = txtUser.getText().trim();
                    Registry re = LocateRegistry.getRegistry(IP, 5001);
                    rmi.Method rmi = (rmi.Method) re.lookup("raven");
                    if (rmi.checkName(userName)) {
                        Method.connect(profile_pic, userName, IP);
                        this.dispose();
                        Main.main(null);
                    } else {
                        showStatus("Nombre de usuario existente");
                    }
                }

            }
        } catch (UnknownHostException e) {
            showStatus("Host desconocido : " + txtIP.getText());
        } catch (java.rmi.UnknownHostException e) {
            showStatus("Host desconocido : " + txtIP.getText());
        } catch (ConnectException e) {
            showStatus("Servidor no encontrado");
        } catch (java.rmi.ConnectException e) {
            showStatus("Servidor no encontrado");
        } catch (Exception e) {
            showStatus("La red es inalcanzable : conectar");
            System.out.println(e);
        }
    }//GEN-LAST:event_cmdLoginActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if (evt.getKeyChar() == 10) {
            txtIP.grabFocus();
        }
        if (txtUser.getText().trim().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtIPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIPKeyTyped
        if (evt.getKeyChar() == 10) {
            cmdLoginActionPerformed(null);
        }
    }//GEN-LAST:event_txtIPKeyTyped

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private ImageIcon profile_pic;
    private Timer timer = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            lbStatus.setText("");
            timer.stop();
        }
    });

    private void showStatus(String error) {
        if (timer.isRunning()) {
            lbStatus.setText("");
            timer.stop();
        }
        timer.start();
        lbStatus.setText(error);
    }

    private static String ms = "";

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (args.length == 1) {
                    ms = args[0];
                }
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private my_swing.Button cmdLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
