/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DAOFuncionario;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.Funcionario;

/**
 *
 * @author eliomar.campos 
 */
public class DialogFuncionario extends javax.swing.JDialog {

    private DAOFuncionario dao;
    private List<Funcionario> listaFuncionarios;
    private Funcionario funcionario;
    private int posicao;
    private InternalFuncionario parent;

    public DialogFuncionario(InternalFuncionario parent, boolean novo) {
        super();
        initComponents();
        this.parent = parent;
        dao = new DAOFuncionario();
        listaFuncionarios = parent.getListaFuncionarios();
        
        if (novo) {
            limparFormulario();
        } else {
            posicao = parent.getjTable1().getSelectedRow();
            funcionario = listaFuncionarios.isEmpty() ? null : listaFuncionarios.get(posicao);
            atualizarFormulario();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelManter = new javax.swing.JPanel();
        botaoNovo = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        botaoPrimeiro = new javax.swing.JButton();
        botaoUltimo = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        tfDataAdmissao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        botaoLocalizarCargo = new javax.swing.JButton();
        botaoLimparCargo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        textoCodigoCargo = new javax.swing.JTextField();
        textoNomeCargo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btLocalizarFuncao = new javax.swing.JButton();
        btDeletarFuncao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário - Funcionários");
        setIconImage(new ImageIcon(getClass().getResource("/view/img/office_32.png")).getImage()
        );
        setModal(true);

        painelManter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        botaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/new2_32.png"))); // NOI18N
        botaoNovo.setToolTipText("Novo");
        botaoNovo.setBorder(null);
        botaoNovo.setBorderPainted(false);
        botaoNovo.setContentAreaFilled(false);
        botaoNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoNovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/new3_32.png"))); // NOI18N
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/save_32.png"))); // NOI18N
        botaoSalvar.setToolTipText("Gravar");
        botaoSalvar.setBorder(null);
        botaoSalvar.setContentAreaFilled(false);
        botaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/delete_32.png"))); // NOI18N
        botaoExcluir.setToolTipText("Excluir");
        botaoExcluir.setBorder(null);
        botaoExcluir.setContentAreaFilled(false);
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/delete2_32.png"))); // NOI18N
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/backward_32.png"))); // NOI18N
        botaoAnterior.setToolTipText("Anterior");
        botaoAnterior.setBorder(null);
        botaoAnterior.setContentAreaFilled(false);
        botaoAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAnterior.setEnabled(false);
        botaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnteriorActionPerformed(evt);
            }
        });

        botaoPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/backwardFirst_32.png"))); // NOI18N
        botaoPrimeiro.setToolTipText("Primeiro");
        botaoPrimeiro.setBorder(null);
        botaoPrimeiro.setContentAreaFilled(false);
        botaoPrimeiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPrimeiro.setEnabled(false);
        botaoPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrimeiroActionPerformed(evt);
            }
        });

        botaoUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/forwardEnd_32.png"))); // NOI18N
        botaoUltimo.setToolTipText("Último");
        botaoUltimo.setBorder(null);
        botaoUltimo.setContentAreaFilled(false);
        botaoUltimo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUltimoActionPerformed(evt);
            }
        });

        botaoProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/forward_32.png"))); // NOI18N
        botaoProximo.setToolTipText("Próximo");
        botaoProximo.setBorder(null);
        botaoProximo.setContentAreaFilled(false);
        botaoProximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout painelManterLayout = new javax.swing.GroupLayout(painelManter);
        painelManter.setLayout(painelManterLayout);
        painelManterLayout.setHorizontalGroup(
            painelManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelManterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoPrimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoUltimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelManterLayout.setVerticalGroup(
            painelManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelManterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAnterior)
                    .addComponent(botaoPrimeiro)
                    .addComponent(botaoProximo)
                    .addComponent(botaoUltimo)
                    .addComponent(botaoExcluir)
                    .addGroup(painelManterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoNovo)
                        .addComponent(botaoSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Código:");

        tfCodigo.setEditable(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Email:");

        jLabel5.setText("Salário:");

        jLabel6.setText("Data Admissão:");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Função"));

        botaoLocalizarCargo.setToolTipText("Procurar Cargo");
        botaoLocalizarCargo.setBorder(null);
        botaoLocalizarCargo.setContentAreaFilled(false);
        botaoLocalizarCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoLocalizarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLocalizarCargoActionPerformed(evt);
            }
        });

        botaoLimparCargo.setToolTipText("Limpar Cargo");
        botaoLimparCargo.setBorder(null);
        botaoLimparCargo.setBorderPainted(false);
        botaoLimparCargo.setContentAreaFilled(false);
        botaoLimparCargo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoLimparCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCargoActionPerformed(evt);
            }
        });

        jLabel9.setText("Código Função:");

        textoCodigoCargo.setEditable(false);

        textoNomeCargo.setEditable(false);

        jLabel10.setText("Nome Função:");

        btLocalizarFuncao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/find2_32.png"))); // NOI18N
        btLocalizarFuncao.setToolTipText("Procurar Cargo");
        btLocalizarFuncao.setBorder(null);
        btLocalizarFuncao.setContentAreaFilled(false);
        btLocalizarFuncao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLocalizarFuncao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/find3_32.png"))); // NOI18N
        btLocalizarFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocalizarFuncaoActionPerformed(evt);
            }
        });

        btDeletarFuncao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/clear_32.png"))); // NOI18N
        btDeletarFuncao.setToolTipText("Limpar Cargo");
        btDeletarFuncao.setBorder(null);
        btDeletarFuncao.setBorderPainted(false);
        btDeletarFuncao.setContentAreaFilled(false);
        btDeletarFuncao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletarFuncao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/clear2_32.png"))); // NOI18N
        btDeletarFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarFuncaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(botaoLocalizarCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLimparCargo))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoCodigoCargo)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoNomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLocalizarFuncao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeletarFuncao)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCodigoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoNomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btLocalizarFuncao)
                    .addComponent(btDeletarFuncao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoLimparCargo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoLocalizarCargo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelManter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfSalario)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 183, Short.MAX_VALUE))
                                    .addComponent(tfEmail)))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelManter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        limparFormulario();
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (tfNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios!", "Aviso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/view/img/sad_32.png")));
            tfNome.requestFocus();
        } else {
            if (tfCodigo.getText().isEmpty()) {
                salvar();
            } else {
                atualizar();
            }
            parent.setListaFuncionarios(listaFuncionarios);
            parent.preencherTabela();
            atualizarFormulario();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja Excluir?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            //se ao excluir retornar true, então atualiza a lista
            if (dao.deletarFuncionario(funcionario.getId())) {
                listaFuncionarios = dao.getAllFuncionarios(parent.getOrdenacao());
                posicao = 0;
                funcionario = listaFuncionarios.get(posicao);
                JOptionPane.showMessageDialog(this, "Excluído com Sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/view/img/success_32.png")));
            }

            parent.setListaFuncionarios(listaFuncionarios);
            parent.preencherTabela();
            atualizarFormulario();

        }

    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnteriorActionPerformed
        posicao--;
        if (posicao < 0) {
            JOptionPane.showMessageDialog(this, "Início da lista!", "Aviso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/view/img/sad_32.png")));
            posicao++;
        } else {
            funcionario = listaFuncionarios.get(posicao);
            atualizarFormulario();
        }

    }//GEN-LAST:event_botaoAnteriorActionPerformed

    private void botaoPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrimeiroActionPerformed
        posicao = 0;
        funcionario = listaFuncionarios.get(posicao);
        atualizarFormulario();

    }//GEN-LAST:event_botaoPrimeiroActionPerformed

    private void botaoUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUltimoActionPerformed
        posicao = listaFuncionarios.size() - 1;
        funcionario = listaFuncionarios.get(posicao);
        atualizarFormulario();
    }//GEN-LAST:event_botaoUltimoActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        posicao++;
        if (posicao > listaFuncionarios.size() - 1) {
            JOptionPane.showMessageDialog(this, "Final da lista!", "Aviso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/view/img/sad_32.png")));
            posicao--;
        } else {
            funcionario = listaFuncionarios.get(posicao);
            atualizarFormulario();
        }

    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoLocalizarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLocalizarCargoActionPerformed
        //new DialogCargo(null, true, this).setVisible(true);
    }//GEN-LAST:event_botaoLocalizarCargoActionPerformed

    private void botaoLimparCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCargoActionPerformed
        textoCodigoCargo.setText("");
        textoNomeCargo.setText("");
       // cargo = new Cargo(); //recebe um cargo novo vazio
    }//GEN-LAST:event_botaoLimparCargoActionPerformed

    private void btLocalizarFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocalizarFuncaoActionPerformed
        //new DialogCargo(null, true, this).setVisible(true);
    }//GEN-LAST:event_btLocalizarFuncaoActionPerformed

    private void btDeletarFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarFuncaoActionPerformed
        textoCodigoCargo.setText("");
        textoNomeCargo.setText("");
        //cargo = new Cargo(); //recebe um cargo novo vazio
    }//GEN-LAST:event_btDeletarFuncaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAnterior;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoLimparCargo;
    private javax.swing.JButton botaoLocalizarCargo;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoPrimeiro;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoUltimo;
    private javax.swing.JButton btDeletarFuncao;
    private javax.swing.JButton btLocalizarFuncao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel painelManter;
    private javax.swing.JTextField textoCodigoCargo;
    private javax.swing.JTextField textoNomeCargo;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfDataAdmissao;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfSalario;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        new DialogFuncionario(new InternalFuncionario(), true).setVisible(true);
    }

    private void atualizarFormulario() {
        tfCodigo.setText(funcionario.getId() + "");
        tfNome.setText(funcionario.getNome());

        botaoExcluir.setEnabled(true);
        
        if (posicao == 0) {
                botaoAnterior.setEnabled(false);
                botaoPrimeiro.setEnabled(false);
                botaoProximo.setEnabled(true);
                botaoUltimo.setEnabled(true);
            } else if (posicao == listaFuncionarios.size() - 1) {
                botaoAnterior.setEnabled(true);
                botaoPrimeiro.setEnabled(true);
                botaoProximo.setEnabled(false);
                botaoUltimo.setEnabled(false);
            } else {
                botaoAnterior.setEnabled(true);
                botaoPrimeiro.setEnabled(true);
                botaoProximo.setEnabled(true);
                botaoUltimo.setEnabled(true);
            }
    }

    private void limparFormulario() {
        posicao = -1;
        botaoAnterior.setEnabled(false);
        botaoPrimeiro.setEnabled(false);
        
        tfCodigo.setText("");
        tfNome.setText("");

        tfNome.requestFocus(); //coloca o caret dentro do campo
        botaoExcluir.setEnabled(false);
    }

    private void salvar() {
        Funcionario f = new Funcionario();
        f.setNome(tfNome.getText());

        //Se salvar retornar true, é porque houve sucesso ao salvar
        if (dao.insertFuncionario(f)) {
            listaFuncionarios = dao.getAllFuncionarios(parent.getOrdenacao());
            int i = 0;
            for(Funcionario fun : listaFuncionarios){
                if(fun.getNome().equals(f.getNome())){
                    funcionario = fun;
                    posicao = i;
                }
                i++;
            }
            JOptionPane.showMessageDialog(this, "Salvo com Sucesso!", "Aviso!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/view/img/success_32.png")));
        }
    }

    private void atualizar() {
        Funcionario f = new Funcionario();
        f.setId(Integer.parseInt(tfCodigo.getText()));
        f.setNome(tfNome.getText());

        //se ao atualizar retornar true, então atualiza a lista
        if (dao.atualizarFuncionario(f)) {
            listaFuncionarios = dao.getAllFuncionarios(parent.getOrdenacao());
            funcionario = listaFuncionarios.get(posicao);
            JOptionPane.showMessageDialog(this, "Atualizado com Sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/view/img/success_32.png")));
        }
    }

}
