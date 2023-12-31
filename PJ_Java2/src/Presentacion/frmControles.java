/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

/**
 *
 * @author Userr
 */
public class frmControles extends javax.swing.JFrame {

    /**
     * Creates new form frmControles
     */
    public frmControles() {
        initComponents();
        
        rbtGrupo.add(rbtFemenino);
        rbtGrupo.add(rbtMasculino);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtGrupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        chkBaseDeDatos = new javax.swing.JCheckBox();
        chkDesarrollador = new javax.swing.JCheckBox();
        chkAnalista = new javax.swing.JCheckBox();
        btnProcesarDatos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResultadoGenero = new javax.swing.JTextField();
        txtResultadoCarrera = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controles");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Genero :");

        rbtMasculino.setText("Masculino");

        rbtFemenino.setText("Femenino");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Carreras profesionales : ");

        chkBaseDeDatos.setText("Base de datos");

        chkDesarrollador.setText("Desarrollador");

        chkAnalista.setText("Analista");

        btnProcesarDatos.setText("Procesar Datos");
        btnProcesarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProcesarDatosMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Seleccion de genero fue : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Seleccion de carrera fue : ");

        txtResultadoGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkBaseDeDatos)
                                .addGap(18, 18, 18)
                                .addComponent(chkDesarrollador)
                                .addGap(18, 18, 18)
                                .addComponent(chkAnalista)))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnProcesarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rbtMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(rbtFemenino)
                        .addGap(140, 140, 140))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(txtResultadoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(txtResultadoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtMasculino)
                    .addComponent(rbtFemenino))
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBaseDeDatos)
                    .addComponent(chkDesarrollador)
                    .addComponent(chkAnalista))
                .addGap(24, 24, 24)
                .addComponent(btnProcesarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(txtResultadoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultadoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultadoGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoGeneroActionPerformed

    private void btnProcesarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcesarDatosMouseClicked
        // TODO add your handling code here:
        
        // Limpiar los espacios para texto
        txtResultadoGenero.setText("");
        txtResultadoCarrera.setText("");
        
        
        // Valida los datos del genero
        if(rbtFemenino.isSelected() == true){
            txtResultadoGenero.setText("Femenino c:");
        } else if (rbtMasculino.isSelected() == true){
            txtResultadoGenero.setText("Masculino c:");
        } else {
            txtResultadoGenero.setText("Falto seleccionar");
        }
        
        // Validar y asignar los checkBox a las carreras
        if(chkBaseDeDatos.isSelected() ==  true){
            txtResultadoCarrera.setText("Administrador de base de datos");
        }
        
        if(chkDesarrollador.isSelected() == true){
            txtResultadoCarrera.setText(txtResultadoCarrera.getText() + " - " + "Desarrollador");
        }
        
        if(chkAnalista.isSelected() == true){
            txtResultadoCarrera.setText(txtResultadoCarrera.getText() + " - " + "Analista");
        }
        
       
        
    }//GEN-LAST:event_btnProcesarDatosMouseClicked

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
            java.util.logging.Logger.getLogger(frmControles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmControles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmControles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmControles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmControles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesarDatos;
    private javax.swing.JCheckBox chkAnalista;
    private javax.swing.JCheckBox chkBaseDeDatos;
    private javax.swing.JCheckBox chkDesarrollador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.ButtonGroup rbtGrupo;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtResultadoCarrera;
    private javax.swing.JTextField txtResultadoGenero;
    // End of variables declaration//GEN-END:variables
}
