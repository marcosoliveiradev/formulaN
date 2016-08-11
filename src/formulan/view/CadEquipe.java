package formulan.view;

import formulan.control.Dependencias;
import formulan.control.EquipeDAO;
import formulan.model.Equipe;
import formulan.model.Pais;
import formulan.util.util;
import formulan.util.vars;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class CadEquipe extends javax.swing.JFrame implements CadBasico{

    public CadEquipe() {
        initComponents();
        getContentPane().setBackground(vars.corJanelaPadrao);
        
        this.flagEdicao = false;        
        modoNavega();        
        setarTabelaItemAtual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaDados = new javax.swing.JTable();
        edBusca = new javax.swing.JTextField();
        btLimpaBusca = new javax.swing.JButton();
        pnBotoes = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbPaises = new javax.swing.JComboBox<>();
        edNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbEquipes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edAnoInicio = new javax.swing.JTextField();
        edAnoFim = new javax.swing.JTextField();

        setTitle("Cadastro de Equipes");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de Equipes");

        tbListaDados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbListaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Id", "Equipe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbListaDados);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
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

        taObs.setColumns(20);
        taObs.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taObs.setLineWrap(true);
        taObs.setRows(5);
        taObs.setWrapStyleWord(true);
        jScrollPane4.setViewportView(taObs);

        jLabel5.setText("Logotipo");

        imgLogo.setBackground(new java.awt.Color(255, 255, 255));
        imgLogo.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgLogo.setToolTipText("");
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgLogo.setRequestFocusEnabled(false);
        imgLogo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imgLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLogoMouseClicked(evt);
            }
        });

        jLabel2.setText("País");

        cbPaises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPaisesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbPaisesMouseReleased(evt);
            }
        });

        edNome.setEditable(false);

        jLabel1.setText("Nome");

        jLabel3.setText("Observações");

        jLabel6.setText("Eqiupe Origem");

        cbEquipes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbEquipesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbEquipesMouseReleased(evt);
            }
        });

        jLabel7.setText("Ano de Fundação");

        jLabel8.setText("Ano de Término");

        edAnoInicio.setEditable(false);

        edAnoFim.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbEquipes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edAnoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpaBusca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEquipes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(edAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edAnoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 70, Short.MAX_VALUE))
                            .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

        equipeAtual.setEquipeId(null);
        equipeAtual.setEquipeNome(null);              
        equipeAtual.setEquipeOrigemId(null);
        equipeAtual.setEquipeAnoInicio(null);
        equipeAtual.setEquipeAnoFim(null);
        equipeAtual.setEquipeObs(null);
        equipeAtual.setPaisId(null);
        equipeAtual.setEquipeLogo(null);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        modoEdicao();
        EquipeDAO equipeDao = new EquipeDAO();
        this.equipeAtual = (Equipe)equipeDao.getObjetoById(this.idAtual);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        EquipeDAO equipeDao = new EquipeDAO();
        Equipe equipeTemp = (Equipe)equipeDao.getObjetoById(idAtual);

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?"+Dependencias.verEquipe(equipeTemp),
            "Confirmar", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            equipeDao.excluir(idAtual);
            listarTabela("");
        }

        modoNavega();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        EquipeDAO equipeDao = new EquipeDAO();

        equipeAtual.setEquipeNome(edNome.getText());              
        equipeAtual.setEquipeOrigemId(util.getIdComboEquipe(cbEquipes));        
        if (!edAnoInicio.getText().equals("")) 
            equipeAtual.setEquipeAnoInicio(Short.parseShort(edAnoInicio.getText()));
        else equipeAtual.setEquipeAnoInicio(Short.parseShort("0"));
        if (!edAnoFim.getText().equals(""))
            equipeAtual.setEquipeAnoFim(Short.parseShort(edAnoFim.getText()));
        else equipeAtual.setEquipeAnoFim(Short.parseShort("0"));
        equipeAtual.setEquipeObs(taObs.getText().getBytes());
        equipeAtual.setPaisId(util.getIdComboPais(cbPaises));
        equipeAtual.setEquipeLogo(this.byteLogo);        
                
        if (this.equipeAtual.getEquipeId()==null) equipeDao.inserir(this.equipeAtual);
        else equipeDao.editar(this.equipeAtual);

        util.preencherComboEquipe(cbEquipes);
        listarTabela("");
        modoNavega();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.flagEdicao = false;
        limpar();
        modoNavega();
        setarTabelaItemAtual();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void imgLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoMouseClicked
        if (this.flagEdicao == true)
            this.byteLogo = util.escolherImagem(this, imgLogo);
    }//GEN-LAST:event_imgLogoMouseClicked

    private void cbPaisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPaisesMouseClicked
    }//GEN-LAST:event_cbPaisesMouseClicked

    private void cbPaisesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPaisesMouseReleased
    }//GEN-LAST:event_cbPaisesMouseReleased

    private void cbEquipesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbEquipesMouseClicked
    }//GEN-LAST:event_cbEquipesMouseClicked

    private void cbEquipesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbEquipesMouseReleased
    }//GEN-LAST:event_cbEquipesMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        util.preencherComboPais(cbPaises);
        util.preencherComboEquipe(cbEquipes);
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
            java.util.logging.Logger.getLogger(CadEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadEquipe().setVisible(true);
            }
        });
    }

    @Override
    public void limpar() {
        edNome.setText("");
        cbPaises.setSelectedIndex(-1);
        cbEquipes.setSelectedIndex(-1);
        edAnoInicio.setText("");
        edAnoFim.setText("");
        taObs.setText("");
        imgLogo.setIcon(null);        
    }

    @Override
    public void modoEdicao() {
        tbListaDados.setEnabled(false);
        tbListaDados.setForeground(Color.GRAY);
        tbListaDados.clearSelection();
        
        edBusca.setEnabled(false);
        edNome.setEditable(true);
        cbPaises.setEnabled(true);
        cbEquipes.setEnabled(true);
        edAnoInicio.setEditable(true);
        edAnoFim.setEditable(true);
        taObs.setEditable(true);
        imgLogo.setEnabled(true);
        util.lblImagemModoEdicao(imgLogo);

        btNovo.setEnabled(false);
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        
        edNome.requestFocus();
        flagEdicao = true;        
    }

    @Override
    public void modoNavega() {
        tbListaDados.setEnabled(true);
        tbListaDados.setForeground(Color.BLACK);
        
        edBusca.setEnabled(true);
        edNome.setEditable(false);
        cbPaises.setEnabled(false);
        cbEquipes.setEnabled(false);
        edAnoInicio.setEditable(false);
        edAnoFim.setEditable(false);
        taObs.setEditable(false);
        imgLogo.setEnabled(false);        
        util.lblImagemModoNavega(imgLogo);

        btNovo.setEnabled(true);
        btEditar.setEnabled(true);
        btExcluir.setEnabled(true);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);

        tbListaDados.requestFocus();
        flagEdicao = false;
    }

    @Override
    public void listarTabela(String textoBusca) {
        EquipeDAO equipeDao = new EquipeDAO();
        List<Equipe> listaEquipes;   
        listaEquipes = (List)equipeDao.listaBusca(textoBusca);
        
        String[] nomesColunas = {"Id", "Nome"};
        List<String[]> listaTemp = new ArrayList<>();
        String tempId = "";
        String tempNome = "";
        
        if (listaEquipes.size() > 0) { //evita tabela vazia
            for (int i = 0; i <= listaEquipes.size() - 1; i++) {
                tempId = listaEquipes.get(i).getEquipeId().toString();
                tempNome = listaEquipes.get(i).getEquipeNome();
                listaTemp.add(new String[]{tempId, tempNome});

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

        EquipeDAO equipeDao = new EquipeDAO();
        Equipe equipe = (Equipe)equipeDao.getObjetoById(idAtual);
        
        edNome.setText(equipe.getEquipeNome());
        cbPaises.setSelectedIndex(util.setarComboPais(cbPaises, equipe.getPaisId()));
        cbEquipes.setSelectedIndex(util.setarComboEquipe(cbEquipes, equipe.getEquipeOrigemId()));
        if (equipe.getEquipeAnoInicio()!=0) edAnoInicio.setText(equipe.getEquipeAnoInicio().toString());
        else edAnoInicio.setText("");
        if (equipe.getEquipeAnoFim()!=0) edAnoFim.setText(equipe.getEquipeAnoFim().toString());
        else edAnoFim.setText("");
        taObs.setText(util.txtByteToString(equipe.getEquipeObs()));
        this.byteLogo = equipe.getEquipeLogo();
        if (this.byteLogo != null) 
            imgLogo.setIcon(new ImageIcon( util.redimensiona( util.imgByteToImage(this.byteLogo), imgLogo.getWidth(), imgLogo.getHeight())));            
        util.lblImagemModoNavega(imgLogo); //Não faz muito sentido, mas precisa pra atualizar
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
    private javax.swing.JComboBox<Equipe> cbEquipes;
    private javax.swing.JComboBox<Pais> cbPaises;
    private javax.swing.JTextField edAnoFim;
    private javax.swing.JTextField edAnoInicio;
    private javax.swing.JTextField edBusca;
    private javax.swing.JTextField edNome;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTable tbListaDados;
    // End of variables declaration//GEN-END:variables
    protected boolean flagEdicao;
    protected int idAtual;
    protected int itemAtual;
    protected Equipe equipeAtual = new Equipe();
    protected byte[] byteLogo = null;
}