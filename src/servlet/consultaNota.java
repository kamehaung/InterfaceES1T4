package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class consultaNota
 */
@WebServlet("/consultaNota")
public class consultaNota extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public consultaNota() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
		String tipo = request.getParameter("tipo");	
		String numNota = request.getParameter("numNota");
		
		System.out.println("tipo= " + tipo + " numNota= " + numNota);

		
		double valorTeste = 99.99;
		
		request.setAttribute("numNota", numNota);
		request.setAttribute("data", "12/12/1999");
		request.setAttribute("totNota", valorTeste);
		request.getRequestDispatcher("/consultaNota.jsp").forward(request, response);
	}

}
