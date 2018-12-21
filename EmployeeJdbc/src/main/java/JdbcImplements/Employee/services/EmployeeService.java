package JdbcImplements.Employee.services;

import java.util.List;

import JdbcImplements.EmployeeJdbc.Employee.Employee;

public interface EmployeeService {

	public abstract void addEmployee(Employee employee);
	public abstract Employee getEmployeeById(int id);
	public abstract void deleteEmployeeById(int id);
	public abstract void updateEmployeeById(String email,int id);
	public abstract List<Employee> getAllEmployeeInfo();
}
