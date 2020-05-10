package JunitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		junitfunction junit=new junitfunction();
		int result=junit.addNumbers(100, 200);
		assertEquals(300,result);
	}

}
