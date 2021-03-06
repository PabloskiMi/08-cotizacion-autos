/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author pablo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        jLabel1 = new javax.swing.JLabel();
        cbx_Color = new javax.swing.JComboBox<>();
        cbx_Precio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbx_Pasajeros = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbx_Combustible = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        btn_Simular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_01 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Color");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        cbx_Color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Azul", "Verde", "Negro", "Blanco" }));
        jPanel1.add(cbx_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, -1));

        cbx_Precio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "300.000", "500.000", "700.000" }));
        jPanel1.add(cbx_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, -1));

        jLabel2.setText("Precio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        cbx_Pasajeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "2" }));
        jPanel1.add(cbx_Pasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, -1));

        jLabel3.setText("Pasajeros");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        cbx_Combustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Di??sel" }));
        jPanel1.add(cbx_Combustible, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, -1));

        jLabel4.setText("Combustible");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        btn_Salir.setText("SALIR");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        btn_Simular.setText("SIMULAR");
        btn_Simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SimularActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Simular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        txta_01.setColumns(20);
        txta_01.setRows(5);
        jScrollPane1.setViewportView(txta_01);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 370, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SimularActionPerformed
        
        String cadena = "";
        
        cadena = "El auto seleccionado es de color ";
        cadena += this.cbx_Color.getSelectedItem() + ". ";
        
        cadena += "\n Tiene un precio de ";
        cadena += this.cbx_Precio.getSelectedItem() + ". ";
        
        cadena += "\n Tiene capacidad de " + this.cbx_Pasajeros.getSelectedItem() + " pasajeros. ";
        
        cadena += "\n El combustible es " + this.cbx_Combustible.getSelectedItem() + ". ";
        
        this.txta_01.setText(cadena);
        
    }//GEN-LAST:event_btn_SimularActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btn_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Simular;
    private javax.swing.JComboBox<String> cbx_Color;
    private javax.swing.JComboBox<String> cbx_Combustible;
    private javax.swing.JComboBox<String> cbx_Pasajeros;
    private javax.swing.JComboBox<String> cbx_Precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txta_01;
    // End of variables declaration//GEN-END:variables
}
