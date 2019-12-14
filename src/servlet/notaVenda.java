package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class notaVenda
 */
@WebServlet("/notaVenda")
public class notaVenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public notaVenda() {
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
		
		Date datai = null;
		
		String nome = request.getParameter("numNota");
		String data = request.getParameter("data");
		String cliente = request.getParameter("cliente");
		
		System.out.println("nome= " + nome + " data= " + data + " cliente= " + cliente);
		
		String codigos [] = request.getParameterValues("codigo");
		String produtos [] = request.getParameterValues("produto");
		String quantidades [] = request.getParameterValues("quant");
		String precos [] = request.getParameterValues("preco");
		String totais [] = request.getParameterValues("total");
		
		for(int i=0; i < codigos.length; i++) {
			System.out.println("cod prod qtd preco e tot = " + codigos[i] + " " + produtos[i] +  " " + quantidades[i] + " " + precos[i] + " " + totais[i] + " "); 
		}

		String totNota = request.getParameter("totNota");
		
		//nao sei como ia ser isso...
		String descTot = request.getParameter("destTot");
		String valorLiq = request.getParameter("valorLiq");
		
		System.out.println(" valot total e liquido= " + totNota + " " + valorLiq);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			datai = sdf.parse(data);
		}catch(ParseException e ) {
			e.printStackTrace();
		}
		
//		int res = 0;
//		try {
//			res = 
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		HttpSession session = request.getSession();
		
//		if(res == 1) {
//			session.setAttribute("Alert", "Nota Registrada com sucesso.");
//			response.sendRedirect("index.jsp");
//		}
//		else {
//			session.setAttribute("Alert", "Ocorreu um erro no registro!");
//			response.sendRedirect("index.jsp");
//		}

		//essa forma e a outra funcionam
//		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
