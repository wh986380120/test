package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	private static Connection connection;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf8","root", "123");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Post> selectPost() throws SQLException{
		String sql="select * from post";
		PreparedStatement stat = connection.prepareStatement(sql);
		ResultSet result = stat.executeQuery();
		ArrayList<Post> list=new ArrayList<>();
		while (result.next()) {
			Post post = new Post();
			post.setPost_desc(result.getString("post_desc"));
			post.setPost_id(result.getInt("post_id"));
			post.setPost_name(result.getString("post_name"));
			list.add(post);
		}
		return list;
	}
	public List<Employee> selectEmpByNameAndPostId(String emp_name, int post_id) throws SQLException {
		String sql="select * from employee where emp_name=? and post_id=?";
		PreparedStatement stat = connection.prepareStatement(sql);
		stat.setString(1, emp_name);
		stat.setInt(2, post_id);
		ResultSet result = stat.executeQuery();
		ArrayList<Employee> list=new ArrayList<>();
		while (result.next()) {
			Employee employee = new Employee();
			employee.setEmp_name(result.getString("emp_name"));
			employee.setEmp_age(result.getInt("emp_age"));
			employee.setEmp_depart(result.getString("emp_depart"));
			employee.setEmp_id(result.getInt("emp_id"));
			employee.setEmp_sex(result.getString("emp_sex"));
			employee.setEmp_year(result.getInt("emp_year"));
			employee.setPost_id(post_id);
			list.add(employee);
		}
		return list;
		
	}
	public List<Employee> selectempBypostId(int post_id) throws SQLException {
		String sql="select * from employee where post_id=?";
		PreparedStatement stat = connection.prepareStatement(sql);
		stat.setInt(1, post_id);
		ResultSet result = stat.executeQuery();
		ArrayList<Employee> list=new ArrayList<>();
		while (result.next()) {
			Employee employee = new Employee();
			employee.setEmp_name(result.getString("emp_name"));
			employee.setEmp_age(result.getInt("emp_age"));
			employee.setEmp_depart(result.getString("emp_depart"));
			employee.setEmp_id(result.getInt("emp_id"));
			employee.setEmp_sex(result.getString("emp_sex"));
			employee.setEmp_year(result.getInt("emp_year"));
			employee.setPost_id(post_id);
			list.add(employee);
		}
		return list;
		
	}
	public Post selectPostById(int post_id) throws SQLException {
		String sql="select * from post where post_id=?";
		PreparedStatement stat = connection.prepareStatement(sql);
		stat.setInt(1, post_id);
		ResultSet result = stat.executeQuery();
		ArrayList<Post> list=new ArrayList<>();
		while (result.next()) {
			Post post = new Post();
			post.setPost_desc(result.getString("post_desc"));
			post.setPost_id(result.getInt("post_id"));
			post.setPost_name(result.getString("post_name"));
			list.add(post);
		}
		return list.get(0);
		
	}
}
