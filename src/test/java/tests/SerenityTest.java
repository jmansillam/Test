package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import app.WebDriverCreator;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class SerenityTest {

	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	steps.NominacionPasos nominacion;
	
	
	@Test
	@Title("CREAR NOMINACION")
	public void crearNominacion() 
	{ 
		nominacion.gotoLogin();
		nominacion.setusername();
		nominacion.submit();
		nominacion.select();
	}
	
}
