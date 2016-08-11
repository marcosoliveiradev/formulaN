package formulan.view;

import formulan.control.Dependencias;
import formulan.model.Pais;
import formulan.control.PaisDAO;
import formulan.util.util;
import formulan.util.vars;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class CadPais extends javax.swing.JFrame {

    public CadPais() {
        initComponents();
        getContentPane().setBackground(vars.corJanelaPadrao);

        this.flagEdicao = false;        
        modoNavega();
        
        //Habilitar método pra pegar seleção de linha na tabela
        tbListaDados.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selected = tbListaDados.getSelectedRow();
                if (selected != -1) {
                    CadPais.this.itemAtual = selected;
                    mostrarDados(tbListaDados, selected);
                }
            }
        });

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
        edSigla = new javax.swing.JTextField();
        lbBandeiraMini = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbBandeiraGrande = new javax.swing.JLabel();
        imgMini = new javax.swing.JLabel();
        imgGrande = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaDados = new javax.swing.JTable();
        edBusca = new javax.swing.JTextField();
        btNovo1 = new javax.swing.JButton();
        pnBotoes = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

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

        setTitle("Cadastro de País");
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

        jLabel1.setText("País");

        jLabel2.setText("Sigla");

        edSigla.setEditable(false);

        lbBandeiraMini.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbBandeiraMini.setText("Bandeira Mini");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de Países");

        lbBandeiraGrande.setText("Bandeira");

        imgMini.setBackground(new java.awt.Color(255, 255, 255));
        imgMini.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgMini.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgMini.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMiniMouseClicked(evt);
            }
        });

        imgGrande.setBackground(new java.awt.Color(255, 255, 255));
        imgGrande.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgGrande.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgGrande.setToolTipText("");
        imgGrande.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgGrande.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgGrande.setRequestFocusEnabled(false);
        imgGrande.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imgGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGrandeMouseClicked(evt);
            }
        });

        tbListaDados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbListaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Sigla", "País"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edBuscaKeyTyped(evt);
            }
        });

        btNovo1.setText("Novo");
        btNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovo1ActionPerformed(evt);
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
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(imgGrande, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lbBandeiraGrande)
                            .addComponent(edNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(edSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(imgMini, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbBandeiraMini))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBandeiraMini)
                            .addComponent(lbBandeiraGrande))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgMini, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))
                            .addComponent(imgGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNovo1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        PaisDAO paisDAO = new PaisDAO();
        
        this.paisAtual.setPaisNome(edNome.getText());
        this.paisAtual.setPaisSigla(edSigla.getText());
        this.paisAtual.setPaisBandeiraMini(this.byteMini);
        this.paisAtual.setPaisBandeiraMaior(this.byteGrande);
        
        if (this.paisAtual.getPaisId()==null) paisDAO.inserir(this.paisAtual);
        else paisDAO.editar(this.paisAtual);
        
        listarTabela("");
        modoNavega();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpar();
        modoEdicao();
        
        this.paisAtual.setPaisId(null);
        this.paisAtual.setPaisNome("");
        this.paisAtual.setPaisSigla("");
        this.paisAtual.setPaisBandeiraMini(null);
        this.paisAtual.setPaisBandeiraMaior(null);        
    }//GEN-LAST:event_btNovoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //ListarTabela();
    }//GEN-LAST:event_formWindowActivated

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        modoEdicao();
        PaisDAO paisDao = new PaisDAO();
        this.paisAtual = paisDao.getObjetoById(this.idAtual);                        
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        PaisDAO paisDao = new PaisDAO();
        Pais paisTemp = paisDao.getObjetoById(idAtual);
        
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?"+Dependencias.verPais(paisTemp),
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            paisDao.excluir(idAtual);
            listarTabela("");
        }
        
        modoNavega();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovo1ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        modoNavega();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void edBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBuscaMouseClicked
        edBusca.setText("");
    }//GEN-LAST:event_edBuscaMouseClicked

    private void imgGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGrandeMouseClicked
        if (this.flagEdicao == true) {            
            this.byteGrande = util.escolherImagem(this, imgGrande);      
        }        
    }//GEN-LAST:event_imgGrandeMouseClicked

    private void imgMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMiniMouseClicked
        if (this.flagEdicao == true) {
            this.byteMini = util.escolherImagem(this, imgMini);  
        }        
    }//GEN-LAST:event_imgMiniMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listarTabela("");
    }//GEN-LAST:event_formWindowOpened

    private void edBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edBuscaKeyTyped
        listarTabela(edBusca.getText());
    }//GEN-LAST:event_edBuscaKeyTyped

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
            java.util.logging.Logger.getLogger(CadPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadPais().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btNovo1;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField edBusca;
    private javax.swing.JTextField edNome;
    private javax.swing.JTextField edSigla;
    private javax.persistence.EntityManager formulaNPUEntityManager;
    private javax.swing.JLabel imgGrande;
    private javax.swing.JLabel imgMini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbBandeiraGrande;
    private javax.swing.JLabel lbBandeiraMini;
    private java.util.List<formulan.model.Pais> paisList;
    private javax.persistence.Query paisQuery;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JTable tbListaDados;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFileChooser fcBandeira;
    protected boolean flagEdicao;
    protected int idAtual;
    protected int itemAtual;
    protected Pais paisAtual = new Pais();
    protected byte[] byteMini = null;
    protected byte[] byteGrande = null;
    
    private void limpar() {
        edNome.setText("");
        edSigla.setText("");
        imgMini.setIcon(null);
        imgGrande.setIcon(null);
    }

    private void modoEdicao() {
        edNome.setEditable(true);
        edSigla.setEditable(true);
        util.lblImagemModoEdicao(imgMini);
        util.lblImagemModoEdicao(imgGrande);        
        edBusca.setEnabled(false);
        tbListaDados.setEnabled(false);
                
        btNovo.setEnabled(false);
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        
        edNome.requestFocus();
        this.flagEdicao = true;
    }

    private void modoNavega() {
        edNome.setEditable(false);
        edSigla.setEditable(false);
        util.lblImagemModoNavega(imgMini);
        util.lblImagemModoNavega(imgGrande);
        
        edBusca.setEnabled(true);
        tbListaDados.setEnabled(true);
        
        btNovo.setEnabled(true);
        btEditar.setEnabled(true);
        btExcluir.setEnabled(true);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);

        //listarTabela();
        tbListaDados.requestFocus();
        this.flagEdicao = false;
    }    
    
    public void listarTabela(String textoBusca) {
        PaisDAO paisDAO = new PaisDAO();
        List<Pais> listaPaises;   
        listaPaises = (List)paisDAO.listaBusca(textoBusca);
        
        String[] nomesColunas = {"Id", "Sigla", "Pais"};
        List<String[]> listaTemp = new ArrayList<>();
        String tempId = "";
        String tempSigla = "";
        String tempPais = "";
        
  
        if (listaPaises.size() > 0) { //evita tabela vazia
            for (int i = 0; i <= listaPaises.size() - 1; i++) {
                tempId = listaPaises.get(i).getPaisId().toString();
                tempSigla = listaPaises.get(i).getPaisSigla();
                tempPais = listaPaises.get(i).getPaisNome();
                listaTemp.add(new String[]{tempId, tempSigla, tempPais});
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
        
        PaisDAO paisDao = new PaisDAO();
        Pais pais = paisDao.getObjetoById(this.idAtual);
        
        edNome.setText(pais.getPaisNome());
        edSigla.setText(pais.getPaisSigla());
        this.byteMini = pais.getPaisBandeiraMini();
        if (this.byteMini != null)
            imgMini.setIcon(new ImageIcon( util.redimensiona( util.imgByteToImage(this.byteMini), imgMini.getWidth(), imgMini.getHeight())  ));
        this.byteGrande = pais.getPaisBandeiraMaior();
        if (this.byteGrande != null)
            imgGrande.setIcon(new ImageIcon( util.redimensiona( util.imgByteToImage(this.byteGrande), imgGrande.getWidth(), imgGrande.getHeight() )  ));
    }

}