 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paparde;

import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author dkazemaks
 */
public class PapardeZim extends javax.swing.JFrame {
    double[ ][ ] punkti = new double[1][2];
    double[ ][ ] reiz = { {0.5, 0.0}, {0.0, 0.5} };
    double[ ][ ] p1={{0.0,1.60}};
    double[ ][ ] p2={{0.0,0.44}};
    
    double[ ][ ] type1 = {{0.0,0.0},{0.0,0.16}};
    double[ ][ ] type2 = {{0.85,0.04},{-0.04,0.85}};
    double[ ][ ] type3 = {{0.20,0.23},{-0.26,0.22}};
    double[ ][ ] type4 = {{-0.15,0.28},{0.26,0.24}};

    public PapardeZim() {
        initComponents();
    }
    
    public void reizinat(double[ ][ ] p) {
        double[ ][ ] end = new double [punkti.length][p[0].length];
        for(int i = 0;i<punkti.length;i++){
            for(int j = 0;j<p[0].length;j++){
                end[i][j]= 0;
                for(int t=0;t<punkti[0].length;t++) {
                    end[i][j]+= punkti[i][t]*p[t][j];
                }
            }
        }
        punkti=end;
    }

    public void pieskaita(double[ ][ ] p) {
        for(int i = 0;i<punkti.length;i++){
            for(int j = 0;j<punkti[0].length;j++){
                punkti[i][j]+=p[i][j];
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        draw = new javax.swing.JButton();
        spinner = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        draw.setText("Draw");
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });

        spinner.setModel(new javax.swing.SpinnerNumberModel(1000, null, null, 1000));
        spinner.setValue(500
        );
        spinner.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(draw)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(draw)
                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawActionPerformed
//        int n = (int)spinner.getValue();
        Graphics g=jPanel1.getGraphics();
        int panelHeight = jPanel1.getHeight();
        int panelWidth = jPanel1.getWidth();
        g.clearRect(0, 0, panelWidth, panelHeight );
        int n = (int)spinner.getValue();
        Random rand=new Random();
        for(int i=0;i<n;i++){
            g.drawRect((int)(punkti[0][0]*30+170),panelHeight - (int)(punkti[0][1]*30+10),1,1);
            int p=rand.nextInt(100);
            if (p==0) reizinat(type1);
            else if (p<86){
                reizinat(type2);
                pieskaita(p1);}
            else if(p<93) {
                reizinat(type3);
                pieskaita(p1);}
            else {
                reizinat(type4);
                pieskaita(p2);
            }
        }

    }//GEN-LAST:event_drawActionPerformed

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
            java.util.logging.Logger.getLogger(PapardeZim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PapardeZim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PapardeZim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PapardeZim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PapardeZim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton draw;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spinner;
    // End of variables declaration//GEN-END:variables
}
