package Scripts;

import genericLibraray.Baseclass;

import org.testng.annotations.Test;

import Pompages.SkilraryLoginPage;
import Pompages.demoSkillraryPage;
import Pompages.Addtocartpage;

public class TestCase1 extends Baseclass {
	
	@Test
	public void tc1(){
	
	SkilraryLoginPage s=new SkilraryLoginPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	utilities.switchingtabs(driver);
	demoSkillraryPage sd=new demoSkillraryPage(driver);
	utilities.mouseHover(driver, sd.getcoursetab());
	sd.seleniumtraining();
	Addtocartpage d=new Addtocartpage(driver);
	utilities.doubleClick(driver, d.getAddbtn());
	d.carttocartbtn();
	utilities.alertpopup(driver);
	
	
	
	
	
	
	}		

}
