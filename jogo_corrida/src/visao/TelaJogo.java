package visao;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import conceito.Jogo;

/**
 *
 * @author Evandro
 */
public class TelaJogo extends javax.swing.JFrame implements IVisaoJogo {

    private javax.swing.JLabel listaCasas[];
    private Jogo jogo;

    public TelaJogo() {
        initComponents();
        this.iniciaListaLabels();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visaoDado = new javax.swing.JLabel();
        labelCasa1 = new javax.swing.JLabel();
        labelCasa2 = new javax.swing.JLabel();
        labelCasa3 = new javax.swing.JLabel();
        labelCasa4 = new javax.swing.JLabel();
        labelCasa5 = new javax.swing.JLabel();
        labelCasa6 = new javax.swing.JLabel();
        labelCasa7 = new javax.swing.JLabel();
        labelCasa8 = new javax.swing.JLabel();
        labelCasa9 = new javax.swing.JLabel();
        labelCasa10 = new javax.swing.JLabel();
        labelCasa11 = new javax.swing.JLabel();
        labelCasa12 = new javax.swing.JLabel();
        labelCasa13 = new javax.swing.JLabel();
        labelCasa14 = new javax.swing.JLabel();
        labelCasa15 = new javax.swing.JLabel();
        labelCasa16 = new javax.swing.JLabel();
        labelCasa17 = new javax.swing.JLabel();
        labelCasa18 = new javax.swing.JLabel();
        labelCasa19 = new javax.swing.JLabel();
        labelCasa20 = new javax.swing.JLabel();
        labelCasa21 = new javax.swing.JLabel();
        labelCasa22 = new javax.swing.JLabel();
        labelCasa23 = new javax.swing.JLabel();
        labelCasa24 = new javax.swing.JLabel();
        labelCasa25 = new javax.swing.JLabel();
        labelCasa26 = new javax.swing.JLabel();
        labelCasa27 = new javax.swing.JLabel();
        labelCasa28 = new javax.swing.JLabel();
        labelCasa29 = new javax.swing.JLabel();
        labelCasa30 = new javax.swing.JLabel();
        labelCasa31 = new javax.swing.JLabel();
        labelCasa32 = new javax.swing.JLabel();
        nomeJogador1 = new javax.swing.JLabel();
        nomeJogador2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quemJoga = new javax.swing.JLabel();
        nomeVencedor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuJogo = new javax.swing.JMenu();
        itemMenuNovoJogo = new javax.swing.JMenuItem();
        itemMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Corriga (Ludo)");
        getContentPane().setLayout(null);

        visaoDado.setBackground(new java.awt.Color(112, 154, 217));
        visaoDado.setOpaque(true);
        visaoDado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visaoDadoMouseClicked(evt);
            }
        });
        getContentPane().add(visaoDado);
        visaoDado.setBounds(840, 90, 100, 100);

        labelCasa1.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa1.setOpaque(true);
        getContentPane().add(labelCasa1);
        labelCasa1.setBounds(110, 340, 90, 40);

        labelCasa2.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa2.setOpaque(true);
        getContentPane().add(labelCasa2);
        labelCasa2.setBounds(110, 290, 90, 40);

        labelCasa3.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa3.setOpaque(true);
        getContentPane().add(labelCasa3);
        labelCasa3.setBounds(110, 240, 90, 40);

        labelCasa4.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa4.setOpaque(true);
        getContentPane().add(labelCasa4);
        labelCasa4.setBounds(110, 190, 90, 40);

        labelCasa5.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa5.setOpaque(true);
        getContentPane().add(labelCasa5);
        labelCasa5.setBounds(110, 140, 90, 40);

        labelCasa6.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa6.setOpaque(true);
        getContentPane().add(labelCasa6);
        labelCasa6.setBounds(110, 90, 90, 40);

        labelCasa7.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa7.setOpaque(true);
        getContentPane().add(labelCasa7);
        labelCasa7.setBounds(110, 40, 90, 40);

        labelCasa8.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa8.setOpaque(true);
        getContentPane().add(labelCasa8);
        labelCasa8.setBounds(210, 40, 90, 40);

        labelCasa9.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa9.setOpaque(true);
        getContentPane().add(labelCasa9);
        labelCasa9.setBounds(310, 40, 90, 40);

        labelCasa10.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa10.setOpaque(true);
        getContentPane().add(labelCasa10);
        labelCasa10.setBounds(310, 90, 90, 40);

        labelCasa11.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa11.setOpaque(true);
        getContentPane().add(labelCasa11);
        labelCasa11.setBounds(310, 140, 90, 40);

        labelCasa12.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa12.setOpaque(true);
        getContentPane().add(labelCasa12);
        labelCasa12.setBounds(310, 190, 90, 40);

        labelCasa13.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa13.setOpaque(true);
        getContentPane().add(labelCasa13);
        labelCasa13.setBounds(310, 240, 90, 40);

        labelCasa14.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa14.setOpaque(true);
        getContentPane().add(labelCasa14);
        labelCasa14.setBounds(310, 290, 90, 40);

        labelCasa15.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa15.setOpaque(true);
        getContentPane().add(labelCasa15);
        labelCasa15.setBounds(310, 340, 90, 40);

        labelCasa16.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa16.setOpaque(true);
        getContentPane().add(labelCasa16);
        labelCasa16.setBounds(410, 340, 90, 40);

        labelCasa17.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa17.setOpaque(true);
        getContentPane().add(labelCasa17);
        labelCasa17.setBounds(510, 340, 90, 40);

        labelCasa18.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa18.setOpaque(true);
        getContentPane().add(labelCasa18);
        labelCasa18.setBounds(510, 290, 90, 40);

        labelCasa19.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa19.setOpaque(true);
        getContentPane().add(labelCasa19);
        labelCasa19.setBounds(510, 240, 90, 40);

        labelCasa20.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa20.setOpaque(true);
        getContentPane().add(labelCasa20);
        labelCasa20.setBounds(510, 190, 90, 40);

        labelCasa21.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa21.setOpaque(true);
        getContentPane().add(labelCasa21);
        labelCasa21.setBounds(510, 140, 90, 40);

        labelCasa22.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa22.setOpaque(true);
        getContentPane().add(labelCasa22);
        labelCasa22.setBounds(510, 90, 90, 40);

        labelCasa23.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa23.setOpaque(true);
        getContentPane().add(labelCasa23);
        labelCasa23.setBounds(510, 40, 90, 40);

        labelCasa24.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa24.setOpaque(true);
        getContentPane().add(labelCasa24);
        labelCasa24.setBounds(610, 40, 90, 40);

        labelCasa25.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa25.setOpaque(true);
        getContentPane().add(labelCasa25);
        labelCasa25.setBounds(710, 40, 90, 40);

        labelCasa26.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa26.setOpaque(true);
        getContentPane().add(labelCasa26);
        labelCasa26.setBounds(710, 90, 90, 40);

        labelCasa27.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa27.setOpaque(true);
        getContentPane().add(labelCasa27);
        labelCasa27.setBounds(710, 140, 90, 40);

        labelCasa28.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa28.setOpaque(true);
        getContentPane().add(labelCasa28);
        labelCasa28.setBounds(710, 190, 90, 40);

        labelCasa29.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa29.setOpaque(true);
        getContentPane().add(labelCasa29);
        labelCasa29.setBounds(710, 240, 90, 40);

        labelCasa30.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa30.setOpaque(true);
        getContentPane().add(labelCasa30);
        labelCasa30.setBounds(710, 290, 90, 40);

        labelCasa31.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa31.setOpaque(true);
        getContentPane().add(labelCasa31);
        labelCasa31.setBounds(810, 290, 90, 40);

        labelCasa32.setBackground(new java.awt.Color(112, 154, 217));
        labelCasa32.setOpaque(true);
        getContentPane().add(labelCasa32);
        labelCasa32.setBounds(910, 290, 90, 40);

        nomeJogador1.setBackground(new java.awt.Color(255, 255, 255));
        nomeJogador1.setForeground(new java.awt.Color(153, 51, 0));
        nomeJogador1.setOpaque(true);
        getContentPane().add(nomeJogador1);
        nomeJogador1.setBounds(230, 410, 140, 20);

        nomeJogador2.setBackground(new java.awt.Color(255, 255, 255));
        nomeJogador2.setForeground(new java.awt.Color(153, 51, 0));
        nomeJogador2.setOpaque(true);
        getContentPane().add(nomeJogador2);
        nomeJogador2.setBounds(230, 440, 140, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome Jogador2");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 440, 110, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nome Jogador1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 410, 120, 20);

        quemJoga.setBackground(new java.awt.Color(255, 255, 255));
        quemJoga.setForeground(new java.awt.Color(153, 51, 0));
        quemJoga.setOpaque(true);
        getContentPane().add(quemJoga);
        quemJoga.setBounds(490, 410, 140, 20);

        nomeVencedor.setBackground(new java.awt.Color(255, 255, 255));
        nomeVencedor.setForeground(new java.awt.Color(153, 51, 0));
        nomeVencedor.setOpaque(true);
        getContentPane().add(nomeVencedor);
        nomeVencedor.setBounds(490, 440, 140, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Vencedor");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 440, 60, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Quem Joga");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 410, 70, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Penaliza>>");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 50, 90, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Passa>>");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(630, 200, 80, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Passa>>");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(430, 300, 80, 20);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 17, 17));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Click no Dado");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(830, 60, 120, 18);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Passa>>");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 50, 80, 20);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Penaliza>>");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(620, 300, 90, 20);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Passa>>");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(230, 150, 80, 20);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Passa>>");
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 200, 80, 20);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Penaliza>>");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(420, 150, 90, 20);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Passa>>");
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(230, 350, 80, 20);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Penaliza>>");
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(220, 250, 90, 20);

        menuJogo.setText("Jogo");

        itemMenuNovoJogo.setText("Novo Jogo");
        itemMenuNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuNovoJogoActionPerformed(evt);
            }
        });
        menuJogo.add(itemMenuNovoJogo);

        itemMenuSair.setText("Sair");
        itemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSairActionPerformed(evt);
            }
        });
        menuJogo.add(itemMenuSair);

        jMenuBar1.add(menuJogo);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1021, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuNovoJogoActionPerformed
        this.jogo.novoJogo();
        this.atualizaTela();
    }//GEN-LAST:event_itemMenuNovoJogoActionPerformed

    private void visaoDadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visaoDadoMouseClicked
        if (this.jogo != null) {
            this.jogo.jogar();
        }
    }//GEN-LAST:event_visaoDadoMouseClicked

    private void itemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemMenuSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuNovoJogo;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelCasa1;
    private javax.swing.JLabel labelCasa10;
    private javax.swing.JLabel labelCasa11;
    private javax.swing.JLabel labelCasa12;
    private javax.swing.JLabel labelCasa13;
    private javax.swing.JLabel labelCasa14;
    private javax.swing.JLabel labelCasa15;
    private javax.swing.JLabel labelCasa16;
    private javax.swing.JLabel labelCasa17;
    private javax.swing.JLabel labelCasa18;
    private javax.swing.JLabel labelCasa19;
    private javax.swing.JLabel labelCasa2;
    private javax.swing.JLabel labelCasa20;
    private javax.swing.JLabel labelCasa21;
    private javax.swing.JLabel labelCasa22;
    private javax.swing.JLabel labelCasa23;
    private javax.swing.JLabel labelCasa24;
    private javax.swing.JLabel labelCasa25;
    private javax.swing.JLabel labelCasa26;
    private javax.swing.JLabel labelCasa27;
    private javax.swing.JLabel labelCasa28;
    private javax.swing.JLabel labelCasa29;
    private javax.swing.JLabel labelCasa3;
    private javax.swing.JLabel labelCasa30;
    private javax.swing.JLabel labelCasa31;
    private javax.swing.JLabel labelCasa32;
    private javax.swing.JLabel labelCasa4;
    private javax.swing.JLabel labelCasa5;
    private javax.swing.JLabel labelCasa6;
    private javax.swing.JLabel labelCasa7;
    private javax.swing.JLabel labelCasa8;
    private javax.swing.JLabel labelCasa9;
    private javax.swing.JMenu menuJogo;
    private javax.swing.JLabel nomeJogador1;
    private javax.swing.JLabel nomeJogador2;
    private javax.swing.JLabel nomeVencedor;
    private javax.swing.JLabel quemJoga;
    private javax.swing.JLabel visaoDado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    private void iniciaListaLabels() {
        this.listaCasas = new javax.swing.JLabel[32];
        this.listaCasas[0] = this.labelCasa1;
        this.listaCasas[1] = this.labelCasa2;
        this.listaCasas[2] = this.labelCasa3;
        this.listaCasas[3] = this.labelCasa4;
        this.listaCasas[4] = this.labelCasa5;
        this.listaCasas[5] = this.labelCasa6;
        this.listaCasas[6] = this.labelCasa7;
        this.listaCasas[7] = this.labelCasa8;
        this.listaCasas[8] = this.labelCasa9;
        this.listaCasas[9] = this.labelCasa10;
        this.listaCasas[10] = this.labelCasa11;
        this.listaCasas[11] = this.labelCasa12;
        this.listaCasas[12] = this.labelCasa13;
        this.listaCasas[13] = this.labelCasa14;
        this.listaCasas[14] = this.labelCasa15;
        this.listaCasas[15] = this.labelCasa16;
        this.listaCasas[16] = this.labelCasa17;
        this.listaCasas[17] = this.labelCasa18;
        this.listaCasas[18] = this.labelCasa19;
        this.listaCasas[19] = this.labelCasa20;
        this.listaCasas[20] = this.labelCasa21;
        this.listaCasas[21] = this.labelCasa22;
        this.listaCasas[22] = this.labelCasa23;
        this.listaCasas[23] = this.labelCasa24;
        this.listaCasas[24] = this.labelCasa25;
        this.listaCasas[25] = this.labelCasa26;
        this.listaCasas[26] = this.labelCasa27;
        this.listaCasas[27] = this.labelCasa28;
        this.listaCasas[28] = this.labelCasa29;
        this.listaCasas[29] = this.labelCasa30;
        this.listaCasas[30] = this.labelCasa31;
        this.listaCasas[31] = this.labelCasa32;
    }

    @Override
    public void atualizaTela() {
        this.setNomeJogador1(this.jogo.getNomeJogador1());
        this.setNomeJogador2(this.jogo.getNomeJogador2());
        this.setQuemJoga(this.jogo.getNomeQuemJoga());
        if (this.jogo.getNomeVencedor() != null) {
            this.setNomeVencedor(this.jogo.getNomeVencedor());
        }
        int numPeoes;
        for (int x = 1; x <= 32; x++) {
            numPeoes = this.jogo.getPeoesCasa(x);
            if (numPeoes > 0) {
                this.listaCasas[x - 1].setIcon(new ImageIcon("./imagens/peao" + numPeoes + ".GIF"));
            } else {
                this.listaCasas[x - 1].setIcon(null);
            }
        }
        this.visaoDado.setIcon(new ImageIcon("./imagens/face" + this.jogo.getFaceSorteada() + ".GIF"));
    }

    @Override
    public void setNomeJogador1(String nome) {
        if (nome != null && nome.length() > 0) {
            this.nomeJogador1.setText(nome);
        } else {
            JOptionPane.showMessageDialog(null, "Nome do jagador1 inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void setNomeJogador2(String nome) {
        if (nome != null && nome.length() > 0) {
            this.nomeJogador2.setText(nome);
        } else {
            JOptionPane.showMessageDialog(null, "Nome do jagador2 inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void setQuemJoga(String nome) {
        if (nome != null && nome.length() > 0) {
            this.quemJoga.setText(nome);
        } else {
            JOptionPane.showMessageDialog(null, "Nome do jagador que deve larçar o dado é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void setNomeVencedor(String nome) {
        if (nome != null && nome.length() > 0) {
            this.nomeVencedor.setText(nome);
        } else {
            JOptionPane.showMessageDialog(null, "Nome do jagador vencedor é inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void mensagem(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    @Override
    public String lerNomeJogador1() {
        return JOptionPane.showInputDialog("Forneça o nome do Jogador1");
    }

    @Override
    public String lerNomeJogador2() {
        return JOptionPane.showInputDialog("Forneça o nome do Jogador2");
    }
}
