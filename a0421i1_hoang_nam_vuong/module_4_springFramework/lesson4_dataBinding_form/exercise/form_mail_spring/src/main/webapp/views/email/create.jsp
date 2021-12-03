<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Email</title>
</head>
<body>
<h1>Settings</h1>
<form:form action="/email/create" method="post" modelAttribute="email">
    <table border="1">
        <tr>
            <td>Languages</td>
            <td><form:radiobuttons path="languages" items="${listLanguages}"></form:radiobuttons> </td>
        </tr>
        <tr>
            <td>PageSizes</td>
            <td><form:radiobuttons path="pageSizes" items="${listPageSizes}"></form:radiobuttons> </td>
        </tr>
        <tr>
            <td>SpamFilters</td>
            <td><form:radiobuttons path="spamFilters" items="${listSpamFilters}"></form:radiobuttons> </td>
        </tr>
        <tr>
            <td>Signature</td>
            <td><form:input path="signature" /></td>
        </tr>
        <tr>
            <td><input type="update" value="update"></td>
            <td><input type="cancel" value="cancel"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
