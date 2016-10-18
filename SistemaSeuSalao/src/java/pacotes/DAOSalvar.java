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
public class DAOSalvar {
    
    public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    static void salvarFuncionario(String ds_nome,int nr_telefone,String ds_email,String ds_endereco,int ds_cpf,int id_perfil) {
        Funcionario funcionario = new Funcionario();
        funcionario.ds_nome = ds_nome;
        funcionario.ds_cpf = ds_cpf;
        funcionario.ds_email= ds_email;
        funcionario.ds_endereco= ds_endereco;
        funcionario.nr_telefone= nr_telefone;
        funcionario.id_perfil = id_perfil;
        
     
        funcionarios.add(funcionario);
        
        
        try {
            PreparedStatement ps = ConexaoDB.getConnection("insert into funcionario(ds_nome,nr_telefone,ds_email,ds_endereco,ds_cpf,id_perfil) values(?,?,?,?,?,?)");
            ps.setString(1, ds_nome);
            ps.setInt(2, nr_telefone);
            ps.setString(3, ds_email);
            ps.setString(4, ds_endereco);
            ps.setInt(5, ds_cpf);
            ps.setInt(6, id_perfil);
            
            
            ps.executeUpdate();
            
            ps.getGeneratedKeys().next();
            funcionario.id_funcionario = ps.getGeneratedKeys().getInt("id_funcionario");
            
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static void salvarCliente(String ds_nome,int nr_telefone,String ds_email,String ds_endereco,int ds_cpf) {
        Cliente cliente = new Cliente();
        cliente.ds_nome = ds_nome;
        cliente.nr_telefone= nr_telefone;
        cliente.ds_email= ds_email;
        cliente.ds_endereco= ds_endereco;
        cliente.ds_cpf= ds_cpf;
        
        
        clientes.add(cliente);
        try {
            PreparedStatement ps = ConexaoDB.getConnection("insert into cliente(ds_nome,nr_telefone,ds_email,ds_endereco,ds_cpf) values(?,?,?,?,?)");
            ps.setString(1, ds_nome);
            ps.setInt(2, nr_telefone);
            ps.setString(3, ds_email);
            ps.setString(4, ds_endereco);
            ps.setInt(5, ds_cpf);
            
            ps.executeUpdate();
            
            ps.getGeneratedKeys().next();
            cliente.id_cliente = ps.getGeneratedKeys().getInt("id_cliente");
            
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void salvarMovimentacao(int id_cliente, int id_funcionario, String ds_descricao,String ds_operacao, double vl_valor) {
        Funcionario funcionario = DAOBuscar.buscarFuncionario(id_funcionario);
        Cliente cliente = DAOBuscar.buscarCliente(id_cliente);
        ArrayList<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();
        Movimentacao movimentacao = new Movimentacao();
        try {
            PreparedStatement as = ConexaoDB.getConnection("select * from caixa where ds_situacao='aberto' ");
            
            
            ResultSet rs = as.executeQuery();
            
            Caixa caixa = new Caixa();
            
            if (rs.next()){
                
            caixa.vl_valorinicial= rs.getInt("vl_valorinicial");
            caixa.ds_situacao= rs.getString("ds_situacao");
            caixa.id_caixa= rs.getInt("id_caixa");
            
            rs.close();
            as.close();
            as.getConnection().close();
            }
            
            PreparedStatement ps = ConexaoDB.getConnection("insert into movimentacao (id_cliente,id_funcionario,ds_descricao,ds_operacao,vl_valor,id_caixa) values (?,?,?,?,?,?)");
            ps.setInt(1, id_cliente);
            ps.setInt(2, id_funcionario);
            ps.setString(3, ds_descricao);
            ps.setString(4, ds_operacao);
            ps.setDouble(5, vl_valor);
            ps.setInt(6, caixa.id_caixa);
            
            
            
            ps.executeUpdate();
            
            ps.getGeneratedKeys().next();
            movimentacao.id_movimentacao = ps.getGeneratedKeys().getInt("id_movimentacao");
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static ArrayList<Produtos> produtos = new ArrayList<Produtos>();
    
    static void salvarProdutos(String ds_descricao,double vl_valor,int nr_quantidade){
        Produtos produto = new Produtos();
        produto.ds_descricao=ds_descricao;
        produto.nr_quantidade= nr_quantidade;
        produto.vl_valor= vl_valor;
        
        produtos.add(produto);
        
        PreparedStatement ps= ConexaoDB.getConnection("insert into produtos (ds_descricao,vl_valor,nr_quantidade) values (?,?,?)");
        try {
            ps.setString(1, ds_descricao);
            ps.setDouble(2, vl_valor);
            ps.setInt(3, nr_quantidade);
            
            ps.executeUpdate();
           
          
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }
    
    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    static void salvarUsuario(int id_perfil,String ds_login,int nr_senha){
        Usuario usuario = new Usuario();
        usuario.ds_login = ds_login;
        usuario.id_perfil= id_perfil;
        usuario.nr_senha= nr_senha;
        
        usuarios.add(usuario);
        
        PreparedStatement ps=ConexaoDB.getConnection(" insert into usuario (id_perfil,ds_login,nr_senha) values (?,?,?)");
        try {
            ps.setInt(1, id_perfil);
            ps.setString(2, ds_login);
            ps.setInt(3, nr_senha);
            ps.executeUpdate();
            ps.getGeneratedKeys().next();
            usuario.id_usuario = ps.getGeneratedKeys().getInt("id_usuario");
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOSalvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
}
