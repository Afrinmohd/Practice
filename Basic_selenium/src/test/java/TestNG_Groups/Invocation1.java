package TestNG_Groups;

import org.testng.annotations.Test;

public class Invocation1 {
	@Test(groups="smoke")
	public void test1() {
		System.out.println("Hi");
	}
	@Test
	public void test2() {
		System.out.println("java");
	}
}
