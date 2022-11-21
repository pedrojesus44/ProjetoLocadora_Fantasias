package controle;


import conexao.Conexao;
import controle.frm_cadastrar;
import controle.frm_Catalogo;
import controle.frm_Menu;
import java.sql.SQLException;
import javax.swing.JOptionPane; 
import javax.sql.*;
/**
 *
 * @author Admin
 */
public class frm_Login extends javax.swing.JFrame {
    Conexao con_cliente;
    /**
     * Creates new form frm_Login
     */
    public frm_Login() {
        initComponents();
        con_cliente = new Conexao();
        con_cliente.conecta();
        setLocationRelativeTo( null );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        rotulo_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        rotulo_senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(170, 83, 196));
        jPanel1.setLayout(null);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Acesso ao sistema");
        jPanel1.add(titulo);
        titulo.setBounds(80, 40, 303, 48);

        rotulo_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rotulo_email.setForeground(new java.awt.Color(255, 255, 255));
        rotulo_email.setText("Email:");
        jPanel1.add(rotulo_email);
        rotulo_email.setBounds(80, 120, 55, 20);
        jPanel1.add(txt_email);
        txt_email.setBounds(140, 110, 230, 30);

        rotulo_senha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rotulo_senha.setForeground(new java.awt.Color(255, 255, 255));
        rotulo_senha.setText("Senha:");
        jPanel1.add(rotulo_senha);
        rotulo_senha.setBounds(80, 180, 44, 20);
        jPanel1.add(txt_senha);
        txt_senha.setBounds(140, 170, 230, 30);

        btn_login.setText("Logar");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login);
        btn_login.setBounds(190, 230, 81, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Não possui cadastro?");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 300, 142, 20);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(190, 340, 83, 25);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/door_in.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel2.add(btnSair);
        btnSair.setBounds(429, 480, 30, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        String senha = txt_senha.getText();
        try{
            
            String pesquisa = "select * from clientes where email_cli like '" + txt_email.getText() + "' && senha_cli = '" + senha + "'";
            System.out.println(pesquisa);
            con_cliente.executaSQL(pesquisa);
            
            if (con_cliente.resultset.first()) {
                
                frm_Catalogo mostra = new frm_Catalogo();
                mostra.setVisible(true);
                dispose();
            }
            else {
                
                JOptionPane.showMessageDialog(null, "\n Usuário não cadastrado!!!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                con_cliente.desconecta();
            }
        }
        catch(SQLException errosql) {
            JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        frm_cadastrar mostracadastro = new frm_cadastrar();
        mostracadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        frm_Menu mostramenu = new frm_Menu();
        mostramenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCadastrar;
    public javax.swing.JButton btnSair;
    public javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel rotulo_email;
    public javax.swing.JLabel rotulo_senha;
    public javax.swing.JLabel titulo;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_senha;
    // End of variables declaration//GEN-END:variables
}
