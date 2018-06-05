package steps;

import org.openqa.selenium.By;

import app.Endpoints;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NominacionPasos extends ScenarioSteps{

	@Step
	public void gotoLogin() {
		
		getDriver().navigate().to(Endpoints.paginaPrincipal);
	}
	
	@Step
	public void setusername() {
		getDriver().findElement(By.id("WucLogin_TxtUsuario")).sendKeys("mpenate");
	}
	
	@Step
	public void setpass() {
		getDriver().findElement(By.id("WucLogin_TxtClave")).sendKeys("Bdgsa.2018$");
	}
	
	@Step
	public void submit() {
		getDriver().findElement(By.id("WucLogin_BtnLogin")).click();
	}
	
	@Step
	public void select() {
		getDriver().findElement(By.xpath("//*[@id=\\\"WucRolxUsuario_btnSeleccionar\\\"]")).click();
	}
}
