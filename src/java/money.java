import database.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

/**
 *
 * @author Nandini Gangrade
 */

public class money extends HttpServlet 
{
        @Override
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                response.sendRedirect("index.html");
        }
        @Override
        public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
        {
            String senderid=req.getParameter("senderid");
            String sendername=req.getParameter("sendername");
            String senderbalance=req.getParameter("senderbalance");
            String receiverid=req.getParameter("receiverid");
            String receivername=req.getParameter("receivername");
            String money=req.getParameter("money");
            String now = req.getParameter("time");
            
            System.out.println(now);
            
            int tableid = 0;
            int receiverbalance=0;
            
            int rid=Integer.parseInt(receiverid);
            
            Statement st=null;
            ResultSet rs=null;
    
    try
    {
        st=DBConnector.getStatement();
        String query="SELECT id, balance from customer where id='"+receiverid+"'";
        
        rs=st.executeQuery(query);
       
        if(rs.next())
        {
            tableid=rs.getInt(1);
           receiverbalance=rs.getInt(2);
        }
        
        if(rid==tableid)
        {
                PrintWriter out = resp.getWriter();
                HttpSession session=req.getSession(true);       
                int updatesenderbalance=Integer.parseInt(senderbalance)-Integer.parseInt(money);
                int updatereceiverbalance=receiverbalance+Integer.parseInt(money);
               
                String query1= "update customer set balance='"+updatesenderbalance+"' where id='"+senderid+"'";
                String query2= "update customer set balance='"+updatereceiverbalance+"' where id='"+tableid+"'";
                
                String query3= "Insert into history(sid,sname,amount,rid,rname,date) values('"+senderid+"','"+sendername+"','"+money+"','"+receiverid+"' , '"+receivername+"' , '"+now+"') ";
                
                System.out.println(query3);
                st.executeUpdate(query1);
                st.executeUpdate(query2);
                System.out.println("Database updated successfully ");
                st.executeUpdate(query3);
                System.out.println("Database history updated successfully ");
                
        
               out.println("<html>");
               out.println("<head>");
               out.println("<title>new servlet</title>");
               out.println("</head>");
               out.println("<body >");
               out.println("<script>");
               out.println("alert('Transaction Sucessfull');");
               out.println("location='transaction.jsp';");
               out.println("</script>");
               out.println("</body>");
               out.println("</head>");
               out.println("</html>");  
        }
        else
        {
        System.out.println("receiver id not found");
        PrintWriter out = resp.getWriter();
        
               out.println("<html>");
               out.println("<head>");
               out.println("<title>new servlet</title>");
               out.println("</head>");
               out.println("<body >");
               out.println("<script>");
               out.println("alert('Receiver id Not Match..!!');");
               out.println("location='transaction.jsp';");
               out.println("</script>");
               out.println("</body>");
               out.println("</head>");
               out.println("</html>");  
           
        }
    }
    catch(SQLException e)
    {
        System.out.println(e);
    }
    
     }
}
