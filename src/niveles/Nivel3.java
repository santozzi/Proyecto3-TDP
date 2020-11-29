package niveles;

import java.util.List;

import entidades.Entidad;
import niveles.fabricas.FabricaDeTandas;
import niveles.fabricas.Nivel3InfectadosMixto;

public class Nivel3 extends Nivel {

	@Override
	public List<Entidad> primeraTanda() {
		FabricaDeTandas  fdt =  new Nivel3InfectadosMixto(juego,this); 
		fdt.primeraTanda();
		return this.compInf.getListaDeInfectados();
	}

	@Override
	public List<Entidad> segundaTanda() {
		FabricaDeTandas  fdt = new Nivel3InfectadosMixto(juego, this); 
		fdt.segundaTanda();
		return this.compInf.getListaDeInfectados();
	}
	public List<Entidad> elJefe(){
		FabricaDeTandas  fdt = new Nivel3InfectadosMixto(juego, this);
		fdt.elJefe();
		return this.compInf.getListaDeInfectados();
	}




}
