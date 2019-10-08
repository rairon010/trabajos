package parquimetro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class InterfazParquimetro extends javax.swing.JFrame {

    
    
    public InterfazParquimetro() {
        initComponents();
        setLocationRelativeTo(null);
        t= new Timer(10, accion);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AvanzarMinuto = new javax.swing.JButton();
        jSalida = new javax.swing.JButton();
        jTiempoEstacionado = new javax.swing.JLabel();
        jRestablecer = new javax.swing.JButton();
        AutoDetectado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AvanzarMinuto.setText("Avanzar Minutos");
        AvanzarMinuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarMinutoActionPerformed(evt);
            }
        });

        jSalida.setText("Salida Auto");
        jSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalidaActionPerformed(evt);
            }
        });

        jTiempoEstacionado.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTiempoEstacionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTiempoEstacionado.setText("00:00:00");

        jRestablecer.setText("Reestablecer Parquimetro");
        jRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestablecerActionPerformed(evt);
            }
        });

        AutoDetectado.setText("Auto Detectado");
        AutoDetectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoDetectadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Patente:");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Mail Patente:");

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRestablecer)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(AutoDetectado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTiempoEstacionado, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AvanzarMinuto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTiempoEstacionado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AutoDetectado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AvanzarMinuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalida)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRestablecer)
                .addGap(165, 165, 165))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int CentavosPorHora = 50;
    int centavos = 0;
    private Timer t;
    private int h, m, s;
    private ActionListener accion = new ActionListener() {
                
        @Override
        public void actionPerformed(ActionEvent ae) {
            ++s;
            if(s==60){
                s = 0;
                ++m;
            }
            if(m==60){
                m = 0;
                ++h;
            }
            actualizarLabel();
        }
    };
    
    private void actualizarLabel(){
        String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s;
        jTiempoEstacionado.setText(tiempo);
    }
    private void jSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalidaActionPerformed
        // TODO add your handling code here
        t.stop();
        if(t.isRunning()){
            
        } else {
            
            if(m!=0){
                ++h;
            }
            centavos = CentavosPorHora*h;
            String nl = System.getProperty("line.separator");
            JOptionPane.showMessageDialog(null, "El Auto se ha retirado"+nl+"El monto a pagar es de: "+centavos+" centavos");
        }
        jSalida.setEnabled(false);
        
    }//GEN-LAST:event_jSalidaActionPerformed

    private void jRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestablecerActionPerformed
        // TODO add your handling code here:
        if(t.isRunning()){
            t.stop();           
        }
        AvanzarMinuto.setEnabled(true);
        jSalida.setEnabled(false);
        jRestablecer.setEnabled(false);
        h=0; m=0; s=0;
        jTextField1.setText("");
        jTextField2.setText("");
        
        actualizarLabel();
    }//GEN-LAST:event_jRestablecerActionPerformed

    private void AvanzarMinutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarMinutoActionPerformed
        // TODO add your handling code here:
        t.start();
        AvanzarMinuto.setEnabled(false);
        jSalida.setEnabled(true);
        jRestablecer.setEnabled(true);
        
    }//GEN-LAST:event_AvanzarMinutoActionPerformed

    private void AutoDetectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoDetectadoActionPerformed
        String characters1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String aleatorio1 = "";
        int length = 3;
        
        Random rand = new Random();
        char[] text = new char[length];
        for(int i = 0; i < length; ++i ){
            text[i] = characters1.charAt(rand.nextInt(characters1.length()));
        }
        for(int i = 0; i < text.length; ++i){
            aleatorio1 += text[i];
            }
        String characters2 = "0123456789";
        String aleatorio2 = "";
        
        for(int i = 0; i < length; ++i ){
            text[i] = characters2.charAt(rand.nextInt(characters2.length()));
        }
        for(int i = 0; i < text.length; ++i){
            aleatorio2 += text[i];
            }
        jTextField1.setText(aleatorio1+" "+aleatorio2);
        jTextField2.setText("patente"+aleatorio1+aleatorio2+"@parquimetro.com.ar");
    }//GEN-LAST:event_AutoDetectadoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazParquimetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazParquimetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazParquimetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazParquimetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazParquimetro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AutoDetectado;
    private javax.swing.JButton AvanzarMinuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jRestablecer;
    private javax.swing.JButton jSalida;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jTiempoEstacionado;
    // End of variables declaration//GEN-END:variables

    
}
