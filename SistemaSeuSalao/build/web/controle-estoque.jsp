<%-- 
    Document   : controle-estoque
    Created on : 17/10/2016, 14:00:25
    Author     : vinicius
--%>

<%@page import="pacotes.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/estilo.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle - Estoque</title>
    </head>
    <body>
        <div><%@include file="master-pages/menu-top.jsp" %></div>
        <div class="sub-top-menu">
        </div>
        <div class="telas-de-insercao">
            <table class="table">
                <thead>
                    <tr style="font-weight: bold">
                        <td>Descrição</td>
                        <td>Quantidade</td>
                        <td>Valor</td>
                    </tr>
                </thead>
                <tbody>
                     <%
                        for (Produtos produto : DAOListar.ListarProdutos()) {
                    %>
                    <tr>
                        <td><%=produto.ds_descricao%></td>
                        <td><%=produto.nr_quantidade%></td>
                        <td><%=produto.vl_valor%></td>
                       
                        
                     
                        
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
