 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cepure;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author dkazemaks
 */
public class CepureDraw extends javax.swing.JFrame {
    int angle = 60;
    int angleX = 60;
    int angleY = 60;
    double user = 2.0;
    double[ ][ ] punkti = new double[241*361][3];
    
    public CepureDraw() {
        initComponents();
            
    }
    
    public void getPoints () {

        int i = 0;
        for(int z=-120;z<=120;z++){
            for (int x=-180;x<=180;x++){
                punkti[i][0] = x;
                punkti[i][1] = 40 * Math.sin(0.043 * Math.sqrt(x * x + z * z));
                punkti[i][2] = z;

                i++;
            }
        }
    }
    public double[][] reizinat(double[ ][ ] p) {
        double[ ][ ] end = new double [punkti.length][p[0].length];
        for(int i = 0;i<punkti.length;i++){
            for(int j = 0;j<p[0].length;j++){
                end[i][j]= 0;
                for(int t=0;t<punkti[0].length;t++) {
                    end[i][j]+= punkti[i][t]*p[t][j];
                }
            }
        }
        return end;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        draw = new javax.swing.JButton();
        spinner1 = new javax.swing.JSpinner();
        spinner2 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spinner3 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spinner4 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1212, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );

        draw.setText("Draw");
        draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawActionPerformed(evt);
            }
        });

        spinner1.setModel(new javax.swing.SpinnerNumberModel(60, null, null, 10));

        spinner2.setModel(new javax.swing.SpinnerNumberModel(60, null, null, 10));

        jLabel1.setText("Projekcijas leņķis");

        jLabel2.setText("Pagriezt pa x");

        spinner3.setModel(new javax.swing.SpinnerNumberModel(2.0d, null, null, 0.5d));

        jLabel3.setText("Palielinat");

        spinner4.setModel(new javax.swing.SpinnerNumberModel(0, null, null, 10));

        jLabel4.setText("pagriezt pa y");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawActionPerformed
        angle = (int)spinner1.getValue();
        angleX = (int)spinner2.getValue();
        angleY = (int)spinner4.getValue();
        user = (double)spinner3.getValue();
        double alfa = Math.PI/180;
        
        double[ ][ ] reiz = {{1.0, 0.0}, {0.0, 1.0}, {Math.cos((alfa) * angle), Math.sin((alfa) * angle)}};
        double[ ][ ] reizX = {{1.0, 0.0, 0.0}, {0.0,Math.cos((alfa)*angleX), Math.sin((alfa)*angleX)}, {0.0, -Math.sin((alfa)*angleX), Math.cos((alfa)*angleX)}};
        double[ ][ ] reizY = {{Math.cos((alfa)*angleY), 0.0, -Math.sin((alfa)*angleY)}, {0.0, 1.0, 0.0}, {Math.sin((alfa)*angleY), 0.0, Math.cos((alfa)*angleY)}};
        double[ ][ ] reizPar = {{user, 0.0, 0.0}, {0.0, user, 0.0}, {0.0, 0.0, user}};
//        Random r = new Random();


        getPoints();
        
        punkti = reizinat(reizX);
        punkti = reizinat(reizY);
        punkti = reizinat(reizPar);
        double[][] twoD = reizinat(reiz);
        Graphics g = panel1.getGraphics();
        g.clearRect(0, 0, panel1.getWidth(), panel1.getHeight());
        
        double[] yMax = new double[panel1.getWidth()];
        double[] yMin = new double[panel1.getWidth()];

        for (int i = 0; i<panel1.getWidth(); i++ ) {
            yMax[i] = -1.0;
            yMin[i]= 100000.0;
        }
        

        for ( int i = 0; i < twoD.length; i++){
//            g.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
            int x = (int) twoD[i][0] + 600;
            int y = (int) twoD[i][1] + 300;
            if (y >= yMin[x]) {
                if (y> yMax[x]) {
                    yMax[x] = y;
                    g.drawRect(x, y, 1, 1);
                    
                }
            } else {
                yMin[x] = y;
                g.drawRect(x, y, 1, 1);
                
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
            java.util.logging.Logger.getLogger(CepureDraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CepureDraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CepureDraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CepureDraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CepureDraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton draw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panel1;
    private javax.swing.JSpinner spinner1;
    private javax.swing.JSpinner spinner2;
    private javax.swing.JSpinner spinner3;
    private javax.swing.JSpinner spinner4;
    // End of variables declaration//GEN-END:variables
}
