package view;
import controller.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {
    

    public MenuPrincipal() {
        initComponents();
    }

   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Conteudo = new javax.swing.JButton();
        Tempo = new javax.swing.JComboBox<>();
        Aula = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Anote aqui suas preferências para estudo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 350, 30));

        Conteudo.setBackground(new java.awt.Color(255, 255, 255));
        Conteudo.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        Conteudo.setForeground(new java.awt.Color(153, 0, 0));
        Conteudo.setText("MEUS CONTEÚDOS");
        Conteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConteudoActionPerformed(evt);
            }
        });
        getContentPane().add(Conteudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        Tempo.setBackground(new java.awt.Color(153, 0, 0));
        Tempo.setForeground(new java.awt.Color(255, 255, 255));
        Tempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30 min", "1 hora " }));
        Tempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempoActionPerformed(evt);
            }
        });
        getContentPane().add(Tempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 190, -1));

        Aula.setBackground(new java.awt.Color(153, 0, 0));
        Aula.setForeground(new java.awt.Color(255, 255, 255));
        Aula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aula Mensal (R$150,00)", "Aulas Semanais (R$250,00)", "Aulas Diárias (R$450,00)" }));
        Aula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AulaActionPerformed(evt);
            }
        });
        getContentPane().add(Aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 190, -1));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agora que você é nosso aluno Star English, você terá direito a:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 540, 30));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Atendimento personalizado e professores totalmente qualificados ✅");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Experiências em Inglês que te preparam para sua carreira ✅");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Design sem nome.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        jLabel6.setText("Ao ingressar para a Star English, você terá direito:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 270, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AulaActionPerformed
        String aulaSelecionada = (String) Aula.getSelectedItem();
        String tempoSelecionado = (String) Tempo.getSelectedItem();
        enviarDadosParaBanco(aulaSelecionada, tempoSelecionado);
    }//GEN-LAST:event_AulaActionPerformed

    

    private void TempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempoActionPerformed
     
    }//GEN-LAST:event_TempoActionPerformed

    

    private void ConteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConteudoActionPerformed
     abrirConteudo();
    }//GEN-LAST:event_ConteudoActionPerformed

private void abrirConteudo() {
    Conteudo conteudo = new Conteudo();
    conteudo.setVisible(true);
    this.dispose(); // Fecha a janela atual após abrir a janela Conteudo
}

    private void enviarDadosParaBanco(String Aula, String Tempo) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DatabaseConnection.getConnection();
            String sql = "INSERT INTO Servicos (Aula, Tempo) VALUES (?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, Aula);
            stmt.setString(2, Tempo);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Dados inseridos com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao inserir dados no banco de dados: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Aula;
    private javax.swing.JButton Conteudo;
    private javax.swing.JComboBox<String> Tempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

  
    

}