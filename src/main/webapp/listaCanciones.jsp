<%@ page import="Beans.Cancion" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean type="java.util.ArrayList<Beans.Cancion>" scope="request" id="listaCanciones"/>
<jsp:useBean id="titulo" type="java.lang.String" scope="request"/>
<jsp:useBean id="boton" type="java.lang.String" scope="request"/>
<html>
<jsp:include page="/static/head.jsp">
    <jsp:param name="title" value="Lista de Canciones"/>
</jsp:include>
<body>
<div class='container'>
    <jsp:include page="/includes/navbar.jsp">
        <jsp:param name="page" value="canciones"/>
    </jsp:include>
    <div class="pb-5 pt-4 px-3 titlecolor">
        <div class="col-lg-6">
            <h1 class='text-light'><%=titulo%></h1>
            <%=boton%>
        </div>
    </div>
    <div class="tabla">
        <table class="table table-dark table-transparent table-hover">
            <thead>
            <th>ID</th>
            <th>CANCION</th>
            <th>BANDA</th>
            </thead>
            <%
                for (Cancion cancion : listaCanciones) {
            %>
            <tr>
                <td><%=cancion.getIdcancion()%>
                </td>
                <td><%=cancion.getNombre_cancion()%>
                </td>
                <td><%=cancion.getIdBanda()%>
                </td>
            </tr>
            <%
                }
            %>
        </table>
    </div>

</div>
<jsp:include page="/static/scripts.jsp"/>
</body>
</html>
