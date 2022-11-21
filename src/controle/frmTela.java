
package controle;

import conexao.Conexao; // importar do package a classe
import controle.frm_Menu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; // para reconhecimento da Jtable
import java.sql.*; // para reconhecimento dos comandos SQL

public class frmTela extends javax.swing.JFrame {

    Conexao con_cliente;
    
    public frmTela() {
        initComponents();
        setLocationRelativeTo( null );
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

        jPanel1 = new javax.swing.JPanel();
        rotulo1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        rotulo2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        rotulo3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        rotulo4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        rotulo5 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        btnPrimeiroRegistro = new javax.swing.JButton();
        btnVoltarUmRegistro = new javax.swing.JButton();
        btnAvancarUmRegistro = new javax.swing.JButton();
        btnUltimoRegistro = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        rotulo6 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        rotulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotulo1.setForeground(new java.awt.Color(255, 255, 255));
        rotulo1.setText("Código:");
        jPanel1.add(rotulo1);
        rotulo1.setBounds(50, 60, 100, 32);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt1);
        txt1.setBounds(160, 60, 90, 30);

        rotulo2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotulo2.setForeground(new java.awt.Color(255, 255, 255));
        rotulo2.setText("Nome:");
        jPanel1.add(rotulo2);
        rotulo2.setBounds(50, 110, 90, 32);
        jPanel1.add(txt2);
        txt2.setBounds(150, 110, 340, 30);

        rotulo3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotulo3.setForeground(new java.awt.Color(255, 255, 255));
        rotulo3.setText("Tipo:");
        jPanel1.add(rotulo3);
        rotulo3.setBounds(50, 160, 60, 30);
        jPanel1.add(txt3);
        txt3.setBounds(130, 160, 230, 30);

        rotulo4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotulo4.setForeground(new java.awt.Color(255, 255, 255));
        rotulo4.setText("Tamanho:");
        jPanel1.add(rotulo4);
        rotulo4.setBounds(50, 210, 120, 30);
        jPanel1.add(txt4);
        txt4.setBounds(180, 210, 180, 30);

        rotulo5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rotulo5.setForeground(new java.awt.Color(255, 255, 255));
        rotulo5.setText("Preço:");
        jPanel1.add(rotulo5);
        rotulo5.setBounds(50, 260, 80, 30);
        jPanel1.add(txt5);
        txt5.setBounds(140, 260, 220, 30);

        btnPrimeiroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultset_first.png"))); // NOI18N
        btnPrimeiroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrimeiroRegistro);
        btnPrimeiroRegistro.setBounds(50, 380, 70, 40);

        btnVoltarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultset_previous.png"))); // NOI18N
        btnVoltarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUmRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarUmRegistro);
        btnVoltarUmRegistro.setBounds(130, 380, 70, 40);

        btnAvancarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultset_next.png"))); // NOI18N
        btnAvancarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarUmRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnAvancarUmRegistro);
        btnAvancarUmRegistro.setBounds(210, 380, 70, 40);

        btnUltimoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resultset_last.png"))); // NOI18N
        btnUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnUltimoRegistro);
        btnUltimoRegistro.setBounds(290, 380, 70, 40);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo);
        btnNovo.setBounds(580, 380, 70, 40);

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disk.png"))); // NOI18N
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGravar);
        btnGravar.setBounds(660, 380, 70, 40);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_edit.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlterar);
        btnAlterar.setBounds(740, 380, 70, 40);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_delete.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir);
        btnExcluir.setBounds(820, 380, 70, 40);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Tipo", "Tamanho", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jPanel1.add(ScrollPane);
        ScrollPane.setBounds(50, 440, 840, 240);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door_in.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair);
        btnSair.setBounds(1310, 720, 30, 25);

        rotulo6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotulo6.setForeground(new java.awt.Color(255, 255, 255));
        rotulo6.setText("Pesquisa por nome do Produto:");
        jPanel1.add(rotulo6);
        rotulo6.setBounds(50, 700, 280, 30);

        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt6KeyReleased(evt);
            }
        });
        jPanel1.add(txt6);
        txt6.setBounds(330, 700, 280, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telasacesso/acesso5.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
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
        txt5.setText(tblProdutos.getValueAt(linha_selecionada, 4).toString());
    }//GEN-LAST:event_tblProdutosKeyPressed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        int linha_selecionada = tblProdutos.getSelectedRow();
        txt1.setText(tblProdutos.getValueAt(linha_selecionada, 0).toString());
        txt2.setText(tblProdutos.getValueAt(linha_selecionada, 1).toString());
        txt3.setText(tblProdutos.getValueAt(linha_selecionada, 2).toString());
        txt4.setText(tblProdutos.getValueAt(linha_selecionada, 3).toString());
        txt5.setText(tblProdutos.getValueAt(linha_selecionada, 4).toString());
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
        String preco = txt5.getText();
        
        try {
            String insert_sql="insert into produto (nome_pro,tipo_pro, tamanho_pro, preco) values ('" + nome + "','" + tipo + "','" + tamanho + "','" + preco + "')";   
            System.out.println(insert_sql);
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
        String preco = txt5.getText();
        String sql="";
        String msg="";
        
        try {
            if(txt1.getText().equals("")){
                sql="insert into produto (nome_pro,tipo_pro, tamanho_pro, preco) values ('" + nome + "','" + tipo + "','" + tamanho + "','" + preco + "')";
                msg="Gravação de um novo registro";
            } else {
                sql="update produto set nome_pro='" + nome + "',tipo_pro='" + tipo + "', tamanho_pro='" + tamanho + "', preco='" + preco + "' where id_pro = " + txt1.getText();
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
        frm_Menu mostramenu = new frm_Menu();
        mostramenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    
    public void preencherTabela() {
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(11);
        tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(14);
        tblProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
        
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
                    con_cliente.resultset.getString("preco"),
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
            txt5.setText(con_cliente.resultset.getString("preco"));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel rotulo1;
    public javax.swing.JLabel rotulo2;
    public javax.swing.JLabel rotulo3;
    public javax.swing.JLabel rotulo4;
    public javax.swing.JLabel rotulo5;
    public javax.swing.JLabel rotulo6;
    public javax.swing.JTable tblProdutos;
    public javax.swing.JTextField txt1;
    public javax.swing.JTextField txt2;
    public javax.swing.JTextField txt3;
    public javax.swing.JTextField txt4;
    public javax.swing.JTextField txt5;
    public javax.swing.JTextField txt6;
    // End of variables declaration//GEN-END:variables
}
