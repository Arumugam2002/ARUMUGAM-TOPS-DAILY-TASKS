package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SellerDao;
import dao.UserDao;
import model.Seller;
import model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserController() {
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
		
		String action = request.getParameter("action"); 
		
		if(action.equalsIgnoreCase("register"))
		{
			User u = new User();
			
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			
			String email = request.getParameter("email");
			
			boolean flag = UserDao.checkEmail(email);
			
			if(flag == false)
			{
				UserDao.insertUser(u);
				request.setAttribute("reg", "Successfully Registered");
				request.getRequestDispatcher("user-login.jsp").forward(request, response);
			}
			
			else 
			{
				request.setAttribute("msg", "Account has been already registered");
				request.getRequestDispatcher("user-register.jsp").forward(request, response);
			}
			
			
		}
		
		if(action.equalsIgnoreCase("login"))
		{
			User u = new User();
			
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			
			String email = request.getParameter("email");
			
			boolean flag = UserDao.checkEmail(email);
			
			if(flag == true)
			{
				System.out.println("If Flag is true");
				User u1 =  UserDao.userLogin(u);
				
				if(u1!= null)
				{
					System.out.println("If Session is true");
					HttpSession session = request.getSession();
					
					session.setAttribute("data", u1);
					request.getRequestDispatcher("user-home.jsp").forward(request, response);
				}
				
				else {
					System.out.println("Password is Incorrect");
					request.setAttribute("pass", "Password is Incorrect");
					request.getRequestDispatcher("user-login.jsp").forward(request, response);
				}
			}
			
			else {
				request.setAttribute("msg1", "Email not register, please register");
				request.getRequestDispatcher("user-register.jsp").forward(request, response);
			}
			
			
			}
		
		if(action.equalsIgnoreCase("update"))
		{
			
			
			User u = new User();
			
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			
			UserDao.updateProfile(u);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("data", u);
			request.setAttribute("update", "Profile has been updated");
			request.getRequestDispatcher("user-home.jsp").forward(request, response);
			
			
			
			
		}
		
		if(action.equalsIgnoreCase("cp"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			
			boolean flag = UserDao.checkOP(id, op);
			
			if(flag == true)
			{
				if(np.equals(cnp))
				{
					UserDao.updatePassword(id, np);
					response.sendRedirect("user-home.jsp");
					
					
				}
				
				else {
					request.setAttribute("msg1", "np and cnp is not matched");
					request.getRequestDispatcher("user-change-password.jsp").forward(request, response);
					
				}
				
				
			}
			
			else {
				request.setAttribute("msg", "Old password is Incorrect");
				request.getRequestDispatcher("user-change-password.jsp").forward(request, response);
				
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
