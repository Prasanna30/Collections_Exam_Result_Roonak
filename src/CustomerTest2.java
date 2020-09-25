import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class CustomerTest2 {

	@Test(expected = AgeCanNotBeNegativeException.class)
	public void testSetAge() throws AgeCanNotBeNegativeException{
//		Throwable exception = assertThrows(
//	    		AgeCanNotBeNegativeException.class, () -> {
//	              Customer c1 = new Customer();
//	              c1.setAge(12);
//	            }
//	    );
//	    assertEquals("Valid input", exception.getMessage()); 
		try{
			Customer c1 = new Customer();
			c1.setAge(-12);
		}
		catch(AgeCanNotBeNegativeException ex) {
			System.out.println(ex);
		}
	}
	
}
