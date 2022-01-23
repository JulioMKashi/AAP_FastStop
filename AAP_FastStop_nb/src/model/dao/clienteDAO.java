package model.dao;

import connection.ConnectionFactory;
import Model.bean.cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Cliente_del;
import model.bean.Cliente_sel;


public class clienteDAO {
    
    private Connection con = null;
    
    public clienteDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(cliente cliente) {
        
        String sql = "CALL cliente_IP " + " (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getDatanascimento());
            stmt.setString(5, cliente.getCnh());
            stmt.setString(6, cliente.getCpf());
            stmt.setString(7, cliente.getRg());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean selectByName(Cliente_sel c_sel){
        
        String sql = "CALL cliente_sel (?)";
        
         PreparedStatement stmt = null;
         ResultSet rs = null;
         
         try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c_sel.getCliente_nome());
            rs = stmt.executeQuery();
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<cliente> findAll(){
        String sql = "SELECT * FROM cliente";
        
        PreparedStatement stmt = null; 
        ResultSet rs = null; 
        
        List<cliente> clientes = new ArrayList<>();
        
       
        try {
            
            stmt = con.prepareStatement(sql);
             rs = stmt.executeQuery();
            
                  while (rs.next()){
            cliente cliente = new cliente();
            cliente.setNome(rs.getString("nome"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setEmail(rs.getString("email"));
            cliente.setDatanascimento(rs.getString("datanascimento"));
            cliente.setRg(rs.getString("rg"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setCnh(rs.getString("cnh"));
            clientes.add(cliente);
                  }
       } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return clientes;
}
    
   public boolean DeleteByID(Cliente_del c_del){
        
        String sql = "CALL cliente_del (?)";
        
         PreparedStatement stmt = null;
         ResultSet rs = null;
         
         try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, c_del.getCliente_ID_cliente());
            rs = stmt.executeQuery();
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}