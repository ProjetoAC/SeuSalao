package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pacotes.*;

public final class frente_002dde_002dcaixa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/master-pages/menu-top.jsp");
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"/css/bootstrap.min.css\" media=\"all\">\n");
      out.write("        <title>Frente de Caixa</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
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
      out.write("                    <li><a href=\"cadastro-cliente.jsp\"><i class=\"fa fa-users fa-2x components-menu\"></i><font>Cadastro de Cliente</font></a></li>\n");
      out.write("                    <li><a href=\"cadastro-funcionario.jsp\"><i class=\"fa fa-user fa-2x components-menu\"></i><font>Cadastro de Funcionário</font></a></li>\n");
      out.write("                    <li><a href=\"cadastro-produto.jsp\"><i class=\"fa fa-scissors fa-2x components-menu\"></i><font>Cadastro de Produto</font></a></li>\n");
      out.write("                    <li><a href=\"login-administrativo.jsp\"><i class=\"fa fa-university fa-2x components-menu\"></i><font>Administrativo</font></a></li>\n");
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
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sub-top-menu\">\n");
      out.write("            <a href=\"realizar-movimentacao.jsp\"><i class=\"fa fa-shopping-cart fa-3x\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"frente-de-caixa\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr style=\"font-weight: bold\">\n");
      out.write("                        <td>Cliente</td>\n");
      out.write("                        <td>Descrição</td>\n");
      out.write("                        <td>Operação</td>\n");
      out.write("                        <td>Funcionario</td>\n");
      out.write("                        <td>Valor</td>\n");
      out.write("                        <td>Data</td>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        for (Movimentacao movimentacao : DAOListar.ListarMovimentacao()) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(movimentacao.id_cliente.ds_nome);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(movimentacao.ds_descricao);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(movimentacao.ds_operacao);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(movimentacao.id_funcionario.ds_nome);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(movimentacao.vl_valor);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(movimentacao.dt_data);
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("                <form method=\"post\" action=\"ServletFecharCaixa\">\n");
      out.write("            <button class=\"btn btn-default\" action=\"ServletFecharCaixa\">Fechar Caixa</button>\n");
      out.write("                </form>\n");
      out.write("        </div>\n");
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
