<!DOCTYPE html>
<html>
<head>
    <title>Detalhes do Cliente</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Detalhes do Cliente</h1>
    <c:if test="${cliente != null}">
        <table>
            <tr>
                <th>Nome</th>
                <th>Data de Nascimento</th>
                <th>CPF</th>
                <th>Telefone</th>
            </tr>
            <tr>
                <td>${cliente.nome}</td>
                <td>${cliente.dataNascimento}</td>
                <td>${cliente.cpf}</td>
                <td>${cliente.telefone}</td>
            </tr>
        </table>
    </c:if>
    <a href="<c:url value='/listarClientes' />">Voltar para a lista de clientes</a>
</body>
</html>
