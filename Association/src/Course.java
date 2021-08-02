
public class Course {


	
	private String coursename;
	private String courseCode;
	private String courseCredit;
	
	
	public Course(String coursename, String courseCode, String courseCredit) {
		
		this.coursename = coursename;
		this.courseCode = courseCode;
		this.courseCredit = courseCredit;
	}
	
	
	public String coursename() {
		
		return coursename;
	}
	
	public String courseCode() {
		
		return courseCode;
	}
	
	public String courseCredit() {
		
		return courseCredit;	
	}
	
}
