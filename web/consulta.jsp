<%-- 
    Document   : consulta
    Created on : 21/04/2019, 23:48:41
    Author     : DELL
--%>

<%@page import="controller.EmpregadosDao"%>
<%@page import="java.util.List"%>
<%@page import="model.Empregados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:h="http://xmlns.jcp.org/jsf/html" xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Empregados</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
          <h1>Hello World!</h1>
          <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NOME</th>
                    <th>CARGO</th>
                    <th>SALÁRIO</th>
                </tr>
            </thead>
            <%
                EmpregadosDao dao = new EmpregadosDao();

                for (Empregados empregados : dao.getLista()) {
            %>


            <tbody>
                <tr>
                    <td><%=empregados.getId()%></td> 
                    <td><%=empregados.getNome()%></td>
                    <td><%=empregados.getCargo()%></td>
                    <td><%=empregados.getSalario()%></td>
                </tr>
            </tbody>

            <%
                }
            %>
        </table>
        </div>
        


        

    </body>
</html>
