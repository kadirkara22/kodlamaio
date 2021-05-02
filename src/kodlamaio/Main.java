package kodlamaio;

public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.age=15;
		student1.cinsiyet="E";
		student1.email="kadir@kadir.com";
		student1.firstName="kadir";
		student1.LastName="kara";
		student1.id=1;
		student1.password="1234";
		student1.profession="student";
		student1.ogrenciNo="200";
		student1.sınıf="12";
		
		Instructor instructor2=new Instructor();
		instructor2.age=30;
		instructor2.cinsiyet="k";
		instructor2.email="elif@elif.com";
		instructor2.firstName="elif";
		instructor2.LastName="eylül";
		instructor2.id=2;
		instructor2.password="56789";
		instructor2.profession="instructor";
		instructor2.brans="Matematik";
		
		UserManager userManager=new UserManager();
		userManager.NewPerson(student1);
		userManager.DeletePerson(instructor2);
		userManager.UpdatePerson(instructor2);
		
		StudentManager studentManager=new StudentManager();
		studentManager.AddHomeWork(student1);
		studentManager.DeleteHomeWork(student1);
		studentManager.UpdateHomeWork(student1);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.AddLesson(instructor2);
		instructorManager.DeleteLesson(instructor2);
		instructorManager.UpdateLesson(instructor2);
	}

}
