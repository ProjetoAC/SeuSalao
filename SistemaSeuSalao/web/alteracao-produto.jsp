<%-- 
    Document   : alteracao-produto
    Created on : 14/10/2016, 14:58:23
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pacotes.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
        <title>Alteração de Produto</title>
    </head>
    <body>
        <div><%@include file="master-pages/menu-top.jsp" %></div>
        <div class="sub-top-menu">
            <i class="fa fa-refresh fa-3x"></i>
            <label>Produto</label>
        </div>
        <form method="post" action="ServletAlteracaoProduto">
            <div class="telas-de-insercao">
                <div class="input-group input-group-lg">
                <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-heart"></i></span>
                <select  class="form-control" onchange="window.location='alteracao-produto.jsp?id_produto='+this.value">
                     <option>
                            Selecione o produto
                        </option>
                        <% for (Produtos produto  : DAOListar.ListarProdutos()) {%>
                        <option value="<%= produto.id_produto%>"> 
                            <%= produto.ds_descricao%>
                        </option>
                        <% } %>
                </select>
               
            </div>
                 <%
                    if (request.getParameter("id_produto") != null) {

                        int id_produto= Integer.valueOf(request.getParameter("id_produto"));
                        Produtos produto = DAOBuscar.buscarProduto(id_produto);
                %>          
            <input type="hidden" value="<%=produto.id_produto%>" name="id_produto">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-pencil-square-o"></i></span>
                    <input value="<%= produto.ds_descricao%>" name="ds_descricao" class="form-control" placeholder="Descrição" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-list-ol"></i></span>
                    <input value="<%= produto.nr_quantidade%>" name="nr_quantidade" class="form-control" placeholder="Quantidade" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-usd"></i></span>
                    <input value="<%= produto.vl_valor%>" name="vl_valor" class="form-control" placeholder="10" aria-describedby="sizing-addon1">
                    <span class="input-group-addon" id="sizing-addon1">.00</span>
                </div>
                <button type="submit" class="btn btn-default">Cadastrar</button>
                 <%}%>
            </div>
        </form>
    </body>
</html>
