/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.24
 * Generated at: 2019-04-05 10:44:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" >\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.come/ajax/libs/jquery/3.3.1/jquery.min.css\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.css\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Customer Register</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<h2>Customer Register</h2>\r\n");
      out.write("\t\t<form action=\"CustomerController\" method=\"post\">\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\" style=\"width:60%;\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\"><center>Customer Registration</center></th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">ID</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"CustomerId\" required=\"required\" placeholder=\"CustomerId\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">First Name</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"cFirstName\" required=\"required\" placeholder=\"FirstName\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">Last Name</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"cLastName\" required=\"required\" placeholder=\"LastName\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">Gender</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"cGender\" required=\"required\" placeholder=\"Gender\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">Contact</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"cContact\" required=\"required\" placeholder=\"Contact\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">Address</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"caddress\" required=\"required\" placeholder=\"Address\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">Area Residence</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"carea\" required=\"required\" placeholder=\"Area Residence\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">City</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"ccity\" required=\"required\" placeholder=\"City\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">PostalCode</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"cpostal\" required=\"required\" placeholder=\"PostalCode\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">Country</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"ccountry\" required=\"required\" placeholder=\"Country\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">Profession</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"cprofession\" required=\"required\" placeholder=\"Profession\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align: center; padding-top: 15px; font-weight: bold;\">Password</td>\r\n");
      out.write("\t\t\t<td><input type=\"password\" name=\"cPassword\" required=\"required\" placeholder=\"*******\" class=\"form-control\"></td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"submit\" value=\"register\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t<input style=\"text-align: center;\" type=\"reset\" value=\"Reset\" class=\"btn btn-info\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\t<a href=\"Login.jsp\" style=\"text-align: center;\">Login</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</center>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
