package calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculaterTest {

	@Test
	public void testResult() {
		CalculatorModel cm =new CalculatorModel();
		cm.addNumbers(2, 3);
		int result=cm.getResult();
assertEquals(5,result);

	}
	
	

}

