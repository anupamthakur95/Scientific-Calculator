/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcscientific;

/**
 *
 * @author ANUPAM KUMAR
 */
public class CalcSci extends javax.swing.JFrame {

    private double a;
    private double b; 
    private boolean zeros;
    private boolean dec;
    private boolean s;
    private byte ax;
    private boolean drd;
    
    private double on;
    public CalcSci() {
        initComponents();
    }
                                         

  
   
                 

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        output2 = new javax.swing.JTextField();
        output1 = new javax.swing.JTextField();
        output3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        memRead = new javax.swing.JButton();
        memClear = new javax.swing.JButton();
        memSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        deg = new javax.swing.JRadioButton();
        rad = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        seven = new javax.swing.JButton();
        four = new javax.swing.JButton();
        one = new javax.swing.JButton();
        deci = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        five = new javax.swing.JButton();
        two = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        six = new javax.swing.JButton();
        three = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        onex = new javax.swing.JButton();
        threeRoot = new javax.swing.JButton();
        per = new javax.swing.JButton();
        div = new javax.swing.JButton();
        square = new javax.swing.JButton();
        root = new javax.swing.JButton();
        add = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cosine = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        plusmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Scientific Calculator");

        output2.setFocusable(false);

        output1.setBackground(new java.awt.Color(255, 204, 204));
        output1.setText("0");

