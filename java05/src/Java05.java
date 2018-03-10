
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Java05 extends javax.swing.JFrame {
    
    float valorA, valorB, valorC, d, x1, x2, vc[] = new float[4];
    int op;
        
    String escrever(){
        char q = (char)178;
        String eq, a, b, c;
        a = Float.toString(valorA);b = Float.toString(valorB);c = Float.toString(valorC);
        if(valorB < 0 && valorC < 0){
        eq = a+"x"+q+" "+b+"x "+c+" = 0";}
        else if(valorB >= 0 && valorC < 0){
        eq = a+"x"+q+" +"+b+"x "+c+" = 0";}
        else if(valorB < 0 && valorC >= 0){
        eq = a+"x"+q+" "+b+"x +"+c+" = 0";}
        else{
        eq = a+"x"+q+" +"+b+"x +"+c+" = 0";}
        return eq; }
      
    float[] calcular(){        
        if(valorA == 0) {vc[0] = 0;vc[1] = 0;vc[2] = 0;vc[3] = 0;}// vc[3] == 0 => "A Não pode ser Zero!"
        else {d=(float) ((pow(valorB, 2))-(4*valorA*valorC)); // cálculo do delta               
        if (d < 0){vc[0] = d;vc[1] = 0;vc[2] = 0;vc[3] = 1;}// vc[3] == 1 => "Não Existe Raizes Reais!"
        else{x1=(float) (((-1*valorB)+(sqrt(d)))/(2*valorA)); // cálculo de Basckara
             x2=(float) (((-1*valorB)-(sqrt(d)))/(2*valorA));
             vc[0] = d;vc[1] = x1;vc[2] = x2;vc[3] = 2;}} // vc[3] == 2 => ok
        return vc;}
    
    String resposta(int op){
        switch (op) {
            case 0:
                return "A Não pode ser Zero!";
            case 1:
                return "Não Existe Raizes Reais!";
            default:
                return escrever();
        }
    }
    
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
        jLabel1.setText("Eq 2G");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Formato: Ax2 + Bx + C = 0");

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

        raiz1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        raiz1.setText("Raiz X1");

        raiz2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        raiz2.setText("Raiz X2");

        delta.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        delta.setText("Delta");

        resposta.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        resposta.setText("Resposta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(resposta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(delta)
                        .addGap(97, 97, 97)
                        .addComponent(raiz1)
                        .addGap(86, 86, 86)
                        .addComponent(raiz2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(valB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(valC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delta)
                    .addComponent(raiz1)
                    .addComponent(raiz2))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if ("".equals(valA.getText()) || "".equals(valB.getText()) || "".equals(valC.getText())){
       resposta.setText("Digite os Valores!");}
       else{
       valorA = Float.parseFloat(valA.getText());
       valorB = Float.parseFloat(valB.getText());
       valorC = Float.parseFloat(valC.getText()); 
       op = (int)calcular()[3];
       resposta.setText(resposta(op));
       delta.setText("Delta: "+Float.toString(calcular()[0]));
       raiz1.setText("Raiz X1: "+Float.toString(calcular()[1]));
       raiz2.setText("Raiz X2: "+Float.toString(calcular()[2]));
       }
    }//GEN-LAST:event_jButton1ActionPerformed

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
}
