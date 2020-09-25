
public class Customer{
	
	private String name;
	private int age;
	private int ssn;
	private String address;
	private String city;
	private int zipCode;
	
	Customer(String name, int age, int ssn, String address, String city, int zipCode){
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.address =address;
		this.city = city;
		this.zipCode =zipCode;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeCanNotBeNegativeException{
		if(age<0) {
			throw new AgeCanNotBeNegativeException("Age can not be negative");
		}
		else {
			this.age = age;
		}
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
