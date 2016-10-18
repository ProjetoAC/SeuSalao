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
public class DAOFecharCaixa {

    static void FecharCaixa() {
        try {
            PreparedStatement as = ConexaoDB.getConnection("select * from caixa where ds_situacao='aberto'");
            ResultSet rs = as.executeQuery();
            rs.next();

            Caixa caixa = new Caixa();
            caixa.id_caixa = rs.getInt("id_caixa");

            rs.close();

            PreparedStatement cs = ConexaoDB.getConnection("select sum(vl_valor) as valorfinal from movimentacao where id_caixa=?");
            cs.setInt(1, caixa.id_caixa);
            ResultSet fs = cs.executeQuery();
            fs.next();

            Movimentacao movimentacao = new Movimentacao();
            movimentacao.vl_valor = fs.getFloat("valorfinal");

            fs.close();

            PreparedStatement ps = ConexaoDB.getConnection(" update caixa set vl_valorfinal=?, ds_situacao='fechado'  where id_caixa=? ");

            ps.setDouble(1, movimentacao.vl_valor);
            ps.setInt(2, caixa.id_caixa);

            ps.executeUpdate();
            ps.getGeneratedKeys().next();

            ps.close();
            ps.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOAbrirCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
