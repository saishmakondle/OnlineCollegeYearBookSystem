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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Online College Year Book</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\" integrity=\"sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("        ");

        if (request.getParameter("m1") != null) {
      out.write("\n");
      out.write("        <script>alert('Login Failed..!');</script> \n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");

        if (request.getParameter("msg") != null) {
      out.write("\n");
      out.write("        <script>alert('Registered Successfully..!');</script> \n");
      out.write("        ");
}
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- Main Header -->\n");
      out.write("    <header class=\"main-header\">\n");
      out.write("        <center><h1>Online College Year Book</h1></center>\n");
      out.write("    </header>\n");
      out.write("    <!-- Dropdown Navbar -->\n");
      out.write("    <nav>\n");
      out.write("         <ul>\n");
      out.write("            <li><a href=\"index.html\" >Home</a></li>\n");
      out.write("            <li><a href=\"login.jsp\" class=\"active\">Login</a></li>\n");
      out.write("            <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <!-- Login Form -->\n");
      out.write("    <div class=\"form-div animated flip\">\n");
      out.write("        <img src=\"img/user.png\">\n");
      out.write("        <h2> Login Page</h2>\n");
      out.write("        <form action=\"loginact.jsp\" method=\"post\">\n");
      out.write("            <input type=\"text\" placeholder=\"Username\" name=\"username\" required=\"\" autocomplete=\"off\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" name=\"password\" required=\"\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <select name=\"utype\" id=\"\" required=\"\">\n");
      out.write("            <option value=\"\">--Select--</option>\n");
      out.write("            <option value=\"Admin\">Admin</option>\n");
      out.write("            <option value=\"Teacher\">Teacher</option>\n");
      out.write("            <option value=\"Student\">Student</option>\n");
      out.write("        </select>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Login\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <br><br>\n");
      out.write("    <br><br><br>\n");
      out.write("    <br>\n");
      out.write("    <!-- Main Footer -->\n");
      out.write("    <footer class=\"main-footer\">\n");
      out.write("        <p>Developed by <a href=\"\" target=\"_blank\">  </a></p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
