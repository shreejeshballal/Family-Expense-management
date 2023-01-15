
import Backend.ConnectSQL;
import java.sql.*;
import javax.swing.JOptionPane;


public class Member_Loans_Delete extends javax.swing.JFrame {
Connection con;
    PreparedStatement pst1;

    public Member_Loans_Delete() {
        initComponents();
        con = ConnectSQL.createC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtLid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(470, 120));
        setMinimumSize(new java.awt.Dimension(1040, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1040, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 242));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(925, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(192, 223, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(255, 255, 242));
        jButton5.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        jButton5.setForeground(new java.awt.Color(42, 68, 146));
        jButton5.setText("DELETE");
        jButton5.setToolTipText("");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 68, 148), 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 140, 50));

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 55, 135));
        jLabel10.setText("LID :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 90, 60));

        txtLid.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        txtLid.setToolTipText("");
        txtLid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        txtLid.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtLid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLidActionPerformed(evt);
            }
        });
        jPanel3.add(txtLid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 220, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 860, 360));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 34, 107));
        jLabel2.setText("DELETE LOAN :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 380, 80));

        Back_button.setBackground(new java.awt.Color(255, 255, 242));
        Back_button.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Back_button.setForeground(new java.awt.Color(42, 68, 146));
        Back_button.setText("Back");
        Back_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 68, 148), 2, true));
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 82, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   
        try{
            String eid = txtLid.getText();
            
            pst1 = con.prepareStatement("delete from loans where  Lid=? and user=? ");
            
            pst1.setString(2, Login.usern);
            pst1.setString(1, eid);
            pst1.executeUpdate();
            txtLid.setText("");
            JOptionPane.showMessageDialog(this,"Record Deleted!");
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"Please try again!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtLidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLidActionPerformed

    }//GEN-LAST:event_txtLidActionPerformed

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
    dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Member_Loans_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_Loans_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_Loans_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_Loans_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }




        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_Loans_Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtLid;
    // End of variables declaration//GEN-END:variables
}