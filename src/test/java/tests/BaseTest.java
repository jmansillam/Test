package tests;

import org.openqa.selenium.WebDriver;

import app.WebDriverCreator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class BaseTest {
	private String url;
	private WebDriver _driver;
	private String browserType;
	
    public BaseTest(String url, String browserType) 
    {
    	this.url = url;
    	this.browserType = browserType;
    }	
    
    // Este metodo siempre se va ejecutar antes de cualquier test
    @Before
    public void inicializar() 
    {
    	if(browserType.equals("chrome")) 
    	{
    		_driver = WebDriverCreator.getChromeDriver();
    	}else 
    	{
    		_driver = WebDriverCreator.getFirefoxDriver();
    	}
    	
    	_driver.navigate().to(url);
    }
    
    // Este metoddo siempre se va a ejecutar despues de cualquier test
    @After
    public void finalizar() 
    {
    	_driver.close(); // cerrar las ventanas abiertas
    	_driver.quit(); // cerrar el driver
    }
    
    public WebDriver getDriver() 
    {
    	return this._driver;
    }
    

}
