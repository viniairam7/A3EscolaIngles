package view;

import controller.LoginController;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    public Login() {
        initComponents();
        controller = new LoginController(this);
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Site = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        Site1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TextNome = new javax.swing.JTextField();
        TextCPF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextTel = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        Site.setBackground(new java.awt.Color(102, 0, 0));
        Site.setForeground(new java.awt.Color(255, 255, 255));
        Site.setText("Site");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Site1.setBackground(new java.awt.Color(102, 0, 0));
        Site1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Site1.setForeground(new java.awt.Color(255, 255, 255));
        Site1.setText("PÁGINA WEB - WIX.COM");
        Site1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Site1ActionPerformed(evt);
            }
        });
        jPanel1.add(Site1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 220, 60));

        jLabel2.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ANTES DE CONTINUAR, CONHEÇA O QUE OFERECEMOS PARA VOCÊ COMO ALUNO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 680, 20));

        jLabel7.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GOSTOU? PREENCHA OS CAMPOS ABAIXO PARA LOGIN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 510, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RECEBIMENTO E PERSONALIZAÇÃO DE SUAS AULAS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 510, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("COM PONTOS, VÍRGULAS E SINAIS PARA MELHOR ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 510, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PREENCHA TODOS OS CAMPOS DE MANEIRA CORRETA, ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 510, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 170, 40));

        TextNome.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });
        jPanel1.add(TextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 210, -1));

        TextCPF.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        TextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCPFActionPerformed(evt);
            }
        });
        jPanel1.add(TextCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 210, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CPF");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TELEFONE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EMAIL");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        TextTel.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        TextTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelActionPerformed(evt);
            }
        });
        jPanel1.add(TextTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 210, -1));

        TextEmail.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });
        jPanel1.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 210, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Design sem nome.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-450, 20, 570, 60));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STAR ENGLISH - SUA FLUÊNCIA NAS ESTRELAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/dark-blue-background-in-polygonal-style-vector.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 524));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed

    private void TextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCPFActionPerformed

    private void TextTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTelActionPerformed

    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        realizarCadastro();
    
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Site1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Site1ActionPerformed
        openLink("https://staridiomasonline.wixsite.com/aulas-personalizadas");
    }//GEN-LAST:event_Site1ActionPerformed

   
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Site;
    private javax.swing.JToggleButton Site1;
    private javax.swing.JTextField TextCPF;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextTel;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   private boolean realizarCadastro() {
        String email = TextEmail.getText().trim();
        String nome = TextNome.getText().trim();
        String cpf = TextCPF.getText().trim();
        String telefone = TextTel.getText().trim();

        if (email.isEmpty() || nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty()) {
            exibeMensagem("Por favor, preencha todos os campos.");
            return false;
        }

        if (controller.cadastrarAluno(email, nome, cpf, telefone)) {
            exibeMensagem("Aluno cadastrado com sucesso.");
            abrirMenuPrincipal();
            return true;
        } else {
            exibeMensagem("Erro ao cadastrar aluno.");
            return false;
        }
    }
    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void abrirMenuPrincipal() {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.setVisible(false);
    }
 


    public JTextField getTextCPF() {
        return TextCPF;
    }

    public void setTextCPF(JTextField TextCPF) {
        this.TextCPF = TextCPF;
    }

    public JTextField getTextEmail() {
        return TextEmail;
    }

    public void setTextEmail(JTextField TextEmail) {
        this.TextEmail = TextEmail;
    }

    public JTextField getTextNome() {
        return TextNome;
    }

    public void setTextNome(JTextField TextNome) {
        this.TextNome = TextNome;
    }

    

    public JTextField getTextTel() {
        return TextTel;
    }

    public void setTextTel(JTextField TextTel) {
        this.TextTel = TextTel;
    }

   private void openLink(String url) {
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
 public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
     
    }
  
}


   
     


