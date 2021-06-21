<%-- 
    Document   : history.jsp
    Created on : Jun 7, 2021, 7:14:16 PM
    Author     : Nandini Gangrade
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="database.DBConnector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
             
   <!-- basic -->
   <meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- mobile metas -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<!-- site metas -->
<title>BankingSystem</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">
<!-- bootstrap css -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- style css -->
<link rel="stylesheet" href="css/style.css">
<!-- Table css -->
<link rel="stylesheet" href="css/table.css">
<!-- Responsive-->
<link rel="stylesheet" href="css/responsive.css">
<!-- fevicon -->
<link rel="icon" href="images/fevicon.png" type="image/gif" />
<!-- Scrollbar Custom CSS -->
<link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
</head>

<!-- body -->
<body class="main-layout">
<!-- loader  -->
<div class="loader_bg">
  <div class="loader"><img src="images/loading.gif" alt="#" /></div>
</div>
<!-- end loader --> 
<!-- header -->
<header> 
  <!-- header inner -->
  <div class="head-top">
    <div class="container">
      <div class="row">
        <div class="col-xl-4 col-lg-4 col-md-4 col-sm-4">
          <div class="email"> <a href="https://mail.google.com/mail/u/0/#inbox?compose=new">Email : nandinigangrade2000@gmail.com</a> </div>
        </div>
        <div class="col-xl-4 col-lg-4 col-md-4 col-sm-4">
            <div class="icon"> <i> <a href="https://www.facebook.com/profile.php?id=100007869857450"><img src="icon/facebook.png"></a></i> <i> <a href="https://twitter.com/GangradeNandini"><img src="icon/Twitter.png"></a></i> <i> <a href="https://www.linkedin.com/in/nandini-gangrade-306496152/"><img src="icon/linkedin.png"></a></i> </div>
        </div>
        <div class="col-xl-4 col-lg-4 col-md-4 col-sm-4">
          <div class="contact"> <a href="#">Contact :  +91 8269097</a> </div>
        </div>
      </div>
    </div>
  </div>
  <div class="container">
    <div class="row">
      <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
        <div class="full">
          <div class="center-desk">
            <div class="logo"> <a href="index.html"><img src="images/logo.jpg" alt="#"></a> </div>
          </div>
        </div>
      </div>
      <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
        <div class="menu-area">
          <div class="limit-box">
            <nav class="main-menu">
              <ul class="menu-area-main">
                <li> <a href="index.html">Home</a> </li>
                <li> <a href="aboutus.html">About</a> </li>
                <li> <a href="Currency.html"> Transaction</a> </li>
                <li> <a href="Team.html">Team</a> </li>
                <li class="active"> <a href="contact.html">Contact us</a> </li>
                <li> <a href="#"><img src="images/search_icon.png" alt="#" /></a> </li>
              </ul>
            </nav>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- end header inner --> 
</header>
<!-- end header -->

<div class="Currency-bg">
  <div class="container">
    <div class="row">
      <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12">
        <div class="abouttitle">
          <h2>Transaction History</h2>
        </div>
      </div>
    </div>
  </div>
</div>
    <h1></h1>
    <h2></h2>
    <h3></h3>
    
<%
                ResultSet rs=null;
                Statement st=null;
                String sname=null;
                String rname=null;
                int sid;
                int rid;
                int amount;
                String date=null;
%>

<table class="table-fill">
<thead>
<tr>
<th class="text-left">Sender ID</th>
<th class="text-left">Sender Name</th>
<th class="text-left">Transaction Amount</th>
<th class="text-left">Receiver ID</th>
<th class="text-left">Receiver Name</th>
<th class="text-left">Date & Time</th>
</tr>
</thead>
                
<%
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
                                date=rs.getString(6);

%>           
<tbody class="table-hover">
       
            <tr> 
                    <td class="text-left"><input type="text" value="<%=sid%>" name="Transaction ID" readonly></td>
                    <td class="text-left"><input type="text"value="<%=sname%>" name="Name" readonly></td>
                    <td class="text-left"><input type="text" value="<%=amount%>" name="Email" readonly></td>
                    <td class="text-left"><input type="text" value="<%=rid%>" name="Contact Number" readonly></td>
                    <td class="text-left"><input type="text" value="<%=rname%>" name="Current Balance" readonly></td>   
                    <td class="text-left"><input type="text" value="<%=date%>" name="Current Balance" readonly></td>   
            </tr>
 
<%    
                            }

                        }
                        catch(SQLException e)
                        {
                            System.out.println(e);
                        }
%>
</tbody>
</table>
 
<!-- footer -->
<footer>
  <div class="footer">
    <div class="container">
      <div class="row">
        <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
          <div class="Contact">
            <h3>Contact Us</h3>
            <ul class="contant_icon">
              <li> <a href="#"><img src="icon/location.png"></a></li>
              <li> <a href="https://mail.google.com/mail/u/0/#inbox?compose=new"><img src="icon/tellephone.png"></a></li>
              <li> <a href=""><img src="icon/email.png"></a></li>
            </ul>
          </div>
        </div>
        <div class="col-xl-3 col-lg-3 col-md-3 col-sm-12">
          <div class="Social">
            <h3>Social links</h3>
            <ul class="socil_link">
              <li><a href="https://www.facebook.com/profile.php?id=100007869857450"><img src="icon/fb.png"></a></li>
              <li><a href="https://twitter.com/GangradeNandini"><img src="icon/tw.png"></a></li>
              <li> <a href="www.linkedin.com/in/nandini-gangrade-306496152"><img src="icon/lin.png"></a></li>
              <li> <a href="https://www.instagram.com/__nandini__2000/"><img src="icon/insta.png"></a></li>
            </ul>
          </div>
        </div>
        <div class="col-xl-5 col-lg-5 col-md-5 col-sm-12">
          <div class="newsletter">
            <h3>Newsletter</h3>
            <input class="new" placeholder="Enter your email" type="email" >
            <button class="subscribe">Subscribe</button>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="copyright">
    <div class="container">
      <p>Copyright 2021 All Right Reserved By <a href="#">Nandini And Its Company</a></p>
    </div>
  </div>
</footer>
<!-- end footer --> 
<!-- Javascript files--> 
<script src="js/jquery.min.js"></script> 
<script src="js/popper.min.js"></script> 
<script src="js/bootstrap.bundle.min.js"></script> 
<script src="js/jquery-3.0.0.min.js"></script> 
<script src="js/plugin.js"></script> 

<!-- sidebar --> 
<script src="js/jquery.mCustomScrollbar.concat.min.js"></script> 
<script src="js/custom.js"></script>

    </body>

</html>
