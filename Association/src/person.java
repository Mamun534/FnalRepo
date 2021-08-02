
public class person {

	private String name;
	private String gender;
	private String age;
	private String mobilenum;
	private Address address;
	
	
	public person(String name, String gender, String age, String mobilenum, Address address) {

		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mobilenum = mobilenum;
		this.address=address;
	}

	

	public String getname() {

		return name;
	}

	public String getgender() {

		return gender;
	}

	public String getage() {

		return age;
	}

	public String getmobilenum() {

		return mobilenum;
	}

	public Address getaddress() {

		return address;
	}

}
