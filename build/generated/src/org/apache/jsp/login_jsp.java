package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("    <title>Login And Registration page</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <form action=\"\" class=\"form\">\n");
      out.write("      <div class=\"action\">\n");
      out.write("        <span class=\"load show\" id=\"login-action\" onclick=\"openLoginPage()\"\n");
      out.write("          >Login</span\n");
      out.write("        >\n");
      out.write("        <span class=\"load\" onclick=\"openRegPage()\" id=\"reg-action\"\n");
      out.write("          >Register</span\n");
      out.write("        >\n");
      out.write("      </div>\n");
      out.write("      <div class=\"login show-page\">\n");
      out.write("        <input type=\"text\" placeholder=\"Username\" />\n");
      out.write("        <input type=\"password\" placeholder=\"Password\" />\n");
      out.write("        <button>Login</button>\n");
      out.write("        <a href=\"#\" onclick=\"openRegPage()\">Register</a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"reg\">\n");
      out.write("        <input type=\"text\" placeholder=\"Username\" />\n");
      out.write("        <input type=\"email\" placeholder=\"Email\" />\n");
      out.write("        <input type=\"password\" placeholder=\"Password\" />\n");
      out.write("        <button>Register</button>\n");
      out.write("        <a href=\"#\" onclick=\"openLoginPage()\">Login</a>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </body>\n");
      out.write("  <script>\n");
      out.write("    function openLoginPage() {\n");
      out.write("      document.querySelector(\".reg\").classList.remove(\"show-page\");\n");
      out.write("      document.querySelector(\".login\").classList.add(\"show-page\");\n");
      out.write("      document.getElementById(\"login-action\").classList.add(\"show\");\n");
      out.write("      document.getElementById(\"reg-action\").classList.remove(\"show\");\n");
      out.write("    }\n");
      out.write("    function openRegPage() {\n");
      out.write("      document.querySelector(\".reg\").classList.add(\"show-page\");\n");
      out.write("      document.querySelector(\".login\").classList.remove(\"show-page\");\n");
      out.write("      document.getElementById(\"reg-action\").classList.add(\"show\");\n");
      out.write("      document.getElementById(\"login-action\").classList.remove(\"show\");\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("</html>\n");
      out.write("\n");
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
