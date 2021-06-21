package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import database.DBConnector;
import org.apache.jsp.*;;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("             \n");
      out.write("   <!-- basic -->\n");
      out.write("   <meta name=\"viewport\" content=\"initial-scale=1.0; maximum-scale=1.0; width=device-width;\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<!-- mobile metas -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("<!-- site metas -->\n");
      out.write("<title>History</title>\n");
      out.write("<meta name=\"keywords\" content=\"\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("<!-- bootstrap css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<!-- style css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("<!-- Table css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/table.css\">\n");
      out.write("<!-- Responsive-->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("<!-- fevicon -->\n");
      out.write("<link rel=\"icon\" href=\"images/fevicon.png\" type=\"image/gif\" />\n");
      out.write("<!-- Scrollbar Custom CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <!-- body -->\n");
      out.write("<body class=\"main-layout\">\n");
      out.write("<div class=\"Currency-bg\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-xl-12 col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("        <div class=\"abouttitle\">\n");
      out.write("          <h2>Transaction History</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <h1></h1>\n");
      out.write("    <h2></h2>\n");
      out.write("    <h3></h3>\n");
      out.write("    \n");

                ResultSet rs=null;
                Statement st=null;
                String sname=null;
                String rname=null;
                int sid;
                int rid;
                int amount;
                

      out.write("\n");
      out.write("\n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">Sender ID</th>\n");
      out.write("<th class=\"text-left\">Sender Name</th>\n");
      out.write("<th class=\"text-left\">Transaction Amount</th>\n");
      out.write("<th class=\"text-left\">Receiver ID</th>\n");
      out.write("<th class=\"text-left\">Receiver Name</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("                \n");

                        st=DBConnector.getStatement();
                          try 
                         {
                            String query = "select * from history";
                            System.out.println(query);
                            rs=st.executeQuery(query);
                            while(rs.next())
                            {
                                sid=rs.getInt(1);                                
                                sname=rs.getString(2);
                                amount=rs.getInt(3);
                                rid=rs.getInt(4);
                                rname=rs.getString(5);                                


      out.write("           \n");
      out.write("<tbody class=\"table-hover\">\n");
      out.write("       \n");
      out.write("            <tr> \n");
      out.write("                    <td class=\"text-left\"><input type=\"text\" value=\"");
      out.print(sid);
      out.write("\" name=\"Transaction ID\" readonly></td>\n");
      out.write("                    <td class=\"text-left\"><input type=\"text\"value=\"");
      out.print(sname);
      out.write("\" name=\"Name\" readonly></td>\n");
      out.write("                    <td class=\"text-left\"><input type=\"text\" value=\"");
      out.print(amount);
      out.write("\" name=\"Email\" readonly></td>\n");
      out.write("                    <td class=\"text-left\"><input type=\"text\" value=\"");
      out.print(rid);
      out.write("\" name=\"Contact Number\" readonly></td>\n");
      out.write("                    <td class=\"text-left\"><input type=\"text\" value=\"");
      out.print(rname);
      out.write("\" name=\"Current Balance\" readonly></td>   \n");
      out.write("            </tr>\n");
      out.write(" \n");
    
                            }

                        }
                        catch(SQLException e)
                        {
                            System.out.println(e);
                        }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write(" \n");
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
      out.write("\n");
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
