
public class Address {
	
	private String houseNo;
	private String village;
	private String postoffice;
	private String Thana;
	private String District;
	


	public Address(String houseNo, String village, String postoffice, String Thana, String District){
		
		this.houseNo = houseNo;
		this.village = village;
		this.postoffice = postoffice;
		this.Thana = Thana;
		this.District = District;
	}
	public String getHouseNo() {
		
		return houseNo;
	}
	
	public String getvillage() {
		
		return village;
	}
	
	public String getpostoffice() {
		
		return postoffice;
	}
	
	public String getThana() {
		
		return Thana;
	}
	
	public String getDistrict() {
		
		return District;
	}
}