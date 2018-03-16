package onlinelibrary.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("adminName");
		String pass=request.getParameter("password");
		PrintWriter out=response.getWriter();
		if(name.equals("Sridevi") && pass.equals("admin123")) {
			HttpSession adminSession=request.getSession(true);
			adminSession.setAttribute("adminName", "Admin");
/*			request.setAttribute("result", "This is the result of the servlet call");
*/			request.getRequestDispatcher("/adminDashboard.jsp").forward(request, response);
		}
		else {
			out.println("<script>window.location=\"adminLogin.jsp\";alert(\"Admin Name Or Password Is Incorrect ...!\")</script>");
		}

		out.close();
	}


}
