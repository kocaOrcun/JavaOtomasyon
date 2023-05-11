package jodev;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class HizmetverenKayit extends javax.swing.JFrame {

    public HizmetverenKayit() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void kayit(){
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HizmetverenKayit().setVisible(true);
            }
        });*/
         try {
            PreparedStatement ps = DBHelper.getConnection().prepareStatement("INSERT INTO hizmetveren(hizmetverenAd, hizmetverenSoyad, hizmetverenSektor) VALUES(?,?,?)");
            ps.setString(1,"Berkay");
            ps.setString(2,"Sevimay");
            ps.setString(3, "Yazılım");
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(HizmetverenKayit.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
    public static void main(String args[]) {
               
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
