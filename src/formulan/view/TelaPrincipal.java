package formulan.view;

import formulan.util.Fundo;
import formulan.util.util;
import javax.swing.JFrame;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        setContentPane(new Fundo()); 
        initComponents();
//        getContentPane().setBackground(vars.corFundoPrograma);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastros = new javax.swing.JMenu();
        miPais = new javax.swing.JMenuItem();
        miMotor = new javax.swing.JMenuItem();
        miPista = new javax.swing.JMenuItem();
        miPiloto = new javax.swing.JMenuItem();
        miEquipe = new javax.swing.JMenuItem();
        miPontos = new javax.swing.JMenuItem();
        mnTemporadas = new javax.swing.JMenu();
        miTemporadaAtual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fórmula N");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        mnCadastros.setText("Cadastros");

        miPais.setText("País");
        miPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPaisActionPerformed(evt);
            }
        });
        mnCadastros.add(miPais);

        miMotor.setText("Motor");
        miMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMotorActionPerformed(evt);
            }
        });
        mnCadastros.add(miMotor);

        miPista.setText("Pista");
        miPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPistaActionPerformed(evt);
            }
        });
        mnCadastros.add(miPista);

        miPiloto.setText("Piloto");
        miPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPilotoActionPerformed(evt);
            }
        });
        mnCadastros.add(miPiloto);

        miEquipe.setText("Equipe");
        miEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEquipeActionPerformed(evt);
            }
        });
        mnCadastros.add(miEquipe);

        miPontos.setText("Regras de Pontos");
        miPontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPontosActionPerformed(evt);
            }
        });
        mnCadastros.add(miPontos);

        jMenuBar1.add(mnCadastros);

        mnTemporadas.setText("Temporadas");

        miTemporadaAtual.setText("Temporada Atual");
        miTemporadaAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTemporadaAtualActionPerformed(evt);
            }
        });
        mnTemporadas.add(miTemporadaAtual);

        jMenuBar1.add(mnTemporadas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void miPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPaisActionPerformed
        util.mostrarFrame(new CadPais());
    }//GEN-LAST:event_miPaisActionPerformed

    private void miMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMotorActionPerformed
        util.mostrarFrame(new CadMotor());
    }//GEN-LAST:event_miMotorActionPerformed

    private void miPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPistaActionPerformed
        util.mostrarFrame(new CadPista());
    }//GEN-LAST:event_miPistaActionPerformed

    private void miPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPilotoActionPerformed
        util.mostrarFrame(new CadPiloto());
    }//GEN-LAST:event_miPilotoActionPerformed

    private void miEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEquipeActionPerformed
        util.mostrarFrame(new CadEquipe());
    }//GEN-LAST:event_miEquipeActionPerformed

    private void miPontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPontosActionPerformed
        util.mostrarFrame(new CadPontos());        
    }//GEN-LAST:event_miPontosActionPerformed

    private void miTemporadaAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTemporadaAtualActionPerformed
        util.mostrarFrame(new TelaTemporada());
    }//GEN-LAST:event_miTemporadaAtualActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });

    }        

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miEquipe;
    private javax.swing.JMenuItem miMotor;
    private javax.swing.JMenuItem miPais;
    private javax.swing.JMenuItem miPiloto;
    private javax.swing.JMenuItem miPista;
    private javax.swing.JMenuItem miPontos;
    private javax.swing.JMenuItem miTemporadaAtual;
    private javax.swing.JMenu mnCadastros;
    private javax.swing.JMenu mnTemporadas;
    // End of variables declaration//GEN-END:variables


}
