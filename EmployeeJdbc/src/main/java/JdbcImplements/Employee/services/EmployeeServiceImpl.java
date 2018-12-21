package JdbcImplements.Employee.services;

import java.util.List;

import JdbcImplements.Employee.dao.EmployeeDao;
import JdbcImplements.EmployeeJdbc.Employee.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	public  void setEmployeeDao(EmployeeDao employeeDao)
	 {
		 this.employeeDao=employeeDao;
	 }
	@Override
	public void addEmployee(Employee employee) {
		
		employeeDao.createEmployee(employee);

	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
			}

	@Override
	public void deleteEmployeeById(int id) {
		 employeeDao.deleteEmployeeById(id);

	}

	@Override
	public void updateEmployeeById(String email, int id) {
	employeeDao.updateEmployeeById(email, id);

	}

	@Override
	public List<Employee> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployeedetails();
	}

}
