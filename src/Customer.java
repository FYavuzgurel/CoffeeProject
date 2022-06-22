
public class Customer {
	
	
	private int Id;
	private String FristName;
	private String LastName;
	private String NationalityId;
	private int DateOfBirth;
	
	public Customer() {
		
	}
	
	public Customer(int Id,String FristName,String LastName,String NationalityId,int DateOfBirth) {
		
		this.Id=Id;
		this.FristName=FristName;
		this.LastName=LastName;
		this.NationalityId=NationalityId;
		this.DateOfBirth=DateOfBirth;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getFristName() {
		return FristName;
	}

	public void setFristName(String fristName) {
		this.FristName = fristName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.NationalityId = nationalityId;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}
	
	

	
}
