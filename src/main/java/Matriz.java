
import java.awt.Color;
import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiki
 */
public class Matriz extends javax.swing.JFrame {

    /**
     * Creates new form Matriz
     */
    public Matriz() {
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

        btnAceptar = new javax.swing.JButton();
        txtN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSumaTotal = new javax.swing.JLabel();
        btnMayor = new javax.swing.JButton();
        btnMenor = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAceptar.setText("Generar matriz");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatriz);

        jLabel1.setText("Tamaño de la matriz");

        jButton1.setText("Sumar toda la matriz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSumaTotal.setText("Suma total de la matriz: ");

        btnMayor.setText("Pintar mayor");
        btnMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayorActionPerformed(evt);
            }
        });

        btnMenor.setText("Pintar menor");

        jButton2.setText("Pinta Mayor por columna");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pinta Mayor por fila");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Pinta dato con mayor suma de digitos por fila");

        jButton5.setText("pinta datos con suma de digitos 7 o 12");

        jButton6.setText("Ordena cada fila ascendentemente");

        jButton7.setText("Pinta la letra Z");

        jButton8.setText("Promedio diagonal principal");

        jButton9.setText("Numero de veces de cada dato");

        jButton10.setText("Pinta triangular izquierda");

        jButton11.setText("Ordena ascendentemente por filas");

        jButton12.setText("Intercambia filas(i,j)");

        jButton13.setText("Pinta datos que pertenezcan a la serie fibonacci");

        jButton14.setText("Pinta como tablero de ajedrez");

        jButton15.setText("Ordena digitos de cada dato ascendentemente");

        jButton16.setText("Suma datos casillas blancas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12)
                                    .addComponent(jButton14)
                                    .addComponent(jButton16))
                                .addGap(86, 177, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8)
                                    .addComponent(jButton13)
                                    .addComponent(jButton11)
                                    .addComponent(jButton10)
                                    .addComponent(jButton9)
                                    .addComponent(jButton15))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btnAceptar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(txtSumaTotal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnMayor)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnMenor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(29, 29, 29)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addGap(26, 26, 26)
                                .addComponent(jButton7)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSumaTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(jButton1)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMayor)
                    .addComponent(btnMenor)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int n=0;
        try{
                n=Integer.parseInt(txtN.getText());
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ingrese solo números");
        }
        if(n<8 || n>16){
            JOptionPane.showMessageDialog(null,"El tamaño minimo de la matriz es 8 y el tamaño maximo es 16");
            return;
        }      
        Llenar(n);
        mostrarMatriz(matriz,n);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int c=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++) {
               c=matriz[i][j]+c;
            }
        }
        txtSumaTotal.setText("La suma total de la matriz es: "+c);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayorActionPerformed
        // TODO add your handling code here:
        int c = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > c) {
                    c = matriz[i][j];
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == c) {
                    System.out.println(c);
                }
            }
        }
    }//GEN-LAST:event_btnMayorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int i = 0; i < matriz.length; i++) {
            int c = 0;
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > c) {
                    c = matriz[i][j];
                }
            }
            System.out.println(c);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i = 0; i < matriz.length; i++) {
            int c = 0;
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] > c) {
                    c = matriz[i][j];
                }
            }
            System.out.println(c);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz().setVisible(true);
            }
        });
    }
    
    private static int matriz[][];
    
    public void Llenar(int n){
        matriz=new int[n][n];
        tblMatriz.setOpaque(true);
        tblMatriz.setGridColor(Color.RED);
        Random aleatorio = new Random();
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++) {
                matriz[i][j] = aleatorio.nextInt(1000);
            }
        }
    }
    
public void mostrarMatriz(int matriz[][],int n){
    DefaultTableModel model =(DefaultTableModel)tblMatriz.getModel();
    model.setRowCount(n);
    model.setColumnCount(n);
    for(int i=0;i<n;i++){
        for(int j=0; j<n; j++){
            tblMatriz.setValueAt(matriz[i][j], i, j);
        }
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnMayor;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTextField txtN;
    private javax.swing.JLabel txtSumaTotal;
    // End of variables declaration//GEN-END:variables
}


