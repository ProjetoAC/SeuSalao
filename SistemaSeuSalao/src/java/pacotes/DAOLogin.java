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
 * @author Senai
 */
public class DAOLogin {
    public static Usuario Login(String ds_login,int nr_senha){
    
    PreparedStatement ps= ConexaoDB.getConnection("select * from usuario where ds_login=? and nr_senha =?");
        try {
            ps.setString(1, ds_login);
            ps.setInt(2, nr_senha);
            
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next()){
                Usuario usuario = new Usuario();
                usuario.id_usuario = rs.getInt("id_usuario");
                usuario.id_perfil = rs.getInt("id_perfil");
                
                rs.close();
                ps.close();
                ps.getConnection().close();
                
                return usuario;    
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return null;
}

}