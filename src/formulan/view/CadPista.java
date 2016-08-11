package formulan.view;

import formulan.model.Pais;
import formulan.control.PaisDAO;
import formulan.control.PistaDAO;
import formulan.model.Piloto;
import formulan.model.Pista;
import formulan.util.util;
import formulan.util.vars;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class CadPista extends javax.swing.JFrame {

    public CadPista() {
        initComponents();        
        getContentPane().setBackground(vars.corJanelaPadrao);

        flagEdicao = false;        
        modoNavega();        
        setarTabelaItemAtual();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        formulaNPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("formulaNPU").createEntityManager();
        paisQuery = java.beans.Beans.isDesignTime() ? null : formulaNPUEntityManager.createQuery("SELECT p FROM Pais p");
        paisList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : paisQuery.getResultList();
        edNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        cbPaises = new javax.swing.JComboBox<>();
        imgTracado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edExtensao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        edRecorde = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbPilotos = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setTitle("Cadastro de Motor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        edNome.setEditable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("País");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de Pistas");

        tbListaDados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbListaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Id", "Nome"
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
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

        jLabel3.setText("Observações");

        taObs.setColumns(20);
        taObs.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taObs.setLineWrap(true);
        taObs.setRows(4);
        taObs.setWrapStyleWord(true);
        jScrollPane4.setViewportView(taObs);

        cbPaises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPaisesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbPaisesMouseReleased(evt);
            }
        });

        imgTracado.setBackground(new java.awt.Color(255, 255, 255));
        imgTracado.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgTracado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgTracado.setToolTipText("");
        imgTracado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgTracado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgTracado.setRequestFocusEnabled(false);
        imgTracado.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imgTracado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgTracadoMouseClicked(evt);
            }
        });

        jLabel5.setText("Traçado");

        edCidade.setEditable(false);

        jLabel6.setText("Cidade");

        edExtensao.setEditable(false);

        jLabel7.setText("Extensão");

        jLabel8.setText("m");

        jLabel9.setText("Recorde");

        edRecorde.setEditable(false);

        jLabel10.setText("Piloto");

        cbPilotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPilotosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbPilotosMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edRecorde, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edExtensao, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 434, Short.MAX_VALUE))
                    .addComponent(imgTracado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpaBusca))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbPilotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(edCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(edExtensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(edRecorde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(260, 260, 260))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgTracado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void btLimpaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaBuscaActionPerformed
        edBusca.setText("");
        listarTabela("");
        modoNavega();
    }//GEN-LAST:event_btLimpaBuscaActionPerformed

    private void edBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBuscaMouseClicked
        edBusca.setText("");
    }//GEN-LAST:event_edBuscaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        util.preencherComboPais(cbPaises);
        util.preencherComboPiloto(cbPilotos);
        listarTabela("");        
    }//GEN-LAST:event_formWindowOpened

    private void cbPaisesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPaisesMouseReleased
    }//GEN-LAST:event_cbPaisesMouseReleased

    private void cbPaisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPaisesMouseClicked
    }//GEN-LAST:event_cbPaisesMouseClicked

    private void edBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edBuscaKeyTyped
        listarTabela(edBusca.getText());
    }//GEN-LAST:event_edBuscaKeyTyped

    private void edBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edBuscaKeyPressed
    }//GEN-LAST:event_edBuscaKeyPressed

    private void imgTracadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgTracadoMouseClicked
        if (this.flagEdicao == true) {
            this.byteTracado = util.escolherImagem(this, imgTracado);  
        }        
    }//GEN-LAST:event_imgTracadoMouseClicked

    private void cbPilotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPilotosMouseClicked
    }//GEN-LAST:event_cbPilotosMouseClicked

    private void cbPilotosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPilotosMouseReleased
    }//GEN-LAST:event_cbPilotosMouseReleased

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        flagEdicao = false;
        limpar();
        modoNavega();
        setarTabelaItemAtual();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        PistaDAO pistaDao = new PistaDAO();

        this.pistaAtual.setPistaNome(edNome.getText());
        this.pistaAtual.setPistaCidade(edCidade.getText());
        this.pistaAtual.setPaisId(cbPaises.getItemAt(cbPaises.getSelectedIndex()).getPaisId());
        if (!edExtensao.getText().equals(""))
            this.pistaAtual.setPistaKm(Double.parseDouble(edExtensao.getText()));
        else
            this.pistaAtual.setPistaKm(0.0);
        this.pistaAtual.setPistaRecorde(null); //CODIFICAR
        this.pistaAtual.setPilotoId(cbPilotos.getItemAt(cbPilotos.getSelectedIndex()).getPilotoId());
        this.pistaAtual.setPistaObs(taObs.getText().getBytes());
        this.pistaAtual.setPistaTracado(this.byteTracado);

        if (pistaAtual.getPistaId()==null) pistaDao.inserir(pistaAtual);
        else pistaDao.editar(pistaAtual);

        listarTabela("");
        modoNavega();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        PistaDAO pistaDao = new PistaDAO();

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            pistaDao.excluir(idAtual);
            listarTabela("");
        }

        modoNavega();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        modoEdicao();
        PistaDAO pistaDao = new PistaDAO();
        this.pistaAtual = pistaDao.getObjetoById(this.idAtual);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpar();
        modoEdicao();

        pistaAtual.setPistaId(null);
        pistaAtual.setPistaNome("");
        pistaAtual.setPistaCidade("");
        pistaAtual.setPaisId(null);
        pistaAtual.setPistaKm(null);
        pistaAtual.setPistaRecorde(null);
        pistaAtual.setPaisId(null);
        pistaAtual.setPistaTracado(null);
    }//GEN-LAST:event_btNovoActionPerformed


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
            java.util.logging.Logger.getLogger(CadPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPista().setVisible(true);
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
    private javax.swing.JComboBox<Pais> cbPaises;
    private javax.swing.JComboBox<Piloto> cbPilotos;
    private javax.swing.JTextField edBusca;
    private javax.swing.JTextField edCidade;
    private javax.swing.JTextField edExtensao;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edRecorde;
    private javax.persistence.EntityManager formulaNPUEntityManager;
    private javax.swing.JLabel imgTracado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private java.util.List<formulan.model.Pais> paisList;
    private javax.persistence.Query paisQuery;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTable tbListaDados;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFileChooser fcBandeira;
    protected boolean flagEdicao;
    protected int idAtual;
    protected int itemAtual;
    protected Pista pistaAtual = new Pista();
    protected byte[] byteTracado = null;
    
    private void limpar() {        
        edNome.setText("");
        edCidade.setText("");
        cbPaises.setSelectedIndex(-1);
        edExtensao.setText("");
        edRecorde.setText("");
        cbPilotos.setSelectedIndex(-1);        
        taObs.setText("");
        imgTracado.setIcon(null);
    }

    private void modoEdicao() {
        tbListaDados.setEnabled(false);
        tbListaDados.setForeground(Color.GRAY);
        tbListaDados.clearSelection();

        edBusca.setEnabled(false);
        edNome.setEditable(true);
        edCidade.setEditable(true);
        cbPaises.setEnabled(true);
        edExtensao.setEnabled(true);
        edRecorde.setEnabled(true);
        cbPilotos.setEnabled(true);
        taObs.setEditable(true);
        imgTracado.setEnabled(true);        
        
        btNovo.setEnabled(false);
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        
        edNome.requestFocus();
        flagEdicao = true;
    }

    private void modoNavega() {
        tbListaDados.setEnabled(true);
        tbListaDados.setForeground(Color.BLACK);

        edBusca.setEnabled(true);
        edNome.setEditable(false);
        edCidade.setEditable(false);
        cbPaises.setEnabled(false);
        edExtensao.setEditable(false);
        edRecorde.setEditable(false);
        cbPilotos.setEnabled(false);
        taObs.setEditable(false);
        imgTracado.setEnabled(false);        
        
        btNovo.setEnabled(true);
        btEditar.setEnabled(true);
        btExcluir.setEnabled(true);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);

        tbListaDados.requestFocus();
        flagEdicao = false;
    }    

    private void listarTabela(String textoBusca) {
        PistaDAO pistaDao = new PistaDAO();
        List<Pista> listaPistas;   

        listaPistas = (List)pistaDao.listaBusca(textoBusca);
        
        String[] nomesColunas = {"Id", "Pista"};
        List<String[]> listaTemp = new ArrayList<>();
        String tempId = "";
        String tempNome = "";
        
        if (listaPistas.size() > 0) {
            for (int i = 0; i <= listaPistas.size() - 1; i++) {
                tempId = listaPistas.get(i).getPistaId().toString();
                tempNome = listaPistas.get(i).getPistaNome();
                listaTemp.add(new String[]{tempId, tempNome});
            }
            
            DefaultTableModel modelo = new DefaultTableModel(
                    listaTemp.toArray(new String[listaTemp.size()][]), nomesColunas);
            tbListaDados.setModel(modelo);
            tbListaDados.setRowSelectionInterval(0, 0);
            
        }
  
    }    
        
    private void mostrarDados(JTable tabela, int itemTabela) {
        Object selecaoId = tabela.getValueAt(itemTabela, 0); //0 = primeira coluna
        this.idAtual = (Integer.parseInt(String.valueOf(selecaoId)));

        limpar();
        
        PistaDAO pistaDao = new PistaDAO();
        Pista pista = pistaDao.getObjetoById(idAtual);
        
        edNome.setText(pista.getPistaNome());
        edCidade.setText(pista.getPistaCidade());
        cbPaises.setSelectedIndex(util.setarComboPais(cbPaises, pista.getPaisId()));
        edExtensao.setText(String.valueOf(pista.getPistaKm()));
        edRecorde.setText(String.valueOf(pista.getPistaRecorde()));
        cbPilotos.setSelectedIndex(util.setarComboPiloto(cbPilotos, pista.getPilotoId()));        
        taObs.setText(util.txtByteToString(pista.getPistaObs()));
        this.byteTracado = pista.getPistaTracado();
        if (this.byteTracado != null)
            imgTracado.setIcon(new ImageIcon( util.redimensiona( util.imgByteToImage(this.byteTracado), imgTracado.getWidth(), imgTracado.getHeight())));
    }

    private void setarTabelaItemAtual() {
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

}