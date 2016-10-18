<%-- 
    Document   : configuracao
    Created on : 17/10/2016, 15:30:18
    Author     : vinicius
--%>

<%@page import="pacotes.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/estilo.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alteração de Login</title>
    </head>
    <body>
        <div><%@include file="master-pages/menu-top-adm.jsp" %></div>
        <div class="sub-top-menu"></div>
        <div class="telas-de-insercao">
            <form method="post" action="ServletAlteracaoUsuario">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon"><i class="fa fa-user"></i></span>
                    <select class="form-control" onchange="window.location='configuracao.jsp?id_usuario='+this.value">
                        <option>Selecione o usuário...</option>
                        <% for (Usuario usuario : DAOListar.ListarUsuarios()) {%> 
                        <option value="<%= usuario.id_usuario%>"> 
                            <%= usuario.ds_login%>
                        </option>
                        <% } %>
                    </select>
                </div>
                <%
                    if (request.getParameter("id_usuario") != null) {

                        int id_usuario = Integer.valueOf(request.getParameter("id_usuario"));
                        Usuario usuario = DAOBuscar.buscarUsuario(id_usuario);
                %>
                 <input type="hidden" value="<%=usuario.id_usuario%>" name="id_usuario">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-user"></i></span>
                    <input value="<%= usuario.ds_login%>" name="ds_login" class="form-control">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-user"></i></span>
                    <input value="<%= usuario.nr_senha%> " name="nr_senha" class="form-control">
                </div>
                <button type="submit" class="btn btn-default">Alterar Usuário</button>
                <%}%>
            </form>
        </div>
    </body>
</html>
