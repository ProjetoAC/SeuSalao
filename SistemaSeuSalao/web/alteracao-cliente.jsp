<%-- 
    Document   : alteracao-cliente
    Created on : 13/10/2016, 16:46:02
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pacotes.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
        <title>Alteração de Cliente</title>
    </head>

    <body>

        <div>
            <%@include file="master-pages/menu-top.jsp" %>
        </div>
        <div class="sub-top-menu">
            <i class="fa fa-refresh fa-3x"></i>
            <label>Cliente</label>
        </div>

        <form method="post" action="ServletAlteracaoCliente">
            <div class="telas-de-insercao">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-heart"></i></span>
                    <select  class="form-control" onchange="window.location='alteracao-cliente.jsp?id_cliente='+this.value">
                        <option>
                            selecione um
                        </option>
                        <% for (Cliente cliente : DAOListar.ListarCliente()) {%>
                        <option value="<%= cliente.id_cliente%>"> 
                            <%= cliente.ds_nome%>
                        </option>
                        <% } %>
                    </select>
                </div>          
                <%
                    if (request.getParameter("id_cliente") != null) {

                        int id_cliente = Integer.valueOf(request.getParameter("id_cliente"));
                        Cliente cliente = DAOBuscar.buscarCliente(id_cliente);
                %>          
                <input type="hidden" value="<%=cliente.id_cliente%>" name="id_cliente">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1">Nome:</span>
                    <input value="<%= cliente.ds_nome%>" name="ds_nome" class="form-control" placeholder="João da Silva" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg input-cpf-telefone">
                    <span class="input-group-addon" id="sizing-addon1">CPF:</span>
                    <input value="<%= cliente.ds_cpf%>" name="ds_cpf" class="form-control" placeholder="12345678900" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg input-cpf-telefone">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-phone"></i></span>
                    <input value="<%= cliente.nr_telefone%>" name="nr_telefone" class="form-control" placeholder="0012345678" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1">@</span>
                    <input value="<%= cliente.ds_email%>" name="ds_email" class="form-control" placeholder="exemplo@exemplo.com.br" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-home"></i></span>
                    <input value="<%= cliente.ds_endereco%>" name="ds_endereco" class="form-control" placeholder="Rua Muito Engraçada" aria-describedby="sizing-addon1">
                </div>
                <button type="submit" class="btn btn-default">Cadastrar</button>
                <%}%>
            </div>
        </form>
    </body>
</html>
