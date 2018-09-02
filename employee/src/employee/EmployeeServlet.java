package employee;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				request.setCharacterEncoding("utf-8");
				String post_idstr = request.getParameter("post_id");
				int post_id = Integer.parseInt(post_idstr);
				String emp_name=request.getParameter("emp_name");
				EmployeeDao dao = new EmployeeDao();
				List<Employee> list=new ArrayList<Employee>();
				if (emp_name!=null&&emp_name!="") {
					list = dao.selectEmpByNameAndPostId(emp_name,post_id);
				}else{
					list=dao.selectempBypostId(post_id);
				}
				Post post = dao.selectPostById(post_id);
				request.setAttribute("post", post);
				request.setAttribute("emplist", list);
				request.getRequestDispatcher("search.jsp").forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}