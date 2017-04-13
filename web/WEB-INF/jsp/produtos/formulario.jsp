<%-- 
    Document   : formulario
    Created on : 13/04/2017, 10:51:18
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
        <form action="adiciona">
            <fieldset>
                <legend>Adicionar Produto</legend>
                <label for="nome">Nome</label>
                <input id="nome" type="text" name="produto.nome"/>
                
                <label for="nome">Descrição:</label>
                <textarea id="descricao" rows="5" cols="30" name="produto.descricao"></textarea>
                
                <label for="nome">Preço:</label>
                <input id="preco" type="text" name="produto.preco"/>
                
                <br/>
                
                <input type="submit" value="enviar"/>
            </fieldset>
        </form>
    </body>
</html>
