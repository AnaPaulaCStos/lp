package servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;
import model.ClienteRepository;

@WebServlet("/detalhesCliente")
public class DetalhesClienteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String clienteId = request.getParameter("id");

        if (clienteId != null) {
            Long id = Long.parseLong(clienteId);
            Cliente cliente = clienteRepository.buscarClientePorId(id);

            if (cliente != null) {
                request.setAttribute("cliente", cliente);
                request.getRequestDispatcher("/jsp/detalhesCliente.jsp").forward(request, response);
            } else {
                // Trate o caso em que o cliente não é encontrado
                response.sendRedirect(request.getContextPath() + "/listarClientes");
            }
        } else {
            // Trate o caso em que o ID do cliente não é fornecido
            response.sendRedirect(request.getContextPath() + "/listarClientes");
        }
    }
}
