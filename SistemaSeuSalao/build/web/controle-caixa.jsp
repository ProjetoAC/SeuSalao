<%-- 
    Document   : controle-caixa
    Created on : 17/10/2016, 14:02:50
    Author     : vinicius
--%>

<%@page import="pacotes.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/estilo.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle - Caixa</title>
    </head>
    <body>
        <div><%@include file="master-pages/menu-top.jsp"%></div>
        <div class="sub-top-menu">
        </div>
        <div class="telas-de-insercao">
            <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-line-chart"></i></span>
                <select class="form-control">
           
                </select>
            </div>

            <table class="table">
                <thead>
                    <tr style="font-weight: bold">
                        <td>Cliente</td>
                        <td>Descrição</td>
                        <td>Funcionário</td>
                        <td>Valor</td>
                        <td>Data</td>
                        <td>Operacaor</td>
                        <td>Caixa</td>

                    </tr>
                </thead>
                <tbody>
                    <% for (Movimentacao movimentacao : DAOListar.ListarMovimentacao()) {%>  
                    <tr>
                <td> <%= movimentacao.id_cliente.ds_nome%></td>  
                <td> <%=  movimentacao.ds_descricao%></td>
                <td> <%=movimentacao.id_funcionario.ds_nome%></td>     
                <td> <%= movimentacao.vl_valor%></td>
                <td><%= movimentacao.ds_operacao%></td>                            
                <td><%= movimentacao.dt_data%></td>
                <td><%= movimentacao.id_caixa%></td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
