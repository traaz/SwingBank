/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Settings.ActionButton;
import Settings.IEdits;
import Settings.Text;
import javax.swing.JOptionPane;

/**
 *
 * @author alioz
 */
public class ŞifreEkranı extends javax.swing.JFrame implements IEdits{

    /**
     * Creates new form ŞifreEkranı
     */
    public ŞifreEkranı() {
        initComponents();
        getEdits();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ŞifrePanel = new javax.swing.JPanel();
        ŞifreLabel = new javax.swing.JLabel();
        KimlikLabel = new javax.swing.JLabel();
        TelNoLabel = new javax.swing.JLabel();
        KodLabel = new javax.swing.JLabel();
        ŞifreeLabel = new javax.swing.JLabel();
        KimlikText = new javax.swing.JTextField();
        TelNoText = new javax.swing.JTextField();
        KodText = new javax.swing.JTextField();
        ŞifreYenileButon = new javax.swing.JButton();
        Geriİkon = new javax.swing.JLabel();
        şifreText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ŞifrePanel.setBackground(new java.awt.Color(102, 102, 255));

        ŞifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ŞifreLabel.setForeground(new java.awt.Color(255, 255, 255));
        ŞifreLabel.setText("ŞİFRE YENİLEME ");

        KimlikLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        KimlikLabel.setText("T.C Kimlik No :");

        TelNoLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TelNoLabel.setText("Telefon Numarası :");

        KodLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        KodLabel.setText("Telefona Gönderilen Kod :");

        ŞifreeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ŞifreeLabel.setText("Yeni Şifre :");

        ŞifreYenileButon.setText("Şifre Yenile");
        ŞifreYenileButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ŞifreYenileButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ŞifreYenileButonActionPerformed(evt);
            }
        });

        Geriİkon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconlar/icons8_left_arrow_64px.png"))); // NOI18N
        Geriİkon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Geriİkon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeriİkonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ŞifrePanelLayout = new javax.swing.GroupLayout(ŞifrePanel);
        ŞifrePanel.setLayout(ŞifrePanelLayout);
        ŞifrePanelLayout.setHorizontalGroup(
            ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ŞifrePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ŞifreYenileButon)
                .addGap(171, 171, 171))
            .addGroup(ŞifrePanelLayout.createSequentialGroup()
                .addGroup(ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ŞifrePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Geriİkon)
                        .addGap(59, 59, 59)
                        .addComponent(ŞifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ŞifrePanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TelNoLabel)
                            .addComponent(KodLabel)
                            .addComponent(ŞifreeLabel)
                            .addComponent(KimlikLabel))
                        .addGap(18, 18, 18)
                        .addGroup(ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KodText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(şifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        ŞifrePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {KimlikText, KodText, TelNoText, şifreText});

        ŞifrePanelLayout.setVerticalGroup(
            ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ŞifrePanelLayout.createSequentialGroup()
                .addGroup(ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ŞifrePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(ŞifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ŞifrePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Geriİkon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addGroup(ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelNoLabel)
                    .addComponent(TelNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KodLabel)
                    .addComponent(KodText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(ŞifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ŞifreeLabel)
                    .addComponent(şifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(ŞifreYenileButon)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        ŞifrePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {KimlikText, KodText, TelNoText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ŞifrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ŞifrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeriİkonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriİkonMouseClicked
        ActionButton.setVisible(this, new GirişEkranı());
    }//GEN-LAST:event_GeriİkonMouseClicked

    private void ŞifreYenileButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ŞifreYenileButonActionPerformed
        if(KimlikText.getText().equals("") || TelNoText.getText().equals("") || KodText.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurunuz.");
        }else{
            JOptionPane.showMessageDialog(this, "Şifreniz değiştirildi.");
            ActionButton.setVisible(this, new GirişEkranı());
        }
    }//GEN-LAST:event_ŞifreYenileButonActionPerformed

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
            java.util.logging.Logger.getLogger(ŞifreEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ŞifreEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ŞifreEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ŞifreEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ŞifreEkranı().setVisible(true);
            }
        });
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        ŞifrePanel.setFocusable(true);
        Text.setOnlyNumber(TelNoText);
        Text.setOnlyNumber(KimlikText);
        Text.setOnlyNumber(KodText);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Geriİkon;
    private javax.swing.JLabel KimlikLabel;
    private javax.swing.JTextField KimlikText;
    private javax.swing.JLabel KodLabel;
    private javax.swing.JTextField KodText;
    private javax.swing.JLabel TelNoLabel;
    private javax.swing.JTextField TelNoText;
    private javax.swing.JLabel ŞifreLabel;
    private javax.swing.JPanel ŞifrePanel;
    private javax.swing.JButton ŞifreYenileButon;
    private javax.swing.JLabel ŞifreeLabel;
    private javax.swing.JPasswordField şifreText;
    // End of variables declaration//GEN-END:variables
}
