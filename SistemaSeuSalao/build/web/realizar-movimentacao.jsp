<%-- 
    Document   : realizar-movimentacao
    Created on : 12/10/2016, 19:25:15
    Author     : vinicius
--%>


<%@page import="pacotes.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css" media="all">
        <link rel="stylesheet" 
              href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.11.2/css/bootstrap-select.min.css">
        <title>Realizar Movimentação</title>
    </head>
    <body>
        <div>
            <%@include file="master-pages/menu-top.jsp" %>
        </div>
        <div class="sub-top-menu">
            <i class="fa fa-usd fa-3x desc-sub-top-menu"></i>
            <label>Movimentação</label>
        </div>
        <form method="post" action="ServletMovimentacao">
            <div class="telas-de-insercao">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-heart"></i></span>
                    <select name="id_cliente" class="form-control ">
                        <% for(Cliente cliente  : DAOListar.ListarCliente()) { %>
                <option value="<%= cliente.id_cliente %>"> 
                    <%= cliente.ds_nome %>
                </option>
                <% } %>
                        
                    </select>
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-pencil-square-o"></i></span>
                    <input name="ds_descricao" class="form-control" placeholder="Descrição" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg input-cpf-telefone">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-exchange"></i></span>
                    <select name="ds_operacao" class="form-control">
                        <option value="Entrada">Entrada</option>
                        <option value="Saída">Saida</option>
                    </select>
                </div>
                <div class="input-group input-group-lg input-cpf-telefone">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-users"></i></span>
                    <select name="id_funcionario" class="form-control">
                         <% for(Funcionario funcionario  : DAOListar.ListarFuncionario()) { %>
                <option value="<%= funcionario.id_funcionario %>"> 
                    <%= funcionario.ds_nome %>
                </option>
                <% } %>
                    </select>
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-usd"></i></span>
                    <input name="vl_valor" class="form-control" placeholder="50" aria-describedby="sizing-addon1">
                    <span class="input-group-addon" id="sizing-addon1">.00</span>
                </div>
                <button type="submit" class="btn btn-default">Cadastrar</button>
            </div>
        </form>
    </body>
</html>
