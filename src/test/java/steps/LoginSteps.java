package steps;

import org.openqa.selenium.By;

import app.Endpoints;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps{

	@Step
	public void gotoLogin() {
		
		//getDriver().navigate().to(Endpoints.login);
	}
	
	@Step
	public void setusername() {
		getDriver().findElement(By.id("userid")).sendKeys("edward");;
	}
	
	@Step
	public void setpass1() {
		getDriver().findElement(By.name("passid")).sendKeys("1234567");;
	}
	
	@Step
	public void setpass2() {
		getDriver().findElement(By.name("repeatpassid")).sendKeys("1234567");;
	}
	
	@Step
	public void submit() {
		getDriver().findElement(By.name("submit")).sendKeys("1234567");;
	}
}
