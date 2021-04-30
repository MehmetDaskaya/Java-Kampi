
public class Main
{

	public static void main(String[] args)
	{
		Courses course1=new Courses(1,"Yaz�l�m Geli�tirici Kamp� C#-Angular","Engin Demiro�");
		Courses course2=new Courses(2,"Yaz�l�m Geli�tirici Kamp� Java-React","Engin Demiro�");
		Courses course3=new Courses(3,"Programlamaya Giri� ��in Temel Kurs","Engin Demiro�");
		Courses course4=new Courses(4,"Python Dersi","Mehmet Da�kaya");
		
		Courses[] courses= {course1,course2,course3,course4};
		
		for(Courses course:courses)
		{
			System.out.println(course.courseName +" "+ course.teacherName);
		}

		Instructors instructor1=new Instructors(1,"Engin","Demiro�");
		Instructors instructor2=new Instructors(2,"Mehmet","Da�kaya");
		
		Instructors[] instructors= {instructor1,instructor2};
		System.out.println(instructors.length);
		
		for(Instructors instructor:instructors)
		{
			System.out.println(instructor.name+ instructor.surname);
		}
	}
		
}