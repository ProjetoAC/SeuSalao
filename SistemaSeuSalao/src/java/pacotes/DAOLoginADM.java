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
 * @author Molinete
 */
public class DAOLoginADM {

    

    public static Usuario Login(String ds_login, int nr_senha ) {
       PreparedStatement ps = ConexaoDB.getConnection("select * from usuario where ds_login=? and nr_senha =? and id_perfil=1");
        try {
           /* PreparedStatement as = ConexaoDB.getConnection(" select perfil.id_perfil from usuario,perfil where perfil.id_perfil= usuario.id_perfil and perfil.ds_nome='administrativo'");
            ResultSet rs = as.executeQuery();
            rs.next();

            usuario.id_perfil = rs.getInt("id_perfil");
            rs.close();
            as.close();
            as.getConnection().close();
            */
            
            
            ps.setString(1, ds_login);
            ps.setInt(2, nr_senha);
            /*ps.setInt(3, usuario.id_perfil);*/

            ResultSet rss = ps.executeQuery();

            if (rss.next()) {
                Usuario usuario = new Usuario();
                
                usuario.id_usuario = rss.getInt("id_usuario");
                usuario.id_perfil = rss.getInt("id_perfil");
                
                

                rss.close();
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
