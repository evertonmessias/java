
public class Java05 extends javax.swing.JFrame {
    
    char q = (char)178; // quadrado   
    
    public Java05() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valB = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        valC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        raiz1 = new javax.swing.JLabel();
        raiz2 = new javax.swing.JLabel();
        delta = new javax.swing.JLabel();
        resposta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 130, 191));
        jLabel1.setText("Equação do 2º Grau");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setText("Ax² + Bx + C = 0");

        valA.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Valor A:");

        valB.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("Valor B:");

        valC.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Valor C:");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setText("APAGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        raiz1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        raiz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        raiz1.setText("Raiz X1");

        raiz2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        raiz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        raiz2.setText("Raiz X2");

        delta.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        delta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delta.setText("Delta");

        resposta.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        resposta.setForeground(new java.awt.Color(193, 58, 58));
        resposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resposta.setText("Resposta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(delta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(raiz1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(raiz2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 177, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(resposta, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(valC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resposta)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delta)
                    .addComponent(raiz1)
                    .addComponent(raiz2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BOTÕES:   
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String a = valA.getText();String b = valB.getText();String c = valC.getText();
       if ("".equals(a) || "".equals(b) || "".equals(c) || !isNumeric(a) || !isNumeric(b) || !isNumeric(c)){
       resposta.setText("Digite os Valores Numéricos!");}
       else{
           
       Eq2grau equac = new Eq2grau(Float.parseFloat(a),Float.parseFloat(b),Float.parseFloat(c));
   
       resposta.setText(equac.resposta());
       String de = String.format("%.2f",equac.calcular()[0]);
       String r1 = String.format("%.2f",equac.calcular()[1]);
       String r2 = String.format("%.2f",equac.calcular()[2]);
       delta.setText("Delta = "+de);
       raiz1.setText("X1 = "+r1);
       raiz2.setText("X2 = "+r2);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        valA.setText("");
        valB.setText("");
        valC.setText("");
        resposta.setText("Resposta:");
        delta.setText("Delta");
        raiz1.setText("Raiz X1");
        raiz2.setText("Raiz X2");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // método principal não usado !
        
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
            java.util.logging.Logger.getLogger(Java05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java05().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel delta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel raiz1;
    private javax.swing.JLabel raiz2;
    private javax.swing.JLabel resposta;
    private javax.swing.JTextField valA;
    private javax.swing.JTextField valB;
    private javax.swing.JTextField valC;
    // End of variables declaration//GEN-END:variables

   public static boolean isNumeric (String s) {
		try {
			Float.parseFloat(s);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;}
   
   
}
