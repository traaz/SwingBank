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
public class ParaYatırmaEkranı extends javax.swing.JFrame implements IEdits{
    int yatırılcakMiktar=0;
                            
    /**
     * Creates new form ParaYatırmaEkranı
     */
    public ParaYatırmaEkranı() {
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

        ParaYatırmaPanel = new javax.swing.JPanel();
        ParaYatırmaBakiyeLabel = new javax.swing.JLabel();
        BakiyeLabel = new javax.swing.JLabel();
        UyarıLabel = new javax.swing.JLabel();
        MiktarLabel = new javax.swing.JLabel();
        MiktarText = new javax.swing.JTextField();
        ParaYatırButon = new javax.swing.JButton();
        Geriİcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ParaYatırmaPanel.setBackground(new java.awt.Color(102, 102, 255));

        ParaYatırmaBakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ParaYatırmaBakiyeLabel.setForeground(new java.awt.Color(255, 255, 255));
        ParaYatırmaBakiyeLabel.setText("Toplam Bakiyeniz :");

        BakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BakiyeLabel.setText("(BAKİYE)");

        UyarıLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UyarıLabel.setForeground(new java.awt.Color(255, 255, 255));
        UyarıLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UyarıLabel.setText("TEK SEFERDE 5000 TL YATIRABİLİRSİNİZ.");

        MiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MiktarLabel.setForeground(new java.awt.Color(255, 255, 255));
        MiktarLabel.setText("Yatırılcak Miktar :");

        MiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MiktarTextKeyReleased(evt);
            }
        });

        ParaYatırButon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ParaYatırButon.setText("Para Yatır");
        ParaYatırButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaYatırButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaYatırButonActionPerformed(evt);
            }
        });

        Geriİcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconlar/icons8_left_arrow_64px.png"))); // NOI18N
        Geriİcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Geriİcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeriİconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ParaYatırmaPanelLayout = new javax.swing.GroupLayout(ParaYatırmaPanel);
        ParaYatırmaPanel.setLayout(ParaYatırmaPanelLayout);
        ParaYatırmaPanelLayout.setHorizontalGroup(
            ParaYatırmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParaYatırmaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ParaYatırButon)
                .addGap(92, 92, 92))
            .addGroup(ParaYatırmaPanelLayout.createSequentialGroup()
                .addGroup(ParaYatırmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaYatırmaPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(ParaYatırmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ParaYatırmaPanelLayout.createSequentialGroup()
                                .addGroup(ParaYatırmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ParaYatırmaBakiyeLabel)
                                    .addComponent(MiktarLabel))
                                .addGap(34, 34, 34)
                                .addGroup(ParaYatırmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BakiyeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(MiktarText)))))
                    .addGroup(ParaYatırmaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Geriİcon)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        ParaYatırmaPanelLayout.setVerticalGroup(
            ParaYatırmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaYatırmaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Geriİcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(UyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ParaYatırmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ParaYatırmaBakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BakiyeLabel))
                .addGap(37, 37, 37)
                .addGroup(ParaYatırmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MiktarLabel)
                    .addComponent(MiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(ParaYatırButon)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ParaYatırmaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ParaYatırmaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MiktarTextKeyReleased
        String text=this.MiktarText.getText();
        if(!text.equals("")){
            this.yatırılcakMiktar=Integer.valueOf(text);
            if(this.yatırılcakMiktar>5000){
                this.yatırılcakMiktar=5000;
                MiktarText.setText(String.valueOf(this.yatırılcakMiktar));
            }
       }else{
            this.yatırılcakMiktar=0;
        }
       

    }//GEN-LAST:event_MiktarTextKeyReleased

    private void ParaYatırButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaYatırButonActionPerformed
        if(this.MiktarText.getText().equals("")|| this.MiktarText.getText().equals("0")){
            JOptionPane.showMessageDialog(ParaYatırmaPanel,"Para miktarı girmediniz.");
        }else{
        
        
        JOptionPane.showMessageDialog(ParaYatırmaPanel, "İşlem Başarılı\nYatırılan para: "+this.yatırılcakMiktar+" TL.");
    }//GEN-LAST:event_ParaYatırButonActionPerformed
    }
    private void GeriİconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriİconMouseClicked
        ActionButton.setVisible(this, new HesapEkranı());
    }//GEN-LAST:event_GeriİconMouseClicked

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
            java.util.logging.Logger.getLogger(ParaYatırmaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatırmaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatırmaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatırmaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatırmaEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BakiyeLabel;
    private javax.swing.JLabel Geriİcon;
    private javax.swing.JLabel MiktarLabel;
    private javax.swing.JTextField MiktarText;
    private javax.swing.JButton ParaYatırButon;
    private javax.swing.JLabel ParaYatırmaBakiyeLabel;
    private javax.swing.JPanel ParaYatırmaPanel;
    private javax.swing.JLabel UyarıLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
         ParaYatırmaPanel.setFocusable(true);
         Text.setOnlyNumber(MiktarText);
    }
}
