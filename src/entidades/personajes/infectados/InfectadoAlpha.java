package entidades.personajes.infectados;

import entidades.proyectiles.particulas.ParticulaAlpha;
import logica.Juego;
import visitor.*;
import visitor.Visitor;

/**
 * Estos infectados tienen menor resistencia y 
 * mayor letalidad.
 * @author 
 *
 */
public class InfectadoAlpha extends Infectado{
	
		public InfectadoAlpha(Juego juego) {
		super(juego);
	   	this.cargaViral = 80;
	   	this.puntos = 10;
		v = new VisitanteInfectadoAlpha(this);
	}

	/**
	 * duplicarVelocidad
	 * -----------------
	 * Duplica la velocidad del personaje
	 * cuando este tiene menos del 20% de energia
	 */
	public void duplicarVelocidad() {

		// si no esta afectado por la cuarentena entonces duplico su velocidad
		if(this.vector.getModulo()>0) { 
			vector.setModulo(8);
			//vector.setModulo(vector.getModulo()*2);
			particula.getVector().setModulo(9);
		}
	}
	// v es de jugador
	@Override
	public void accept(Visitor v) {
		v.visitarInfectadoAlpha(this);
	}
	@Override
	public void impacto(int disparo) {
		super.impacto(disparo);
		if(cargaViral-disparo>0 && cargaViral-disparo<=20)
			duplicarVelocidad();
	}

	public void tirarParticula() {
    	this.particula= new ParticulaAlpha(juego,this);
    }

	@Override
	public InfectadoAlpha clone() {
		// TODO Auto-generated method stub
		return new InfectadoAlpha(juego);
	}

	

	

}
