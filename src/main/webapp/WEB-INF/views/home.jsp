<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title>하핫</title>
</head>
<body>
    <h1>Hello world!</h1>
 
    <table>
        <thead>
            <tr>
                <th>값1</th>
                <th>값2</th>
                <th>값3</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${testList}" var="test">
                <tr>
                    <td>${test.value1}</td>
                    <td>${test.value2}</td>
                    <td>${test.value3}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
 
 
</body>
</html>

