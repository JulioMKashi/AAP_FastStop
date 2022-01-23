/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Model.bean.cliente;
import model.bean.Cliente_del;
import model.bean.Cliente_sel;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author user
 */
public class clienteDAOTest {
    
    public clienteDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        
        cliente cl = new cliente("Gustavo", "992061348", "julio5@fatec.com", "2001-12-10", "11213222333", "43435555666", "122222333");
        clienteDAO dao = new clienteDAO();
        
        if(dao.save(cl)){
            System.out.println("Salvo com sucesso");
        }else{
            fail("Erro ao salvar");
        }
    }
    
   
    @Test
    
    public void selecionar(){
        
       Cliente_sel c_sel = new Cliente_sel("'Gustavo'");
        clienteDAO dao = new clienteDAO();
        
        if(dao.selectByName(c_sel)){
            System.out.println("sucesso");
        }else{
            fail("Erro");
        }

    }
    
    @Test
    @Ignore
    public void listar(){
        
        clienteDAO dao = new clienteDAO();
        
        for(cliente c: dao.findAll()){
            
            System.out.println("nome: "+c.getNome());
            System.out.println("telefone: "+c.getTelefone());
            System.out.println("email: "+c.getEmail());
            System.out.println("datanascimento: "+c.getDatanascimento());
            System.out.println("cnh: "+c.getCnh());
            System.out.println("cpf: "+c.getCpf());
            System.out.println("rg: "+c.getRg());
            System.out.println("=========================");
            
        }
    }
    
    @Test
    @Ignore
    public void deletar(){
        
        Cliente_del c_del = new Cliente_del(4);
        clienteDAO dao = new clienteDAO();
        
        if(dao.DeleteByID(c_del)){
            System.out.println("sucesso");
        }else{
            fail("Erro");
        }
    }
    
}
