<%-- 
    Document   : altera
    Created on : 13/04/2017, 11:28:34
    Author     : DeivisondeOliveira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Produto</title>
    </head>
    <body>
        <form action="altera">
            <fieldset>
                <legend>Editar Produto</legend>
                <input type="hidden" name="produto.id" value="${produto.id}"/>
                
                <label for="nome">Nome</label>
                <input id="nome" type="text" name="produto.nome" value="${produto.nome}"/>
                
                <label for="nome">Descrição:</label>
                <textarea id="descricao" rows="5" cols="30" 
                          name="produto.descricao">${produto.descricao}</textarea>
                
                <label for="nome">Preço:</label>
                <input id="preco" type="text" 
                       name="produto.preco" value="${produto.preco}"/>
                
                <br/>
                
                <input type="submit" value="enviar"/>
            </fieldset>
        </form>
    </body>
</html>
