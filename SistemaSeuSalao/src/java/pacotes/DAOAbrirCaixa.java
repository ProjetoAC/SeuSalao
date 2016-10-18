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
 * @author Senai
 */
public class DAOAbrirCaixa {
    
    static void AbrirCaixa(double vl_valorinicial){
                    
        
        PreparedStatement ps = ConexaoDB.getConnection(" insert into caixa (vl_valorinicial,ds_situacao) values (?,'aberto') ");
        try {
            ps.setDouble(1, vl_valorinicial);
            ps.executeUpdate();
            ps.getGeneratedKeys().next();
            
            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAbrirCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
