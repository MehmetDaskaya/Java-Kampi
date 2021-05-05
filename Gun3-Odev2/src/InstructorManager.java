
public class InstructorManager extends UserManager{

	static void teach(Instructor instructor, Courses course) {
		System.out.println(instructor.firstName + " " + instructor.lastName + " artýk " +  course.course + " kursunun eðitmeni.");
	}

}
