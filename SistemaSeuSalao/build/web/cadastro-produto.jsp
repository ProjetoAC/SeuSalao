<%-- 
    Document   : cadastro-produto
    Created on : 13/10/2016, 20:24:16
    Author     : vinicius
--%>
<%@page import="pacotes.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
        <title>Cadastro de Produto</title>
    </head>
    <body>
        <div>
            <%@include file="master-pages/menu-top.jsp" %>
        </div>
        <div class="sub-top-menu">
            <i class="fa fa-plus-circle fa-3x desc-sub-top-menu"></i>
            <label>Produto</label>
        </div>
        <form method="post" action="ServletProdutos">
            <div class="telas-de-insercao">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-pencil-square-o"></i></span>
                    <input name="ds_descricao" class="form-control" placeholder="Descrição" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-list-ol"></i></span>
                    <input name="nr_quantidade" class="form-control" placeholder="Quantidade" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-usd"></i></span>
                    <input name="vl_valor" class="form-control" placeholder="10" aria-describedby="sizing-addon1">
                    <span class="input-group-addon" id="sizing-addon1">.00</span>
                </div>
                <button type="submit" class="btn btn-default">Cadastrar</button>
            </div>
        </form>
    </body>
</html>
