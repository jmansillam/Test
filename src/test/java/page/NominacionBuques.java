package page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import entities.Buque;

public class NominacionBuques {
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"WucLogin_TxtUsuario\"]")
	WebElement userName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"WucLogin_TxtClave\"]")
	WebElement password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"WucLogin_BtnLogin\"]")
	WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"WucRolxUsuario_btnSeleccionar\"]")
	WebElement btnSeleccionar;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_ddlEncabezadoTipoImportacion\"]")
	WebElement tipoImportacion;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"navbar\"]/ul[1]/li[1]/a")
	WebElement importaciones;
	
	@FindBy(how = How.XPATH, using = "	//*[@id=\"navbar\"]/ul[1]/li[1]/ul/li[1]/a")
	WebElement nominacionDeBuques;
	
	//Botones
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucToolbar_lkbNuevo > i")
	WebElement btnNew;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_wucToolbar_lkbGuardar\"]")
	WebElement btnSave;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucToolbar_lkbAceptar > i")
	WebElement btnAccept;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucToolbar_lkbCancelar > i")
	WebElement btnCancelar;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucToolbar_lkbBasura")
	WebElement btnDelete;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_BtBusquedaBuque")
	WebElement btnSearch;
	
	//Campos de datos
	@FindBy(how = How.CSS, using = "#textboxEditablectl00_ContentPlaceHolder_wucMaestro_wucBuque_upWucTextboxEditable")
	WebElement txtBuscarBuque;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_wucMaestro_txtMstNombreBuque\"]")
	WebElement txtNombreBuque;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dropdownlistContentctl00_ContentPlaceHolder_wucMaestro_wucCasaClasificadora_ComboBox\"]/input")
	WebElement casaClasificadora;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dropdownlistContentctl00_ContentPlaceHolder_wucMaestro_wucPaisBandera_myCombobox\"]/input")
	WebElement pais;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtAnioBuque")
	WebElement AnioBuque;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtEslora")
	WebElement txtEslora;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionEslora_ComboBox\"]/i")
	WebElement btnMedidaEslora;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dropdownlistContentctl00_ContentPlaceHolder_wucMaestro_wucSeleccionEslora_ComboBox\"]/input")
	WebElement medidasEslora;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtManga")
	WebElement txtManga;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionManga_ComboBox\"]")
	WebElement btnMedidaManga;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dropdownlistContentctl00_ContentPlaceHolder_wucMaestro_wucSeleccionManga_ComboBox\"]/input")
	WebElement medidaManga;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtMstPesoBruto")
	WebElement txtPesoBruto;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionPesoBruto_ComboBox\"]")
	WebElement btnPesoBruto;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"listitem2innerListBoxjqxWidgete65b3528585c\"]/span/table/tbody/tr/td[1]")
	WebElement paisSeleccionado;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dropdownlistContentctl00_ContentPlaceHolder_wucMaestro_wucSeleccionPesoBruto_ComboBox\"]/input")
	WebElement medidaPesoBruto;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_wucMaestro_txtMstGtr\"]")
	WebElement txtGTR;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionGtr_ComboBox\"]")
	WebElement btnGtr;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dropdownlistContentctl00_ContentPlaceHolder_wucMaestro_wucSeleccionGtr_ComboBox\"]/input")
	WebElement medidaGTR;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtMstBodegasFisicas")
	WebElement txtBodegasFisicas;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtMstNumeroGruas")
	WebElement txtNumeroDeGruas;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtMstCapacidadGrua")
	WebElement txtCapacidadGruas;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionCapacidadGrua_ComboBox\"]")
	WebElement btnMedidaCapacidadGruas;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dropdownlistContentctl00_ContentPlaceHolder_wucMaestro_wucSeleccionCapacidadGrua_ComboBox\"]/input")
	WebElement medidaCapacidadGruas;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_wucMaestro_chkMstIndicadorAlmeja\"]")
	WebElement comboBoxAlmeja;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtMstCapacidadAlmejas")
	WebElement txtCapacidadAlmeja;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"thebuttonctl00_ContentPlaceHolder_wucMaestro_wucSeleccionCapacidadAlmejas_ComboBox\"]")
	WebElement btnCapacidadAlmeja;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dropdownlistContentctl00_ContentPlaceHolder_wucMaestro_wucSeleccionCapacidadAlmejas_ComboBox\"]/input")
	WebElement medidaCapacidadAlmeja;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtMstIncentivoDescuento")
	WebElement txtIncentivo;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_wucMaestro_ddlMstIncentivoDescuento\"]")
	WebElement monedaIncentivo;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucMaestro_txtMstPenalizacionBarco")
	WebElement txtPenalizacion;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_wucMaestro_ddlMstPenalizacionBarco\"]")
	WebElement monedaPenalizacion;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dropdownlistContentctl00_ContentPlaceHolder_wucDetalleDestinos_wucPaisBandera_myCombobox\"]/input")
	WebElement paisDestino;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_wucDetalleDestinos_ddlDetOrden\"]")
	WebElement No_Orden;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_wucDetalleDestinos_lkbDetOrden\"]")
	WebElement btnAgregarDestino;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetCantidadPropia")
	WebElement txtCantidadPropia;
	
	@FindBy(how = How.CSS, using = "#dropdownlistContentctl00_ContentPlaceHolder_wucDetalleCantidades_wucSeleccionCantidadPropia_ComboBox > input")
	WebElement unidadCantidadPropia;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetCantidadTerceros")
	WebElement txtCantidadTerceros;
	
	@FindBy(how = How.CSS, using = "#dropdownlistContentctl00_ContentPlaceHolder_wucDetalleCantidades_wucSeleccionCantidadTerceros_ComboBox > input")
	WebElement medidaCantidadTerceros;
	
	@FindBy(how = How.CSS, using = "#ctl00_ContentPlaceHolder_wucDetalleCantidades_txtDetTolerancia")
	WebElement tolerancia;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"af369b50-0934-48ad-bfb7-13b929a6ae81\"]/div/div")
	WebElement alertaGuardado;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"46af3021-2228-49c6-900a-4881fec7f3cf\"]")
	WebElement btnGuardado;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"listitem2innerListBoxjqxWidget9bacb70f17c5\"]/span/table/tbody/tr/td[1]")
	WebElement paisDestinoSeleccionado;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_wucDetalleDestinos_rptBody_ctl00_lkbLimpiar\"]/span")
	WebElement btnCancelarDestino;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_ContentPlaceHolder_uprogNominacionBuque\"]/div/div[2]/img")
	WebElement imageWait;
	
	@FindBy(how = How.CSS, using = "#f1243237-e9c0-4e5e-9e37-3b39c0cffbf2 > div > div > div.modal-body > div > div > ul")
	WebElement lblSeleccioneImportacion;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"jqxScrollThumbverticalScrollBarinnerListBoxjqxWidget6645a22d0927\"]")
	WebElement scroll;
	
	
	@FindBy(how = How.CSS, using = "#\\30 a0a46aa-523d-4ed2-a997-fb02b72185c8")
	WebElement btnOkLblSeleccioneImportacion;
	
	WebDriver driver;
	
	public NominacionBuques(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public boolean Login(Buque buque) {
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		this.userName.sendKeys(buque.getUserName());
		this.password.sendKeys(buque.getPassword());
		app.Utilities.TakeScreenshot(this.driver, "Login");
		this.btnLogin.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionar));
		app.Utilities.TakeScreenshot(this.driver, "Seleccionar");
		this.btnSeleccionar.click();
		wait.until(ExpectedConditions.elementToBeClickable(importaciones));
		app.Utilities.TakeScreenshot(this.driver, "Pagina Principal");
		return importaciones.isDisplayed(); 
	}
	
	public boolean ClickEnGuardarSinSeleccionarUnTipoDeImportacion(Buque buque) {
		if (!Login(buque)) {
			return false;
		}
		importaciones.click();
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		WebDriverWait wait2 = new WebDriverWait(this.driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(nominacionDeBuques));
		nominacionDeBuques.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoImportacion));
		btnSave.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait2.until(ExpectedConditions.invisibilityOf(imageWait));
		wait.until(ExpectedConditions.visibilityOf(btnOkLblSeleccioneImportacion));
		btnOkLblSeleccioneImportacion.click();
		if (lblSeleccioneImportacion.getText().contains("Debe elegir un tipo de importación válido")) {
			wait.until(ExpectedConditions.visibilityOf(btnOkLblSeleccioneImportacion));
			btnOkLblSeleccioneImportacion.click();
			return true;
		}
		return false;
	}
	
	public boolean CrearNominacionDeBuque(Buque buque) {
		Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt(98563654);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(this.driver, 5);
		WebDriverWait wait2 = new WebDriverWait(this.driver, 50);
		this.userName.sendKeys(buque.getUserName());
		this.password.sendKeys(buque.getPassword());
		app.Utilities.TakeScreenshot(this.driver, "Login");
		this.btnLogin.click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSeleccionar));
		app.Utilities.TakeScreenshot(this.driver, "Seleccionar");
		this.btnSeleccionar.click();
		wait.until(ExpectedConditions.elementToBeClickable(importaciones));
		app.Utilities.TakeScreenshot(this.driver, "Pagina Principal");
		importaciones.click();
		wait.until(ExpectedConditions.elementToBeClickable(nominacionDeBuques));
		nominacionDeBuques.click();
		wait.until(ExpectedConditions.elementToBeClickable(tipoImportacion));
		app.Utilities.TakeScreenshot(this.driver, "Nominacion");
		new Select(this.tipoImportacion).selectByVisibleText(buque.getTipoImportacion());
		this.txtNombreBuque.sendKeys(buque.getNombre()+"_"+randomNum);
		this.casaClasificadora.sendKeys(buque.getCasaClasificadora());
		//wait.until(ExpectedConditions.visibilityOf(scroll));
		this.pais.click();
		this.pais.sendKeys(buque.getBandera());
		this.AnioBuque.sendKeys(buque.getAnio());
		
		this.txtEslora.sendKeys(buque.getEslora());
		wait.until(ExpectedConditions.visibilityOf(btnMedidaEslora));
		this.btnMedidaEslora.click();
		wait.until(ExpectedConditions.visibilityOf(medidasEslora));
		this.medidasEslora.sendKeys(buque.getMedidaEslora());
		medidasEslora.sendKeys("\u0008");
		
		this.txtManga.sendKeys(buque.getManga());
		wait.until(ExpectedConditions.visibilityOf(btnMedidaManga));
		this.btnMedidaManga.click();
		wait.until(ExpectedConditions.visibilityOf(medidaManga));
		medidaManga.sendKeys(buque.getMedidaManga());
		medidaManga.sendKeys("\u0008");
		
		this.txtPesoBruto.sendKeys(buque.getPesoBruto());
		wait.until(ExpectedConditions.visibilityOf(btnPesoBruto));
		this.btnPesoBruto.click();
		wait.until(ExpectedConditions.visibilityOf(medidaPesoBruto));
		this.medidaPesoBruto.sendKeys(buque.getMedidaPesoBruto());
		medidaPesoBruto.sendKeys("\u0008");
		
		this.txtGTR.sendKeys(buque.getGtr());
		wait.until(ExpectedConditions.visibilityOf(btnGtr));
		this.btnGtr.click();
		wait.until(ExpectedConditions.visibilityOf(medidaGTR));
		this.medidaGTR.sendKeys(buque.getMedidaGtr());
		medidaGTR.sendKeys("\u0008");
		
		txtBodegasFisicas.sendKeys(buque.getBodegas());
		txtNumeroDeGruas.sendKeys(buque.getNumeroDeGruas());
		
		txtCapacidadGruas.sendKeys(buque.getCapacidadGruas());
		wait.until(ExpectedConditions.visibilityOf(btnMedidaCapacidadGruas));
		this.btnMedidaCapacidadGruas.click();
		wait.until(ExpectedConditions.visibilityOf(medidaCapacidadGruas));
		this.medidaCapacidadGruas.sendKeys(buque.getMedidacapacidadGruas());
		medidaCapacidadGruas.sendKeys("\u0008");
		
		if (!buque.isIndicadorAlmeja()) {
			wait.until(ExpectedConditions.visibilityOf(comboBoxAlmeja));
			comboBoxAlmeja.click();
		}else {
			txtCapacidadAlmeja.sendKeys(buque.getCapacidadAlmeja());
			wait.until(ExpectedConditions.visibilityOf(btnCapacidadAlmeja));
			this.btnCapacidadAlmeja.click();
			wait.until(ExpectedConditions.visibilityOf(medidaCapacidadAlmeja));
			this.medidaCapacidadAlmeja.sendKeys(buque.getMedidaCapacidadAlmeja());
			medidaCapacidadAlmeja.sendKeys("\u0008");
		}
		app.Utilities.TakeScreenshot(this.driver, "Campos principales");
		this.txtIncentivo.sendKeys(buque.getIncentivo());
		new Select(this.monedaIncentivo).selectByVisibleText(buque.getMonedaIncentivo());
		this.txtPenalizacion.sendKeys(buque.getPenalizacion());
		new Select(this.monedaPenalizacion).selectByVisibleText(buque.getMonedaPenalizacion());
		paisDestino.sendKeys(buque.getPaisDestino1());
		No_Orden.click();
		new Select(this.No_Orden).selectByVisibleText(buque.getOrden1());
		wait.until(ExpectedConditions.visibilityOf(btnAgregarDestino));
		this.btnAgregarDestino.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait2.until(ExpectedConditions.invisibilityOf(imageWait));
		//Thread hilo = new Thread();
		//hilo.wait(50000);
		btnSave.click();
		//wait.until(ExpectedConditions.visibilityOf(lblSeleccioneImportacion));
		app.Utilities.TakeScreenshot(this.driver, "Destino 1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait2.until(ExpectedConditions.invisibilityOf(imageWait));
		app.Utilities.TakeScreenshot(this.driver, "Guardado");
		//wait2.until(ExpectedConditions.visibilityOf(alertaGuardado));
		//btnGuardado.click();
		return true;
	}
	
	
}
