/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import basicas.Locacao;
import basicas.Locacao;
import dao.DAOLocacao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eliomar.campos
 */
public class InternalLocacao extends javax.swing.JInternalFrame {

    private ArrayList<Locacao> listaLocacoes; 
    private DAOLocacao dao;
    private String ordena;

    public InternalLocacao() {
        initComponents();
        dao = new DAOLocacao();
        ordena = "locac_id";
        rbCodigo.setSelected(true); 
        listaLocacoes = dao.getAllLocacoes(ordena);
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bNovo = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        cbFiltrar = new javax.swing.JComboBox<>();
        tfFiltrar = new javax.swing.JTextField();
        bFiltrar = new javax.swing.JButton();
        rbDataEntrega = new javax.swing.JRadioButton();
        rbCodigo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Locações");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Locação"));

        bNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/new2_32.png"))); // NOI18N
        bNovo.setBorder(null);
        bNovo.setContentAreaFilled(false);
        bNovo.setFocusPainted(false);
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/folder_32.png"))); // NOI18N
        bEditar.setBorder(null);
        bEditar.setContentAreaFilled(false);
        bEditar.setFocusPainted(false);
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/delete_32.png"))); // NOI18N
        bExcluir.setBorder(null);
        bExcluir.setContentAreaFilled(false);
        bExcluir.setFocusPainted(false);
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        cbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Data Entrega" }));
        cbFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltrarActionPerformed(evt);
            }
        });

        bFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/filter_32.png"))); // NOI18N
        bFiltrar.setBorder(null);
        bFiltrar.setContentAreaFilled(false);
        bFiltrar.setFocusPainted(false);
        bFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiltrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDataEntrega);
        rbDataEntrega.setText("Por Data Entrega");
        rbDataEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDataEntregaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCodigo);
        rbCodigo.setText("Por Código");
        rbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExcluir)
                .addGap(18, 18, 18)
                .addComponent(cbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFiltrar)
                .addGap(156, 156, 156)
                .addComponent(rbCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbDataEntrega)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bExcluir)
            .addComponent(bEditar)
            .addComponent(bNovo)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bFiltrar)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbDataEntrega)
                .addComponent(rbCodigo))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data de Entrega", "Data de Devolução", "Status", "Cód. Veículo", "Placa Veículo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int qtdCliques = evt.getClickCount();
        if (qtdCliques >= 2) {
            new DialogLocacao(this, false).setVisible(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered

    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

    }//GEN-LAST:event_jTable1MouseReleased

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (opcao == 0) { //0 é sim, 1 é não e 2 é cancelar
            int linhaSelecionada = jTable1.getSelectedRow();
            Locacao vei = listaLocacoes.get(linhaSelecionada);
            boolean excluiu = dao.deletarLocacao(vei);
            if (excluiu) {
                listaLocacoes = dao.getAllLocacoes(ordena);
                preencherTabela();
                JOptionPane.showMessageDialog(this, "Excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Algo de errado não está certo!");
            }
        }

    }//GEN-LAST:event_bExcluirActionPerformed

    private void bFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiltrarActionPerformed
        String coluna = cbFiltrar.getSelectedItem().toString();
        switch (coluna) {
            case "Código":
                coluna = "locac_id";
                break;
            case "Data de Entrega":
                coluna = "locac_dataentrega";
                break;
        }

        String valor = tfFiltrar.getText();

        listaLocacoes = dao.filtrarLocacaos(coluna, valor, ordena);
        preencherTabela();
    }//GEN-LAST:event_bFiltrarActionPerformed

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        new DialogLocacao(this, true).setVisible(true);
    }//GEN-LAST:event_bNovoActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        new DialogLocacao(this, false).setVisible(true);
    }//GEN-LAST:event_bEditarActionPerformed

    private void rbDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDataEntregaActionPerformed
        ordena = "locac_dataentrega";
        listaLocacoes = dao.getAllLocacoes(ordena);
        preencherTabela();
    }//GEN-LAST:event_rbDataEntregaActionPerformed

    private void rbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodigoActionPerformed
        ordena = "locac_id";
        listaLocacoes = dao.getAllLocacoes(ordena);
        preencherTabela();
    }//GEN-LAST:event_rbCodigoActionPerformed

    private void cbFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bFiltrar;
    private javax.swing.JButton bNovo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbFiltrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbDataEntrega;
    private javax.swing.JTextField tfFiltrar;
    // End of variables declaration//GEN-END:variables

    public String getOrdena(){
        return ordena;
    }
    
    public void preencherTabela() {
        DefaultTableModel modeloTabela = (DefaultTableModel) jTable1.getModel();

        modeloTabela.setNumRows(0);

        Object[] linha;

        for (Locacao loca : listaLocacoes) {
            linha = new Object[]{loca.getId(), loca.getDataEntrega(), loca.getDataDevolucao(), loca.getStatus(), loca.getVeiculo().getId(), loca.getVeiculo().getPlaca()};
            modeloTabela.addRow(linha);
        }

        //seleciona a linha 1
        jTable1.setRowSelectionInterval(0, 0);
    }

    public void setAllLocacoes(ArrayList<Locacao> listaLocacaos) {
        this.listaLocacoes = listaLocacaos;
    }

    public ArrayList<Locacao> getAllLocacoes() {
        return this.listaLocacoes;
    }

    public JTable getTabela() {
        return jTable1;
    }
}
