package formulan.view;

import formulan.control.Dependencias;
import formulan.control.PontosDAO;
import formulan.model.Pontos;
import formulan.util.util;
import formulan.util.vars;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class CadPontos extends javax.swing.JFrame implements CadBasico {

    public CadPontos() {
        initComponents();
        getContentPane().setBackground(vars.corJanelaPadrao);
        
        modoNavega();        
        setarTabelaItemAtual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        edBusca = new javax.swing.JTextField();
        btLimpaBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaDados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        edPontosRegra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edPontos1 = new javax.swing.JTextField();
        edPontos2 = new javax.swing.JTextField();
        edPontos3 = new javax.swing.JTextField();
        edPontos4 = new javax.swing.JTextField();
        edPontos5 = new javax.swing.JTextField();
        edPontos6 = new javax.swing.JTextField();
        edPontos7 = new javax.swing.JTextField();
        edPontos8 = new javax.swing.JTextField();
        edPontos9 = new javax.swing.JTextField();
        edPontos10 = new javax.swing.JTextField();
        pnBotoes = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setTitle("Regras de Pontuação");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Regras de Pontuação");

        edBusca.setText("Digite o termo de busca...");
        edBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edBuscaMouseClicked(evt);
            }
        });
        edBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edBuscaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edBuscaKeyTyped(evt);
            }
        });

        btLimpaBusca.setText("Novo");
        btLimpaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpaBuscaActionPerformed(evt);
            }
        });

        tbListaDados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbListaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Ano de Implantação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbListaDados);

        jLabel1.setText("Ano de Implantação");

        edPontosRegra.setEditable(false);

        jLabel2.setText("Pontuação do 1º");

        jLabel3.setText("Pontuação do 2º");

        jLabel5.setText("Pontuação do 3º");

        jLabel6.setText("Pontuação do 4º");

        jLabel7.setText("Pontuação do 5º");

        jLabel8.setText("Pontuação do 6º");

        jLabel9.setText("Pontuação do 7º");

        jLabel10.setText("Pontuação do 8º");

        jLabel11.setText("Pontuação do 9º");

        jLabel12.setText("Pontuação do 10º");

        edPontos1.setEditable(false);

        edPontos2.setEditable(false);

        edPontos3.setEditable(false);

        edPontos4.setEditable(false);

        edPontos5.setEditable(false);

        edPontos6.setEditable(false);

        edPontos7.setEditable(false);

        edPontos8.setEditable(false);

        edPontos9.setEditable(false);

        edPontos10.setEditable(false);

        pnBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotoesLayout = new javax.swing.GroupLayout(pnBotoes);
        pnBotoes.setLayout(pnBotoesLayout);
        pnBotoesLayout.setHorizontalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBotoesLayout.createSequentialGroup()
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnBotoesLayout.createSequentialGroup()
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btLimpaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel2))
                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edPontos1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontos2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontos3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontos5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontos6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontos7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontos8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontos9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontos10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontos4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edPontosRegra, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btLimpaBusca))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(edPontosRegra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edPontos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edPontos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edPontos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edPontos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edPontos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edPontos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edPontos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edPontos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edPontos9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(jLabel2))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edPontos10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBuscaMouseClicked
        edBusca.setText("");
    }//GEN-LAST:event_edBuscaMouseClicked

    private void edBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edBuscaKeyPressed

    }//GEN-LAST:event_edBuscaKeyPressed

    private void edBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edBuscaKeyTyped
        listarTabela(edBusca.getText());
    }//GEN-LAST:event_edBuscaKeyTyped

    private void btLimpaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaBuscaActionPerformed
        edBusca.setText("");
        listarTabela("");
        modoNavega();
    }//GEN-LAST:event_btLimpaBuscaActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpar();
        modoEdicao();

        this.idAtual = -1;
        pontosAtual.setPontosRegra(null);
        pontosAtual.setPontos1(null);
        pontosAtual.setPontos2(null);
        pontosAtual.setPontos3(null);
        pontosAtual.setPontos4(null);
        pontosAtual.setPontos5(null);
        pontosAtual.setPontos6(null);
        pontosAtual.setPontos7(null);
        pontosAtual.setPontos8(null);
        pontosAtual.setPontos9(null);
        pontosAtual.setPontos10(null);        
    }//GEN-LAST:event_btNovoActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        modoEdicao();
    
        PontosDAO pontosDao = new PontosDAO();
        this.pontosAtual = (Pontos)pontosDao.getObjetoById(this.idAtual);

        //GAMBIARRA PRA MANTER A CHAVE PRIMÁRIA
        edPontosRegra.setEditable(false);        
        edPontos1.requestFocus();        
        //*************************************
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        PontosDAO pontosDao = new PontosDAO();
        Pontos pontosTemp = (Pontos)pontosDao.getObjetoById(idAtual);

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?"+Dependencias.verPontos(pontosTemp),
            "Confirmar", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            pontosDao.excluir(idAtual);
            listarTabela("");
        }

        modoNavega();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        PontosDAO pontosDao = new PontosDAO();

        this.pontosAtual.setPontosRegra(Short.parseShort(edPontosRegra.getText()));
        this.pontosAtual.setPontos1(Short.parseShort(edPontos1.getText()));
        this.pontosAtual.setPontos2(Short.parseShort(edPontos2.getText()));
        this.pontosAtual.setPontos3(Short.parseShort(edPontos3.getText()));
        this.pontosAtual.setPontos4(Short.parseShort(edPontos4.getText()));
        this.pontosAtual.setPontos5(Short.parseShort(edPontos5.getText()));
        this.pontosAtual.setPontos6(Short.parseShort(edPontos6.getText()));
        this.pontosAtual.setPontos7(Short.parseShort(edPontos7.getText()));
        this.pontosAtual.setPontos8(Short.parseShort(edPontos8.getText()));
        this.pontosAtual.setPontos9(Short.parseShort(edPontos9.getText()));
        this.pontosAtual.setPontos10(Short.parseShort(edPontos10.getText()));

        if (this.idAtual == -1) pontosDao.inserir(this.pontosAtual);
        else pontosDao.editar(this.pontosAtual);

        listarTabela("");
        modoNavega();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limpar();
        modoNavega();
        setarTabelaItemAtual();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listarTabela("");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CadPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPontos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPontos().setVisible(true);
            }
        });
    }

    @Override
    public void limpar() {
        edPontosRegra.setText("");
        edPontos1.setText("");
        edPontos2.setText("");
        edPontos3.setText("");
        edPontos4.setText("");
        edPontos5.setText("");
        edPontos6.setText("");
        edPontos7.setText("");
        edPontos8.setText("");
        edPontos9.setText("");
        edPontos10.setText("");
    }

    @Override
    public void modoEdicao() {
        tbListaDados.setEnabled(false);
        tbListaDados.setForeground(Color.GRAY);
        tbListaDados.clearSelection();
        
        edBusca.setEditable(false);
        edPontosRegra.setEditable(true);
        edPontos1.setEditable(true);
        edPontos2.setEditable(true);
        edPontos3.setEditable(true);
        edPontos4.setEditable(true);
        edPontos5.setEditable(true);
        edPontos6.setEditable(true);
        edPontos7.setEditable(true);
        edPontos8.setEditable(true);
        edPontos9.setEditable(true);
        edPontos10.setEditable(true);

        btNovo.setEnabled(false);
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        
        edPontosRegra.requestFocus();
    }

    @Override
    public void modoNavega() {
        tbListaDados.setEnabled(true);
        tbListaDados.setForeground(Color.BLACK);

        edBusca.setEditable(true);
        edPontosRegra.setEditable(false);
        edPontos1.setEditable(false);
        edPontos2.setEditable(false);
        edPontos3.setEditable(false);
        edPontos4.setEditable(false);
        edPontos5.setEditable(false);
        edPontos6.setEditable(false);
        edPontos7.setEditable(false);
        edPontos8.setEditable(false);
        edPontos9.setEditable(false);
        edPontos10.setEditable(false);
        
        btNovo.setEnabled(true);
        btEditar.setEnabled(true);
        btExcluir.setEnabled(true);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
        
        tbListaDados.requestFocus();
    }

    @Override
    public void listarTabela(String textoBusca) {
        PontosDAO pontosDao = new PontosDAO();
        List<Pontos> listaPontos;   
        listaPontos = (List)pontosDao.listaBusca(textoBusca);
        
        String[] nomesColunas = {"Ano de Implantação"};
        List<String[]> listaTemp = new ArrayList<>();
        String tempRegra = "";
        
        if (listaPontos.size() > 0) { //evita tabela vazia
            for (int i = 0; i <= listaPontos.size() - 1; i++) {
                tempRegra = listaPontos.get(i).getPontosRegra().toString();
                listaTemp.add(new String[]{tempRegra});

                DefaultTableModel modelo = new DefaultTableModel(
                        listaTemp.toArray(new String[listaTemp.size()][]), nomesColunas);
                tbListaDados.setModel(modelo);
                tbListaDados.setRowSelectionInterval(0, 0);
            }
        }
    }

    @Override
    public void mostrarDados(JTable tabela, int itemTabela) {
        Object selecaoId = tabela.getValueAt(itemTabela, 0); //0 = primeira coluna
        idAtual = (Integer.parseInt(String.valueOf(selecaoId)));
        limpar();

        PontosDAO pontosDao = new PontosDAO();
        Pontos pontos = (Pontos)pontosDao.getObjetoById(idAtual);
        
        edPontosRegra.setText(pontos.getPontosRegra().toString());
        edPontos1.setText(pontos.getPontos1().toString());
        edPontos2.setText(pontos.getPontos2().toString());
        edPontos3.setText(pontos.getPontos3().toString());
        edPontos4.setText(pontos.getPontos4().toString());
        edPontos5.setText(pontos.getPontos5().toString());
        edPontos6.setText(pontos.getPontos6().toString());
        edPontos7.setText(pontos.getPontos7().toString());
        edPontos8.setText(pontos.getPontos8().toString());
        edPontos9.setText(pontos.getPontos9().toString());
        edPontos10.setText(pontos.getPontos10().toString());
    }

    @Override
    public void setarTabelaItemAtual() {
        tbListaDados.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selected = tbListaDados.getSelectedRow();
                if (selected != -1) {
                    itemAtual = selected;
                    mostrarDados(tbListaDados, selected);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpaBusca;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField edBusca;
    private javax.swing.JTextField edPontos1;
    private javax.swing.JTextField edPontos10;
    private javax.swing.JTextField edPontos2;
    private javax.swing.JTextField edPontos3;
    private javax.swing.JTextField edPontos4;
    private javax.swing.JTextField edPontos5;
    private javax.swing.JTextField edPontos6;
    private javax.swing.JTextField edPontos7;
    private javax.swing.JTextField edPontos8;
    private javax.swing.JTextField edPontos9;
    private javax.swing.JTextField edPontosRegra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JTable tbListaDados;
    // End of variables declaration//GEN-END:variables
    protected int idAtual;
    protected int itemAtual;
    protected Pontos pontosAtual = new Pontos();
}