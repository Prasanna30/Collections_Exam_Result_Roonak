import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testSetAge() {
		Customer c1 = new Customer("Ronak", 12, 216152, "seely", "san Jose", 95134);
		Throwable  exception = assertThrows(AgeCanNotBeNegativeException.class, 
				() -> c1.setAge(-12), "This was not expected");
		assertEquals("Age can not be negative", exception.getMessage()); 
		
	}

}
