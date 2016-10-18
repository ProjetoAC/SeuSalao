/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinicius
 */
class DAOUpdate {

    static void updateCliente(int id_cliente,String ds_nome,int nr_telefone,String ds_email,String ds_endereco,int ds_cpf) {
        
        PreparedStatement ps = ConexaoDB.getConnection("update cliente set ds_nome=? ,nr_telefone=?, ds_email=?, ds_endereco=?, ds_cpf=? where id_cliente=?");
        try {
            ps.setString(1, ds_nome);
            ps.setInt(2,nr_telefone);
            ps.setString(3, ds_nome);
            ps.setString(4, ds_endereco);
            ps.setInt(5, ds_cpf);
            ps.setInt(6, id_cliente);
            
            
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    static void updateFuncionario(int id_funcionario,String ds_nome,int nr_telefone,String ds_email,String ds_endereco,int ds_cpf,int id_perfil) {
         
        PreparedStatement ps = ConexaoDB.getConnection("update funcionario set id_perfil=? ds_nome=? ,nr_telefone=?, ds_email=?, ds_endereco=?, ds_cpf=? where id_funcionario=?");
        try {
            ps.setString(1, ds_nome);
            ps.setInt(2,nr_telefone);
            ps.setString(3, ds_nome);
            ps.setString(4, ds_endereco);
            ps.setInt(5, ds_cpf);
 
            ps.setInt(6, id_perfil);
            ps.setInt(7, id_funcionario);
            
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    

    static void updateMovimentacao(int id_cliente,int id_funcionario,String ds_descricao,String ds_operacao,double vl_valor,int id_caixa) {
        PreparedStatement ps = ConexaoDB.getConnection("update movimentacao set id_cliente=? ,id_funcionario=?, ds_descricao=?, ds_operacao=?, vl_valor=?, id_caixa=?");
        try {
            ps.setInt(1, id_cliente);
            ps.setInt(2,id_funcionario);
            ps.setString(3, ds_descricao);
            ps.setString(4, ds_operacao);
            ps.setDouble(5, vl_valor);
            ps.setInt(6, id_caixa);
           
            
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    static void updateProdutos(int id_produto,String ds_descricao,double vl_valor,int nr_quantidade) {
        PreparedStatement ps = ConexaoDB.getConnection("update produtos set ds_descricao=? ,vl_valor=?, nr_quantidade=? where id_produto=?");
        try {
            ps.setString(1, ds_descricao);
            ps.setDouble(2, vl_valor);
            ps.setInt(3, nr_quantidade);
            ps.setInt(4, id_produto);
            
            
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
     static void updateUsuario(int id_usuario,String ds_login,int nr_senha) {
         
         
         
        PreparedStatement ps = ConexaoDB.getConnection("update usuario set ds_login=?, nr_senha=? where id_usuario=?");
        try {
            
            ps.setString(1, ds_login);
            ps.setInt(2, nr_senha);
            ps.setInt(3,id_usuario);
            
            
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
    
  