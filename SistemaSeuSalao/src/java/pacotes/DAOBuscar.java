/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotes;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinicius
 */
public class DAOBuscar {
    public static Funcionario buscarFuncionario(int id_funcionario){
        try {
            
            PreparedStatement ps = ConexaoDB.getConnection("select * from funcionario where id_funcionario = ?");
            ps.setInt(1, id_funcionario);
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            Funcionario funcionario = new Funcionario();
            funcionario.id_funcionario= rs.getInt("id_funcionario");
            funcionario.ds_nome = rs.getString("ds_nome");
            
            rs.close();
            ps.close();
            ps.getConnection().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    return null;
    } 
    public static Cliente buscarCliente(int id_cliente){
        try {
            
            PreparedStatement ps = ConexaoDB.getConnection("select * from cliente where id_cliente = ?");
            ps.setInt(1, id_cliente);
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            Cliente cliente = new Cliente();
            cliente.ds_endereco = rs.getString("ds_endereco");
            cliente.ds_nome = rs.getString("ds_nome");
            cliente.ds_email=rs.getString("ds_email");
            cliente.nr_telefone=rs.getInt("nr_telefone");
            cliente.ds_cpf= rs.getInt("ds_cpf");
            cliente.id_cliente=rs.getInt("id_cliente");
            
            rs.close();
            ps.close();
            ps.getConnection().close();
            
            return cliente;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    return null;
    } 
    
     public static Produtos buscarProduto(int id_produto){
         
        try {
           
            PreparedStatement ps = ConexaoDB.getConnection("select * from produtos where id_produto = ?");
            ps.setInt(1, id_produto);
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            Produtos produto = new Produtos();
            produto.id_produto = rs.getInt("id_produto");
            produto.ds_descricao= rs.getString("ds_descricao");
            produto.nr_quantidade=rs.getInt("nr_quantidade");
            produto.vl_valor=rs.getDouble("vl_valor");
            
            rs.close();
            ps.close();
            ps.getConnection().close();
                    
            return produto;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
            
     }
     public static Usuario buscarUsuario(int id_usuario){
         
        try {
            
            
            PreparedStatement ps = ConexaoDB.getConnection("select * from usuario where id_usuario = ?");
            ps.setInt(1, id_usuario);
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            Usuario usuario = new Usuario();
            usuario.id_usuario=rs.getInt("id_usuario");
            usuario.ds_login = rs.getString("ds_login");
            usuario.nr_senha= rs.getInt("nr_senha");
            
            
            rs.close();
            ps.close();
          ps.getConnection().close();
          return usuario;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
        
            
     }
     
     public static Movimentacao buscarMovimentacao(int id_movimentacao){
         
        try {
            
            
            PreparedStatement ps = ConexaoDB.getConnection("select * from movimentacao where id_movimentacao =?");
            ps.setInt(1, id_movimentacao);
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            Movimentacao movimentacao = new Movimentacao();
            movimentacao.id_movimentacao=rs.getInt("id_movimentacao");
            movimentacao.ds_operacao = rs.getString("ds_operacao");
            movimentacao.ds_descricao= rs.getString("ds_descricao");
            movimentacao.dt_data= rs.getDate("dt_data");
            movimentacao.id_cliente.ds_nome= rs.getString("id_cliente");
            movimentacao.vl_valor= rs.getFloat("vl_valor");
            movimentacao.id_caixa= rs.getInt("id_caixa");
            movimentacao.id_funcionario.ds_nome= rs.getString("id_funcionario");
            
            
            
            rs.close();
            ps.close();
          ps.getConnection().close();
          return movimentacao;
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
        
            
     }

}   

