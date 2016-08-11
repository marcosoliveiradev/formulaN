package formulan.view;

import static com.oracle.jrockit.jfr.ContentType.Bytes;
import formulan.control.Dependencias;
import formulan.model.Motor;
import formulan.control.MotorDAO;
import formulan.model.Pais;
import formulan.control.PaisDAO;
import formulan.util.util;
import formulan.util.vars;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.io.BufferedReader;
import java.sql.Blob;
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

public class CadMotor extends javax.swing.JFrame {

    public CadMotor() {
        initComponents();        
        getContentPane().setBackground(vars.corJanelaPadrao);

        this.flagEdicao = false;        
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
        imgLogo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        jLabel1.setText("Fabricante");

        jLabel2.setText("País");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de Fabricantes de Motor");

        tbListaDados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbListaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Fabricante", "País"
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
                        .addGap(26, 26, 26)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel3.setText("Observações");

        taObs.setColumns(20);
        taObs.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taObs.setLineWrap(true);
        taObs.setRows(5);
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

        jLabel5.setText("Logotipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edNome)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(edBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpaBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        MotorDAO motorDao = new MotorDAO();
        
        this.motorAtual.setMotorNome(edNome.getText());
        this.motorAtual.setPaisId(cbPaises.getItemAt(cbPaises.getSelectedIndex()).getPaisId());                
        this.motorAtual.setMotorObs(taObs.getText().getBytes());
        this.motorAtual.setMotorLogo(this.byteLogo);        
      
        if (this.motorAtual.getMotorId()==null) motorDao.inserir(this.motorAtual);
        else motorDao.editar(this.motorAtual);
        
        listarTabela("");
        modoNavega();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpar();
        ModoEdicao();
        
        motorAtual.setMotorId(null);
        motorAtual.setMotorNome("");
        motorAtual.setMotorLogo(null);
        motorAtual.setMotorObs(null);
        motorAtual.setPaisId(null);
    }//GEN-LAST:event_btNovoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        ModoEdicao();
        MotorDAO motorDao = new MotorDAO();
        this.motorAtual = motorDao.getObjetoById(this.idAtual);        
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        MotorDAO motorDao = new MotorDAO();
        Motor motorTemp = motorDao.getObjetoById(idAtual);
        
        //int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Confirmar", JOptionPane.YES_NO_OPTION);
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?"+Dependencias.verMotor(motorTemp),
                "Confirmar", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            motorDao.excluir(idAtual);
            listarTabela("");
        }
        
        modoNavega();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimpaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaBuscaActionPerformed
        edBusca.setText("");
        listarTabela("");
        modoNavega();
    }//GEN-LAST:event_btLimpaBuscaActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.flagEdicao = false;        
        limpar();
        modoNavega();        
        setarTabelaItemAtual();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void edBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edBuscaMouseClicked
        edBusca.setText("");
    }//GEN-LAST:event_edBuscaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        util.preencherComboPais(cbPaises);
        listarTabela("");        
    }//GEN-LAST:event_formWindowOpened

    private void cbPaisesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPaisesMouseReleased
        //JOptionPane.showMessageDialog(this, String.valueOf(cbPaises.getItemAt(cbPaises.getSelectedIndex()).getPaisId()));
    }//GEN-LAST:event_cbPaisesMouseReleased

    private void cbPaisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbPaisesMouseClicked
        //JOptionPane.showMessageDialog(this, String.valueOf(cbPaises.getItemAt(cbPaises.getSelectedIndex()).getPaisId()));
    }//GEN-LAST:event_cbPaisesMouseClicked

    private void edBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edBuscaKeyTyped
        listarTabela(edBusca.getText());
    }//GEN-LAST:event_edBuscaKeyTyped

    private void edBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edBuscaKeyPressed
    }//GEN-LAST:event_edBuscaKeyPressed

    private void imgLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoMouseClicked
        if (this.flagEdicao == true) 
            this.byteLogo = util.escolherImagem(this, imgLogo);         
    }//GEN-LAST:event_imgLogoMouseClicked


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
            java.util.logging.Logger.getLogger(CadMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadMotor().setVisible(true);
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
    private javax.swing.JTextField edBusca;
    private javax.swing.JTextField edNome;
    private javax.persistence.EntityManager formulaNPUEntityManager;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    protected Motor motorAtual = new Motor();
    protected byte[] byteLogo = null;
    
    private void limpar() {
        edNome.setText("");
        cbPaises.setSelectedIndex(-1);
        taObs.setText("");
        imgLogo.setIcon(null);
    }

    private void ModoEdicao() {
        tbListaDados.setEnabled(false);
        tbListaDados.setForeground(Color.GRAY);
        tbListaDados.clearSelection();

        edNome.setEditable(true);
        cbPaises.setEnabled(true);        
        util.lblImagemModoEdicao(imgLogo);

        edBusca.setEnabled(true);
        tbListaDados.setEnabled(true);
                
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

        edNome.setEditable(false);        
        cbPaises.setEnabled(false);        
        util.lblImagemModoNavega(imgLogo);

        edBusca.setEnabled(true);
        tbListaDados.setEnabled(true);
        
        btNovo.setEnabled(true);
        btEditar.setEnabled(true);
        btExcluir.setEnabled(true);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);

        tbListaDados.requestFocus();
        flagEdicao = false;
    }    

    private void listarTabela(String textoBusca) {
        MotorDAO motorDao = new MotorDAO();
        List<Motor> listaMotores;   
        listaMotores = (List)motorDao.listaBusca(textoBusca);
        
        String[] nomesColunas = {"Id", "Fabricante"};
        List<String[]> listaTemp = new ArrayList<>();
        String tempId = "";
        String tempNome = "";
        
        if (listaMotores.size() > 0) { //evita tabela vazia
            for (int i = 0; i <= listaMotores.size() - 1; i++) {
                tempId = listaMotores.get(i).getMotorId().toString();
                tempNome = listaMotores.get(i).getMotorNome();
                listaTemp.add(new String[]{tempId, tempNome});
            }
        }
  
        DefaultTableModel modelo = new DefaultTableModel(
                listaTemp.toArray(new String[listaTemp.size()][]), nomesColunas);
        tbListaDados.setModel(modelo);
        tbListaDados.setRowSelectionInterval(0,0);                
    }    
        
    private void mostrarDados(JTable tabela, int itemTabela) {
        Object selecaoId = tabela.getValueAt(itemTabela, 0); //0 = primeira coluna
        idAtual = (Integer.parseInt(String.valueOf(selecaoId)));

        limpar();
        
        MotorDAO motorDao = new MotorDAO();
        Motor motor = motorDao.getObjetoById(this.idAtual);
        
        edNome.setText(motor.getMotorNome());
        cbPaises.setSelectedIndex(util.setarComboPais(cbPaises, motor.getPaisId()));
        taObs.setText(util.txtByteToString(motor.getMotorObs()));
        this.byteLogo = motor.getMotorLogo();
        if (this.byteLogo != null)
            imgLogo.setIcon(new ImageIcon( util.redimensiona( util.imgByteToImage(this.byteLogo), imgLogo.getWidth(), imgLogo.getHeight() )  ));

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