import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Nandini Gangrade
 */
public class view extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
          res.sendRedirect("index.html");    
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
          res.sendRedirect("view.jsp");    
    }

}
