package formulan.view;

import formulan.control.PilotoDAO;
import formulan.model.Pais;
import formulan.model.Piloto;
import formulan.util.util;
import formulan.util.vars;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class CadPiloto extends javax.swing.JFrame implements CadBasico {

    public CadPiloto() {
        initComponents();
        getContentPane().setBackground(vars.corJanelaPadrao);

        flagEdicao = false;        
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
        pnBotoes = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbPaises = new javax.swing.JComboBox<>();
        edSobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edSigla = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        imgCapacete = new javax.swing.JLabel();
        imgFoto = new javax.swing.JLabel();
        edNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbFalecido = new javax.swing.JComboBox<>();
        edDtNasc = new javax.swing.JFormattedTextField();

        setTitle("Cadastro de Pilotos");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de Pilotos");

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
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbListaDados);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome");

        edNome.setEditable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("País");

        cbPaises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbPaisesMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbPaisesMouseReleased(evt);
            }
        });

        edSobrenome.setEditable(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sigla");

        edSigla.setEditable(false);
        edSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edSiglaActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Observações");

        taObs.setColumns(8);
        taObs.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taObs.setLineWrap(true);
        taObs.setRows(5);
        taObs.setWrapStyleWord(true);
        jScrollPane2.setViewportView(taObs);

        imgCapacete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCapacete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgCapacete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgCapaceteMouseClicked(evt);
            }
        });

        imgFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgFotoMouseClicked(evt);
            }
        });

        edNum.setEditable(false);
        edNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edNumActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("#");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("(a partir de 2014)");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Nascimento");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Falecido?");

        cbFalecido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NÃO", "SIM" }));

        edDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btLimpaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(edDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbFalecido, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel9))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(edNome, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addComponent(cbPaises, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(edSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6)
                                                .addComponent(edNum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7)))
                                        .addComponent(edSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(imgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(imgCapacete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btLimpaBusca))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imgCapacete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(66, 66, 66))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbFalecido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        this.pilotoAtual.setPilotoId(null);
        this.pilotoAtual.setPilotoNome("");
        this.pilotoAtual.setPilotoSobrenome("");
        this.pilotoAtual.setPilotoSigla("");
        this.pilotoAtual.setPaisId(null);
        this.pilotoAtual.setPilotoNum(null);
        this.pilotoAtual.setPilotoFoto(null);
        this.pilotoAtual.setPilotoCapacete(null);
        this.pilotoAtual.setPilotoObs(null);
        this.pilotoAtual.setPilotoDtNasc(null);
        this.pilotoAtual.setPilotoFalecido(FALSE);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        modoEdicao();
        PilotoDAO pilotoDao = new PilotoDAO();
        this.pilotoAtual = (Piloto)pilotoDao.getObjetoById(this.idAtual);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        PilotoDAO pilotoDao = new PilotoDAO();

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            pilotoDao.excluir(idAtual);
            listarTabela("");
        }

        modoNavega();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        PilotoDAO pilotoDao = new PilotoDAO();

        this.pilotoAtual.setPilotoNome(edNome.getText());
        this.pilotoAtual.setPilotoSobrenome(edSobrenome.getText());
        this.pilotoAtual.setPaisId(cbPaises.getItemAt(cbPaises.getSelectedIndex()).getPaisId());
        if (!edNum.getText().equals("")) 
            this.pilotoAtual.setPilotoNum(Integer.parseInt(edNum.getText()));
        else 
            this.pilotoAtual.setPilotoNum(0);
        this.pilotoAtual.setPilotoSigla(edSigla.getText());
        this.pilotoAtual.setPilotoFoto(this.byteFoto);
        this.pilotoAtual.setPilotoCapacete(this.byteCapacete);
        this.pilotoAtual.setPilotoObs(taObs.getText().getBytes());   
        this.pilotoAtual.setPilotoDtNasc(null); //CODIFICAR, TRABALHAR COM DATA
        if (cbFalecido.getSelectedIndex()==1 /*SIM*/)           
            this.pilotoAtual.setPilotoFalecido(TRUE);
        else
            this.pilotoAtual.setPilotoFalecido(FALSE); 
        
        if (this.pilotoAtual.getPilotoId()==null) pilotoDao.inserir(this.pilotoAtual);
        else pilotoDao.editar(this.pilotoAtual);

        listarTabela("");
        modoNavega();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        flagEdicao = false;
        limpar();
        modoNavega();
        setarTabelaItemAtual();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbPaisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPaisesMouseClicked

    }//GEN-LAST:event_cbPaisesMouseClicked

    private void cbPaisesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPaisesMouseReleased

    }//GEN-LAST:event_cbPaisesMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        util.preencherComboPais(cbPaises);
        listarTabela("");        
    }//GEN-LAST:event_formWindowOpened

    private void edSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edSiglaActionPerformed

    private void edNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edNumActionPerformed

    private void imgFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFotoMouseClicked
        if (this.flagEdicao == true) {
            this.byteFoto = util.escolherImagem(this, imgFoto);
        }        
    }//GEN-LAST:event_imgFotoMouseClicked

    private void imgCapaceteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgCapaceteMouseClicked
        if (this.flagEdicao == true) {
            this.byteCapacete = util.escolherImagem(this, imgCapacete);
        }        
    }//GEN-LAST:event_imgCapaceteMouseClicked

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
            java.util.logging.Logger.getLogger(CadPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPiloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPiloto().setVisible(true);
            }
        });
    }

    @Override
    public void limpar() {
        edNome.setText("");
        edSobrenome.setText("");
        cbPaises.setSelectedIndex(-1);
        edNum.setText("");
        edSigla.setText("");
        taObs.setText("");
        imgFoto.setIcon(null);
        imgCapacete.setIcon(null);
        edDtNasc.setText("");
        cbFalecido.setSelectedIndex(1);
    }

    @Override
    public void modoEdicao() {
        tbListaDados.setEnabled(false);
        tbListaDados.setForeground(Color.GRAY);
        tbListaDados.clearSelection();

        edBusca.setEnabled(false); edBusca.setEditable(false);
        edNome.setEditable(true);
        edSobrenome.setEditable(true);
        cbPaises.setEnabled(true);
        edNum.setEditable(true);
        edSigla.setEditable(true);
        taObs.setEditable(true);
        edDtNasc.setEditable(true);
        cbFalecido.setEnabled(true);
        util.lblImagemModoEdicao(imgFoto);
        util.lblImagemModoEdicao(imgCapacete);       
        
        btNovo.setEnabled(false);
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        
        edNome.requestFocus();
        this.flagEdicao = true;
    }

    @Override
    public void modoNavega() {
        tbListaDados.setEnabled(true);
        tbListaDados.setForeground(Color.BLACK);

        edBusca.setEnabled(true); edBusca.setEditable(true);
        edNome.setEditable(false);
        edSobrenome.setEditable(false);
        cbPaises.setEnabled(false);
        edNum.setEditable(false);
        edSigla.setEditable(false);
        taObs.setEditable(false);
        edDtNasc.setEditable(false);
        cbFalecido.setEnabled(false);
        util.lblImagemModoNavega(imgFoto);
        util.lblImagemModoNavega(imgCapacete);
        
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
        PilotoDAO pilotoDao = new PilotoDAO();
        List<Piloto> listaPilotos = (List)pilotoDao.listaBusca(textoBusca);
        
        String[] nomesColunas = {"Id", "Nome", ""};
        List<String[]> listaTemp = new ArrayList<>();
        String tempId = "";
        String tempNome = "";
        String tempSobrenome ="";
        
        if (listaPilotos.size() > 0) {
            for (int i = 0; i <= listaPilotos.size() - 1; i++) {
                tempId = listaPilotos.get(i).getPilotoId().toString();
                tempNome = listaPilotos.get(i).getPilotoNome();
                tempSobrenome = listaPilotos.get(i).getPilotoSobrenome();
                listaTemp.add(new String[]{tempId, tempNome, tempSobrenome});
            }
            
            DefaultTableModel modelo = new DefaultTableModel(
                    listaTemp.toArray(new String[listaTemp.size()][]), nomesColunas);
            tbListaDados.setModel(modelo);
            tbListaDados.setRowSelectionInterval(0, 0);
        }
  
    }

    @Override
    public void mostrarDados(JTable tabela, int itemTabela) {
        Object selecaoId = tabela.getValueAt(itemTabela, 0); //0 = primeira coluna
        idAtual = (Integer.parseInt(String.valueOf(selecaoId)));
        limpar();
        
        PilotoDAO pilotoDao = new PilotoDAO();
        Piloto piloto = (Piloto)pilotoDao.getObjetoById(idAtual);
        
        edNome.setText(piloto.getPilotoNome());
        edSobrenome.setText(piloto.getPilotoSobrenome());
        cbPaises.setSelectedIndex(util.setarComboPais(cbPaises, piloto.getPaisId()));
        edNum.setText(piloto.getPilotoNum().toString());
        edSigla.setText(piloto.getPilotoSigla());
        if (piloto.getPilotoDtNasc()!=null) edDtNasc.setText(util.formatarData(piloto.getPilotoDtNasc()));
        else edDtNasc.setText("");
        if (piloto.getPilotoFalecido()==TRUE) cbFalecido.setSelectedIndex(1);
        else cbFalecido.setSelectedIndex(0);        
        taObs.setText(util.txtByteToString(piloto.getPilotoObs()));        
        this.byteFoto = piloto.getPilotoFoto();
        if (this.byteFoto != null) 
            imgFoto.setIcon(new ImageIcon( util.redimensiona( util.imgByteToImage(this.byteFoto ), imgFoto.getWidth(), imgFoto.getHeight())));            
        util.lblImagemModoNavega(imgFoto);     //Não faz muito sentido, mas precisa pra atualizar
        this.byteCapacete = piloto.getPilotoCapacete();
        if (this.byteCapacete != null) 
            imgCapacete.setIcon(new ImageIcon( util.redimensiona( util.imgByteToImage(piloto.getPilotoCapacete() ), imgCapacete.getWidth(), imgCapacete.getHeight())));                    
        util.lblImagemModoNavega(imgCapacete); //Não faz muito sentido, mas precisa pra atualizar
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
    private javax.swing.JComboBox<String> cbFalecido;
    private javax.swing.JComboBox<Pais> cbPaises;
    private javax.swing.JTextField edBusca;
    private javax.swing.JFormattedTextField edDtNasc;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edNum;
    private javax.swing.JTextField edSigla;
    private javax.swing.JTextField edSobrenome;
    private javax.swing.JLabel imgCapacete;
    private javax.swing.JLabel imgFoto;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTable tbListaDados;
    // End of variables declaration//GEN-END:variables
    protected boolean flagEdicao;
    protected int idAtual;
    protected int itemAtual;
    protected Piloto pilotoAtual = new Piloto();
    protected byte[] byteFoto = null;
    protected byte[] byteCapacete = null;    
}
