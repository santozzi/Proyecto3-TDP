package visitor;

import entidades.personajes.Humano;
import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.infectados.InfectadoBoss;
import entidades.personajes.infectados.InfectadoBossAlpha;
import entidades.personajes.infectados.InfectadoBossBeta;
import entidades.personajes.jugador.Jugador;
import entidades.premios.no_temporales.Pocion;
import entidades.premios.temporales.Cuarentena;
import entidades.premios.temporales.SuperArma;
import entidades.proyectiles.ParticulaAlpha;
import entidades.proyectiles.ParticulaBeta;
import entidades.proyectiles.Proyectil;
import entidades.proyectiles.ProyectilSanitario;
import entidades.proyectiles.SuperProyectilSanitario;

public class VisitanteInfectadoBossBeta extends Visitante {
	
	private InfectadoBossBeta infectadoBossBeta;
	




	public VisitanteInfectadoBossBeta(InfectadoBossBeta infectadoBossBeta) {
		this.infectadoBossBeta = infectadoBossBeta;
	}

	@Override
	public void visitarInfectadoAlpha(InfectadoAlpha ea) {
		// TODO Auto-generated method stub
		
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
	public void visitarHumano(Humano hum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarParticulaAlpha(ParticulaAlpha par) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarPocion(Pocion pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarCuarentena(Cuarentena cuarentena) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarParticulaBeta(ParticulaBeta par) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarSuperProyectilSanitario(SuperProyectilSanitario sps) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarSuperArma(SuperArma sarm) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visitarInfectadoBossAlpha(InfectadoBossAlpha ifboss) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarInfectadoBossBeta(InfectadoBossBeta ifboss) {
		// TODO Auto-generated method stub
		
	}



}