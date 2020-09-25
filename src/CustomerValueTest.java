import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerValueTest {

	@Test
	void testName() {
		Customer c1 = new Customer("Ronak", 12, 216152, "seely", "san Jose", 95134);
		String actual = c1.getName() ;
		String expected = "Ronak";
		assertEquals(expected, actual );
	}
	
	@Test
	void testAge(){
		Customer c1 = new Customer("Ronak", 12, 216152, "seely", "san Jose", 95134);
		int actual = c1.getAge();
		int expected = 12;
		assertEquals(expected, actual );
	}
	
	@Test
	void testSSN(){
		Customer c1 = new Customer("Ronak", 12, 216152, "seely", "san Jose", 95134);
		int actual = c1.getSsn();
		int expected = 216152;
		assertEquals(expected, actual );
	}
	
	@Test
	void testAddress(){
		Customer c1 = new Customer("Ronak", 12, 216152, "seely", "san Jose", 95134);
		String actual = c1.getAddress();
		String expected = "seely";
		assertEquals(expected, actual );
	}
	
	@Test
	void testCity(){
		Customer c1 = new Customer("Ronak", 12, 216152, "seely", "san Jose", 95134);
		String actual = c1.getCity();
		String expected = "san Jose";
		assertEquals(expected, actual );
	}
	
	@Test
	void testZipcode(){
		Customer c1 = new Customer("Ronak", 12, 216152, "seely", "san Jose", 95134);
		int actual = c1.getZipCode();
		int expected = 95134;
		assertEquals(expected, actual );
	}
	
	
	
	
	
	
	

}
