/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios.FormulariosAdd;

import Conexion.Conexion;
import Formularios.frmDiagnostico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Leoni
 */
public class frmAddDiagnostico extends javax.swing.JFrame {
    Conexion cn=new Conexion();
    Connection cone;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form frmAddDiagnostico
     */
    public frmAddDiagnostico() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIDMedico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDUI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDCita = new javax.swing.JTextField();
        txtMedicina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtIDDiag = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Agregar Diagnostico");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DUI Paciente:");

        txtIDMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDMedico.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Medico");

        txtDUI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDUI.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID Cita");

        txtIDCita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDCita.setForeground(new java.awt.Color(0, 0, 0));

        txtMedicina.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMedicina.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID Medicina");

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 255, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txaDescripcion.setColumns(20);
        txaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txaDescripcion);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID Diagnostico");

        txtIDDiag.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDDiag.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDUI, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd))
                            .addComponent(jScrollPane1)
                            .addComponent(txtIDMedico, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(txtIDCita)
                            .addComponent(txtMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDDiag, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIDDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnAdd))
                .addGap(37, 37, 37))
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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmDiagnostico d = new frmDiagnostico();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String id, idD, idP, idC, descripcion, idM;
         id = txtIDDiag.getText();
         idD = txtIDMedico.getText();
         idP = txtDUI.getText();
         idC = txtIDCita.getText();
         descripcion = txaDescripcion.getText();
         idM = txtMedicina.getText();
         
         if(id.matches("^[0-9]{7}$"))
         {
             if(!idD.equals("") && !idP.equals("") && !idC.equals("") && !descripcion.equals("") && !idM.equals(""))
             {
                 ingresar(id, idP, idD, idC, descripcion, idM);
                 txtIDDiag.setText("");
                 txtIDMedico.setText("");
                 txtDUI.setText("");
                 txtIDCita.setText("");
                 txaDescripcion.setText("");
                 txtMedicina.setText("");
             }
             else JOptionPane.showMessageDialog(this, "Ingrese los datos correctamente!!");
         }
         else JOptionPane.showMessageDialog(this, "El ID deben ser 7 Numeros!!");
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(frmAddDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAddDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextField txtDUI;
    private javax.swing.JTextField txtIDCita;
    private javax.swing.JTextField txtIDDiag;
    private javax.swing.JTextField txtIDMedico;
    private javax.swing.JTextField txtMedicina;
    // End of variables declaration//GEN-END:variables
    public void ingresar(String d1, String d2, String d3, String d4, String d5, String d6)
    {
        java.sql.Connection con2 = null;
        PreparedStatement pst = null;
        
        try{
            con2 = cn.getConnection();
            pst=con2.prepareStatement("INSERT INTO `diagnostico` (`idDiagnostico`, `dui_Paciente`, `id_Medico`, `id_Cita`, `descripcion`, `id_Medicina`) "
                    + "VALUES (?, ?, ?, ?, ?, ?);");
            pst.setString(1, d1);
            pst.setString(2, d2);
            pst.setString(3, d3);
            pst.setString(4, d4);
            pst.setString(5, d5);
            pst.setString(6, d6);
            pst.execute();
            
            JOptionPane.showMessageDialog(this, "Diagnostico Agregado con Exito");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado."+e);
        }
    }

}
