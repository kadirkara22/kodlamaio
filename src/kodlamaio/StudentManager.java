package kodlamaio;

public class StudentManager {
	public void AddHomeWork(User user) {
		System.out.println(user.firstName+" "+user.LastName+" Homework adeded");
	}
	public void DeleteHomeWork(User user) {
		System.out.println(user.firstName+" "+user.LastName+" Homework deleted");
	}
	public void UpdateHomeWork(User user) {
		System.out.println(user.firstName+" "+user.LastName+" Homework updated");
	}

}
