package kodlamaio;

public class User {
	int id;
	String email;
	String password;
	String firstName;
	String LastName;
	int age;
	String cinsiyet;
	String profession;
	
	

	public User(int id, String email, String password, String firstName, String lastName, int age, String cinsiyet,
			String profession) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
		this.cinsiyet = cinsiyet;
		this.profession = profession;
	}



	public User(){
		
	}

}
