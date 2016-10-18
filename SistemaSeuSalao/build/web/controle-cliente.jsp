<%-- 
    Document   : controle-cliente
    Created on : 17/10/2016, 13:50:29
    Author     : vinicius
--%>

<%@page import="pacotes.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
        <title>Controle - Cliente</title>
    </head>
    <body>
        <div><%@include file="master-pages/menu-top.jsp" %></div>
        <div class="sub-top-menu">
        </div>
        <div class="telas-de-insercao">
            <table class="table">
                <thead>
                    <tr style="font-weight: bold">
                        <td>Nome</td>
                        <td>Telefone</td>
                        <td>E-Mail</td>
                        <td>Endereço</td>
                        <td>CPF</td>
                    </tr>
                </thead>
                <tbody>
                   <%
                        for (Cliente cliente : DAOListar.ListarCliente()) {
                    %>
                    <tr>
                        <td><%=cliente.ds_nome%></td>
                        <td><%=cliente.nr_telefone%></td>
                        <td><%=cliente.ds_email%></td>
                        <td><%=cliente.ds_endereco%></td>
                        <td><%=cliente.ds_cpf%></td>
                        
                     
                        
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
