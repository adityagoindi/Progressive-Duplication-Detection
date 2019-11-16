
package progressive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.jfree.ui.RefineryUtilities;


public class kmean extends javax.swing.JFrame {
Connection con;
Statement st, st1, st2,st3,st4;
   
    public kmean() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/duplic", "root", "root");
            st = con.createStatement();
            st1 = con.createStatement();
            st2 = con.createStatement();
            st3=con.createStatement();
//      st3.executeUpdate("truncate table cluster");
            st4 = con.createStatement();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(663, 531));
        setMinimumSize(new java.awt.Dimension(663, 531));
        setPreferredSize(new java.awt.Dimension(663, 531));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Min & Max Points", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 40, 260, 140);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(310, 40, 280, 140);

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jButton1.setText("min points");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 190, 120, 30);

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jButton2.setText("max points");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(370, 190, 120, 30);

        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jButton3.setText("min & max");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(460, 250, 120, 30);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 240, 430, 100);

        jButton4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(460, 310, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 140, 620, 360);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel3.setText("Progressive Duplicate Detection");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(130, 20, 350, 47);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(20, 20, 620, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progressive/abstract2.jpg"))); // NOI18N
        jLabel4.setText("jLabel2");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 600);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 670, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int i = 0;
            int j = 1;
            jTextArea1.append("P(A/B)\n*******\n");
            int[] a = new int[10];
            st.executeUpdate("TRUNCATE TABLE bayes");
            ResultSet rs = st.executeQuery("select distinct(pro) from cluster");
            while (rs.next()) {
                String s = rs.getString(1);
                System.out.println(s);
                jTextArea1.append(s + "\n");
                ResultSet r = st1.executeQuery("select distinct(Cluster) from cluster where pro='" + s + "'");
                while (r.next()) {
                    String s1 = r.getString(1);
                    jTextArea1.append(s1 + "\t");
                    ResultSet r1 = st2.executeQuery("select count(*) from cluster where pro='" + s + "' and Cluster='" + s1 + "'");
                    while (r1.next()) {
                        int count = r1.getInt(1);
                        jTextArea1.append(count + "\t");
                        a[i] = count;
                        i++;
                    }

                    jTextArea1.append("\n");
                }
                st2.executeUpdate("insert into bayes values(" + j + ",'" + a[0] + "','" + a[1] + "','" + a[2] + "')");
                j++;
                i = 0;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            st.executeUpdate("TRUNCATE TABLE bayes1");
            st.executeUpdate("TRUNCATE TABLE bayes2");
            int cnt=0;
            jTextArea2.append("P(B)\n*******\n");
            ResultSet rs = st.executeQuery("select distinct(cluster) from cluster");
            while (rs.next()) {
                String s = rs.getString(1);
                ResultSet r = st1.executeQuery("select count(*) from cluster where Cluster='" + s + "'");
                while (r.next()) {
                    cnt = r.getInt(1);
                           System.out.println(" value:"+cnt);
                    jTextArea2.append(cnt + "\n");
                }
                String c = String.valueOf(cnt);
//                int c =cnt;
                System.out.println(c);
                st2.executeUpdate("insert into bayes1 values('" + s + "','" + cnt + "')");
            }
            jTextArea2.append("\nP(A)\n*******\n");
            ResultSet rs1 = st.executeQuery("select distinct(pro) from cluster");
            while (rs1.next()) {
                String s = rs1.getString(1);
                ResultSet r = st1.executeQuery("select count(*) from cluster where pro='" + s + "'");
                while (r.next()) {
                    cnt = r.getInt(1);
                    jTextArea2.append(cnt + "\n");
                }
                String c = String.valueOf(cnt);
                System.out.println("countvalue"+c);
                st2.executeUpdate("insert into bayes2 values('" + s + "','" + c + "')");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try {
            jTextArea3.append("Cluster1\tCluster2\n");
  
            int i = 0;
            int j = 1, cc = 0, ccc = 0;
            int[] a = new int[10];
           
            ResultSet rs = st.executeQuery("select distinct(pro) from cluster");
            while (rs.next()) {
                String s = rs.getString(1);
                System.out.println("Protocol"+s);
                ResultSet r = st1.executeQuery("select distinct(Cluster) from cluster where pro='" + s + "'");
                while (r.next()) {
                    String s1 = r.getString(1);
                     System.out.println("clustervalue"+s1);
                    ResultSet r1 = st2.executeQuery("select count(*) from cluster where pro='" + s + "' and Cluster='" + s1 + "'");
                    
                    while (r1.next()) {
                        int count = r1.getInt(1);
                          System.out.println("clustervalue"+count);
                        //  jTextArea1.append(count + "\t");
                        ResultSet rr = st4.executeQuery("select * from bayes2 where class='" + s + "'");
                        while (rr.next()) {
                            cc = rr.getInt(2);
                            System.out.println("value:"+cc);
                        }
                        ResultSet rr1 = st4.executeQuery("select * from bayes1 where cluster='" + s1 + "'");
                        while (rr1.next()) {
                            ccc = rr1.getInt(2);
                             System.out.println("value1:"+ccc);
                        }
                        int v = count * ccc;
                         System.out.println("value2:"+v);
                        int v1 = v / cc;
                         System.out.println("value3:"+v1);
                        jTextArea3.append(v1 + "");
                    }
                    jTextArea3.append("\t");
                }
                jTextArea3.append("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     new proj07().setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

   
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
            java.util.logging.Logger.getLogger(kmean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kmean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kmean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kmean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kmean().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
