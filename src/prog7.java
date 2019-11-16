package progressive;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class prog7 extends javax.swing.JFrame {
    public static String s, s2, s3, s4;
    public prog7() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(796, 600));
        setMinimumSize(new java.awt.Dimension(796, 600));
        setPreferredSize(new java.awt.Dimension(796, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(830, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(830, 600));
        jPanel1.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel4.add(jTextField5);
        jTextField5.setBounds(10, 40, 270, 30);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 80, 270, 110);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Block1");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(20, 0, 230, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 170, 290, 200);

        jPanel6.setBackground(new java.awt.Color(248, 202, 202));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(null);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Block2");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(10, 0, 230, 40);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel6.add(jTextField6);
        jTextField6.setBounds(10, 40, 240, 30);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(10, 80, 240, 110);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(310, 170, 260, 200);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(310, 410, 260, 140);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(null);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel7.add(jTextField7);
        jTextField7.setBounds(10, 40, 270, 28);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel7.add(jScrollPane4);
        jScrollPane4.setBounds(10, 80, 270, 120);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Block3");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);
        jButton2.setBounds(50, 0, 190, 40);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(10, 380, 290, 210);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("All Sub Nodes");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(320, 370, 260, 40);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(310, 560, 250, 30);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel3.setText("Progressive Duplicate Detection");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(100, 20, 350, 47);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 10, 570, 80);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setText("Progressive Blocking");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 110, 180, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progressive/Diamond_Cubic-F_lattice_animation.gif"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(570, 240, 230, 240);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -1, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Random rand = new Random();
            int num1 = (rand.nextInt(14) + 1 * 10000) + (rand.nextInt(10) + 1) * 1000 + (rand.nextInt(10) * 100) + rand.nextInt(10);
            s = "Data value is : " + num1;
            jTextField7.setText(s);
            s2 = jTextField7.getText();
        } catch (Exception e) {
          System.err.println(e.getMessage());
        }
        jTextArea4.append(s2 + "\n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Random random = new Random();
        int progress = 0;
        while (progress < 110) {
            try {
                Thread.sleep(random.nextInt(110));
            } catch (InterruptedException ex) {
                Logger.getLogger(prog7.class.getName()).log(Level.SEVERE, null, ex);
            }
            progress += 1;
            jProgressBar1.setValue(progress);

            Rectangle progressRect = jProgressBar1.getBounds();
            progressRect.x = 0;
            progressRect.y = 0;
            jProgressBar1.setForeground(Color.blue);
            jProgressBar1.setBackground(Color.white);
//System.out.print("::::::::::"+progressRect);
            jProgressBar1.paintImmediately(progressRect);
            //  jLabel1.setVisible(false);

        }
        try {

            TimeUnit.SECONDS.sleep(3);

        } catch (Exception e) {
            //Handle exception
        }
        try {
            Random rand = new Random();
            int num1 = (rand.nextInt(8) + 1 * 10000) + (rand.nextInt(8) + 1) * 1000 + (rand.nextInt(10) * 100) + rand.nextInt(10);
            s = "The Value is : " + num1;
            jTextField5.setText(s);
            s3 = jTextField5.getText();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        jTextArea2.append(s3 + "\n");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextArea1.append(s2 + "\n" + s3 + "\n" + s4 + "\n");
        JOptionPane.showMessageDialog(null, " Key Generation Successful!...");
       new prog8().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Random random = new Random();
        int progress = 0;
        while (progress < 110) {
            try {
                Thread.sleep(random.nextInt(110));
            } catch (InterruptedException ex) {
                Logger.getLogger(prog7.class.getName()).log(Level.SEVERE, null, ex);
            }
            progress += 1;
            jProgressBar1.setValue(progress);

            Rectangle progressRect = jProgressBar1.getBounds();
            progressRect.x = 0;
            progressRect.y = 0;
            jProgressBar1.setForeground(Color.blue);
            jProgressBar1.setBackground(Color.white);
//System.out.print("::::::::::"+progressRect);
            jProgressBar1.paintImmediately(progressRect);
            //    jLabel1.setVisible(false);

        }

        try {
            Random rand = new Random();
            int num1 = (rand.nextInt(8) + 1 * 10000) + (rand.nextInt(8) + 1) * 1000 + (rand.nextInt(10) * 100) + rand.nextInt(10);
            s = "Valu is  : " + num1;
            jTextField6.setText(s);
            s4 = jTextField6.getText();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        jTextArea3.append(s4 + "\n");
        try {

            TimeUnit.SECONDS.sleep(2);

        } catch (Exception e) {
            //Handle exception
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
            java.util.logging.Logger.getLogger(prog7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prog7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prog7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prog7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prog7().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
