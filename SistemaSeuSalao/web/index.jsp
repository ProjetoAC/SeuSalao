<%-- 
    Document   : login
    Created on : 12/10/2016, 17:32:16
    Author     : vinicius
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet">
         <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body style="background: #666; margin: 0">
        <div class="tela-login">
            <div class="login-logo">
                <img src="img/logo.png" style="width: 40%; height: 40%">
            </div>
            <% if (request.getAttribute("erro")!= null){%>
             <div class="alert alert-danger" role="alert">
                ${erro}
             </div>   
            <%}%>
            
            <div class="campos-login">
                <form method="post" action="ServletLogin">
                <div class="input-group input-group-lg">
                    <span class="input-group-addon" id="sizing-addon1">@</span>
                    <input name="ds_login" type="text" class="form-control" placeholder="Usuário" aria-describedby="sizing-addon1">
                </div>
                <div class="input-group input-group-lg input-cpf-telefone">
                    <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-key"></i></span>
                    <input name="nr_senha" type="password" class="form-control" placeholder="Senha" aria-describedby="sizing-addon1">
                </div>
                <button type="submit" class="btn btn-default">Entrar</button>
                </form>
            </div>
        </div>
    </body>
</html>
