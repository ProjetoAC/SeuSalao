/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinicius
 */
public class DAOListar {
    public static  ArrayList<Funcionario> ListarFuncionario(){
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        try {
            PreparedStatement ps = ConexaoDB.getConnection("select * from funcionario ORDER BY ds_nome");
           
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Funcionario funcionario = new Funcionario();
            funcionario.id_funcionario = rs.getInt("id_funcionario");
            funcionario.ds_nome = rs.getString("ds_nome");
            funcionario.ds_email=rs.getString("ds_email");
            funcionario.nr_telefone=rs.getInt("nr_telefone");
            
            funcionarios.add(funcionario);
            }
            rs.close();
            ps.close();
            ps.getConnection().close();
            
            return funcionarios;
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public static  ArrayList<Cliente> ListarCliente(){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        try {
            PreparedStatement ps = ConexaoDB.getConnection("select * from cliente ORDER BY ds_nome");
           
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Cliente cliente = new Cliente();
            cliente.ds_endereco = rs.getString("ds_endereco");
            cliente.ds_nome = rs.getString("ds_nome");
            cliente.ds_email=rs.getString("ds_email");
            cliente.nr_telefone=rs.getInt("nr_telefone");
            cliente.ds_cpf= rs.getInt("ds_cpf");
            cliente.id_cliente=rs.getInt("id_cliente");
            clientes.add(cliente);
            }
            rs.close();
            ps.close();
            ps.getConnection().close();
            
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public static  ArrayList<Movimentacao> ListarMovimentacao(){
        ArrayList<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();
        try {
            PreparedStatement ps = ConexaoDB.getConnection("SELECT cliente.ds_nome as nomecli,id_movimentacao, ds_descricao, ds_operacao, funcionario.ds_nome as nomefun, vl_valor,movimentacao.dt_data,movimentacao.id_caixa FROM "
                    + "movimentacao, cliente, funcionario,caixa "
                    
                    + "WHERE caixa.id_caixa=movimentacao.id_caixa and caixa.ds_situacao='aberto' and cliente.id_cliente = movimentacao.id_cliente AND funcionario.id_funcionario = movimentacao.id_funcionario");
           
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Movimentacao movimentacao = new Movimentacao();
            Caixa caixa = new Caixa();
            movimentacao.id_movimentacao= rs.getInt("id_movimentacao");
            movimentacao.id_cliente.ds_nome = rs.getString("nomecli");
            movimentacao.ds_descricao = rs.getString("ds_descricao");
            movimentacao.ds_operacao = rs.getString("ds_operacao");
            movimentacao.id_funcionario.ds_nome = rs.getString("nomefun");
            movimentacao.vl_valor = rs.getFloat("vl_valor");
            movimentacao.dt_data= rs.getDate("dt_data");
            movimentacao.id_caixa= rs.getInt("id_caixa");
            
            movimentacoes.add(movimentacao);
            }
            rs.close();
            ps.close();
            ps.getConnection().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return movimentacoes;
    }
    
    public static Caixa ListarCaixa(){
        Caixa caixa = new Caixa();
        try {
            PreparedStatement ps = ConexaoDB.getConnection("SELECT SUM(vl_valorfinal) AS total FROM caixa");
            ResultSet rs = ps.executeQuery();
            rs.next();
            caixa.vl_valorfinal = rs.getDouble("vl_valorfinal");
            
            rs.close();
            ps.close();
            ps.getConnection().close();
            return caixa;
        } catch (SQLException ex) {
            Logger.getLogger(DAOListar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static  ArrayList<Produtos> ListarProdutos(){
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();
        try {
            PreparedStatement ps = ConexaoDB.getConnection("select * from produtos ORDER BY ds_descricao");
          
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Produtos produto = new Produtos();
            produto.id_produto=rs.getInt("id_produto");
            produto.ds_descricao = rs.getString("ds_descricao");
            produto.id_produto = rs.getInt("id_produto");
            produto.nr_quantidade=rs.getInt("nr_quantidade");
            produto.vl_valor=rs.getDouble("vl_valor");
            produtos.add(produto);
            }
            rs.close();
            ps.close();
            ps.getConnection().close();
            
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    public static  ArrayList<Usuario> ListarUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            PreparedStatement ps = ConexaoDB.getConnection("select * from usuario  ");
            
          
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Usuario usuario = new Usuario();
            
            usuario.ds_login = rs.getString("ds_login");
            usuario.id_usuario = rs.getInt("id_usuario");
            usuario.nr_senha=rs.getInt("nr_senha");
            usuario.id_perfil=rs.getInt("id_perfil");
            usuarios.add(usuario);
            
            }
            rs.close();
            ps.close();
            ps.getConnection().close();
            
            return usuarios;
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public static  ArrayList<Movimentacao> ListarMovimentacaoAlt(){
        ArrayList<Movimentacao> movimentacao = new ArrayList<Movimentacao>();
        try {
            PreparedStatement ps = ConexaoDB.getConnection("SELECT cliente.ds_nome ,id_movimentacao, ds_descricao, ds_operacao, funcionario.ds_nome as nomefun, vl_valor,movimentacao.dt_data,id_caixa FROM "
                    + "movimentacao, cliente, funcionario "
                    
                    + "WHERE cliente.id_cliente = movimentacao.id_cliente AND funcionario.id_funcionario = movimentacao.id_funcionario");
           
          
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Movimentacao movimentacoes = new Movimentacao();
            
            movimentacoes.id_movimentacao= rs.getInt("id_movimentacao");
            movimentacoes.id_cliente.ds_nome = rs.getString("ds_nome");
            movimentacoes.ds_descricao = rs.getString("ds_descricao");
            movimentacoes.ds_operacao = rs.getString("ds_operacao");
            movimentacoes.id_funcionario.ds_nome = rs.getString("nomefun");
            movimentacoes.vl_valor = rs.getFloat("vl_valor");
            movimentacoes.dt_data= rs.getDate("dt_data");
            movimentacoes.id_caixa= rs.getInt("id_caixa");
            
            }
            rs.close();
            ps.close();
            ps.getConnection().close();
            
            return movimentacao;
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}

