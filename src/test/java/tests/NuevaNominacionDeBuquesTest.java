package tests;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import app.Endpoints;
import entities.Buque;

@RunWith(value = Parameterized.class)
public class NuevaNominacionDeBuquesTest extends BaseTest{

	Buque buque;
	public NuevaNominacionDeBuquesTest(String userName, String password, String tipoImportacion, String nombre, String casaClasificadora,
			String bandera, String anio, String eslora, String medidaEslora, String manga, String medidaManga,
			String pesoBruto, String medidaPesoBruto, String gtr, String medidaGtr, String bodegas,
			String numeroDeGruas, String capacidadGruas, String medidacapacidadGruas, String capacidadAlmeja,
			String medidaCapacidadAlmeja, String incentivo, String monedaIncentivo, String penalizacion,
			String monedaPenalizacion, String paisDestino1, String orden1, String paisDestino2, String orden2,
			String paisDestino3, String orden3, String material, String cantidadPropia, String medidaCantidadPropia,
			String cantidadTerceros, String medidaCantidadTerceros, String tolerancia, String indicadorAlmeja) {
		super(Endpoints.paginaPrincipal, "chrome");
		
		boolean indicador = (indicadorAlmeja.equalsIgnoreCase("TRUE") ? true:false);
		// TODO Auto-generated constructor stub
		
		buque = new Buque(userName, password, tipoImportacion, nombre, casaClasificadora, bandera, anio, eslora, medidaEslora, manga, medidaManga, pesoBruto, medidaPesoBruto, gtr, medidaGtr, bodegas, numeroDeGruas, capacidadGruas, medidacapacidadGruas, capacidadAlmeja, medidaCapacidadAlmeja, incentivo, monedaIncentivo, penalizacion, monedaPenalizacion, paisDestino1, orden1, paisDestino2, orden2, paisDestino3, orden3, material, cantidadPropia, medidaCantidadPropia, cantidadTerceros, medidaCantidadTerceros, tolerancia, indicadorAlmeja);
		buque.setIndicadorAlmeja(indicador);
	}
	
	@Test
	public void nuevaNominacionDeBuques()
	{
		//System.out.println(this.cuenta.print());
	   page.NominacionBuques obj = new page.NominacionBuques(this.getDriver());
       obj.CrearNominacionDeBuque(this.buque);
	   //obj.ClickEnGuardarSinSeleccionarUnTipoDeImportacion(this.buque);
	}
	
	@Parameters
	public static List<String[]> getData()
	{
		return app.DataReaders.getCsv("NominacionDeBuques.csv");
	}

}
