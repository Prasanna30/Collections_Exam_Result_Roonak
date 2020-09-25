import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testSetAge() {
		Customer c1 = new Customer();
		Throwable  exception = assertThrows(AgeCanNotBeNegativeException.class, () -> c1.setAge(-12));
		assertEquals("Age can not be negative", exception.getMessage()); 
		
	}

}
