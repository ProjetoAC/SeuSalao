<%-- 
    Document   : cadastro-cliente
    Created on : 12/10/2016, 16:07:00
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css" media="all">
        <title>Cadastro de Clientes</title>
    </head>
    <body>
        <div id="menu">
            <%@include file="master-pages/menu-top.jsp" %>
        </div>
        <form method="post" action="ServletCliente">
            <div class="sub-top-menu">
                <i class="fa fa-plus-circle fa-3x desc-sub-top-menu"></i>
                <label>Cliente</label>
            </div>
            <div class="telas-de-insercao">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1">Nome:</span>
                    <input name="ds_nome" class="form-control" placeholder="João da Silva" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg input-cpf-telefone">
                    <span class="input-group-addon" id="sizing-addon1">CPF:</span>
                    <input name="ds_cpf" class="form-control" placeholder="12345678900" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg input-cpf-telefone">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-phone"></i></span>
                    <input name="nr_telefone" class="form-control" placeholder="0012345678" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1">@</span>
                    <input name="ds_email" class="form-control" placeholder="exemplo@exemplo.com.br" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-home"></i></span>
                    <input name="ds_endereco" class="form-control" placeholder="Rua Muito Engraçada" aria-describedby="sizing-addon1">
                </div>
                <button type="submit" class="btn btn-default">Cadastrar</button>
            </div>
        </form>
    </body>
</html>
