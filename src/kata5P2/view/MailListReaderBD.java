package kata5P2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5P2.model.Mail;

public class MailListReaderBD {
    public List<Mail> read(){
        List<Mail> res = new ArrayList();
        String sql = "SELECT direccion FROM EMAIL";
        try(Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while(rs.next()){
                res.add(new Mail(rs.getString("direccion")));
            }
            
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return res;
    } 


    private Connection connect() {
        String url = "jdbc:sqlite:Kata5.db";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
            System.out.println(conn.toString());
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
        
    }
    
    
    
}