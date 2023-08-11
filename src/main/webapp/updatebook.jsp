<%@page import="com.jsp.book_store.dto.Book"%>
<%@page import="com.jsp.book_store.dao.BookDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update book here</title>

<style type="text/css">

body{
background-color: #F5CBA7;
}

form{
  height:600px;
  width:450px;
   background-color:gray;
  display: flex;
  flex-direction: column;
  flex-wrap: wrap;
  justify-content: flex-start;
  align-items: flex-start;
  border: 2px solid orange;
  margin-left: 500px;
  margin-top: 50px;
  padding-left: 20px;
  font-size: 25px;
  color: orange;
  gap:10px;
  
  }
  
  .upd{
background-color: #FFA500;
height:35px;
width:120px;
border-color: #FFA500;
margin-top: 30px;
margin-left: 100px;
color:white;
font-size: 17px;
}
</style>


</head>
<body>

       <%
			int id = Integer.parseInt(request.getParameter("id"));
			BookDao bookdao=new BookDao();
			Book book=bookdao.getBookById(id);
			
		%>
		
		
		
		<form action="updateBook" method="post">
          
          <h1>Update Book Here</h1>

			<!-- this is for id -->
			<div class="form-floating">
			    <label for="floatingInput">Id:</label>
			    <br>
				<input type="number" class="form-control" id="floatingInput"
					placeholder="id" name="id" required value="<%=book.getId()%>" > 
					
			</div>

			<!--this is for name -->
			<div class="form-floating">
			<label for="bookName">Name:</label>
			 <br>
				<input type="text" class="form-control" id="bookName"
					placeholder="enterName" name="name" required value="<%=book.getName()%>"> 
			</div>
			
			<!--this is for color -->
			<div class="form-floating">
			    <label	for="bookColor">Color:</label>
			     <br>
				<input type="text" class="form-control" id="bookColor"
					placeholder="enterColor" name="color" required value="<%=book.getColor()%>">
					 
			</div>
			
			<!--this is for price -->
			<div class="form-floating">
			    <label for="bookPrice">Price:</label>
			     <br>
				<input type="text" class="form-control"  bookPrice
					placeholder="enterPrice" name="price" required value="<%=book.getPrice()%>">
					
			</div>
			
			
			<!--this is for Author -->
			<div class="form-floating">
			
			<label for="bookAuthor">Author:</label>
			 <br>
				<input type="text" class="form-control"  id="bookAuthor"
					placeholder="enterAuthor" name="author" required value="<%=book.getAuthor()%>"> 
					
			</div>
			
			
			<input  type="submit" value="Update" class="upd">
		</form>
		
		
		
		
		

</body>
</html>