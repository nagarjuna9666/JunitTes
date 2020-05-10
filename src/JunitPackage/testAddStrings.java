package JunitPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		junitfunction junitstrings=new junitfunction();
		String result=junitstrings.addStrings("capstones", "project");
		assertEquals("capstonesproject",result);
	}

}
