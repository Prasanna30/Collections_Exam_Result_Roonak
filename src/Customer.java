
public class Customer{
	
	private String name;
	private int age;
	private int ssn;
	private String address;
	private String city;
	private int zipCode;
	
	
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
//		try{
			if(age<0) {
			throw new AgeCanNotBeNegativeException("Age can not be negative");
			}
			else {
			this.age = age;
//			throw new AgeCanNotBeNegativeException("Valid input");
			}
//			}
//		catch(Exception e){
//			System.out.println(e);
//		}
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

	public static void main(String[] args) throws AgeCanNotBeNegativeException {
		Customer c1 = new Customer();
		c1.setAge(-12);
		

	}

}
