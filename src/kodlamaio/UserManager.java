package kodlamaio;

public class UserManager {
	  public void List(){
	        System.out.println("List course");
	    }
	  public void NewPerson(User user) {
		  System.out.println(user.profession+" "+user.firstName  +" eklendi");
	  }
	  public void DeletePerson(User user) {
		  System.out.println(user.profession+" "+user.firstName +" silindi");
	  } public void UpdatePerson(User user) {
		  
		  
		  System.out.println(user.profession+" "+user.firstName +" güncellendi");
	  }
}
