package ark10;

import java.util.ArrayList;

public class NewJFrame1 extends javax.swing.JFrame {

    Carro carro;
    ArrayList<Carro> listaCarros = new ArrayList();

    int x = 0;

    public NewJFrame1(ArrayList<Carro> listaCarros7, int x1) {
        initComponents();
        this.listaCarros = listaCarros7;
        this.x = x1;
        

        this.jtxt.setText("Informe o Novo Valor da Locação do Carro: " + listaCarros.get(x1).getCódico());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LimparCampos2 = new javax.swing.JButton();
        CVTA = new javax.swing.JButton();
        msgNovoValorDeLocação = new javax.swing.JLabel();
        InputNOVO = new javax.swing.JTextField();
        jtxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARK 10");
        setResizable(false);

        LimparCampos2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        LimparCampos2.setText("Limpar Todos os Campos");
        LimparCampos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCampos2ActionPerformed(evt);
            }
        });

        CVTA.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        CVTA.setText("Alterar Valor");
        CVTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVTAActionPerformed(evt);
            }
        });

        msgNovoValorDeLocação.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        msgNovoValorDeLocação.setForeground(new java.awt.Color(255, 0, 0));

        InputNOVO.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jtxt.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgNovoValorDeLocação, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 384, Short.MAX_VALUE)
                        .addComponent(LimparCampos2)
                        .addGap(10, 10, 10)
                        .addComponent(CVTA))
                    .addComponent(InputNOVO)
                    .addComponent(jtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jtxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputNOVO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgNovoValorDeLocação)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CVTA)
                    .addComponent(LimparCampos2))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LimparCampos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCampos2ActionPerformed
        this.InputNOVO.setText("");
        this.msgNovoValorDeLocação.setText("");
    }//GEN-LAST:event_LimparCampos2ActionPerformed

    private void CVTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVTAActionPerformed
        this.msgNovoValorDeLocação.setText("");
        try {
            float novo = Float.parseFloat(this.InputNOVO.getText().trim());
            this.listaCarros.get(this.x).setValorDeLocação(novo);
            this.dispose();
        } catch (Exception e) {
            msgNovoValorDeLocação.setText("* Informe um Novo Valor de Locação para o Carro, Só Serão Aceitos Valores Numericos nesse Campo !*");
        }
    }//GEN-LAST:event_CVTAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CVTA;
    private javax.swing.JTextField InputNOVO;
    private javax.swing.JButton LimparCampos2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jtxt;
    private javax.swing.JLabel msgNovoValorDeLocação;
    // End of variables declaration//GEN-END:variables
}
