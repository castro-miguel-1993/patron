/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estrategia_lunes;

import java.util.LinkedList;

/**
 *
 * @author RomanO
 */
public class estrategiaCliente extends javax.swing.JFrame {

        LinkedList<Integer> lista;
        estrategia st;
        
        int valor=0;
    /**
     * Creates new form estrategiaCliente
     */
    public estrategiaCliente() {
        initComponents();
        lista=new LinkedList<>();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_lis = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        txt_n = new javax.swing.JTextField();
        btn_qui = new javax.swing.JButton();
        btn_bur = new javax.swing.JButton();
        btn_cle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PATRON ESTRATEGIA");

        btn_add.setText("AGREGAR");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_qui.setText("QUICKSORT");
        btn_qui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quiActionPerformed(evt);
            }
        });

        btn_bur.setText("BURBUJA");
        btn_bur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_burActionPerformed(evt);
            }
        });

        btn_cle.setText("LIMPIAR");
        btn_cle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_n, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_add, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(101, 101, 101)
                            .addComponent(btn_cle))
                        .addComponent(btn_qui))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_bur)
                        .addComponent(txt_lis, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_cle))
                .addGap(18, 18, 18)
                .addComponent(txt_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_qui)
                    .addComponent(btn_bur))
                .addGap(18, 18, 18)
                .addComponent(txt_lis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        int n=Integer.valueOf(txt_n.getText());
        lista.add(n);
        actualizarlista();
        txt_n.setText("");
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_burActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_burActionPerformed
        setEstrategia( new concreta_burbuja());
        valor=1;
        //mando a la estrategia me orden segun su criterio
        lista=st.ordenar(lista);
        
        actualizarlista();
    }//GEN-LAST:event_btn_burActionPerformed

    private void btn_quiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quiActionPerformed
         setEstrategia( new concreta_quicksort());
         valor=2;
        //mando a la estrategia me orden segun su criterio
        lista=st.ordenar(lista);
        
        actualizarlista();
    }//GEN-LAST:event_btn_quiActionPerformed

    private void btn_cleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleActionPerformed
        lista.clear();
        
        txt_lis.setText("");
        txt_n.setText("");
    }//GEN-LAST:event_btn_cleActionPerformed

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
            java.util.logging.Logger.getLogger(estrategiaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estrategiaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estrategiaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estrategiaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estrategiaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_bur;
    private javax.swing.JButton btn_cle;
    private javax.swing.JButton btn_qui;
    private javax.swing.JTextField txt_lis;
    private javax.swing.JTextField txt_n;
    // End of variables declaration//GEN-END:variables
    
    
    public void actualizarlista(){
        int k=lista.size();
        txt_lis.setText("");
        for (int i = 0; i < k; i++) {
            txt_lis.setText(txt_lis.getText()+" , "+lista.get(i));
        }
        
        if (valor==1) {
            txt_lis.setText("BURBUJA = "+txt_lis.getText());
        }
        if (valor==2) {
            txt_lis.setText("QUICKSORT = "+txt_lis.getText());
        }
    }
    
    public void setEstrategia(estrategia nueva){
        st=nueva;
    }
}
