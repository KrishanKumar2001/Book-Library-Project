<%@page import="com.jsp.book_store.dto.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.book_store.dao.BookDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>displaybook</title>

<style type="text/css">

*{
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

body{
  
  background-color: #FFCCCB;
  
  }
  
  table{
  background-color:#CCCCFF;  
  }
 div{
  width:100%;
  height:77px;
  background-color:white; 
  text-align: center;
  border:2px solid black;
  padding-top: 10px;
  
  }
  
  .head{
  display: flex;
  flex-direction: row;
  justify-content:space-around;
 
  
  }
  
  .addbook{
  height:50px;
  width:120px;
  background-color:orange; 
  margin-left:-100px;
  
  }
  
  .addbook a{
  color:black; 
  text-decoration: none;
  font-size: 20px;
  }
  
  a{
   
  text-decoration: none;
  }


h1 {
color: gray;
}

.btn{
 height: 25px;
 width:100px;
 font-size:17px;
 padding: 2px;
 background-color: #FAD7A0 ;
 color: white;
}
table th{
background-color: yellow;

}


table{
margin-top: 80px;
margin-left: 50px;
border: 4px solid orange;
height: 500px;
width:800px;
padding: 5px;
}


.head h1{
margin-right: 600px;
}
</style>

</head>
<body>

    <div class="head">
   <button class="addbook"> <a href="book.jsp" >Add Book</a></button>
     <h1 >Welcome To Book Library </h1>
    </div>
   
   
   <%BookDao bookdao=new BookDao(); %>
    <%List<Book> l1=bookdao.displayBookDetails(); %>
   
   
   <table border="2">
          
          <tr>
              <th>Id</th>
              <th>Name</th>
              <th>Color</th>
              <th>Price</th>
              <th>Author</th>
              <th style="color: red;">Delete</th>
              <th style="color: blue;">Update</th>
              
          </tr>
          
          <%for(Book book:l1){ %>
             <tr>
               <td> <%=book.getId()%></td>
                <td> <%=book.getName()%></td>
                <td> <%=book.getColor()%></td>
                <td> <%=book.getPrice()%></td>
                <td> <%=book.getAuthor()%></td>
                <td > <button class="btn"><a href="deleteBook?id=<%=book.getId() %>"  style="color:red;">Delete</a></button></td>
                <td > <button class="btn"><a href="updatebook.jsp?id=<%=book.getId() %>"  style="color: blue;">Edit</a></button></td>
              </tr>
           <%} %>
   
   </table>

</body>
</html>