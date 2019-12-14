package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Produto
 */
@WebServlet("/Produto")
public class Produto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Produto() {
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
		
		String codProd = request.getParameter("codProd");
		String codBarras = request.getParameter("codBarras");
		String nome = request.getParameter("nomeProd");
		String fornecedor = request.getParameter("forPrincipal");
		
		System.out.println(codProd + " " + codBarras + " " + nome + " " + fornecedor);
		
		//valor de teste
		String valor = "5";
		
		
		request.setAttribute("codBarras", codBarras);
		request.setAttribute("nomeProd", nome);
		request.setAttribute("fornecedor", fornecedor);
		request.setAttribute("prAtual", valor);
		request.setAttribute("prVenda", valor);
		request.setAttribute("qtdAtual", valor);

		request.getRequestDispatcher("/produto.jsp").forward(request, response);
		
	}

}
