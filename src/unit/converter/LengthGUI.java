package unit.converter;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LengthGUI extends javax.swing.JFrame {
 
    public LengthGUI() {
        initComponents();
    }

    private Image setIcon(){
        return getToolkit().getImage(getClass().getResource("/resources/length.png"));
    }
    
    public void update(){
        if (!inputQuantity.getText().equals(""))
        {
            String inputText = new String();
            inputText = inputQuantity.getText();
            double input = Double.parseDouble(inputText);
            String inputType = new String();
            inputType = sourceDropDown.getSelectedItem().toString();
            String outputType = new String();
            outputType = destDropDown.getSelectedItem().toString();
            LengthConverter lc = new LengthConverter(inputType, outputType, input);
            outputQuantity.setText(Double.toString(lc.convert()));
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sourceDropDown = new javax.swing.JComboBox<>();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        destDropDown = new javax.swing.JComboBox<>();
        inputQuantity = new javax.swing.JTextField();
        outputQuantity = new javax.swing.JTextField();
        key7 = new javax.swing.JButton();
        key4 = new javax.swing.JButton();
        key1 = new javax.swing.JButton();
        key8 = new javax.swing.JButton();
        key5 = new javax.swing.JButton();
        key2 = new javax.swing.JButton();
        key9 = new javax.swing.JButton();
        key6 = new javax.swing.JButton();
        key3 = new javax.swing.JButton();
        key0 = new javax.swing.JButton();
        keyDecimal = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();
        backLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convert Length\n");
        setIconImage(setIcon());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Length Converter");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        sourceDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "meter(m)", "kilometer(km)", "mile(mi)", "yard(yd)", "foot(ft)", "inch(in)" }));
        sourceDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceDropDownActionPerformed(evt);
            }
        });

        fromLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fromLabel.setText("From");

        toLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        toLabel.setText("To");

        destDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "meter(m)", "kilometer(km)", "mile(mi)", "yard(yd)", "foot(ft)", "inch(in)" }));
        destDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destDropDownActionPerformed(evt);
            }
        });

        inputQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputQuantityKeyTyped(evt);
            }
        });

        outputQuantity.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fromLabel)
                    .addComponent(sourceDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toLabel)
                    .addComponent(destDropDown, 0, 239, Short.MAX_VALUE)
                    .addComponent(inputQuantity)
                    .addComponent(outputQuantity))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fromLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sourceDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(toLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(destDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        key7.setText("7");
        key7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key7MouseClicked(evt);
            }
        });

        key4.setText("4");
        key4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key4MouseClicked(evt);
            }
        });

        key1.setText("1");
        key1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key1MouseClicked(evt);
            }
        });

        key8.setText("8");
        key8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key8MouseClicked(evt);
            }
        });

        key5.setText("5");
        key5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key5MouseClicked(evt);
            }
        });

        key2.setText("2");
        key2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key2MouseClicked(evt);
            }
        });

        key9.setText("9");
        key9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key9MouseClicked(evt);
            }
        });

        key6.setText("6");
        key6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key6MouseClicked(evt);
            }
        });

        key3.setText("3");
        key3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key3MouseClicked(evt);
            }
        });

        key0.setText("0");
        key0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                key0MouseClicked(evt);
            }
        });

        keyDecimal.setText(".");
        keyDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keyDecimalMouseClicked(evt);
            }
        });

        clearButton.setText("C");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });

        switchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/switch.png"))); // NOI18N
        switchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchButtonMouseClicked(evt);
            }
        });

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"))); // NOI18N
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(key7)
                            .addComponent(key4)
                            .addComponent(key1)
                            .addComponent(key0))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(key5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(key2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(key8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(keyDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(key3)
                            .addComponent(key9)
                            .addComponent(clearButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(key6)
                                .addGap(45, 45, 45)
                                .addComponent(switchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(key6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(key5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(key4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(switchButton)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputQuantityKeyTyped
        // TODO add your handling code here:
        if (inputQuantity.getText().equals(""))
            outputQuantity.setText("");
        char c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c!='+')
                && (c!='.') && (c!= java.awt.event.KeyEvent.VK_BACK_SPACE)){
            evt.consume();  // ignore event
            return;
        }
        else if (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
        {
            //keyTyped only works for characters pressed, since BackSpace is not a character
            //so it cannot be consumed, we are only checking if BackSpace code is present, then 
            //simply call update
            update();
        }
        else
        {
            inputQuantity.setText(inputQuantity.getText()+c);
            evt.consume();
            update();
        }
    }//GEN-LAST:event_inputQuantityKeyTyped

    private void key7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key7MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"7");
        update();
    }//GEN-LAST:event_key7MouseClicked

    private void key8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key8MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"8");
        update();
    }//GEN-LAST:event_key8MouseClicked

    private void key9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key9MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"9");
        update();
    }//GEN-LAST:event_key9MouseClicked

    private void key4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key4MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"4");
        update();
    }//GEN-LAST:event_key4MouseClicked

    private void key5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key5MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"5");
        update();
    }//GEN-LAST:event_key5MouseClicked

    private void key6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key6MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"6");
        update();
    }//GEN-LAST:event_key6MouseClicked

    private void key1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key1MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"1");
        update();
    }//GEN-LAST:event_key1MouseClicked

    private void key2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key2MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"2");
        update();
    }//GEN-LAST:event_key2MouseClicked

    private void key3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key3MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"3");
        update();
    }//GEN-LAST:event_key3MouseClicked

    private void key0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_key0MouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+"0");
        update();

    }//GEN-LAST:event_key0MouseClicked

    private void keyDecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyDecimalMouseClicked
        // TODO add your handling code here:
        inputQuantity.setText(inputQuantity.getText()+".");
        update();
    }//GEN-LAST:event_keyDecimalMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // TODO add your handling code here:
        inputQuantity.setText("");
        outputQuantity.setText("");
    }//GEN-LAST:event_clearButtonMouseClicked

    private void sourceDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceDropDownActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_sourceDropDownActionPerformed

    private void destDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destDropDownActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_destDropDownActionPerformed

    private void switchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButtonMouseClicked
        // TODO add your handling code here:
        Object temp = new Object();
        temp = sourceDropDown.getSelectedItem();
        sourceDropDown.setSelectedItem(destDropDown.getSelectedItem());
        destDropDown.setSelectedItem(temp);
    }//GEN-LAST:event_switchButtonMouseClicked

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

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        GUI g = new GUI();
        g.setVisible(true);
    }//GEN-LAST:event_backLabelMouseClicked

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
            java.util.logging.Logger.getLogger(LengthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LengthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LengthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LengthGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LengthGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> destDropDown;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JTextField inputQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton key0;
    private javax.swing.JButton key1;
    private javax.swing.JButton key2;
    private javax.swing.JButton key3;
    private javax.swing.JButton key4;
    private javax.swing.JButton key5;
    private javax.swing.JButton key6;
    private javax.swing.JButton key7;
    private javax.swing.JButton key8;
    private javax.swing.JButton key9;
    private javax.swing.JButton keyDecimal;
    private javax.swing.JTextField outputQuantity;
    private javax.swing.JComboBox<String> sourceDropDown;
    private javax.swing.JButton switchButton;
    private javax.swing.JLabel toLabel;
    // End of variables declaration//GEN-END:variables
}