<!DOCTYPE html>
<html>
<head>
    <title>Cadastrar Cliente</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Cadastrar Cliente</h1>
    <form action="/cadastrarCliente" method="post">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required><br>
        
        <label for="dataNascimento">Data de Nascimento:</label>
        <input type="date" id="dataNascimento" name="dataNascimento" required><br>
        
        <label for="cpf">CPF:</label>
        <input type="text" id="cpf" name="cpf" required><br>
        
        <label for="telefone">Telefone:</label>
        <input type="text" id="telefone" name="telefone" required><br>
        
        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>
