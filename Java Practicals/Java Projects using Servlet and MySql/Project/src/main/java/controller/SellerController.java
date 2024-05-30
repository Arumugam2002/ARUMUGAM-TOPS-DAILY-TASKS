package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SellerDao;
import model.Seller;

/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SellerController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("register"))

		{
			Seller s = new Seller();

			System.out.println("Registration execution started");

			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));

			String email = request.getParameter("email");

			boolean flag = SellerDao.checkEmail(email);

			if (flag == false) {
				SellerDao.insertSeller(s);
				response.sendRedirect("login-page.jsp");
			}

			else {
				request.setAttribute("msg", "Account has been already registered");
				request.getRequestDispatcher("registration-page.jsp").forward(request, response);
			}

		}

		if (action.equalsIgnoreCase("login")) {

			System.out.println("Login execution started");

			Seller s = new Seller();

			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = SellerDao.checkEmail(email);
			if (flag == true) {
				System.out.println("inside flag true");
				Seller s1 = SellerDao.sellerLogin(s);
				if (s1 != null) {
					System.out.println("insid sesson true");
					HttpSession session = request.getSession();

					session.setAttribute("data", s1);
					request.getRequestDispatcher("seller-home.jsp").forward(request, response);
				}
				else {
					System.out.println("inside flag false");
					request.setAttribute("msg", "password is incorrect");
					request.getRequestDispatcher("login-page.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg1", "Email not found, Please Register");
				request.getRequestDispatcher("registration-page.jsp").forward(request, response);
			}
			
		}
		
		if(action.equalsIgnoreCase("update"))
		{
			System.out.println("Update Execution started");
			
			Seller s = new Seller();
			
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			
			SellerDao.updateProfile(s);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("data", s);
			request.setAttribute("update", "Profile-Updated");
			request.getRequestDispatcher("seller-home.jsp").forward(request, response);
			
			
			
			
		}

	}

}
