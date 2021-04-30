
public class Main
{

	public static void main(String[] args)
	{
		Courses course1=new Courses(1,"Yazýlým Geliþtirici Kampý C#-Angular","Engin Demiroð");
		Courses course2=new Courses(2,"Yazýlým Geliþtirici Kampý Java-React","Engin Demiroð");
		Courses course3=new Courses(3,"Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiroð");
		Courses course4=new Courses(4,"Python Dersi","Mehmet Daþkaya");
		
		Courses[] courses= {course1,course2,course3,course4};
		
		for(Courses course:courses)
		{
			System.out.println(course.courseName +" "+ course.teacherName);
		}

		Instructors instructor1=new Instructors(1,"Engin","Demiroð");
		Instructors instructor2=new Instructors(2,"Mehmet","Daþkaya");
		
		Instructors[] instructors= {instructor1,instructor2};
		System.out.println(instructors.length);
		
		for(Instructors instructor:instructors)
		{
			System.out.println(instructor.name+ instructor.surname);
		}
	}
		
}