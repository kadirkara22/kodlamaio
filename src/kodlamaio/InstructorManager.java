package kodlamaio;

public class InstructorManager {
	public void AddLesson(Instructor instructor) {
		System.out.println(instructor.brans+" �devi "+instructor.firstName+" ��retmen taraf�ndan ==> Lesson adeded");
	}
	public void DeleteLesson(Instructor instructor) {
		System.out.println(instructor.brans+" �devi "+instructor.firstName+" ��retmen taraf�ndan ==> Lesson deleted");
	}
	public void UpdateLesson(Instructor instructor) {
		System.out.println(instructor.brans+" �devi "+instructor.firstName+" ��retmen taraf�ndan ==> Lesson updated");
	}
}
