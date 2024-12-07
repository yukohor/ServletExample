package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int rand = (int) (Math.random() * 10);
		if (rand % 2 == 1) {
			response.sendRedirect("redirected.jsp");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("forwarded.jsp");
			dispatcher.forward(request, response);
		}

		/*	int i = 0;
			
			if(i%2 != 0) {
				
				response.sendRedirect("redirected.jsp");
				
			} else {
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/forwarded.jsp");
				dispatcher.forward(request, response);
			}
		}*/
	}
}
