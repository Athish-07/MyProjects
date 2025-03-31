package sprint2;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/bookFlight")
public class FlightBookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");

        if (user == null) {
            response.sendRedirect("Login.jsp");
            return;
        }

        String flightNumber = request.getParameter("flightNumber");
        String seatClass = request.getParameter("seatClass");

        if (flightNumber != null && seatClass != null) {
            request.setAttribute("message", "Flight " + flightNumber + " booked successfully in " + seatClass + " class.");
            request.getRequestDispatcher("Home.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Booking failed. Please select a flight and class.");
            request.getRequestDispatcher("FlightBooking.jsp").forward(request, response);
        }
    }
}
