<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<body>
<p>from request</p>
<p>${username}</p>1
<p>${requestScope.username}</p>2
<h2><%= request.getParameter("age") %></h2>
</br>
<p>from session</p>
<p>${name}</p>1
<p>${sessionScope.name}</p>2
<p><%= session.getAttribute("name") %></p>
<h2><%= session.getAttribute("age") %></h2>

</body>
<head>
    <title>User info</title>
</head>
</html>
