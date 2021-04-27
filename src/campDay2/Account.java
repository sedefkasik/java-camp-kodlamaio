package campDay2;

public class Account {

	
	
	public Account() {
		
		System.out.println("Constructor class çalýþtý!");
		
	}
	
	
	
	
	public Account (int id, String name, String mail, String password1, String password2) {
		//this();
		this.id = id;
		this.fullName = name;
		this.mailAdress = mail;
		this.password = password1;
		this.controlPassword = password2;
	}
	
	int id;
	String fullName;
	String mailAdress;
	String password;
	String controlPassword;

	
}
