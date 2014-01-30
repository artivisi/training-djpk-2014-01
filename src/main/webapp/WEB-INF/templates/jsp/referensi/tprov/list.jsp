<%-- 
    Document   : list
    Created on : Jan 30, 2014, 2:37:10 PM
    Author     : endy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daftar Provinsi</title>
    </head>
    <body>
        <h1>Daftar Provinsi</h1>

        <table border="1" width="80%">
            <thead>
                <tr>
                    <th>Kode</th>
                    <th>Uraian</th>
                    <th>Uraian Singkat</th>
                    <th>&nbsp;</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="p" items="${daftarProvinsi}">
                    <tr>
                        <td>${p.kodeProvinsi}</td>
                        <td>${p.uraianProvinsi}</td>
                        <td>${p.uraianProvinsiSingkat}</td>
                        <td>
                            <a href="edit?id=${p.id}">edit</a> | 
                            <a href="hapus?id=${p.id}">hapus</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>


    </body>
</html>
