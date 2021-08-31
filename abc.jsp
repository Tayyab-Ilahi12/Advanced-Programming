<!DOCTYPE>
<html>
<body>
<h1>this is abc</h1>

<h1> today is <%  out.println("Date "+ new java.util.Date());
 %>  </h1>

<%  
out.println("hi there");
out.println("your ip "+request.getRemoteAddr());
 %>


<% 
String str="one";

if(str=="on"){
%>
<p>string is one </p>
<%
    }
    else{
%>
<p>string is not one</p>
<% }%>

</body>
</html>