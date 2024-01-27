/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

import java.sql.Connection;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class method {

    
        public int cariIdEkskul (String nama) {
        try {
            int id = -1;
            String sql = "SELECT * FROM ekskul where nama_ekskul='"+nama+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            if (res.next()) {
                return id = res.getInt("id_ekskul");
                
           }
        } catch (Exception e) {
            
        }
        return -1;
    }
        
        public int cariIdMhs(String userNama){
        try {
            String sql = "SELECT * FROM user where nama_mhs='"+userNama+"'";
            java.sql.Connection conn = Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            if (res.next()) {
                return res.getInt("id_user");
           }
        } catch (Exception e) {
            return -1;
        }
        return -1;
    }
}
