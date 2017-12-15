

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control4.service.App;


public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = App.getHelloFromService()+"Hello from Web! Project control4. ";
		request.setAttribute("message", message);
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
	}

}
