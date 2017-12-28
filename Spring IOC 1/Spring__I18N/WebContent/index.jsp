<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="java.util.Locale"%>
<% 
String lang=request.getHeader("accep-laungauage");
Locale locale=new Locale(lang);
ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
String value=ap.getMessage("lable", null,locale);
%>

<form action="./hello">
<%=value%>:<input type="text" name="name">
			<input type="submit" value="submit"/>

</form>