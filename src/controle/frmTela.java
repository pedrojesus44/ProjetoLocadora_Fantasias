
package controle;

import conexao.Conexao; // importar do package a classe
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; // para reconhecimento da Jtable
import java.sql.*; // para reconhecimento dos comandos SQL

public class frmTela extends javax.swing.JFrame {

    Conexao con_cliente;
    
    public frmTela() {
        initComponents();
        con_cliente = new Conexao(); // inicialização do objeto como instância
        con_cliente.conecta(); // chama o método que conecta
        con_cliente.executaSQL("select * from produto order by id_pro");
        preencherTabela();
        posicionarRegistro();
        tblProdutos.setAutoCreateRowSorter(true); // ativa a classificação ordenada da tabela
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotulo1 = new javax.swing.JLabel();
        rotulo2 = new javax.swing.JLabel();
        rotulo3 = new javax.swing.JLabel();
        rotulo4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        ScrollPane = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnPrimeiroRegistro = new javax.swing.JButton();
        btnVoltarUmRegistro = new javax.swing.JButton();
        btnAvancarUmRegistro = new javax.swing.JButton();
        btnUltimoRegistro = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        rotulo6 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotulo1.setText("Código:");

        rotulo2.setText("Nome:");

        rotulo3.setText("Tipo:");

        rotulo4.setText("Tamanho:");

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Tipo", "Tamanho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        tblProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProdutosKeyPressed(evt);
            }
        });
        ScrollPane.setViewportView(tblProdutos);

        btnPrimeiroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultset_first.png"))); // NOI18N
        btnPrimeiroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroRegistroActionPerformed(evt);
            }
        });

        btnVoltarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultset_previous.png"))); // NOI18N
        btnVoltarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUmRegistroActionPerformed(evt);
            }
        });

        btnAvancarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultset_next.png"))); // NOI18N
        btnAvancarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarUmRegistroActionPerformed(evt);
            }
        });

        btnUltimoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultset_last.png"))); // NOI18N
        btnUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistroActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disk.png"))); // NOI18N
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_edit.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_delete.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door_in.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        rotulo6.setText("Pesquisa por nome do Produto:");

        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(rotulo6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotulo2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotulo1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(rotulo4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotulo3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 487, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrimeiroRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltarUmRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAvancarUmRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimoRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScrollPane)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotulo1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotulo2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotulo3)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotulo4)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrimeiroRegistro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltarUmRegistro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAvancarUmRegistro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUltimoRegistro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGravar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotulo6)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnSair)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProdutosKeyPressed
        // evento que sincroniza a grid com as setas do teclado
        int linha_selecionada = tblProdutos.getSelectedRow();
        txt1.setText(tblProdutos.getValueAt(linha_selecionada, 0).toString());
        txt2.setText(tblProdutos.getValueAt(linha_selecionada, 1).toString());
        txt3.setText(tblProdutos.getValueAt(linha_selecionada, 2).toString());
        txt4.setText(tblProdutos.getValueAt(linha_selecionada, 3).toString());
    }//GEN-LAST:event_tblProdutosKeyPressed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        int linha_selecionada = tblProdutos.getSelectedRow();
        txt1.setText(tblProdutos.getValueAt(linha_selecionada, 0).toString());
        txt2.setText(tblProdutos.getValueAt(linha_selecionada, 1).toString());
        txt3.setText(tblProdutos.getValueAt(linha_selecionada, 2).toString());
        txt4.setText(tblProdutos.getValueAt(linha_selecionada, 3).toString());
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void btnPrimeiroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroRegistroActionPerformed
        try {
            con_cliente.resultset.first();
            mostrar_Dados();           
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível acessar o primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPrimeiroRegistroActionPerformed

    private void btnUltimoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoRegistroActionPerformed
        try {
            con_cliente.resultset.last();
            mostrar_Dados();           
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no último registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUltimoRegistroActionPerformed

    private void btnVoltarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUmRegistroActionPerformed
        try {
            con_cliente.resultset.previous();
            mostrar_Dados();           
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no registro anterior: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVoltarUmRegistroActionPerformed

    private void btnAvancarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarUmRegistroActionPerformed
        try {
            con_cliente.resultset.next();
            mostrar_Dados();           
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no próximo registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAvancarUmRegistroActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txt1.setText(""); // limpa a caixa de texto em questão
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt1.requestFocus(); // posiciona o cursos neste campo para digitação
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        String nome = txt2.getText();
        String tipo = txt3.getText();
        String tamanho = txt4.getText();
        
        try {
            String insert_sql="insert into produto (nome_pro,tipo_pro, tamanho_pro) values ('" + nome + "','" + tipo + "','" + tamanho + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null,"Gravação realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from produto order by id_pro");
            con_cliente.resultset.first();
            preencherTabela();
            mostrar_Dados();
            
        }catch(SQLException errosql) {
            JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String nome = txt2.getText();
        String tipo = txt3.getText();
        String tamanho = txt4.getText();
        String sql="";
        String msg="";
        
        try {
            if(txt1.getText().equals("")){
                sql="insert into produto (nome_pro,tipo_pro, tamanho_pro) values ('" + nome + "','" + tipo + "','" + tamanho + "')";
                msg="Gravação de um novo registro";
            } else {
                sql="update produto set nome_pro='" + nome + "',tipo_pro='" + tipo + "', tamanho_pro='" + tamanho + "' where id_pro = " + txt1.getText();
                msg="Alteração de registro";
            }
            
            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,msg+" realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
            con_cliente.executaSQL("select * from produto order by id_pro");
            con_cliente.resultset.first();
            preencherTabela();
            mostrar_Dados();
            
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String sql="";
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão", JOptionPane.YES_NO_OPTION,3);
            if (resposta==0) {
                sql = "delete from produto where id_pro = " + txt1.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if (excluir==1) {
                    JOptionPane.showMessageDialog(null,"Exclusão realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from produto order by id_pro");
                    con_cliente.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                }else {
                    JOptionPane.showMessageDialog(null,"Operação cancelada pelo usuário!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                }
            } 
        }catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null,"Erro na exclusão: "+excecao,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txt6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyReleased
        try {
            String pesquisa = "select * from produto where nome_pro like '" + txt6.getText() + "%'";
            con_cliente.executaSQL(pesquisa);
            
            if(con_cliente.resultset.first()){
                preencherTabela();
            } else {
                JOptionPane.showMessageDialog(null,"\n Não existe dados com este paramêtro!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(SQLException errosql) {
            JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txt6KeyReleased

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    
    public void preencherTabela() {
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(11);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(14);
        
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("id_pro"),
                    con_cliente.resultset.getString("nome_pro"),
                    con_cliente.resultset.getString("tipo_pro"),
                    con_cliente.resultset.getString("tamanho_pro"),
                });
            }
        }catch(SQLException erro){
                    JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "
                    +erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistro() {
        try {
            con_cliente.resultset.first(); // posiciona no 1ª registro da tabela
            mostrar_Dados(); // chama o método que irá buscar o dado da tabela
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrar_Dados(){
        try {
            txt1.setText(con_cliente.resultset.getString("id_pro")); // Associar a caixa de texto ao campo cod
            txt2.setText(con_cliente.resultset.getString("nome_pro")); // Associar a caixa de texto ao campo nome
            txt3.setText(con_cliente.resultset.getString("tipo_pro"));
            txt4.setText(con_cliente.resultset.getString("tamanho_pro"));
        } catch(SQLException erro) {
        }
    }
    
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
            java.util.logging.Logger.getLogger(frmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane ScrollPane;
    public javax.swing.JButton btnAlterar;
    public javax.swing.JButton btnAvancarUmRegistro;
    public javax.swing.JButton btnExcluir;
    public javax.swing.JButton btnGravar;
    public javax.swing.JButton btnNovo;
    public javax.swing.JButton btnPrimeiroRegistro;
    public javax.swing.JButton btnSair;
    public javax.swing.JButton btnUltimoRegistro;
    public javax.swing.JButton btnVoltarUmRegistro;
    public javax.swing.JLabel rotulo1;
    public javax.swing.JLabel rotulo2;
    public javax.swing.JLabel rotulo3;
    public javax.swing.JLabel rotulo4;
    public javax.swing.JLabel rotulo6;
    public javax.swing.JTable tblProdutos;
    public javax.swing.JTextField txt1;
    public javax.swing.JTextField txt2;
    public javax.swing.JTextField txt3;
    public javax.swing.JTextField txt4;
    public javax.swing.JTextField txt6;
    // End of variables declaration//GEN-END:variables
}
