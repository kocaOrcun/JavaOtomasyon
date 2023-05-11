package jodev;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class IsverenKayit extends javax.swing.JFrame {

    public IsverenKayit() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtf_soyad = new javax.swing.JTextField();
        txtf_ad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtf_Il = new javax.swing.JTextField();
        txtf_Ilce = new javax.swing.JTextField();
        txtf_TelefonNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ad :");

        jLabel2.setText("Soyad :");

        jButton1.setText("Kaydet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("İl :");

        jLabel4.setText("İlçe :");

        label1.setText("Telefon Numarası");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setText("İşveren Ekleme Alanı");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtf_ad)
                        .addComponent(txtf_soyad)
                        .addComponent(txtf_Il)
                        .addComponent(txtf_Ilce, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtf_TelefonNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtf_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtf_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtf_Il, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtf_Ilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtf_TelefonNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        txtf_soyad.getAccessibleContext().setAccessibleName("txtf_soyad");
        txtf_ad.getAccessibleContext().setAccessibleName("txtf_ad");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void kayit(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IsverenKayit().setVisible(true);
                
                
                try { 
            PreparedStatement statement;
           statement = DBHelper.getConnection().prepareStatement("INSERT INTO isveren (IsverenAd, IsverenSoyad, IsverenIl, IsverenIlce, IsverenTelefonNo) VALUES (?,?,?,?,?)");
           statement.setString(1,txtf_ad.getText());
           statement.setString(2,txtf_soyad.getText());
           statement.setString(3,txtf_Il.getText());
           statement.setString(4,txtf_Ilce.getText());
           statement.setString(5, txtf_TelefonNo.getText());
           statement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Kayıt Eklendi");
            
        } catch (SQLException ex) {
            Logger.getLogger(IsverenKayit.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Kayıt Eklenemedi");
        }
            }
        });
         
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kayit();
    }//GEN-LAST:event_jButton1ActionPerformed


    
    public static void main(String args[]) {
               
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.Label label1;
    private javax.swing.JTextField txtf_Il;
    private javax.swing.JTextField txtf_Ilce;
    private javax.swing.JTextField txtf_TelefonNo;
    private javax.swing.JTextField txtf_ad;
    private javax.swing.JTextField txtf_soyad;
    // End of variables declaration//GEN-END:variables
}
