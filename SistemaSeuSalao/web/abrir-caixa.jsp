<%-- 
    Document   : abrir-caixa
    Created on : 14/10/2016, 16:43:38
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/estilo.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Abrir Caixa</title>
    </head>
    <body>
        <div><%@include file="master-pages/menu-top-adm.jsp"%></div>
        <div class="sub-top-menu">
        </div>
        <div class="telas-de-insercao">
            <form method="post" action="ServletAbrirCaixa">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon"><i class="fa fa-usd"></i></span>
                    <input name="vl_valorinicial" class="form-control" placeholder="Valor em caixa">
                </div>
                <button class="btn btn-default" action="ServletAbrirCaixa">Abrir o Caixa</button>
            </form>
        </div>
    </body>
</html>
