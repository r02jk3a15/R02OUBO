

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1Servlet
 */
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String day = (String)request.getAttribute("day");
		request.setAttribute("day",day);
		String re = (String)request.getAttribute("re");
		request.setAttribute("re",re);
		String re2 = (String)request.getAttribute("re2");
		request.setAttribute("re2",re2);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/xmas.jsp");
		rd.forward(request, response);
	}

}
