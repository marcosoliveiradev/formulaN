package formulan.view;

import formulan.control.ContratoDAO;
import formulan.control.CorridaDAO;
import formulan.control.EquipeAnoDAO;
import formulan.control.EquipeDAO;
import formulan.control.MotorDAO;
import formulan.control.PistaDAO;
import formulan.control.TemporadaDAO;
import formulan.model.Corrida;
import formulan.model.Equipe;
import formulan.model.EquipeAno;
import formulan.model.Temporada;
import formulan.util.util;
import formulan.util.vars;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class TelaTemporada extends javax.swing.JFrame {

    public TelaTemporada() {
        initComponents();
        getContentPane().setBackground(vars.corJanelaPadrao);

        this.setTitle("Temporada Atual");
        this.anoTemporada = 2016;
        
        mostrarTemporada(anoTemporada);
        listarCorridas(anoTemporada);
        listarEquipes(anoTemporada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTemporadaAno = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnAbas = new javax.swing.JTabbedPane();
        pnCorridas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaCorrida = new javax.swing.JTable();
        pnEquipeAno = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbListaEquipes = new javax.swing.JTable();
        lbSponsor = new javax.swing.JLabel();
        lbCarro = new javax.swing.JLabel();
        lbCores = new javax.swing.JLabel();
        lbMotor = new javax.swing.JLabel();
        lbChefe = new javax.swing.JLabel();
        lbProjetista = new javax.swing.JLabel();
        lbObs = new javax.swing.JLabel();
        imgEquipeLogo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btVerEquipe = new javax.swing.JButton();
        lbPiloto1 = new javax.swing.JLabel();
        lbPiloto2 = new javax.swing.JLabel();
        pnEquipeDetalhe = new javax.swing.JPanel();
        imgEquipeLogoDetalhe = new javax.swing.JLabel();
        imgEquipeAnoFoto = new javax.swing.JLabel();
        imgEquipeAnoFoto2 = new javax.swing.JLabel();
        imgPiloto1 = new javax.swing.JLabel();
        imgPiloto2 = new javax.swing.JLabel();
        pnPilotoDetalhe = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbPilotoDetalheNome = new javax.swing.JLabel();
        lbPilotoDetalheSobrenome = new javax.swing.JLabel();
        lbPilotoDetalheNum = new javax.swing.JLabel();
        lbPilotoDetalheIdade = new javax.swing.JLabel();
        lbPilotoDetalheVitorias = new javax.swing.JLabel();
        lbPilotoDetalheDesde = new javax.swing.JLabel();
        lbPilotoDetalheGPs = new javax.swing.JLabel();
        lbPilotoDetalheVitorias1 = new javax.swing.JLabel();
        imgPilotoDetalheFoto = new javax.swing.JLabel();
        imgPilotoDetalheCapacete = new javax.swing.JLabel();
        lbPilotoDetalhePodios = new javax.swing.JLabel();
        lbPontosRegra = new javax.swing.JLabel();
        lbTemporadaObs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbTemporadaAno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTemporadaAno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTemporadaAno.setText("Temporada");

        jLabel2.setText("Regra de Pontuação: ");

        jLabel3.setText("Características:");

        pnAbas.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        pnAbas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pnAbasStateChanged(evt);
            }
        });

        tbListaCorrida.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbListaCorrida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Grande Prêmio", "Pista", "Local"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbListaCorrida.setGridColor(new java.awt.Color(0, 0, 0));
        tbListaCorrida.setRowHeight(20);
        tbListaCorrida.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbListaCorrida.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbListaCorrida.setShowVerticalLines(false);
        tbListaCorrida.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbListaCorrida);

        javax.swing.GroupLayout pnCorridasLayout = new javax.swing.GroupLayout(pnCorridas);
        pnCorridas.setLayout(pnCorridasLayout);
        pnCorridasLayout.setHorizontalGroup(
            pnCorridasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorridasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnCorridasLayout.setVerticalGroup(
            pnCorridasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorridasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnAbas.addTab("Calendário", pnCorridas);

        tbListaEquipes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Equipe", "Motor"
            }
        ));
        tbListaEquipes.setRowHeight(28);
        tbListaEquipes.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbListaEquipes.setShowVerticalLines(false);
        jScrollPane3.setViewportView(tbListaEquipes);

        lbSponsor.setText("Patrocinador:");

        lbCarro.setText("Carro:");

        lbCores.setText("Cores:");

        lbMotor.setText("Motor:");

        lbChefe.setText("Chefe de Equipe:");

        lbProjetista.setText("Projetista:");

        lbObs.setText("Observações:");
        lbObs.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        imgEquipeLogo.setBackground(new java.awt.Color(255, 255, 255));
        imgEquipeLogo.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgEquipeLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgEquipeLogo.setToolTipText("");
        imgEquipeLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgEquipeLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgEquipeLogo.setRequestFocusEnabled(false);
        imgEquipeLogo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imgEquipeLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgEquipeLogoMouseClicked(evt);
            }
        });

        jLabel12.setText("Pilotos:");

        btVerEquipe.setText("Ver>>");
        btVerEquipe.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btVerEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerEquipeActionPerformed(evt);
            }
        });

        lbPiloto1.setText("#33 Emerson Fittipaldi");

        lbPiloto2.setText("#44 Lewis Hamilton");

        javax.swing.GroupLayout pnEquipeAnoLayout = new javax.swing.GroupLayout(pnEquipeAno);
        pnEquipeAno.setLayout(pnEquipeAnoLayout);
        pnEquipeAnoLayout.setHorizontalGroup(
            pnEquipeAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEquipeAnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGroup(pnEquipeAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEquipeAnoLayout.createSequentialGroup()
                        .addGroup(pnEquipeAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEquipeAnoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(imgEquipeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnEquipeAnoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEquipeAnoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnEquipeAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbObs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCarro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMotor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPiloto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPiloto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSponsor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbChefe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProjetista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVerEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnEquipeAnoLayout.setVerticalGroup(
            pnEquipeAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEquipeAnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEquipeAnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(btVerEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnEquipeAnoLayout.createSequentialGroup()
                        .addComponent(imgEquipeLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbMotor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(4, 4, 4)
                        .addComponent(lbPiloto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPiloto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbSponsor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbChefe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbProjetista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pnAbas.addTab("Equipes e Pilotos", pnEquipeAno);

        pnEquipeDetalhe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnEquipeDetalheFocusGained(evt);
            }
        });

        imgEquipeLogoDetalhe.setBackground(new java.awt.Color(255, 255, 255));
        imgEquipeLogoDetalhe.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgEquipeLogoDetalhe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgEquipeLogoDetalhe.setToolTipText("");
        imgEquipeLogoDetalhe.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgEquipeLogoDetalhe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgEquipeLogoDetalhe.setRequestFocusEnabled(false);
        imgEquipeLogoDetalhe.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imgEquipeLogoDetalhe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgEquipeLogoDetalheMouseClicked(evt);
            }
        });

        imgEquipeAnoFoto.setBackground(new java.awt.Color(255, 255, 255));
        imgEquipeAnoFoto.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgEquipeAnoFoto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgEquipeAnoFoto.setToolTipText("");
        imgEquipeAnoFoto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgEquipeAnoFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgEquipeAnoFoto.setRequestFocusEnabled(false);
        imgEquipeAnoFoto.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imgEquipeAnoFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgEquipeAnoFotoMouseClicked(evt);
            }
        });

        imgEquipeAnoFoto2.setBackground(new java.awt.Color(255, 255, 255));
        imgEquipeAnoFoto2.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgEquipeAnoFoto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgEquipeAnoFoto2.setToolTipText("");
        imgEquipeAnoFoto2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgEquipeAnoFoto2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgEquipeAnoFoto2.setRequestFocusEnabled(false);
        imgEquipeAnoFoto2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imgEquipeAnoFoto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgEquipeAnoFoto2MouseClicked(evt);
            }
        });

        imgPiloto1.setBackground(new java.awt.Color(255, 255, 255));
        imgPiloto1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgPiloto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgPiloto1.setToolTipText("");
        imgPiloto1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgPiloto1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgPiloto1.setRequestFocusEnabled(false);
        imgPiloto1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imgPiloto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPiloto1MouseClicked(evt);
            }
        });

        imgPiloto2.setBackground(new java.awt.Color(255, 255, 255));
        imgPiloto2.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        imgPiloto2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        imgPiloto2.setToolTipText("");
        imgPiloto2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgPiloto2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgPiloto2.setRequestFocusEnabled(false);
        imgPiloto2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        imgPiloto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPiloto2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnEquipeDetalheLayout = new javax.swing.GroupLayout(pnEquipeDetalhe);
        pnEquipeDetalhe.setLayout(pnEquipeDetalheLayout);
        pnEquipeDetalheLayout.setHorizontalGroup(
            pnEquipeDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEquipeDetalheLayout.createSequentialGroup()
                .addGroup(pnEquipeDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgEquipeLogoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnEquipeDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imgEquipeAnoFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgEquipeAnoFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnEquipeDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgPiloto1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgPiloto2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, Short.MAX_VALUE))
        );
        pnEquipeDetalheLayout.setVerticalGroup(
            pnEquipeDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEquipeDetalheLayout.createSequentialGroup()
                .addComponent(imgEquipeLogoDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEquipeDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgPiloto1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgEquipeAnoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEquipeDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEquipeDetalheLayout.createSequentialGroup()
                        .addComponent(imgPiloto2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(imgEquipeAnoFoto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnAbas.addTab("Equipe", pnEquipeDetalhe);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ano", "Equipe", "Vitórias", "Colocação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carreira na Fórmula 1");

        lbPilotoDetalheNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPilotoDetalheNome.setText("Lewis");

        lbPilotoDetalheSobrenome.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbPilotoDetalheSobrenome.setText("Hamilton");

        lbPilotoDetalheNum.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbPilotoDetalheNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPilotoDetalheNum.setText("#44");

        lbPilotoDetalheIdade.setText("Idade: 30 anos");

        lbPilotoDetalheVitorias.setText("Vitórias: 40");

        lbPilotoDetalheDesde.setText("Na F1 desde: 2000");

        lbPilotoDetalheGPs.setText("GPs disputados: 100");

        lbPilotoDetalheVitorias1.setText("Títulos: 4");

        imgPilotoDetalheFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPilotoDetalheFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgPilotoDetalheFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPilotoDetalheFotoMouseClicked(evt);
            }
        });

        imgPilotoDetalheCapacete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPilotoDetalheCapacete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgPilotoDetalheCapacete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPilotoDetalheCapaceteMouseClicked(evt);
            }
        });

        lbPilotoDetalhePodios.setText("Pódios: 100");

        javax.swing.GroupLayout pnPilotoDetalheLayout = new javax.swing.GroupLayout(pnPilotoDetalhe);
        pnPilotoDetalhe.setLayout(pnPilotoDetalheLayout);
        pnPilotoDetalheLayout.setHorizontalGroup(
            pnPilotoDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPilotoDetalheLayout.createSequentialGroup()
                .addGroup(pnPilotoDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgPilotoDetalheFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgPilotoDetalheCapacete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPilotoDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPilotoDetalheLayout.createSequentialGroup()
                        .addGroup(pnPilotoDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPilotoDetalheNome)
                            .addComponent(lbPilotoDetalheSobrenome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(lbPilotoDetalheNum))
                    .addGroup(pnPilotoDetalheLayout.createSequentialGroup()
                        .addGroup(pnPilotoDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPilotoDetalheIdade)
                            .addComponent(lbPilotoDetalheVitorias)
                            .addComponent(lbPilotoDetalheDesde)
                            .addComponent(lbPilotoDetalheGPs)
                            .addComponent(lbPilotoDetalheVitorias1)
                            .addComponent(lbPilotoDetalhePodios))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        pnPilotoDetalheLayout.setVerticalGroup(
            pnPilotoDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPilotoDetalheLayout.createSequentialGroup()
                .addGroup(pnPilotoDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgPilotoDetalheFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnPilotoDetalheLayout.createSequentialGroup()
                        .addGroup(pnPilotoDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPilotoDetalheLayout.createSequentialGroup()
                                .addComponent(lbPilotoDetalheNome)
                                .addGap(1, 1, 1)
                                .addComponent(lbPilotoDetalheSobrenome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbPilotoDetalheIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPilotoDetalheDesde)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPilotoDetalheGPs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPilotoDetalheVitorias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPilotoDetalhePodios))
                            .addComponent(lbPilotoDetalheNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPilotoDetalheVitorias1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPilotoDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPilotoDetalheLayout.createSequentialGroup()
                        .addComponent(imgPilotoDetalheCapacete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnAbas.addTab("Piloto", pnPilotoDetalhe);

        lbPontosRegra.setText("vigente desde");

        lbTemporadaObs.setText("Testando testando testando testando testandotestando testandotestando testandotestando testandotestando testando");
        lbTemporadaObs.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbTemporadaAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPontosRegra)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTemporadaObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTemporadaAno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbPontosRegra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbTemporadaObs, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void btVerEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerEquipeActionPerformed
        pnAbas.setSelectedIndex(2);
    }//GEN-LAST:event_btVerEquipeActionPerformed

    private void imgEquipeLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgEquipeLogoMouseClicked

    }//GEN-LAST:event_imgEquipeLogoMouseClicked

    private void imgEquipeLogoDetalheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgEquipeLogoDetalheMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imgEquipeLogoDetalheMouseClicked

    private void imgEquipeAnoFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgEquipeAnoFotoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imgEquipeAnoFotoMouseClicked

    private void imgEquipeAnoFoto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgEquipeAnoFoto2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imgEquipeAnoFoto2MouseClicked

    private void imgPiloto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPiloto1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imgPiloto1MouseClicked

    private void imgPiloto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPiloto2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imgPiloto2MouseClicked

    private void imgPilotoDetalheFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPilotoDetalheFotoMouseClicked
    }//GEN-LAST:event_imgPilotoDetalheFotoMouseClicked

    private void imgPilotoDetalheCapaceteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPilotoDetalheCapaceteMouseClicked
    }//GEN-LAST:event_imgPilotoDetalheCapaceteMouseClicked

    private void pnEquipeDetalheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnEquipeDetalheFocusGained
    }//GEN-LAST:event_pnEquipeDetalheFocusGained

    private void pnAbasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pnAbasStateChanged
        //0-Calendário; 1-Equipes e Pilotos; 2-Equipe; 3-Piloto
        
        if (pnAbas.getSelectedIndex()==2) {
            JOptionPane.showMessageDialog(this, "Mudou pra aba Equipe");            
            if (idAtualEquipe>0) 
                mostrarEquipeAno();
        }
    }//GEN-LAST:event_pnAbasStateChanged

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
            java.util.logging.Logger.getLogger(TelaTemporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTemporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTemporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTemporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTemporada().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVerEquipe;
    private javax.swing.JLabel imgEquipeAnoFoto;
    private javax.swing.JLabel imgEquipeAnoFoto2;
    private javax.swing.JLabel imgEquipeLogo;
    private javax.swing.JLabel imgEquipeLogoDetalhe;
    private javax.swing.JLabel imgPiloto1;
    private javax.swing.JLabel imgPiloto2;
    private javax.swing.JLabel imgPilotoDetalheCapacete;
    private javax.swing.JLabel imgPilotoDetalheFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCarro;
    private javax.swing.JLabel lbChefe;
    private javax.swing.JLabel lbCores;
    private javax.swing.JLabel lbMotor;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbPiloto1;
    private javax.swing.JLabel lbPiloto2;
    private javax.swing.JLabel lbPilotoDetalheDesde;
    private javax.swing.JLabel lbPilotoDetalheGPs;
    private javax.swing.JLabel lbPilotoDetalheIdade;
    private javax.swing.JLabel lbPilotoDetalheNome;
    private javax.swing.JLabel lbPilotoDetalheNum;
    private javax.swing.JLabel lbPilotoDetalhePodios;
    private javax.swing.JLabel lbPilotoDetalheSobrenome;
    private javax.swing.JLabel lbPilotoDetalheVitorias;
    private javax.swing.JLabel lbPilotoDetalheVitorias1;
    private javax.swing.JLabel lbPontosRegra;
    private javax.swing.JLabel lbProjetista;
    private javax.swing.JLabel lbSponsor;
    private javax.swing.JLabel lbTemporadaAno;
    private javax.swing.JLabel lbTemporadaObs;
    private javax.swing.JTabbedPane pnAbas;
    private javax.swing.JPanel pnCorridas;
    private javax.swing.JPanel pnEquipeAno;
    private javax.swing.JPanel pnEquipeDetalhe;
    private javax.swing.JPanel pnPilotoDetalhe;
    private javax.swing.JTable tbListaCorrida;
    private javax.swing.JTable tbListaEquipes;
    // End of variables declaration//GEN-END:variables
    protected int idAtualEquipe;
    protected int itemAtual;
    protected short anoTemporada;

    private void mostrarTemporada(int ano) {
        TemporadaDAO tempDao = new TemporadaDAO();
        Temporada tempTemp = (Temporada) tempDao.getObjetoById(ano);

        lbTemporadaAno.setText("Temporada " + tempTemp.getTempAno());
        lbPontosRegra.setText("vigente desde " + tempTemp.getPontosRegra());
        lbTemporadaObs.setText(util.txtByteToString(tempTemp.getTempObs()));
    }

    private void listarCorridas(int ano) {
        CorridaDAO corridaDao = new CorridaDAO();
        List<Corrida> listaCorridas = (List) corridaDao.listaBusca(String.valueOf(ano));

        String[] nomesColunas = {"Data", "Grande Prêmio", "Pista", "Local"};
        List<String[]> listaTemp = new ArrayList<>();
        String corridaData = "";
        String corridaGP = "";
        String pistaNome = "";
        String pistaCidade = "";

        if (listaCorridas.size() > 0) {
            for (int i = 0; i <= listaCorridas.size() - 1; i++) {
                corridaData = util.formatarData(listaCorridas.get(i).getCorridaData());
                corridaGP = listaCorridas.get(i).getCorridaGP();
                int pistaId = listaCorridas.get(i).getPistaId();

                PistaDAO pistaDao = new PistaDAO();
                pistaNome = pistaDao.getObjetoById(pistaId).getPistaNome();
                pistaCidade = pistaDao.getObjetoById(pistaId).getPistaCidade();

                listaTemp.add(new String[]{corridaData, "GP " + corridaGP, pistaNome, pistaCidade});
            }

            DefaultTableModel modelo = new DefaultTableModel(
                    listaTemp.toArray(new String[listaTemp.size()][]), nomesColunas);
            tbListaCorrida.setModel(modelo);
            tbListaCorrida.setRowSelectionInterval(0, 0);
        }
    }

    private void listarEquipes(int ano) {
        EquipeAnoDAO equipeAnoDao = new EquipeAnoDAO();
        List<EquipeAno> listaEquipesAno = (List) equipeAnoDao.listaBusca(String.valueOf(ano));

        String[] nomesColunas = {"","Equipe", "Motor"};
        List<String[]> listaTemp = new ArrayList<>();
        Integer equipeId = null;
        Integer motorId = null;
        String equipeNome = "";
        String motorNome = "";

        if (listaEquipesAno.size() > 0) {
            for (int i = 0; i <= listaEquipesAno.size() - 1; i++) {
                equipeId = listaEquipesAno.get(i).getEquipeAnoPK().getEquipeId();
                motorId = listaEquipesAno.get(i).getMotorId();

                EquipeDAO equipeDao = new EquipeDAO();
                Equipe equipe = (Equipe) equipeDao.getObjetoById(equipeId);
                equipeNome = equipe.getEquipeNome();
                motorNome = new MotorDAO().getObjetoById(motorId).getMotorNome();

                listaTemp.add(new String[]{equipeId.toString(), equipeNome, motorNome});
            }

            DefaultTableModel modelo = new DefaultTableModel(
                    listaTemp.toArray(new String[listaTemp.size()][]), nomesColunas);
            tbListaEquipes.setModel(modelo);
            tbListaEquipes.setRowSelectionInterval(0, 0);
        }

        setarTabelaItemAtual(tbListaEquipes);
    }

    private void setarTabelaItemAtual(JTable tabela) {
        tabela.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selected = tabela.getSelectedRow();
                if (selected != -1) {
                    itemAtual = selected;
                    mostrarDados(tabela, selected);
                }
            }
        });
    }
    
    private void mostrarDados(JTable tabela, int itemTabela) {        
                //genérica, recebe a tabela pra mostrar        
        if (tabela.equals(tbListaEquipes)) {
            Object selecaoId = tabela.getValueAt(itemTabela, 0); //0 = primeira coluna
            idAtualEquipe = (Integer.parseInt(String.valueOf(selecaoId)));
            limparEquipes();

            EquipeAnoDAO equipeAnoDao = new EquipeAnoDAO();
            EquipeAno equipeAno = (EquipeAno) equipeAnoDao.getObjetoById(idAtualEquipe,Short.parseShort("2016"));          
            
            Equipe equipe = (Equipe)new EquipeDAO().getObjetoById(equipeAno.getEquipeAnoPK().getEquipeId());
            if (equipe.getEquipeLogo()!=null) imgEquipeLogo.setIcon(new ImageIcon( util.redimensiona( util.imgByteToImage(equipe.getEquipeLogo()), imgEquipeLogo.getWidth(), imgEquipeLogo.getHeight())));
            
            lbCarro.setText("Carro: "+equipeAno.getEquipeAnoCarro());
            lbMotor.setText("Motor: "+new MotorDAO().getObjetoById(equipeAno.getMotorId()).getMotorNome() 
                    + " " + equipeAno.getEquipeAnoPotencia());
            lbPiloto1.setText(""); //Puxar da tabela CONTRATO
            lbPiloto2.setText(""); //Puxar da tabela CONTRATO
            lbCores.setText("Cores: "+equipeAno.getEquipeAnoCor1()+" " +equipeAno.getEquipeAnoCor2()+" "+ equipeAno.getEquipeAnoCor3());
            lbSponsor.setText("Patrocinador: "+equipeAno.getEquipeAnoSponsor());
            lbChefe.setText("Chefe de Equipe: "+equipeAno.getEquipeAnoChefe());
            lbProjetista.setText("Projetista: "+equipeAno.getEquipeAnoProjetista());
            lbObs.setText("Obs: "+util.txtByteToString(equipeAno.getEquipeAnoObs()));            
        }
    }
    
    private void limparEquipes () {
        imgEquipeLogo.setIcon(null);
        lbCarro.setText("Carro:");
        lbMotor.setText("Motor:");
        lbPiloto1.setText("");
        lbPiloto2.setText("");
        lbCores.setText("Cores:");
        lbSponsor.setText("Patrocinador:");
        lbChefe.setText("Chefe de Equipe:");
        lbProjetista.setText("Projetista:");
        lbObs.setText("Obs:");
    }    

    private void mostrarEquipeAno() {
        EquipeAnoDAO equipeAnoDao = new EquipeAnoDAO();
        EquipeAno equipeAno = (EquipeAno)equipeAnoDao.getObjetoById(idAtualEquipe, anoTemporada);
        
        if (equipeAno.getEquipeAnoFoto()!=null) {
            imgEquipeAnoFoto.setIcon(new ImageIcon(util.redimensiona(util.imgByteToImage(equipeAno.getEquipeAnoFoto())
                                                                     ,imgEquipeAnoFoto.getWidth(), imgEquipeAnoFoto.getHeight())));            
        }
        if (equipeAno.getEquipeAnoFoto2()!=null) {
            imgEquipeAnoFoto2.setIcon(new ImageIcon( util.redimensiona(util.imgByteToImage(equipeAno.getEquipeAnoFoto2())
                                                                       ,imgEquipeAnoFoto2.getWidth(), imgEquipeAnoFoto2.getHeight())));            
        }
        
        EquipeDAO equipeDao = new EquipeDAO();
        Equipe equipe = (Equipe)equipeDao.getObjetoById(equipeAno.getEquipeAnoPK().getEquipeId());
        imgEquipeLogoDetalhe.setIcon(new ImageIcon( util.redimensiona(util.imgByteToImage(equipe.getEquipeLogo())
                                                    , imgEquipeLogoDetalhe.getWidth(), imgEquipeLogoDetalhe.getHeight())));        
        
        ContratoDAO contratoDao = new ContratoDAO();
        contratoDao.listaBusca(equipeAno.getEquipeAnoPK().getEquipeId(), anoTemporada, null);
    }
}