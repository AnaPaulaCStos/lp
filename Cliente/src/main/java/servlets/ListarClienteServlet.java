package servlets;

import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.ClienteRepository;

@WebServlet("/listarClientes")
public class ListarClienteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        List<Cliente> clientes = clienteRepository.listarClientes();
        request.setAttribute("clientes", clientes);
        request.getRequestDispatcher("/jsp/listarClientes.jsp").forward(request, response);
    }
}
