<%--
String s=request.getParameter("key");
String s2=request.getParameter("var3");

String method=request.getMethod(); 

out.println(s);
out.println(s2);
out.println(method);


--%>

<%-- response.sendRedirect("https://google.com");
--%>

<%
//request.setContentType("application/x-www-form-urlencoded;charset=utf-8");
//request.setContentType("application/json; utf-8");
int total=1;
int number = Integer.parseInt(request.getParameter("number"));
for (int i=1;i<=number;i++) total*=i;
response.setContentType("application/json; utf-8");
response.getWriter().write("{\"result\":"+ total +"}");

%>