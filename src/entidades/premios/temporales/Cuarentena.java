package entidades.premios.temporales;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import entidades.Vector;
import logica.ColeccionDeImagenes;
import logica.Juego;
import entidades.Entidad;
import visitor.VisitanteCuarentena;
import visitor.VisitantePocion;
import visitor.Visitor;

public class Cuarentena extends Temporal{
    
	public Cuarentena(Juego juego) {
    	this.juego= juego;
    	vector = new Vector(0,1,1);
    	v= new VisitanteCuarentena(this);
    	this.claveImagen = new String("cuarentena");
    	imagen = ColeccionDeImagenes.getColeccionDeImagenes().getImagen(claveImagen);
    }
    
	@Override
	public void ejecutar() {
		for(Entidad entidad : this.juego.getNivel().getColeccionDeInfectados().getListaDeInfectados()) {
			entidad.detenerse();
		}
	}

	@Override
	public void accept(Visitor v) {
		v.visitarCuarentena(this);
	}
	
	public boolean hayColision(Entidad entidad) {
		// entidad.getEntorno() this.entorno
		//entorno = [x;x+anchoEntidad]
		//entornoEnY= [[y;y+anchoEntidad]
		int posEntidadActualX =this.vector.getPosicion().x;
		int posEntidadActualY =this.vector.getPosicion().y;
		int posEntidadParametroX =entidad.getVector().getPosicion().x;
		int posEntidadConAnchoX= posEntidadParametroX+entidad.getImagen().getIconWidth();

		int posEntidadParametroY =entidad.getVector().getPosicion().y ;
		int posEntidadConAltoY= posEntidadParametroY +entidad.getImagen().getIconHeight();

		boolean colisionEnX = (posEntidadActualX<= posEntidadConAnchoX) && (posEntidadActualX >= posEntidadParametroX-10);
		boolean colisionEnY = (posEntidadActualY+this.getImagen().getIconHeight()==posEntidadParametroY);// && (+this.getPosicion().y<=posEntidadParametroY);


		return colisionEnX &&colisionEnY;
		/*	
				(
				this.vector.getPosicion().y <= 
			(entidad.getVector().getPosicion().y+entidad.getImagen().getIconHeight())&&
						this.vector.getPosicion().y >= (entidad.getVector().getPosicion().y));
		 */
	}
}
