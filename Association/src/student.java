import java.util.List;

public class student {

	// How To One to Many (student alss and course class for that)
	
	private String name;
	private String id;
	private String dept;
	private List<Course>courses;

	
	public student (String name, String id, String dept, List<Course>courses ) {
		
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.courses = courses;		
	}
	
	public String getname() {
		
		return name;		
	}
	
	public String getid() {
		return id;	
	}
	
	public String getdept() {
		
		return dept;
	}
	
	public List<Course>courses(){
		
		return courses;
	}
}
