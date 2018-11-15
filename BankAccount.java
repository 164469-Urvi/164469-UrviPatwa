


public class BankAccount {
	//static variable
	private static int autoAccountNo;
	//instance variable /class variable
private  int accountNo;
private String accountHolderName;
private double accountBalance;
//init block
{
	accountNo=++autoAccountNo;
	
}




//Default constructor
public BankAccount()
{
	accountNo=++autoAccountNo;
	accountHolderName="Unknow";
	accountBalance=0;
	
}
//parameterized constructor
public BankAccount(String accountHolderName,double accountBalance)//
{
	accountNo=++autoAccountNo;
	this.accountHolderName=accountHolderName;
	this.accountBalance=accountBalance;
	
}
//getter methods
public double getAccountBalance() {
	return accountBalance;
}
public int getAccountNo() {
	return accountNo;
}
public String getAccountHolderName() {
	return accountHolderName;
}
//service methods
public void withdraw(double amount){
	if(amount<=0)
	{
		System.out.println("enter valid value");
	}
	if(amount>accountBalance)
	{
		System.out.println("enter valid value");
	}
	else{
		this.accountBalance=amount;
	}
	
	
}
public void deposit(double amount){
	if(amount<=0){
	System.out.println("enter valid values");
}
	else{
		this.accountBalance+=amount;
	}
}
 public static void main(String[] args) {
	BankAccount acc=new BankAccount();
	BankAccount acc2=new BankAccount("urvi",5000);//to provide variety to user
	//re initializing or modifying existing values
}public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
}
 