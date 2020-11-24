package visitor;

import entidades.personajes.Humano;
import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.jugador.Jugador;
import entidades.premios.no_temporales.Pocion;
import entidades.proyectiles.ParticulaAlpha;
import entidades.proyectiles.Proyectil;
import entidades.proyectiles.ProyectilSanitario;

public class VisitanteJugador extends Visitante {
	private Jugador j;

	public VisitanteJugador(Jugador j) {
		this.j = j;
	}

	@Override
	public void visitarInfectadoAlpha(InfectadoAlpha ea) {
	//	System.out.println("jugador choca a alpha");
			
	}

	@Override
	public void visitarInfectadoBeta(InfectadoBeta eb) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visitarJugador(Jugador J) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visitarProyectilSanitario(ProyectilSanitario p) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visitarParticulaAlpha(ParticulaAlpha par) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarHumano(Humano hum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarPocion(Pocion pos) {
		// TODO Auto-generated method stub
		
	}



}

