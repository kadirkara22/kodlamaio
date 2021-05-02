package kodlamaio;

public class Instructor extends User {
	
   public String brans;
   public Instructor() {
	   
   }

public Instructor(int id, String email, String password, String firstName, String lastName, int age, String cinsiyet,
		String profession, String brans) {
	super(id, email, password, firstName, lastName, age, cinsiyet, profession);
	this.brans = brans;
}
	
	

}
