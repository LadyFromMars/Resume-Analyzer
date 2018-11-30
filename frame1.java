/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


       
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.input.Clipboard;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

public class frame1 extends javax.swing.JFrame {

    static String resumeInput = " ";
    static String jobInput = " ";
    static String test = " ";

    /**
     * Creates new form frame1
     */
    public frame1() {
        initComponents();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        go = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextFieldResume = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextFieldJob = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        paste = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resume Analyzer");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        setForeground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(240, 80));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("/Users/natallia/Desktop/search1-black.png")); // NOI18N
        jButton2.setText("New search");
        jButton2.setToolTipText("");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jButton2.setFocusTraversalPolicyProvider(true);
        jButton2.setIconTextGap(10);
        jButton2.setName("searchButton1"); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(300, 60));
        jButton2.setSelected(true);
        jButton2.setSelectedIcon(new javax.swing.ImageIcon("/Users/natallia/Desktop/search1-green.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("/Users/natallia/Desktop/report1-black.png")); // NOI18N
        jButton3.setText("View report");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jButton3.setIconTextGap(20);
        jButton3.setPreferredSize(new java.awt.Dimension(300, 60));
        jButton3.setSelectedIcon(new javax.swing.ImageIcon("/Users/natallia/Desktop/report1-green.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        go.setBackground(new java.awt.Color(0, 102, 102));
        go.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        go.setText("Go");
        go.setAlignmentY(1.0F);
        go.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        go.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        go.setMaximumSize(new java.awt.Dimension(750, 29));
        go.setPreferredSize(new java.awt.Dimension(200, 50));
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        jPanel2.add(go);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1020, 60));

        TextFieldResume.setColumns(20);
        TextFieldResume.setLineWrap(true);
        TextFieldResume.setRows(50);
        TextFieldResume.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextFieldResume.setOpaque(false);
        TextFieldResume.setSize(new java.awt.Dimension(400, 800));
        jScrollPane1.setViewportView(TextFieldResume);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 480, 480));

        TextFieldJob.setColumns(20);
        TextFieldJob.setLineWrap(true);
        TextFieldJob.setRows(50);
        jScrollPane2.setViewportView(TextFieldJob);
        TextFieldJob.getAccessibleContext().setAccessibleParent(TextFieldJob);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 480, 480));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Insert your resume");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 220, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Insert job description");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/natallia/Desktop/resulazer/img/tarquoise1.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 690));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        paste.setText("Edit");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText(" Copy");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        paste.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText(" Cut");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        paste.add(jMenuItem1);

        JMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        JMenuItem3.setText(" Paste");
        JMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem3ActionPerformed(evt);
            }
        });
        paste.add(JMenuItem3);

        jMenuBar1.add(paste);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        
         // go to page2 "view report":
         
       this.dispose();
        frame102 page2 = new frame102();
         page2.setVisible(true);
        
        
       // getting the text from input fields
       
       resumeInput = TextFieldResume.getText();
       jobInput = TextFieldJob.getText();
       
       
       //run the method
       
         nounParseTest.GO();
       
        
        
    }//GEN-LAST:event_goActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
// push "report" button to open second page
        
        this.dispose();
        frame102 page2 = new frame102();
        page2.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        // copy text:
        TextFieldResume.copy();
        TextFieldJob.copy();

        
         
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem3ActionPerformed
       
        // paste text:
        
       TextFieldResume.paste();
       TextFieldJob.paste();
       
    }//GEN-LAST:event_JMenuItem3ActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        
      
        
    }//GEN-LAST:event_pasteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
// cut text:
        
        TextFieldResume.cut();
        TextFieldJob.cut();
          
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItem3;
    private javax.swing.JTextArea TextFieldJob;
    private javax.swing.JTextArea TextFieldResume;
    private javax.swing.JButton go;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu paste;
    // End of variables declaration//GEN-END:variables
}