<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>book insert</title>


<style type="text/css">


*{
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}
  
  body{
  
  background-color:#008080;
  
  }
  
 
  
  form{
  height:500px;
  width:400px;
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

.sub{
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



<form action="myBookForm" >
  <h2 align="center" style="color:#FFA500 " >New Book Entry</h2>
<label for="bookname" >Enter Book Name</label>
<input type="text"  name="bookname" id="bookname" >

<label for="bookcolor">Enter Book color</label>
<input type="text" id="bookcolor" name="bookcolor">

<label for="bookprice">Enter Book Price</label>
<input type="number" id="bookprice" name="bookprice">

<label for="bookauthor">Enter Author Name</label>
<input type="text" id="bookauthor" name="bookauthor">

<input type="submit" value="Submit" class="sub">

</form>

</body>
</html>