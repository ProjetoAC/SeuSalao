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
public class DAODelete {

    static void deleteCliente(int id_cliente) {
        try {
            PreparedStatement ps = ConexaoDB.getConnection("DELETE FROM cliente WHERE id_cliente = ?");
            ps.setInt(1, id_cliente);
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAODelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void deleteMovimentacao(int id_movimentacao) {
        try {
            PreparedStatement ps = ConexaoDB.getConnection("DELETE FROM movimentacao WHERE id_movimentacao = ?");
            ps.setInt(1,id_movimentacao);
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAODelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void deleteFuncionario(int id_funcionario) {
        try {
            PreparedStatement ps = ConexaoDB.getConnection("DELETE FROM funcionario WHERE id_funcionario = ?");
            ps.setInt(1,id_funcionario);
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAODelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static void deleteProduto(int id_produto) {
        try {
            PreparedStatement ps = ConexaoDB.getConnection("DELETE FROM produtos WHERE id_produto = ?");
            ps.setInt(1,id_produto);
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAODelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void deleteUsuario(int id_usuario) {
        try {
            PreparedStatement ps = ConexaoDB.getConnection("DELETE FROM usuario WHERE id_usuario = ?");
            ps.setInt(1,id_usuario);
            ps.executeUpdate();
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAODelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
