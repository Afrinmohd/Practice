package TestNG_Groups;

import org.testng.annotations.Test;

public class Inocation2 {
	@Test
	public void test1() {
		System.out.println("Hello");
	}
	@Test(groups="smoke")
	public void test2() {
		System.out.println("Selinium");
	}

}
