package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<!-- basic -->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<!-- mobile metas -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("<!-- site metas -->\n");
      out.write("<title>View All Customer</title>\n");
      out.write("<meta name=\"keywords\" content=\"\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("<!-- bootstrap css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<!-- style css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<!-- Responsive-->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("<!-- fevicon -->\n");
      out.write("<link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\n");
      out.write("<!-- Scrollbar Custom CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("<!-- Tweaks for older IEs-->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("<!-- body -->\n");
      out.write("<body class=\"main-layout\">\n");
      out.write("<!-- loader  -->\n");
      out.write("<div class=\"loader_bg\">\n");
      out.write("  <div class=\"loader\"><img src=\"images/loading.gif\" alt=\"#\" /></div>\n");
      out.write("</div>\n");
      out.write("<!-- end loader --> \n");
      out.write("<!-- header -->\n");
      out.write("<header> \n");
      out.write("  <!-- header inner -->\n");
      out.write("  <div class=\"head-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("          <div class=\"email\"> <a href=\"#\">Email : nandinigangrade2000@gmail.com</a> </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("          <div class=\"icon\"> <i> <a href=\"#\"><img src=\"icon/facebook.png\"></a></i> <i> <a href=\"#\"><img src=\"icon/Twitter.png\"></a></i> <i> <a href=\"#\"><img src=\"icon/linkedin.png\"></a></i> <i> <a href=\"#\"><img src=\"icon/google+.png\"></a></i> </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-4\">\n");
      out.write("          <div class=\"contact\"> <a href=\"#\">Contact :  +91 8269097</a> </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section\">\n");
      out.write("        <div class=\"full\">\n");
      out.write("          <div class=\"center-desk\">\n");
      out.write("            <div class=\"logo\"> <a href=\"index.html\"><img src=\"images/logo.jpg\" alt=\"#\"></a> </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-xl-9 col-lg-9 col-md-9 col-sm-9\">\n");
      out.write("        <div class=\"menu-area\">\n");
      out.write("          <div class=\"limit-box\">\n");
      out.write("            <nav class=\"main-menu\">\n");
      out.write("              <ul class=\"menu-area-main\">\n");
      out.write("                <li class=\"active\"> <a href=\"index.html\">Home</a> </li>\n");
      out.write("                <li> <a href=\"aboutus.html\">About</a> </li>\n");
      out.write("                <li class=\"active\"> <a href=\"Currency.html\"> Transaction</a> </li>\n");
      out.write("                <li> <a href=\"Team.html\">Team</a> </li>\n");
      out.write("                <li> <a href=\"contact.html\">Contact us</a> </li>\n");
      out.write("                <li> <a href=\"#\"><img src=\"images/search_icon.png\" alt=\"#\" /></a> </li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- end header inner --> \n");
      out.write("</header>\n");
      out.write("<!-- end header -->\n");
      out.write("\n");
      out.write("<div class=\"Currency-bg\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("        <div class=\"abouttitle\">\n");
      out.write("          <h2>View All Customers</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Currency -->\n");
      out.write("<div class=\"Currency\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-12\">\n");
      out.write("        <div class=\"titlepage\">\n");
      out.write("          <span><img src=\"images/boder.png\" alt=\"img\"/> </span> </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("        <div class=\"three-box\">\n");
      out.write("          <figure><img src=\"images/1.jpg\" alt=\"img\"/></figure>\n");
      out.write("          <div class=\"Bitcoin\"> <i><img src=\"images/dollar.png\" alt=\"img\"/></i>\n");
      out.write("            <h3>Bitcoin Transaction</h3>\n");
      out.write("            <p>ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud lit esse </p>\n");
      out.write("          </div>\n");
      out.write("          <a class=\"read-more\" href=\"#\">Read More</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("        <div class=\"three-box\">\n");
      out.write("          <figure><img src=\"images/2.jpg\" alt=\"img\"/></figure>\n");
      out.write("          <div class=\"Bitcoin\"> <i><img src=\"images/dollar.png\" alt=\"img\"/></i>\n");
      out.write("            <h3>Bitcoin Exchange</h3>\n");
      out.write("            <p>ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud </p>\n");
      out.write("          </div>\n");
      out.write("          <a class=\"read-more\" href=\"#\">Read More</a> </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("        <div class=\"three-box\">\n");
      out.write("          <figure><img src=\"images/3.jpg\" alt=\"img\"/></figure>\n");
      out.write("          <div class=\"Bitcoin\"> <i><img src=\"images/dollar.png\" alt=\"img\"/></i>\n");
      out.write("            <h3>Bitcoin Investment</h3>\n");
      out.write("            <p>ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud </p>\n");
      out.write("          </div>\n");
      out.write("          <a class=\"read-more\" href=\"#\">Read More</a> </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- end Currency --> \n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer>\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-xl-4 col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("          <div class=\"Contact\">\n");
      out.write("            <h3>Contact Us</h3>\n");
      out.write("            <ul class=\"contant_icon\">\n");
      out.write("              <li> <a href=\"#\"><img src=\"icon/location.png\"></a></li>\n");
      out.write("              <li> <a href=\"#\"><img src=\"icon/tellephone.png\"></a></li>\n");
      out.write("              <li> <a href=\"#\"><img src=\"icon/email.png\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xl-3 col-lg-3 col-md-3 col-sm-12\">\n");
      out.write("          <div class=\"Social\">\n");
      out.write("            <h3>Social links</h3>\n");
      out.write("            <ul class=\"socil_link\">\n");
      out.write("              <li><a href=\"#\"><img src=\"icon/fb.png\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"icon/Tw.png\"></a></li>\n");
      out.write("              <li> <a href=\"#\"><img src=\"icon/lin.png\"></a></li>\n");
      out.write("              <li> <a href=\"#\"><img src=\"icon/insta.png\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xl-5 col-lg-5 col-md-5 col-sm-12\">\n");
      out.write("          <div class=\"newsletter\">\n");
      out.write("            <h3>newsletter</h3>\n");
      out.write("            <input class=\"new\" placeholder=\"Enter your email\" type=\"Enter your email\" >\n");
      out.write("            <button class=\"subscribe\">subscribe</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"copyright\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p>Copyright 2019 All Right Reserved By <a href=\"http://html.design\">Free html Templates</a></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<!-- end footer --> \n");
      out.write("<!-- Javascript files--> \n");
      out.write("<script src=\"js/jquery.min.js\"></script> \n");
      out.write("<script src=\"js/popper.min.js\"></script> \n");
      out.write("<script src=\"js/bootstrap.bundle.min.js\"></script> \n");
      out.write("<script src=\"js/jquery-3.0.0.min.js\"></script> \n");
      out.write("<script src=\"js/plugin.js\"></script> \n");
      out.write("\n");
      out.write("<!-- sidebar --> \n");
      out.write("<script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script> \n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("</body>\n");
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
