package kodlamaio;

public class InstructorManager {
	public void AddLesson(Instructor instructor) {
		System.out.println(instructor.brans+" ödevi "+instructor.firstName+" öðretmen tarafýndan ==> Lesson adeded");
	}
	public void DeleteLesson(Instructor instructor) {
		System.out.println(instructor.brans+" ödevi "+instructor.firstName+" öðretmen tarafýndan ==> Lesson deleted");
	}
	public void UpdateLesson(Instructor instructor) {
		System.out.println(instructor.brans+" ödevi "+instructor.firstName+" öðretmen tarafýndan ==> Lesson updated");
	}
}
