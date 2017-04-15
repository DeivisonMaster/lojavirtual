<%-- 
    Document   : visualiza
    Created on : 14/04/2017, 17:22:40
    Author     : DeivisondeOliveira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Itens de seu carrinho de compras: </h3>
        
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th>Preço</th>
                    <th>Quantidade</th>
                    <th>Total</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${carrinho.itens}" var="item">
                    <tr>
                        <td>${item.produto.nome}</td>
                        <td>${item.produto.descricao}</td>
                        <td><fmt:formatNumber type="currency" value="${item.produto.preco}"/></td>
                        <td>${item.quantidade}</td>
                        <td>
                            <fmt:formatNumber type="currency"
                                              value="${item.quantidade * item.produto.preco}"/>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
            <t:foot>
                <tr>
                    <td colspan="2"></td>
                    <th colspan="2">Total:</th>
                    <th>
                        <fmt:formatNumber type="currency" value="${carrinho.total}"/>
                    </th>
                </tr>
            </t:foot>
        </table>
    </body>
</html>
