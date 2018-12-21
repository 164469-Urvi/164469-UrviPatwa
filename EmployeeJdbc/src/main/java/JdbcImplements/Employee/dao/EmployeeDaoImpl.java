package JdbcImplements.Employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;






import javax.sql.DataSource;

import JdbcImplements.EmployeeJdbc.Employee.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
 private DataSource datasource;
 
 public void setDataSource(DataSource datasource)
 {
	 this.datasource=datasource;
 }


	@Override
	public void createEmployee(Employee employee)  {
		Connection connection=null;
		PreparedStatement ps=null;
		try
		{
			String sql="INSERT INTO employee2(name,age,salary,email) VALUES(?,?,?,?)";
			connection=datasource.getConnection();
			ps=connection.prepareStatement(sql);
			ps.setString(1,employee.getName());
			ps.setInt(2,employee.getAge());
			ps.setInt(3,employee.getSalary());
			ps.setString(4,employee.getEmail());
		int update=ps.executeUpdate();
		if(update>0)
		{
			System.out.println("updated");
		}

	}catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployeeById(String email, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> getAllEmployeedetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
