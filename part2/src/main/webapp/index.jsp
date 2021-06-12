<jsp:include page="pages/parts/header.jsp" />
<body>
<h3>Name yourself please:</h3>
<ul>
    <form action="login" method="post">
        Name: <input type="text" width="50" name="username"/>
        Age: <input type="number" width="50" name="age"/>
        <button type="submit">Submit</button>
    </form>
</ul>
</body>
<jsp:include page="pages/parts/footer.jsp" />