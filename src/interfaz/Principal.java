/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lorenzo
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaIncial = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaResultante = new javax.swing.JTable();
        cmbOperacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MATRICES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 230, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Número de Filas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, 20));
        jPanel2.add(txtNumeroFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 40, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Número de Columnas:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 20));
        jPanel2.add(txtNumeroColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 260, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        cmdLlenadoAutomatico.setText("Automático");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 90, -1));

        cmdOperacion.setText("Operación");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        cmdLlenadoManual.setText("Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 70, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 280, 110));

        tblTablaIncial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaIncial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 240, 210));

        tblTablaResultante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaResultante);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 240, 210));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Letra B", "Letra K", "Letra M", "Letra W", "Letra Q", "Letra J", "Letra G", "Letra R", "Reloj de Arena", "Reloj de Arena Invertido", "Cruz", "Rombo" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(728, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        DefaultTableModel tm, tm2;
        try {
            if (txtNumeroFilas.getText().trim().isEmpty()) {
                Helper.mensaje(this, "Espacio en Blanco, Favor Llénelo", 3);
                txtNumeroFilas.requestFocusInWindow();
                cmdCrear.setEnabled(true);
            } else if (txtNumeroColumnas.getText().trim().isEmpty()) {
                Helper.mensaje(this, "Espacio en Blanco, Favor Llénelo", 3);
                txtNumeroColumnas.requestFocusInWindow();
                cmdCrear.setEnabled(true);
            } else {
                nf = Integer.parseInt(txtNumeroFilas.getText());
                nc = Integer.parseInt(txtNumeroColumnas.getText());

                if (nf == 0) {
                    Helper.mensaje(this, "El número de filas no puede ser cero", 2);
                    txtNumeroFilas.requestFocusInWindow();
                } else if (nc == 0) {
                    Helper.mensaje(this, "El número de columnas no puede ser cero", 2);
                    txtNumeroColumnas.requestFocusInWindow();
                } else if (nf > 9 || nc > 9) {
                    Helper.mensaje(this, "El número de filas y colmunas no pueden excederse de 9", 2);
                } else if (nf < 0 || nc < 0) {
                    Helper.mensaje(this, "El número de filas y colmunas no pueden ser negativos", 2);
                } else if (nf < 6 || nc < 6 ) {
                    Helper.mensaje(this, "El número de filas y colmunas no pueden ser menores que 5", 2);
                }
                else {

                    tm = (DefaultTableModel) tblTablaIncial.getModel();
                    tm2 = (DefaultTableModel) tblTablaResultante.getModel();

                    tm.setRowCount(nf);
                    tm.setColumnCount(nc);

                    tm2.setRowCount(nf);
                    tm2.setColumnCount(nc);

                    JButton botonesH[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdLimpiar};
                    JButton botonesD[] = {cmdCrear, cmdOperacion};

                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                }
            }

        } catch (NumberFormatException e) {
            Helper.mensaje(this, "Digite un Número Válido", 3);
        }

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
        int nf, nc, n;

        nf = tblTablaIncial.getRowCount();
        nc = tblTablaIncial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                n = (int) (Math.random() * 60 + 1);
                tblTablaIncial.setValueAt(n, i, j);

            }

        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumeroFilas.setText("");
        txtNumeroColumnas.setText("");
        txtNumeroFilas.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaIncial);
        Helper.porDefectoTabla(tblTablaResultante);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int op;
        int nf, nc;
        

        nf = tblTablaIncial.getRowCount();
        nc = tblTablaIncial.getColumnCount();
        op = cmbOperacion.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaResultante);

        switch (op) {
            case 0:
                 if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El número de filas y columnas deben ser impares", 3);
                }else if(nf != nc){
                    Helper.mensaje(this, "Se necesita matriz cuadrada, favor coloque iguales las filas y columnas", 2);
                } else {
           Helper.letraB(tblTablaIncial, tblTablaResultante);
                 }
            break;
            case 1:
                if(nf != 9 && nc != 6 ){
                    Helper.mensaje(this, "Para que puedar resultar esta letra, debe tener los siguientes digitos: "
                            + "número de filas = 9 y"+"\n"
                            +" número de columnas = 6 ", 2);
                }else {
                Helper.letraK(tblTablaIncial, tblTablaResultante);
                }
                break;
            case 2:
                 if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El número de filas y columnas deben ser impares", 3);
                } else if(nf != nc){
                    Helper.mensaje(this, "Se necesita matriz cuadrada, favor coloque iguales las filas y columnas", 2);
                }  else {
                Helper.letraM(tblTablaIncial, tblTablaResultante);
                 }
                break;
            case 3:
                if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El número de filas y columnas deben ser impares", 3);
                } else if(nf != nc){
                    Helper.mensaje(this, "Se necesita matriz cuadrada, favor coloque iguales las filas y columnas", 2);
                }  else {
                Helper.letraW(tblTablaIncial, tblTablaResultante);
                }
                break;
            case 4:
                if(nf != nc){
                    Helper.mensaje(this, "Se necesita matriz cuadrada, favor coloque iguales las filas y columnas", 2);
                }  else {
                Helper.letraQ(tblTablaIncial, tblTablaResultante);
                }
                break;
            case 5:
                if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El número de filas y columnas deben ser impares", 3);
                } else if(nf != nc){
                    Helper.mensaje(this, "Se necesita matriz cuadrada, favor coloque iguales las filas y columnas", 2);
                }  else {
                Helper.letraJ(tblTablaIncial, tblTablaResultante);
                }
                break;
            case 6:
                if(nf != nc){
                    Helper.mensaje(this, "Se necesita matriz cuadrada, favor coloque iguales las filas y columnas", 2);
                }  else {
                Helper.letraG(tblTablaIncial, tblTablaResultante);
                }
                break;
            case 7:
                if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El número de filas y columnas deben ser impares", 3);
                } else if(nf != nc){
                    Helper.mensaje(this, "Se necesita matriz cuadrada, favor coloque iguales las filas y columnas", 2);
                }  else {
                Helper.letraR(tblTablaIncial, tblTablaResultante);
                }
                break;
            case 8:
                if(nf != 8 || nc != 7 ){
                    Helper.mensaje(this, "Para que puedar resultar esta figura, debe tener los siguientes digitos: "
                            + "número de filas = 8 "+"\n"
                            +"y número de columnas = 7 ", 2);
                }else {
                Helper.relojArena(tblTablaIncial, tblTablaResultante);
                }
                break;
            case 9:
                if(nf != 7 || nc != 8 ){
                    Helper.mensaje(this, "Para que puedar resultar esta figura, debe tener los siguientes digitos: "
                            + "número de filas = 7 "+"\n"
                            +"y número de columnas = 8 ", 2);
                }else {
                Helper.relojArenaInvertido(tblTablaIncial, tblTablaResultante);
                }
                break;
            case 10:if (nf % 2 != 0 || nc % 2 != 0) {
                    Helper.mensaje(this, "El número de filas y columnas deben ser pares", 3);
                } else if(nf != nc){
                    Helper.mensaje(this, "Se necesita matriz cuadrada, favor coloque iguales las filas y columnas", 2);
                }  else {
                Helper.cruz(tblTablaIncial, tblTablaResultante);
                }
                break;
            case 11:
                if (nf % 2 == 0 || nc % 2 == 0) {
                    Helper.mensaje(this, "El número de filas y columnas deben ser impares", 3);
                } else if(nf != nc){
                    Helper.mensaje(this, "Se necesita matriz cuadrada, favor coloque iguales las filas y columnas", 2);
                }  else {
                Helper.rombo(tblTablaIncial, tblTablaResultante);
                }
                break;

        }

        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        int nf, nc;
        int n;
        int sw, res;

        nc = tblTablaIncial.getColumnCount();
        nf = tblTablaIncial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "]" + "[" + j + "]").trim());
                        tblTablaIncial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;

                            Helper.porDefectoTabla(tblTablaIncial);
                            Helper.porDefectoTabla(tblTablaResultante);
                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

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
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaIncial;
    private javax.swing.JTable tblTablaResultante;
    private javax.swing.JTextField txtNumeroColumnas;
    private javax.swing.JTextField txtNumeroFilas;
    // End of variables declaration//GEN-END:variables
}
