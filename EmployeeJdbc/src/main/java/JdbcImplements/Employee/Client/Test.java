package JdbcImplements.Employee.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import JdbcImplements.Employee.services.EmployeeService;
import JdbcImplements.Employee.services.EmployeeServiceImpl;
import JdbcImplements.EmployeeJdbc.Employee.Employee;

public class Test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	EmployeeService employeeService=	context.getBean("employeeService",EmployeeServiceImpl.class);
		Employee employee=new Employee();
		employee.setName("Urvi");
		employee.setEmail("urvipatwa18@gmail.com");
		employee.setAge(22);
		employee.setSalary(10000);
		employeeService.addEmployee(employee);
		context.close();

	}

}
