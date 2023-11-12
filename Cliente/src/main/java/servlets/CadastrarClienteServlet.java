package servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.ClienteRepository;

@WebServlet("/cadastrarCliente")
public class CadastrarClienteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String nome = request.getParameter("nome");
        String dataNascimento = request.getParameter("dataNascimento");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");

        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nome);
        novoCliente.setDataNascimento(dataNascimento);
        novoCliente.setCpf(cpf);
        novoCliente.setTelefone(telefone);

        clienteRepository.adicionarCliente(novoCliente);

        response.sendRedirect(request.getContextPath() + "/listarClientes");
    }
}
