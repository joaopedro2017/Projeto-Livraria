/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Livro;

/**
 *
 * @author John Peter
 */
public class FormLivro extends javax.swing.JFrame {
    private static Livro livBuscar;
    /**
     * Creates new form FormLivro
     */
    public FormLivro() {        
        this.livBuscar = null;
        initComponents();
    }

    public static Livro getLivBuscar() {
        return livBuscar;
    }

    public static void setLivBuscar(Livro livBuscar) {
        FormLivro.livBuscar = livBuscar;
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jbCadastrar = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbFornecedor = new javax.swing.JComboBox<>();
        jtCodigo = new javax.swing.JTextField();
        jtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtValor = new javax.swing.JTextField();
        jtQuantidade = new javax.swing.JTextField();
        jftData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Livros (Acervo)");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jbCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones 72 x 72/book-icon (1).png"))); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setFocusable(false);
        jbCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbCadastrar);

        jbAtualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones 72 x 72/edit-file-icon.png"))); // NOI18N
        jbAtualizar.setText("Atualizar");
        jbAtualizar.setEnabled(false);
        jbAtualizar.setFocusable(false);
        jbAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbAtualizar);

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones 72 x 72/delete-file-icon.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setFocusable(false);
        jbCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbCancelar);

        jbSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones 72 x 72/Actions-go-next-icon.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.setFocusable(false);
        jbSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jToolBar1.add(jbSair);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Título:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fornecedor:");

        jcbFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saraiva", "Mércurio", "Editora Nova" }));
        jcbFornecedor.setSelectedIndex(-1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Valor Unitário:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Quantidade em Estoque:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Data de Publicação:");

        try {
            jftData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftDataActionPerformed(evt);
            }
        });
        jftData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jftDataKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtValor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jcbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftData, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(566, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        if( !jtCodigo.getText().trim().equals("") ){
            int codigo = Integer.parseInt(jtCodigo.getText());
            livBuscar = FormPrincipal.bdLivro.buscarLivro(codigo);
            if(livBuscar == null || FormPrincipal.bdLivro.todosLivros().isEmpty()){
                Livro livro = new Livro();
                if( receberDadosLivro(livro, codigo)){
                    FormPrincipal.bdLivro.adicionarLivro(livro);
                    JOptionPane.showMessageDialog(null, "Livro cadastro com Sucesso", "Cadastro de Livro", JOptionPane.INFORMATION_MESSAGE);
                    jbCancelarActionPerformed(evt);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Livro já cadastrado", "Aviso", JOptionPane.WARNING_MESSAGE);
                jtCodigo.setText("");            
            }                
        }else{
            JOptionPane.showMessageDialog(null, "Verifique o campo do código", "Verifique", JOptionPane.INFORMATION_MESSAGE);
        }     
        
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private boolean receberDadosLivro(Livro livro, int codigo) throws NumberFormatException {
        boolean valido = false;        
        livro.setCodigo( codigo );
        if(jtTitulo.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Verifique o Campo do Titulo", "Erro de Preenchimento", JOptionPane.WARNING_MESSAGE);
            jtTitulo.requestFocus();
        }else{
            livro.setTitulo(jtTitulo.getText() );
            if(jcbFornecedor.getSelectedIndex() < 0){
                JOptionPane.showMessageDialog(null, "Verifique o Campo do Fornecedor", "Erro de Preenchimento", JOptionPane.WARNING_MESSAGE);
                jcbFornecedor.requestFocus();
            }else{
                livro.setFornecedor((String) jcbFornecedor.getSelectedItem());
                if(jtValor.getText().trim().equals("")){
                   JOptionPane.showMessageDialog(null, "Verifique o Campo do Valor", "Erro de Preenchimento", JOptionPane.WARNING_MESSAGE); 
                   jtValor.requestFocus();
                }else{
                    livro.setValorUnitario(Double.parseDouble(jtValor.getText()  ) );                    
                    if(jtQuantidade.getText().trim().equals("")){
                        JOptionPane.showMessageDialog(null, "Verifique o Campo da Quantidade", "Erro de Preenchimento", JOptionPane.WARNING_MESSAGE);
                        jtQuantidade.requestFocus();
                    }else{
                        livro.setQuantidade(Integer.parseInt(jtQuantidade.getText()) );
                        if(jftData.getText().replace("/", "").trim().equals("")){
                           JOptionPane.showMessageDialog(null, "Verifique o Campo da Data", "Erro de Preenchimento", JOptionPane.WARNING_MESSAGE); 
                           jftData.requestFocus();
                        }else{
                            valido = true;
                            //Codigo para passar de formaterTextField para o banco
                            String txt = jftData.getText();        
                            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                            Date data = null;
                            try {
                                data = df.parse(txt);
                            } catch (ParseException ex) {
                                Logger.getLogger(FormLivro.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            livro.setData(data);
                            //FIM                        
                        }
                    }                                    
                }                            
            }      
        }
        return valido;
    }

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        int codigo = livBuscar.getCodigo();
        
        Object[] options = {"Sim", "Não"}; 
        int decisao = JOptionPane.showOptionDialog(null, "Tem certeza que deseja Atualizar?", "ATENÇÃO", 
        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
        if(decisao == JOptionPane.YES_OPTION){
            if( receberDadosLivro(livBuscar, codigo)){
                FormPrincipal.bdLivro.alterarLivro(livBuscar);
                JOptionPane.showMessageDialog(null, "Livro atualizado com Sucesso", "Confirmação", JOptionPane.INFORMATION_MESSAGE);            
                this.dispose();
                //FormConsultaLivro.
            }           
        }      
    }//GEN-LAST:event_jbAtualizarActionPerformed

    public void preencherDadosLivro() {
        jtCodigo.setText( String.valueOf(livBuscar.getCodigo()) );
        jtQuantidade.setText( String.valueOf(livBuscar.getQuantidade()) );
        jtTitulo.setText( livBuscar.getTitulo() );
        jtValor.setText( String.valueOf( Math.round(livBuscar.getValorUnitario()) ));
        
        SimpleDateFormat f = new SimpleDateFormat("ddMMyyyy");
        String data = f.format( livBuscar.getData() );
               
        jftData.setText(data);       
        jcbFornecedor.setSelectedItem( livBuscar.getFornecedor() );
        
        jtCodigo.setEditable(false);
        jtCodigo.setBackground(Color.gray);
        jbCadastrar.setEnabled(false);
        jbAtualizar.setEnabled(true);
        jbCancelar.setEnabled(false);
    }

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        jtCodigo.setText("");
        jtTitulo.setText("");
        jcbFornecedor.setSelectedIndex(-1);
        jtValor.setText("");
        jtQuantidade.setText("");
        jftData.setText("");
        jtCodigo.requestFocus();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(livBuscar != null){
            preencherDadosLivro();        
        }
    }//GEN-LAST:event_formWindowOpened

    private void jftDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftDataKeyReleased
        if(jftData.getText().trim().length() == 10){
            String _data = jftData.getText();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            try {
                format.setLenient(false);
                Date data = format.parse(_data);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Data inválida", "Aviso", JOptionPane.WARNING_MESSAGE);
                jftData.setText("");
            }
        }
    }//GEN-LAST:event_jftDataKeyReleased

    private void jftDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftDataActionPerformed

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
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSair;
    private javax.swing.JComboBox<String> jcbFornecedor;
    private javax.swing.JFormattedTextField jftData;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTextField jtTitulo;
    private javax.swing.JTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
