package servlet;

import java.io.IOException;

import ex.Fruit;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/fruit")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fruit fruit = new Fruit("いちご",700);
		
		
		ServletContext application = this.getServletContext();
		application.setAttribute("fruit", fruit);
		
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ex/fruit.jsp");
	dispatcher.forward(request,response);
}
}
		/*
		fruitインスタンスをリクエストスコープに格納
		request.setAttribute("fruit",fruit);	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/ex/fruit.jsp");
		dispatcher.forward(request, response);
	}

}*/
