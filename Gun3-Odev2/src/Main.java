
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstName("Mehmet");
		student1.setLastName("Daşkaya");
		student1.setId(1);
		
		Student student2 = new Student();
		student2.setFirstName("Veyselkarani");
		student2.setLastName("Ülkü");
		student2.setId(2);
		
		Courses course1 = new Courses();
		course1.setCourse("Python");
		course1.setCourseId(0);
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setId(3);
		
		InstructorManager insmanager1 = new InstructorManager();
		insmanager1.teach(instructor1,course1);
		
		
		User[] users = {student1 , student2 , instructor1};
		
		UserManager userManager = new UserManager();
		userManager.delete(student1);
		UserManager userManager1 = new UserManager();
		userManager.logIn(student2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.logIn();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logIn(instructor1);

	}

}
