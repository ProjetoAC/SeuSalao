<%-- 
    Document   : alteracao-movimentacao
    Created on : 17/10/2016, 20:42:43
    Author     : vinicius
--%>

<%@page import="pacotes.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/estilo.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alteração Movimentação</title>
    </head>
    <body>
        <div><%@include file="master-pages/menu-top-adm.jsp"%></div>
        <div class="sub-top-menu">
        </div>
        <form method="post" action="ServletAlteracaoMovimentacao">
            <div class="telas-de-insercao">
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-usd"></i></span>
                    <select class="form-control" onchange="window.location='alteracao-movimentacao.jsp?id_movimentacao='+this.value">
                       <option>
                            Selecione a movimentacao
                        </option>
                        <% for (Movimentacao movimentacao : DAOListar.ListarMovimentacaoAlt()) {%>
                        <option value="<%= movimentacao.id_movimentacao%>"> 
                            <%= movimentacao.ds_descricao%>
                        </option>
                        <% } %>
                    </select>
                </div>
                <%
                    if (request.getParameter("id_movimentacao") != null) {
                        int id_movimentacao = Integer.valueOf(request.getParameter("id_movimentacao"));
                        Movimentacao movimentacao = DAOBuscar.buscarMovimentacao(id_movimentacao);
                %> 
                <input type="hidden" value="<%=movimentacao.id_movimentacao%>" name="id_movimentacao">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-heart"></i></span>
                    <input value="<%= movimentacao.id_cliente.ds_nome%>" name="id_cliente" class="form-control" placeholder="João da Silva">
                </div>
                <select name="ds_operacao">
                    <option value="Entrada">Entrada</option>
                    <option value="saída">Saída</option>
                </select>
                <div class="input-group">
                    <span class="input-group-addon"><i class="fa fa-"></i></span>
                    
                    <!-- AQUI VAI O SELECT DO CLIENTE -->
                    
                    <select>
                         <option>
                            Selecione o cliente
                        </option>
                        <% for (Movimentacao movimentacoes : DAOListar.ListarMovimentacaoAlt()) {%>
                        <option value="<%= movimentacoes.id_cliente%>"> 
                            <%= movimentacoes.id_cliente.ds_nome%>
                        </option>
                        <% } %>
                    </select>
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-pencil-square-o"></i></span>
                    <input value="<%= movimentacao.ds_descricao%>" name="ds_descricao" class="form-control" placeholder="Corte">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-usd"></i></span>
                    <input value="<%= movimentacao.vl_valor%>" name="vl_valor" class="form-control" placeholder="50">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-usd"></i></span>
                    <input value="<%= movimentacao.id_caixa%>" name="id_caixa" class="form-control" placeholder="50">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-usd"></i></span>
                    <input value="<%= movimentacao.dt_data%>" name="dt_data" class="form-control" placeholder="50">
                </div>
                <%}%>
            </div>
        </form>
    </body>
</html>
