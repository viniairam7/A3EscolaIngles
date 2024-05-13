package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Conteudo extends javax.swing.JFrame {

   
    public Conteudo() {
        initComponents();{
    Instagram.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            openWebPage("https://www.instagram.com/staridiomas.us/");
        }
    });

    

    Zap.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            openWebPage("https://contate.me/viniairam");
        }
    });

    Youtube.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            openWebPage("https://www.youtube.com/watch?v=bHRfN7dmmPc&list=PLD346UBO6iflnIu81WWOqVELi7ssLcoH_&pp=gAQBiAQB");
        }
    });

}
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Instagram = new javax.swing.JToggleButton();
        Zap = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        Youtube = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("você pode nos contatar no botão abaixo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E aqui estarão seus conteúdos adicionais ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("atualizados semanalmente para você acessar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("enquanto preparamos sua próxima aula!");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("É por lá que você receberá seus links para Aulas e Faturas Mensais.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 550, 40));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nos envie uma mensagem na Central de Whatsapp. ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 430, 40));

        Instagram.setBackground(new java.awt.Color(204, 0, 204));
        Instagram.setForeground(new java.awt.Color(255, 255, 255));
        Instagram.setText("Instagram");
        Instagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstagramActionPerformed(evt);
            }
        });
        getContentPane().add(Instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, -1));

        Zap.setBackground(new java.awt.Color(51, 153, 0));
        Zap.setForeground(new java.awt.Color(255, 255, 255));
        Zap.setText("Whatsapp");
        Zap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapActionPerformed(evt);
            }
        });
        getContentPane().add(Zap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agora que temos os seus dados e informações, ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Youtube.setBackground(new java.awt.Color(102, 0, 0));
        Youtube.setForeground(new java.awt.Color(255, 255, 255));
        Youtube.setText("PLAYLIST ABERTA PARA LISTENING");
        getContentPane().add(Youtube, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Design sem nome.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstagramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstagramActionPerformed

    private void ZapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZapActionPerformed

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
            java.util.logging.Logger.getLogger(Conteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conteudo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conteudo().setVisible(true);
            }
        });
    }
    private void openWebPage(String url) {
    try {
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
    } catch (java.io.IOException e) {
        System.out.println(e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Instagram;
    private javax.swing.JToggleButton Youtube;
    private javax.swing.JToggleButton Zap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}

