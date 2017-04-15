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
                    <th>Comprar</th>
                    <th>Editar</th>
                    <th>Remover</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${produtoList}" var="produto">
                    <tr>
                        <td>${produto.nome}</td>
                        <td>${produto.descricao}</td>
                        <td>${produto.preco}</td>
                        <td style="width: 100px;">
                            <form action="<c:url value="/carrinho"/>" method="POST">
                                <input type="hidden" name="item.produto.id" value="${produto.id}"/>
                                <input class="qtde" name="item.quantidade" value="1"/>
                                <input type="submit" value="Comprar"/>
                            </form>
                        </td>
                        <td><a href="edita?id=${produto.id}">Editar</a></td>
                        <td><a href="remove?id=${produto.id}">Remover</a></td>
                        
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
