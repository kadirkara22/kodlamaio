package kodlamaio;

public class Student extends User {
	public String ogrenciNo;
	public String s�n�f;
	public Student() {
		
	}
	public Student(int id, String email, String password, String firstName, String lastName, int age, String cinsiyet,
			String profession, String ogrenciNo, String s�n�f) {
		super(id, email, password, firstName, lastName, age, cinsiyet, profession);
		this.ogrenciNo = ogrenciNo;
		this.s�n�f = s�n�f;
	}
	

}
