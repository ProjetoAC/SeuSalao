<%-- 
    Document   : menu-top
    Created on : 12/10/2016, 12:11:21
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/estilo.css" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css" media="all">
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body>
        <div class="top-menu">
            <a href="frente-de-caixa.jsp"><img src="img/logo.png" class="logo-menu" style=""></a>
            <button class="btn-menu"><i class="fa fa-bars fa-lg"></i></button>
            <nav class="menu">
                <a class="btn-close"><i class="fa fa-minus-square-o"></i></a>
                <ul>
                    <li><a href="cadastro-cliente.jsp"><i class="fa fa-users fa-2x components-menu"></i><font>Cadastro de Cliente</font></a></li>
                    <li><a href="cadastro-funcionario.jsp"><i class="fa fa-user fa-2x components-menu"></i><font>Cadastro de Funcionário</font></a></li>
                    <li><a href="cadastro-produto.jsp"><i class="fa fa-scissors fa-2x components-menu"></i><font>Cadastro de Produto</font></a></li>
                    <li><a href="login-administrativo.jsp"><i class="fa fa-university fa-2x components-menu"></i><font>Administrativo</font></a></li>
                </ul>
            </nav>
        </div>
        <script src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
        <script>
            $(".btn-menu").click(function(){
                $(".menu").show();
            });
            $(".btn-close").click(function(){
                $(".menu").hide();
            });
        </script>
    </body>
</html>
