package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pacotes.*;

public final class alteracao_002dmovimentacao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/master-pages/menu-top-adm.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Alteração Movimentação</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/logo.png\" >\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../css/estilo.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"/css/bootstrap.min.css\" media=\"all\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"top-menu\">\n");
      out.write("            <a href=\"frente-de-caixa.jsp\"><img src=\"img/logo.png\" class=\"logo-menu\" style=\"\"></a>\n");
      out.write("            <button class=\"btn-menu\"><i class=\"fa fa-bars fa-lg\"></i></button>\n");
      out.write("            <nav class=\"menu\">\n");
      out.write("                <a class=\"btn-close\"><i class=\"fa fa-minus-square-o\"></i></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"configuracao.jsp\"><i class=\"fa fa-cogs fa-2x components-menu\"></i><font>Configurações</font></a></li>\n");
      out.write("                    <li><a href=\"abrir-caixa.jsp\"><i class=\"fa fa-calculator fa-2x components-menu\"></i><font>Abrir Caixa</font></a></li>\n");
      out.write("                    <li><a href=\"cadastro-cliente.jsp\"><i class=\"fa fa-users fa-2x components-menu\"></i><font>Cadastro de Cliente</font></a></li>\n");
      out.write("                    <li><a href=\"cadastro-funcionario.jsp\"><i class=\"fa fa-user fa-2x components-menu\"></i><font>Cadastro de Funcionário</font></a></li>\n");
      out.write("                    <li><a href=\"cadastro-produto.jsp\"><i class=\"fa fa-scissors fa-2x components-menu\"></i><font>Cadastro de Produto</font></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.12.4.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(\".btn-menu\").click(function(){\n");
      out.write("                $(\".menu\").show();\n");
      out.write("            });\n");
      out.write("            $(\".btn-close\").click(function(){\n");
      out.write("                $(\".menu\").hide();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("</div>\n");
      out.write("        <div class=\"sub-top-menu\">\n");
      out.write("        </div>\n");
      out.write("        <form method=\"post\" action=\"ServletAlteracaoMovimentacao\">\n");
      out.write("            <div class=\"telas-de-insercao\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <span class=\"input-group-addon\"><i class=\"fa fa-usd\"></i></span>\n");
      out.write("                    <select class=\"form-control\" onchange=\"window.location='alteracao-movimentacao.jsp?id_movimentacao='+this.value\">\n");
      out.write("                       <option>\n");
      out.write("                            Selecione a movimentacao\n");
      out.write("                        </option>\n");
      out.write("                        ");
 for (Movimentacao movimentacao : DAOListar.ListarMovimentacaoAlt()) {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print( movimentacao.id_movimentacao);
      out.write("\"> \n");
      out.write("                            ");
      out.print( movimentacao.ds_descricao);
      out.write("\n");
      out.write("                        </option>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                ");

                    if (request.getParameter("id_movimentacao") != null) {
                        int id_movimentacao = Integer.valueOf(request.getParameter("id_movimentacao"));
                        Movimentacao movimentacao = DAOBuscar.buscarMovimentacao(id_movimentacao);
                
      out.write(" \n");
      out.write("                <input type=\"hidden\" value=\"");
      out.print(movimentacao.id_movimentacao);
      out.write("\" name=\"id_movimentacao\">\n");
      out.write("                <div class=\"input-group input-group-lg\">\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon1\"><i class=\"fa fa-heart\"></i></span>\n");
      out.write("                    <input value=\"");
      out.print( movimentacao.id_cliente.ds_nome);
      out.write("\" name=\"id_cliente\" class=\"form-control\" placeholder=\"João da Silva\">\n");
      out.write("                </div>\n");
      out.write("                <select name=\"ds_operacao\">\n");
      out.write("                    <option value=\"Entrada\">Entrada</option>\n");
      out.write("                    <option value=\"saída\">Saída</option>\n");
      out.write("                </select>\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <span class=\"input-group-addon\"><i class=\"fa fa-\"></i></span>\n");
      out.write("                    \n");
      out.write("                    <!-- AQUI VAI O SELECT DO CLIENTE -->\n");
      out.write("                    \n");
      out.write("                    <select>\n");
      out.write("                         <option>\n");
      out.write("                            Selecione o cliente\n");
      out.write("                        </option>\n");
      out.write("                        ");
 for (Movimentacao movimentacoes : DAOListar.ListarMovimentacaoAlt()) {
      out.write("\n");
      out.write("                        <option value=\"");
      out.print( movimentacoes.id_cliente);
      out.write("\"> \n");
      out.write("                            ");
      out.print( movimentacoes.id_cliente.ds_nome);
      out.write("\n");
      out.write("                        </option>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group input-group-lg\">\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon1\"><i class=\"fa fa-pencil-square-o\"></i></span>\n");
      out.write("                    <input value=\"");
      out.print( movimentacao.ds_descricao);
      out.write("\" name=\"ds_descricao\" class=\"form-control\" placeholder=\"Corte\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group input-group-lg\">\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon1\"><i class=\"fa fa-usd\"></i></span>\n");
      out.write("                    <input value=\"");
      out.print( movimentacao.vl_valor);
      out.write("\" name=\"vl_valor\" class=\"form-control\" placeholder=\"50\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group input-group-lg\">\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon1\"><i class=\"fa fa-usd\"></i></span>\n");
      out.write("                    <input value=\"");
      out.print( movimentacao.id_caixa);
      out.write("\" name=\"id_caixa\" class=\"form-control\" placeholder=\"50\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-group input-group-lg\">\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon1\"><i class=\"fa fa-usd\"></i></span>\n");
      out.write("                    <input value=\"");
      out.print( movimentacao.dt_data);
      out.write("\" name=\"dt_data\" class=\"form-control\" placeholder=\"50\">\n");
      out.write("                </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
