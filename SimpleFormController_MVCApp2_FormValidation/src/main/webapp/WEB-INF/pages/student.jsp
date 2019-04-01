<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<form:form method="POST" commandName="stCmd" >
<%-- <p style='color:red'><form:errors path="*"/> </p> --%>
Name:<form:input path="sname"/><form:errors path="sname"/><br>
Address:<form:input path="sadd"/><form:errors path="sadd"/><br>
<input type="submit" value="register"/>
</form:form>