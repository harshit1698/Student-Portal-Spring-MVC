<%@ page import="db.Std" isELIgnored="false" %>
<html>
<body>
<h2>Enter Student data</h2>
<%----%>


<form action=<%if(request.getAttribute("obj")!=null){out.println("edit"); }else{out.println("add");} %> method="post">

    <input type="text" name="id" value="${obj.id}">
    <input type="text" name="name" value="${obj.name}">
    <input type="submit">

</form>


</body>
</html>
