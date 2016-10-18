/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotes;

import java.sql.Date;

/**
 *
 * @author vinicius
 */
public class Movimentacao {
    public Cliente id_cliente = new Cliente();
    public Funcionario id_funcionario = new Funcionario();
    public Integer id_movimentacao;
    public String ds_descricao;
    public String ds_operacao;
    public Float vl_valor;
    public Date dt_data;
    public int id_caixa;
}
