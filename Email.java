package emailapp;
import java.util.Scanner;
public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String email;
	private String CompanySuffix="aeycompany.com";
//	constructor to receive the first name and last name
	public Email(String firstname ,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
	System.out.println("EMAIL CREATED:"+this.firstname +""+this.lastname);
//		call a method asking for the department=return the department
		this.department=setDepartment();
		System.out.println("department is="+this.department);
	
//	call a method that generate a random password
	this.password=randomPassword(defaultPasswordLength);
	System.out.println("your password is:"+this.password);
	
//	combine elements to generate email
	email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+CompanySuffix;
	System.out.println("your email is:"+email);
	}
	
//	ask for the department
	private String setDepartment()
	{
		System.out.println("New worker:"+firstname+"\ndepartment codes\n1 for sales\n2 for development\n3 for accounting\n0 for none\nenter the department code");
		
		Scanner in= new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2){return "dev";}
		else if(depChoice==3){return "act";}
		else {return "";}
		}
	
//	generate a random password
private String randomPassword(int length) {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$%";
	char[] password=new char[length];
	for(int i=0;i<length;i++)
	{
		
	int rand=(int)(Math.random()*passwordSet.length());
	password[i]=passwordSet.charAt(rand);
	}
	return new String(password);
		
	}

//	set the mailbox capacity
public void setMailboxCapacity(int capacity)
{
this.mailboxCapacity=capacity;
}
//	set the alternate email
public void setAlternateEmail(String altEmail)
{
	this.alternateEmail=altEmail;
}
//change the password	
	public void changePassword(String password) {
		this.password=password;
	}
public int getMailboxCapacity()
{
	return mailboxCapacity;}
public String getAlternateEmail()
{
	return alternateEmail;
}
public String getpassword()
{
	return password;}

public String showInfo() {
	return "DISPLAY NAME:"+firstname+" "+lastname+
			"\nCOMPANY EMAIL="+email+
			"\nMAILBOX CAPACITY=" +mailboxCapacity +"mb"; 
			
}
}
	


