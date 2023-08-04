package TestNG;

import org.testng.annotations.Test;

public class Priority_Testing {
	@Test(enabled=false)
	public void Demo() {
		System.out.println("Testing");

}
	@Test(priority=-1)
	public void Test1() {
		System.out.println("testing2");
	}
	@Test(priority=1,invocationCount=2)
	public void Test2() {
		System.out.println("testing3");
	}
}
