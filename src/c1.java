import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class c1 {

	@Test
	void testSetAge() {
		Customer c1 = new Customer();
		assertThrows(AgeCanNotBeNegativeException.class, () -> c1.setAge(12), "Negative should throw");
	}

}
