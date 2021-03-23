<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : response
    Created on : 22/03/2021, 04:48:47 PM
    Author     : jorge_j3qr4sd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Nombre -->
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name"  />
        <jsp:setProperty name="mybean" property="nacimiento"  />
        <h1>Hello, <jsp:getProperty name="mybean" property="name" />!
        Your age is, <jsp:getProperty name="mybean" property="age" /> years old
        
        <c:choose>
            <c:when test="${mybean.hora>=0 && mybean.hora<12}">
                , Good morning
            </c:when>
            <c:when test="${mybean.hora>=12 && mybean.hora<18}">
                , Good afternoon
            </c:when>
            <c:otherwise>
                , Good night
            </c:otherwise>
        </c:choose>
        
        </h1>
        
    </body>
</html>