        output3.setText("0");
        output3.setFocusable(false);
        output3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                output3ActionPerformed(evt);
            }
        });

        memRead.setText("MR");
        memRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memReadActionPerformed(evt);
            }
        });

        memClear.setText("MC");
        memClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memClearActionPerformed(evt);
            }
        });

        memSave.setText("MS");
        memSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(memRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(memClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(memSave)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memRead)
                    .addComponent(memClear)
                    .addComponent(memSave))
                .addContainerGap())
        );

        deg.setText("Degrees");
        deg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degActionPerformed(evt);
            }
        });

        rad.setText("Radians");
        rad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(deg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rad)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deg)
                    .addComponent(rad))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        deci.setText(".");
        deci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deciActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(255, 51, 51));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(four)
                        .addGap(18, 18, 18)
                        .addComponent(five)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(six))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(seven)
                        .addGap(18, 18, 18)
                        .addComponent(eight)
                        .addGap(28, 28, 28)
                        .addComponent(nine))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(one)
                                .addGap(18, 18, 18)
                                .addComponent(two))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(deci)
                                .addGap(18, 18, 18)
                                .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(three, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(equal, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deci)
                    .addComponent(zero)
                    .addComponent(equal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clear.setText("CE");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        clean.setText("C");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        onex.setText("1/x");
        onex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onexActionPerformed(evt);
            }
        });

        threeRoot.setText("3√");
        threeRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeRootActionPerformed(evt);
            }
        });

        per.setText("%");
        per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perActionPerformed(evt);
            }
        });

        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        square.setText("x^2");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        root.setText("√");
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        mul.setText("*");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        sin.setText("Sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cosine.setText("Cos");
        cosine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosineActionPerformed(evt);
            }
        });

        tan.setText("Tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        pi.setText("n");
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        plusmin.setText("+/-");
        plusmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(sin)
                                .addGap(18, 18, 18)
                                .addComponent(cosine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tan))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(clear)
                                        .addGap(18, 18, 18)
                                        .addComponent(clean))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(onex)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(threeRoot)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(per))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(pi))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(div)
                                .addGap(18, 18, 18)
                                .addComponent(square)
                                .addGap(18, 18, 18)
                                .addComponent(root)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub)
                        .addGap(18, 18, 18)
                        .addComponent(mul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plusmin))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(clean)
                    .addComponent(pi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onex)
                    .addComponent(threeRoot)
                    .addComponent(per))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(div)
                    .addComponent(square)
                    .addComponent(root))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(sub)
                    .addComponent(mul)
                    .addComponent(plusmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sin)
                    .addComponent(cosine)
                    .addComponent(tan))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(output2)
                            .addComponent(output1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(output3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(output2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(output1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(output3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memReadActionPerformed
         output1.setText(String.valueOf(output3.getText()));
    }//GEN-LAST:event_memReadActionPerformed

    private void degActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degActionPerformed
        drd = false;
    }//GEN-LAST:event_degActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
           if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"7");
        zeros = true;
    }//GEN-LAST:event_sevenActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
   b = Double.parseDouble(String.valueOf(output1.getText()));
       
       if(ax == 0){
           on = b;
           output2.setText(String.valueOf(b));
       }
        if(ax == 1){
           on = a + b;
           output2.setText(output2.getText() + String.valueOf(b));
       }
         if(ax == 2){
           on = a - b;
           output2.setText(output2.getText() + String.valueOf(b));
       }
          if(ax == 3){
           on = a * b;
           output2.setText(output2.getText() + String.valueOf(b));
       }
           if(ax == 4){
           on = a / b;
           output2.setText(output2.getText() + String.valueOf(b));
       }
            if(ax == 5){
           on = a * b/100;
           output2.setText(output2.getText() + String.valueOf(b) + ")");
       }
       if(on > -100000000 && on < 100000000){
        output1.setText(String.valueOf(on));
     }
     else{
        output1.setText("Error"); 
         }
       a = 0;
       b = 0;
       ax = 0;
       
       ax = 0;
       dec = false;
       zeros = false;       
    }//GEN-LAST:event_equalActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
         if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"3");
        zeros = true;
    }//GEN-LAST:event_threeActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
       b = Double.parseDouble(String.valueOf(output1.getText()));
        if(!s){
            if(!drd){
              output2.setText("tan(" + String.valueOf(b) + ")");
              b = b * 0.0174532925  ;
            }
            on = Math.tan(b);
        }
        else{
           output2.setText("tanh(" + String.valueOf(b) + ")");
           on = Math.tanh(b);
        }
        output1.setText(String.valueOf(on));
        on = 0;
        ax = 0;
    }//GEN-LAST:event_tanActionPerformed

    private void perActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perActionPerformed
         a = Double.parseDouble(String.valueOf(output1.getText()));
        output1.setText("Null");
        output1.setText(String.valueOf(a) + "%(");
        
        dec= false;
        zeros= false;
        ax = 5;
    }//GEN-LAST:event_perActionPerformed

    private void onexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onexActionPerformed
         b = Double.parseDouble(String.valueOf(output1.getText()));
        on = 1/b;
        
         if(on > -100000000 && on < 100000000){
         output1.setText(String.valueOf(on));
     }
     else{
        output1.setText(" Oh!!! Error"); 
         }
         output2.setText("1/" + String.valueOf(b));
         on = 0;
         ax = 0;
    }//GEN-LAST:event_onexActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
         output1.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_piActionPerformed

    private void output3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_output3ActionPerformed
         output3.setText(String.valueOf(output1.getText()));// memory display
    }//GEN-LAST:event_output3ActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        b = Double.parseDouble(String.valueOf(output1.getText()));
        if(!s){
            if(!drd){
              output2.setText("Sin(" + String.valueOf(b) + ")");
              b = b * 0.0174532925  ;
            }
            on = Math.sin(b);
        }
        else{
           output2.setText("Sinh(" + String.valueOf(b) + ")");
           on = Math.sinh(b);
        }
        output1.setText(String.valueOf(on));
        on = 0;
        ax = 0;
    }//GEN-LAST:event_sinActionPerformed

    private void cosineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosineActionPerformed
         b = Double.parseDouble(String.valueOf(output1.getText()));
        if(!s){
            if(!drd){
              output2.setText("cos(" + String.valueOf(b) + ")");
              b = b * 0.0174532925  ;
            }
            on = Math.cos(b);
        }
        else{
           output2.setText("cosh(" + String.valueOf(b) + ")");
           on = Math.cosh(b);
        }
        output1.setText(String.valueOf(on));
        on = 0;
        ax= 0;
    }//GEN-LAST:event_cosineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"0");
    }//GEN-LAST:event_zeroActionPerformed

    private void deciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deciActionPerformed
        if(!dec){
        output1.setText(output1.getText() + ".");
        dec = true;
      }
          
    }//GEN-LAST:event_deciActionPerformed

    private void plusminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminActionPerformed
         b = Double.parseDouble(String.valueOf(output1.getText()));
     on = b * -1;
     
     if(on > -100000000 && on < 100000000){
         output1.setText(String.valueOf(on));
     }
     else{
        output1.setText("Error......"); 
     }
     dec = true;
     on = 0;
    }//GEN-LAST:event_plusminActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
         if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"1");
        zeros = true;
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
         if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"2");
        zeros = true;
    }//GEN-LAST:event_twoActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
          if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"4");
        zeros = true;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
         if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"5");
        zeros = true;
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"6");
        zeros = true;
    }//GEN-LAST:event_sixActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"8");
        zeros = true;
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if(!zeros && !dec){
            output1.setText(null);
        }
        output1.setText(output1.getText()+"9");
        zeros = true;
    }//GEN-LAST:event_nineActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
 if(ax == 0){
            a = Double.parseDouble(String.valueOf(output1.getText()));
        }
        else{
             b = Double.parseDouble(String.valueOf(output1.getText()));  
        }
        if(ax == 1){
            a = a + b;
            
        }
        if(ax == 2){
            a = a - b;
            
        }
        if(ax == 3){
            a = a * b;
            
        }
        if(ax == 4){
            a = a / b;
            
        }
        if(ax == 5){
            a = a * b/100;
            
        }
        output1.setText("0");
        output2.setText(String.valueOf(a) + "+");
        ax = 1;
        dec = false;
        zeros = false;
        
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
      if(ax == 0){
            a = Double.parseDouble(String.valueOf(output1.getText()));
        }
        else{
             b = Double.parseDouble(String.valueOf(output1.getText()));  
        }
        if(ax == 1){
            a = a + b;
            
        }
        if(ax == 2){
            a = a - b;
            
        }
        if(ax == 3){
            a = a * b;
            
        }
        if(ax == 4){
            a = a / b;
            
        }
        if(ax == 5){
            a = a * b/100;
            
        }
        output1.setText("Null");
        output2.setText(String.valueOf(a) + "-");
        ax = 2;
        dec = false;
        zeros = false;
    }//GEN-LAST:event_subActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        if(ax == 0){
            a = Double.parseDouble(String.valueOf(output1.getText()));
        }
        else{
             b = Double.parseDouble(String.valueOf(output1.getText()));  
        }
        if(ax == 1){
            a = a + b;
            
        }
        if(ax == 2){
            a = a - b;
            
        }
        if(ax == 3){
            a = a * b;
            
        }
        if(ax == 4){
            a = a / b;
            
        }
        if(ax == 5){
            a = a * b/100;
            
        }
        output1.setText("0");
        output2.setText(String.valueOf(a) + "*");
        ax = 3;
        dec = false;
        zeros = false;
    }//GEN-LAST:event_mulActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        if(ax == 0){
            a = Double.parseDouble(String.valueOf(output1.getText()));
        }
        else{
             b = Double.parseDouble(String.valueOf(output1.getText()));  
        }
        if(ax == 1){
            a = a + b;
            
        }
        if(ax == 2){
            a = a - b;
            
        }
        if(ax == 3){
            a = a * b;
            
        }
        if(ax == 4){
            a = a / b;
            
        }
        if(ax == 5){
            a = a * b/100;
            
        }
        output1.setText("0");
        output2.setText(String.valueOf(a) + "/");
        ax = 4;
        dec = false;
        zeros = false;
    }//GEN-LAST:event_divActionPerformed

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed
 b = Double.parseDouble(String.valueOf(output1.getText()));
        on = b * b;
        
        if(on > -100000000 && on < 100000000){
        output1.setText(String.valueOf(on));
     }
     else{
        output1.setText("Error"); 
         }
        
       output2.setText(String.valueOf(b) + "^2");
       on = 0;
       ax = 0;
    }//GEN-LAST:event_squareActionPerformed

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootActionPerformed
        b = Double.parseDouble(String.valueOf(output1.getText()));
        on = Math.sqrt(b);
        
      
        output1.setText(String.valueOf(on));
        
        output2.setText( "^1/2" + String.valueOf(b) );
        on = 0;
        ax = 0;
    }//GEN-LAST:event_rootActionPerformed

    private void threeRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeRootActionPerformed
        b = Double.parseDouble(String.valueOf(output1.getText()));
        on = Math.cbrt(b);
        
      
        output1.setText(String.valueOf(on));
        
        output2.setText( "^3/2" + String.valueOf(b) );
        on = 0;
        ax = 0;
    }//GEN-LAST:event_threeRootActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         output1.setText("0");
     zeros = false;
     dec = false;
    }//GEN-LAST:event_clearActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        output1.setText("0");
       output2.setText(null);
       zeros = false;
       dec = false;
       a = 0;
       b = 0;
       on= 0;
    }//GEN-LAST:event_cleanActionPerformed

    private void memClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memClearActionPerformed
         output3.setText("0");
    }//GEN-LAST:event_memClearActionPerformed

    private void memSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memSaveActionPerformed
        output3.setText(String.valueOf(output1.getText()));
    }//GEN-LAST:event_memSaveActionPerformed

    private void radActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radActionPerformed
         drd = true;
    }//GEN-LAST:event_radActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcSci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clean;
    private javax.swing.JButton clear;
    private javax.swing.JButton cosine;
    private javax.swing.JButton deci;
    private javax.swing.JRadioButton deg;
    private javax.swing.JButton div;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton memClear;
    private javax.swing.JButton memRead;
    private javax.swing.JButton memSave;
    private javax.swing.JButton mul;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton onex;
    private javax.swing.JTextField output1;
    private javax.swing.JTextField output2;
    private javax.swing.JTextField output3;
    private javax.swing.JButton per;
    private javax.swing.JButton pi;
    private javax.swing.JButton plusmin;
    private javax.swing.JRadioButton rad;
    private javax.swing.JButton root;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton square;
    private javax.swing.JButton sub;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton threeRoot;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
