package progressive;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class prog4 extends javax.swing.JFrame {

    static File file = null;
    public static String fname, f1name;
    public static String des;
    public static String des1;
    private boolean debug = true;
    public static String path;
    public static byte ss;
    public static String fpath2, digestB641;
    private File f;

    public prog4() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(615, 630));
        getContentPane().setLayout(null);

        panel1.setLayout(null);
        panel1.add(jLabel5);
        jLabel5.setBounds(480, 120, 0, 50);
        panel1.add(jLabel7);
        jLabel7.setBounds(60, 130, 0, 40);
        panel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 600, 0);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setOpaque(false);
        jScrollPane2.setViewportView(jTextArea2);

        panel1.add(jScrollPane2);
        jScrollPane2.setBounds(280, 150, 310, 280);

        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3);
        jButton3.setBounds(340, 550, 130, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 260, 280);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setText("Progressive Duplicate Detection");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 20, 350, 47);

        panel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 570, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progressive/file-transfer1.png"))); // NOI18N
        panel1.add(jLabel2);
        jLabel2.setBounds(10, 450, 190, 140);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("Data Seperation");
        panel1.add(jLabel3);
        jLabel3.setBounds(210, 100, 150, 30);

        jButton4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jButton4.setText("Select Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel1.add(jButton4);
        jButton4.setBounds(210, 480, 160, 40);

        jButton5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jButton5.setText("Data Subset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel1.add(jButton5);
        jButton5.setBounds(430, 480, 140, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progressive/abstract2.jpg"))); // NOI18N
        jLabel4.setText("jLabel2");
        panel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 600);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new prog5().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        getFile();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        File nextFile = file;
        long fileSize = nextFile.length();
        long splitSize = getSplitSize(fileSize);
        jTextArea1.append("Given File: " + nextFile.getName() + "\n");
        jTextArea1.append("fileSize: " + fileSize + "\n");
        jTextArea1.append("splitSize: " + splitSize + "\n");
        long parts = fileSize / splitSize;
        if (fileSize % splitSize > 0) {
            parts++;
        }
        System.out.println("parts: " + parts + "\n");
        try {
            FileInputStream fis = new FileInputStream(nextFile);
            DataInputStream dis = new DataInputStream(fis);
            long bytesRead = 0;
            File destinationDirectory = getDestinationDirectory();
            for (long k = 0; k < parts; k++) {
                jTextArea2.append("Splitting parts: " + nextFile.getName() + " into part " + k + "\n");
                String filePartName = nextFile.getName();
                if (filePartName.indexOf(".") >= 0) {
                    filePartName = filePartName.substring(0, filePartName.indexOf(".")) + "part" + String.valueOf(k) + filePartName.substring(filePartName.indexOf("."));
                } else {
                    filePartName = filePartName + "part" + String.valueOf(k);
                }
                File outputFile = new File(destinationDirectory, filePartName);
                FileOutputStream fos = new FileOutputStream(outputFile);
                DataOutputStream dos = new DataOutputStream(fos);
                long bytesWritten = 0;
                try {
                    while ((bytesWritten < splitSize) && (bytesRead < fileSize)) {
                        ss = dis.readByte();
                        dos.writeByte(ss);
                        bytesRead++;
                        bytesWritten++;
                    }
                    dos.close();
                    path = outputFile.getAbsolutePath();
                    //a=path;
                } catch (Exception e) {
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("FileNotFoundException:" + fnfe.getMessage());
        }
        JOptionPane.showMessageDialog(null, "File has been Splitted");
    }//GEN-LAST:event_jButton5ActionPerformed
    public File getFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        JFrame frame = new JFrame("Select a file to split");
        chooser.setDialogTitle("Select a file to split");
        int st = chooser.showOpenDialog(null);
        if (st == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            fname = file.getName();
            int pos = fname.lastIndexOf(".");
            if (pos > 0) {
                f1name = fname.substring(0, pos);
            }
            System.out.println("Filename Uploaded is:" + f1name);
            JOptionPane.showMessageDialog(null, "File Uploaded");

        } else if (st == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "File is not Uploaded");
        }
        return file;
    }
    public File getDestinationDirectory() {
        File file = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        JFrame frame = new JFrame("Select destination directory");
        chooser.setDialogTitle("Select destination directory");
        chooser.setApproveButtonText("Select");
        if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
            if (chooser.getSelectedFile().isDirectory()) {
                file = chooser.getSelectedFile();
            } else {
                file = chooser.getSelectedFile().getParentFile();
            }
        }
        des = chooser.getSelectedFile().getAbsolutePath();
        des1 = chooser.getSelectedFile().getName();
        return file;
    }

    public long getSplitSize(long fileSize) {
        String sizeString = JOptionPane.showInputDialog(null, "Input file size: " + String.valueOf(fileSize) + "\nEnter the byte size to split the file into");
         return toLong(sizeString);
    }
     private long toLong(String s) {
        long k = -1;
        try {
            k = Long.parseLong(s);
        } catch (NumberFormatException nfe) {
            k = -1;
        }
        return k;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prog4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
