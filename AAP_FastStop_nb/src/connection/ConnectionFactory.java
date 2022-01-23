
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {
    
    private static final String bd = "aap_faststop";
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String user = "root";
    private static final String password = "";
    private static final String driver = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection(){
        
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url+bd, user, password);
            
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if(stmt != null){
            
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        closeConnection(con);
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs != null){
            
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        closeConnection(con, stmt);
    }
    
   
}
