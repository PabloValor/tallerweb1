package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Document</title>\r\n");
      out.write("\t<link href=\"/WEB_INF/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container theme-showcase\" role=\"main\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- Main jumbotron for a primary marketing message or call to action -->\r\n");
      out.write("\t\t<div class=\"jumbotron\">\r\n");
      out.write("\t\t\t<h1>Test</h1>\r\n");
      out.write("\t\t\t<p>This is a template showcasing the optional theme stylesheet\r\n");
      out.write("\t\t\t\tincluded in Bootstrap. Use it as a starting point to create\r\n");
      out.write("\t\t\t\tsomething more unique by building on or modifying it.</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t<h1>Buttons</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-lg btn-default\">Default</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-lg btn-primary\">Primary</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-lg btn-success\">Success</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-lg btn-info\">Info</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-lg btn-warning\">Warning</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-lg btn-danger\">Danger</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-lg btn-link\">Link</button>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default\">Default</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-primary\">Primary</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-success\">Success</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-info\">Info</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-warning\">Warning</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-danger\">Danger</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-link\">Link</button>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-sm btn-default\">Default</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-sm btn-primary\">Primary</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-sm btn-success\">Success</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-sm btn-info\">Info</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-sm btn-warning\">Warning</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-sm btn-danger\">Danger</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-sm btn-link\">Link</button>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-xs btn-default\">Default</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-xs btn-primary\">Primary</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-xs btn-success\">Success</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-xs btn-info\">Info</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-xs btn-warning\">Warning</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-xs btn-danger\">Danger</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-xs btn-link\">Link</button>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("\t<script src=\"../../js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("\t<script src=\"../../js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
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
