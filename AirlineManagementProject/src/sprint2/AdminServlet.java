package sprint2;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userRole = (String) session.getAttribute("role");

        if (userRole == null || !userRole.equals("admin")) {
            response.sendRedirect("Login.jsp");
            return;
        }

        String action = request.getParameter("action");
        String flightNumber = request.getParameter("flightNumber");

        if ("add".equals(action) || "edit".equals(action) || "delete".equals(action)) {
            request.setAttribute("message", "Flight " + flightNumber + " " + action + "ed successfully.");
        } else {
            request.setAttribute("errorMessage", "Invalid action.");
        }

        request.getRequestDispatcher("AdminPanel.jsp").forward(request, response);
    }
}
