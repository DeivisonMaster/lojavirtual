<%-- 
    Document   : lista
    Created on : 13/04/2017, 09:40:40
    Author     : DeivisondeOliveira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Produtos</title>
    </head>
    <body>
        <h1>Lista Produtos</h1>
        <br/>
        
        
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th>Preço</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${produtoList}" var="produto">
                    <tr>
                        <td>${produto.nome}</td>
                        <td>${produto.descricao}</td>
                        <td>${produto.preco}</td>
                        <td><a href="edita?id=${produto.id}">Editar</a></td>
                        <td><a href="remove?id=${produto.id}">Remover</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
