package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import database.DBConnector;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("   <!-- basic -->\n");
      out.write("   <meta name=\"viewport\" content=\"initial-scale=1.0; maximum-scale=1.0; width=device-width;\">\n");
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

                ResultSet rs=null;
                Statement st=null;
                String name=null;
                String email=null;
                int id;
                int number;
                int balance;
                

      out.write("\n");
      out.write("\n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">Transaction ID</th>\n");
      out.write("<th class=\"text-left\">Name</th>\n");
      out.write("<th class=\"text-left\">Email</th>\n");
      out.write("<th class=\"text-left\">Contact Number</th>\n");
      out.write("<th class=\"text-left\">Current Balance</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("                \n");

                        st=DBConnector.getStatement();
                          try 
                         {
                            String query = "select * from customer";
                            System.out.println(query);
                            rs=st.executeQuery(query);
                            while(rs.next())
                            {
                                id=rs.getInt(1);                                
                                name=rs.getString(2);
                                email=rs.getString(3);
                                number=rs.getInt(4);
                                balance=rs.getInt(5);                                


      out.write("           \n");
      out.write("        \n");
      out.write("            <tr> \n");
      out.write("                    <td><input type=\"text\" value=\"");
      out.print(id);
      out.write("\" name=\"Transaction ID\" readonly></td>\n");
      out.write("                    <td><input type=\"text\"value=\"");
      out.print(name);
      out.write("\" name=\"Name\" readonly></td>\n");
      out.write("                    <td><input type=\"text\" value=\"");
      out.print(email);
      out.write("\" name=\"Email\" readonly></td>\n");
      out.write("                    <td><input type=\"text\" value=\"");
      out.print(number);
      out.write("\" name=\"Contact Number\" readonly></td>\n");
      out.write("                    <td><input type=\"text\" value=\"");
      out.print(balance);
      out.write("\" name=\"Current Balance\" readonly></td>   \n");
      out.write("            </tr>\n");
      out.write("            ");
    
                            }

                        }
                        catch(SQLException e)
                        {
                            System.out.println(e);
                        }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write(" <footer>\n");
      out.write("  <div class=\"copyright\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p>Copyright 2021 All Right Reserved By <a href=\"#\">Nandini And Its Company</a></p>\n");
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
      out.write("\n");
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
