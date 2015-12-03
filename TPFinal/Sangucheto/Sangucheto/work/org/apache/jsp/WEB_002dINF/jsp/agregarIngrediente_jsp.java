package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregarIngrediente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Sanguchetto</title>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"css/bootstrap-tema.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("  <!-- El logotipo y el icono que despliega el menú se agrupan\r\n");
      out.write("       para mostrarlos mejor en los dispositivos móviles -->\r\n");
      out.write("  <div class=\"navbar-header\">\r\n");
      out.write("    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("            data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("      <span class=\"sr-only\">Desplegar navegación</span>\r\n");
      out.write("      <span class=\"icon-bar\"></span>\r\n");
      out.write("      <span class=\"icon-bar\"></span>\r\n");
      out.write("      <span class=\"icon-bar\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">SANGUCHETTO</a>\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("  <!-- Agrupar los enlaces de navegación, los formularios y cualquier\r\n");
      out.write("       otro elemento que se pueda ocultar al minimizar la barra -->\r\n");
      out.write("  <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"active\"><a href=\"carrito\">Carrito\r\n");
      out.write("      <span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span>\r\n");
      out.write("      <span\tclass=\"badge\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cantProductosAgregados}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li class=\"dropdown\">\r\n");
      out.write("        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("          Stock <b class=\"caret\"></b>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"agregarStock\">Agregar Stock a Productos</a></li>          \r\n");
      out.write("          <li><a href=\"stockExistentes\">Stock de Productos Existentes</a></li>\r\n");
      out.write("          <li class=\"divider\"></li>\r\n");
      out.write("          <li><a href=\"eliminarIngrediente\">Eliminar Stock a Producto</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"dropdown\">\r\n");
      out.write("        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("          Ingredientes <b class=\"caret\"></b>\r\n");
      out.write("        </a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"agregarIngrediente\">Dar de Alta un Ingrediente</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li><a href=\"agregarAlCarrito\">Agregar a Carrito</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-xs-6 col-md-4\"></div>\r\n");
      out.write("\t\t<div class=\"col-xs-6 col-md-4\">\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\tIngrediente - <small>Alta</small>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xs-6 col-md-4\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<form action=\"insertarIngrediente\" method=\"POST\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-4\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-4\">\r\n");
      out.write("\t\t\t\tNombre: <input type=\"text\" name=\"nombre\" id=\"nombre\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\"></input> \r\n");
      out.write("\t\t\t\tPrecio: <input\r\n");
      out.write("\t\t\t\t\ttype=\"text\" name=\"precio\" id=\"precio\" class=\"form-control\"></input>\r\n");
      out.write("\t\t\t\tTipo: \r\n");
      out.write("                      <select class=\"form-control\" name=\"tipo\" id=\"tipo\">\r\n");
      out.write("                          <option value=\"INGREDIENTE\">Ingrediente</option>\r\n");
      out.write("                          <option value=\"CONDIMENTO\">Condimento</option>                                 \r\n");
      out.write("                      </select> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-4\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-4\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-4 text-center\">\r\n");
      out.write("\t\t\t\t</br> <input class=\"btn btn-primary\" type=\"submit\" name=\"btnAceptar\"\r\n");
      out.write("\t\t\t\t\tValue=\"Aceptar\"></input>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-4\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
