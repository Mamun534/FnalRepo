import java.util.ArrayList;
import java.util.List;

public class AssociationTest {

	// One to One

	public static void main(String[] args) {

		Address address = new Address("101", "Mahutola", "thanarhat", "sonaimury", "Noakhali");

		person person = new person("mamun", "male", "29", "019876546", address);

		 System.out.println(person.getaddress().getDistrict());

		// One student have Many courses which is called one to many(student class and
		// course class)...

		List<Course> courses = new ArrayList<>();

		Course course1 = new Course("java", "cse45", "4");
		Course course2 = new Course("selenium", "cse5", "5");

		courses.add(course1);
		courses.add(course2);

		student student = new student("mamun", "011", "cse", courses);

		List<Course> courseList = student.courses();
		
		
		// Separately print course using....
		
		System.out.println(courseList.get(0).coursename());
		System.out.println(courseList.get(1).coursename());
		


			// Using for loop together finding course name which is java selenium...	
		
		  for (Course course : courseList) {
		  
		  System.out.println(course.coursename());         //(Two course java,selenium)
		  
		  }
		

	}

}
