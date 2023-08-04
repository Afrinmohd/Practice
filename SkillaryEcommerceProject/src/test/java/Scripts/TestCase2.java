package Scripts;

import org.testng.annotations.Test;

import genericLibraray.Baseclass;
import Pompages.SkilraryLoginPage;
import Pompages.demoSkillraryPage;
import Pompages.TestingPage;

public class TestCase2  extends Baseclass {
	@Test
	public void tc2() throws Throwable{
		SkilraryLoginPage s=new SkilraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		demoSkillraryPage sd=new demoSkillraryPage(driver);
		utilities.switchingtabs(driver);
		Thread.sleep(5000);
		utilities.dropdown(sd.getcourseadd(), pdata.getPropertydata("coursedd"));
		TestingPage  t=new TestingPage (driver);
		utilities.dragdrop(driver, t.getSeleniumtraining(), t.getcarttab());
		
	}

}
