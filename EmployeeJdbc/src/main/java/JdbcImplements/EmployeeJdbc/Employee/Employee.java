package JdbcImplements.EmployeeJdbc.Employee;

public class Employee {
int id;
String name;
int age;
int salary;
String email;
public Employee()
{
	
}
public Employee(int id, String name, int age, int salary,String email) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.email=email;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
}
