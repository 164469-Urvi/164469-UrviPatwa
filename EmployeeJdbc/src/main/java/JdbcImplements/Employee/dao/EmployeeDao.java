package JdbcImplements.Employee.dao;

import java.util.List;

import JdbcImplements.EmployeeJdbc.Employee.Employee;

public interface EmployeeDao {
	
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeById(int id);
	public abstract void deleteEmployeeById(int id);
	public abstract void updateEmployeeById(String email,int id);
	public abstract List<Employee> getAllEmployeedetails();
	

}
