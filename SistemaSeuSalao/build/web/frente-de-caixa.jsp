<%-- 
    Document   : index
    Created on : 17/09/2016, 11:07:53
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pacotes.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css" media="all">
        <title>Frente de Caixa</title>
    </head>
    <body>
        <div id="menu">
            <%@include file="master-pages/menu-top.jsp" %>
        </div>
        <div class="sub-top-menu">
            <a href="realizar-movimentacao.jsp"><i class="fa fa-shopping-cart fa-3x"></i></a>
        </div>
        <div class="frente-de-caixa">
            <table class="table">
                <thead>
                    <tr style="font-weight: bold">
                        <td>Cliente</td>
                        <td>Descrição</td>
                        <td>Operação</td>
                        <td>Funcionario</td>
                        <td>Valor</td>
                        <td>Data</td>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Movimentacao movimentacao : DAOListar.ListarMovimentacao()) {
                    %>
                    <tr>
                        <td><%=movimentacao.id_cliente.ds_nome%></td>
                        <td><%=movimentacao.ds_descricao%></td>
                        <td><%=movimentacao.ds_operacao%></td>
                        <td><%=movimentacao.id_funcionario.ds_nome%></td>
                        <td><%=movimentacao.vl_valor%></td>
                        <td><%=movimentacao.dt_data%></td>
                        
                    </tr>
                    <% }%>
                </tbody>
            </table>
                <form method="post" action="ServletFecharCaixa">
            <button class="btn btn-default" action="ServletFecharCaixa">Fechar Caixa</button>
                </form>
        </div>
    </body>
</html>
