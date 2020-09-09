package unit.converter;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    private Image setIcon(){
        return getToolkit().getImage(getClass().getResource("/resources/app-logo.png"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lengthLabel = new javax.swing.JLabel();
        lengthTextLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        weightTextLabel = new javax.swing.JLabel();
        tempLabel = new javax.swing.JLabel();
        tempTextLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        tempTextLabel1 = new javax.swing.JLabel();
        currencyLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unit Converter");
        setIconImage(setIcon());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Units Available");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        lengthLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/length.png"))); // NOI18N
        lengthLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lengthLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lengthLabelMouseClicked(evt);
            }
        });

        lengthTextLabel.setText("Length");

        weightLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/weight.png"))); // NOI18N
        weightLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        weightLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weightLabelMouseClicked(evt);
            }
        });

        weightTextLabel.setText("Weight");

        tempLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/temp.png"))); // NOI18N
        tempLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tempLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tempLabelMouseClicked(evt);
            }
        });

        tempTextLabel.setText("Temperature");

        speedLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/speed.png"))); // NOI18N
        speedLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        speedLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                speedLabelMouseClicked(evt);
            }
        });

        tempTextLabel1.setText("Speed");

        currencyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/currency.png"))); // NOI18N
        currencyLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        currencyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currencyLabelMouseClicked(evt);
            }
        });

        jLabel3.setText("Currency");

        timeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/time.png"))); // NOI18N
        timeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeLabelMouseClicked(evt);
            }
        });

        jLabel5.setText("Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lengthTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lengthLabel)
                        .addComponent(currencyLabel)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeLabel)
                            .addComponent(weightLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5)))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weightTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempLabel)
                    .addComponent(tempTextLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tempTextLabel1)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(speedLabel)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tempLabel)
                                .addComponent(weightLabel))
                            .addComponent(lengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(speedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(weightTextLabel)
                        .addComponent(tempTextLabel)
                        .addComponent(lengthTextLabel))
                    .addComponent(tempTextLabel1))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currencyLabel)
                    .addComponent(timeLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lengthLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lengthLabelMouseClicked
        // TODO add your handling code here:
        System.out.println("Length Working");
        this.dispose();
        LengthGUI l = new LengthGUI();
        l.setVisible(true);
    }//GEN-LAST:event_lengthLabelMouseClicked

    private void weightLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weightLabelMouseClicked
        // TODO add your handling code here:
        System.out.println("Weight Working");
        this.dispose();
        WeightGUI w = new WeightGUI();
        w.setVisible(true);
    }//GEN-LAST:event_weightLabelMouseClicked

    private void tempLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tempLabelMouseClicked
        // TODO add your handling code here:
        System.out.println("Temperature Working");
        this.dispose();
        TemperatureGUI t = new TemperatureGUI();
        t.setVisible(true);
    }//GEN-LAST:event_tempLabelMouseClicked

    private void speedLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speedLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        SpeedGUI s = new SpeedGUI();
        s.setVisible(true);
    }//GEN-LAST:event_speedLabelMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(null, "Exit Program?","EXIT",JOptionPane.YES_NO_OPTION);
        if(confirmed == JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
        else 
        {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void timeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        TimeGUI t = new TimeGUI();
        t.setVisible(true);
    }//GEN-LAST:event_timeLabelMouseClicked

    private void currencyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currencyLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        CurrencyGUI c = new CurrencyGUI();
        c.setVisible(true);
    }//GEN-LAST:event_currencyLabelMouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currencyLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JLabel lengthTextLabel;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JLabel tempTextLabel;
    private javax.swing.JLabel tempTextLabel1;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JLabel weightTextLabel;
    // End of variables declaration//GEN-END:variables
}