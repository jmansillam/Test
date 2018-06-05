package tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NominacionDeBuques {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCrearUnaNominacion() throws Exception {
    driver.get("http://198.38.93.248/Login");
    driver.findElement(By.id("WucLogin_TxtUsuario")).clear();
    driver.findElement(By.id("WucLogin_TxtUsuario")).sendKeys("mpenate");
    driver.findElement(By.id("WucLogin_TxtClave")).click();
    driver.findElement(By.id("WucLogin_TxtClave")).clear();
    driver.findElement(By.id("WucLogin_TxtClave")).sendKeys("Bdgsa.2018$");
    driver.findElement(By.id("WucLogin_BtnLogin")).click();
    driver.findElement(By.id("WucRolxUsuario_btnSeleccionar")).click();
    driver.findElement(By.linkText("Importaciones")).click();
    driver.findElement(By.linkText("Nominación de Buques")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_ddlEncabezadoTipoImportacion"))).selectByVisibleText("FOB");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_ddlEncabezadoTipoImportacion")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstNombreBuque")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstNombreBuque")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstNombreBuque")).sendKeys("TEST2018");
    driver.findElement(By.xpath("(//input[@value=''])[7]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[7]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[7]")).sendKeys("Guatemala");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtAnioBuque")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtAnioBuque")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtAnioBuque")).sendKeys("2015");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtEslora")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtEslora")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtEslora")).sendKeys("6789.9");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtManga")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtManga")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtManga")).sendKeys("1234.6");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstPesoBruto")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstPesoBruto")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstPesoBruto")).sendKeys("875.89");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstGtr")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstGtr")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstGtr")).sendKeys("3674.4");
    driver.findElement(By.xpath("//button[@id='thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionEslora_ComboBox']/i")).click();
    driver.findElement(By.xpath("(//input[@value=''])[8]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[8]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[8]")).sendKeys("M");
    driver.findElement(By.id("thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionManga_ComboBox")).click();
    driver.findElement(By.xpath("(//input[@value=''])[9]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[9]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[9]")).sendKeys("M");
    driver.findElement(By.id("thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionPesoBruto_ComboBox")).click();
    driver.findElement(By.xpath("(//input[@value=''])[10]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[10]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[10]")).sendKeys("M");
    driver.findElement(By.id("thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionGtr_ComboBox")).click();
    driver.findElement(By.xpath("(//input[@value=''])[11]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[11]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[11]")).sendKeys("MG");
    driver.findElement(By.xpath("(//input[@value=''])[5]")).click();
    driver.findElement(By.xpath("//div[@id='dropdownlistArrowctl00_ContentPlaceHolder_wucMaestro_wucCasaClasificadora_ComboBox']/div")).click();
    driver.findElement(By.xpath("(//input[@value=''])[5]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[5]")).sendKeys("Bureau Veritas (BV)");
    driver.findElement(By.xpath("(//input[@value=''])[5]")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder_wucMaestro_updatePanelWucMaestro']/div[2]/div[3]/div[2]")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstBodegasFisicas")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstBodegasFisicas")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstBodegasFisicas")).sendKeys("4");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstNumeroGruas")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstNumeroGruas")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstNumeroGruas")).sendKeys("34");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstCapacidadGrua")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstCapacidadGrua")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstCapacidadGrua")).sendKeys("456.78");
    driver.findElement(By.xpath("//button[@id='thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionCapacidadGrua_ComboBox']/i")).click();
    driver.findElement(By.xpath("(//input[@value=''])[10]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[10]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[10]")).sendKeys("M");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstCapacidadAlmejas")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstCapacidadAlmejas")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstCapacidadAlmejas")).sendKeys("678.89");
    driver.findElement(By.xpath("//button[@id='thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionCapacidadAlmejas_ComboBox']/i")).click();
    driver.findElement(By.xpath("(//input[@value=''])[11]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[11]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[11]")).sendKeys("M");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstIncentivoDescuento")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstIncentivoDescuento")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstIncentivoDescuento")).sendKeys("678.90");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_ddlMstIncentivoDescuento")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_ddlMstIncentivoDescuento"))).selectByVisibleText("DOP");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_ddlMstIncentivoDescuento")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstPenalizacionBarco")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstPenalizacionBarco")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_txtMstPenalizacionBarco")).sendKeys("3784.98");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_ddlMstPenalizacionBarco")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_ddlMstPenalizacionBarco"))).selectByVisibleText("CRC");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucMaestro_ddlMstPenalizacionBarco")).click();
    driver.findElement(By.xpath("(//input[@value=''])[12]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[12]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[12]")).sendKeys("EL SALVADOR");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden"))).selectByVisibleText("1");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden")).click();
    driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder_wucDetalleDestinos_lkbDetOrden']/span")).click();
    driver.findElement(By.xpath("//input[@value='El Salvador']")).click();
    driver.findElement(By.xpath("//input[@value='El Salvador']")).clear();
    driver.findElement(By.xpath("//input[@value='El Salvador']")).sendKeys("HONDURAS");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden"))).selectByVisibleText("2");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_lkbDetOrden")).click();
    driver.findElement(By.xpath("//input[@value='Honduras']")).click();
    driver.findElement(By.xpath("//input[@value='Honduras']")).clear();
    driver.findElement(By.xpath("//input[@value='Honduras']")).sendKeys("COSTA RICA");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden"))).selectByVisibleText("3");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden")).click();
    driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder_wucDetalleDestinos_lkbDetOrden']/span")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_ddlDetMaterial")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_ddlDetMaterial"))).selectByVisibleText("DNS");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_ddlDetMaterial")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetCantidadPropia")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetCantidadPropia")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetCantidadPropia")).sendKeys("45.98");
    driver.findElement(By.id("thebuttonctl00_ContentPlaceHolder_wucDetalleCantidades_wucSeleccionCantidadPropia_ComboBox")).click();
    driver.findElement(By.id("thebuttonctl00_ContentPlaceHolder_wucDetalleCantidades_wucSeleccionCantidadPropia_ComboBox")).click();
    driver.findElement(By.xpath("(//input[@value=''])[7]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[7]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[7]")).sendKeys("MG");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetCantidadTerceros")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetCantidadTerceros")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetCantidadTerceros")).sendKeys("345.56");
    driver.findElement(By.xpath("//button[@id='thebuttonctl00_ContentPlaceHolder_wucDetalleCantidades_wucSeleccionCantidadTerceros_ComboBox']/i")).click();
    driver.findElement(By.xpath("//button[@id='thebuttonctl00_ContentPlaceHolder_wucDetalleCantidades_wucSeleccionCantidadTerceros_ComboBox']/i")).click();
    driver.findElement(By.xpath("(//input[@value=''])[9]")).click();
    driver.findElement(By.xpath("(//input[@value=''])[9]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[9]")).sendKeys("M");
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetTolerancia")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetTolerancia")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetTolerancia")).sendKeys("45");
    driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder_wucToolbar_lkbGuardar']/i")).click();
    driver.findElement(By.id("87b781ee-c559-42d1-9069-69d1e4218b09")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder_wucDetalleCantidades_lkbDetMaterial")).click();
    driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder_wucToolbar_lkbGuardar']/i")).click();
    driver.findElement(By.id("ac20187e-b358-4f73-8bb6-a16fdba0ed2d")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
