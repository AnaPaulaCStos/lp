<!DOCTYPE html>
<html>
<head>
    <title>Listar Clientes</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Listar Clientes</h1>
    <table>
        <tr>
            <th>Nome</th>
            <th>Data de Nascimento</th>
            <th>CPF</th>
            <th>Telefone</th>
        </tr>
        <c:forEach items="${clientes}" var="cliente">
            <tr>
                <td>${cliente.nome}</td>
                <td>${cliente.dataNascimento}</td>
                <td>${cliente.cpf}</td>
                <td>${cliente.telefone}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
