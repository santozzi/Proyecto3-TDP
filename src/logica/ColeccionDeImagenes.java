package logica;

import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

public class ColeccionDeImagenes extends Imagenes{

	private Map<Integer, ImageIcon> ruta;
	private static ColeccionDeImagenes colDeImg;
	private int contador;// es para probar, despues se borra

	public static ColeccionDeImagenes getColeccionDeImagenes() {
		if(colDeImg == null) {
			colDeImg = new ColeccionDeImagenes();
		}
		return colDeImg;
	}

	private ColeccionDeImagenes() {

		this.contador = 0;
		this.ruta = new HashMap<Integer, ImageIcon>();
		//Nivel 1
		
		//Nivel 2
		
		//InfectadosAlpha
		
		agregarRuta("InfectadoAlpha_golpear", "/img/z_ataque_abajo.gif", 40, 60);
		
		agregarRuta("InfectadoBossAlpha", "/img/z_ataque_abajo.gif", 140, 160);
		
		agregarRuta("InfectadoBossBeta","/img/infectadoBeta_caminar.gif", 140, 160);
		
		agregarRuta("Jugador_dispara", "/img/pistola_idle.png", 70, 50);
		
		agregarRuta("Jugador_dispara_sa", "/img/superArma.png", 70, 50);
		
		agregarRuta("Jugador_caminarDerecha", "/img/Jugador_caminarDerecha.gif", 70, 60);
		
		agregarRuta("Jugador_caminarIzquierda", "/img/Jugador_caminarIzquierda.gif", 70, 60);
		
		agregarRuta("nivel1", "/img/calle_desierto.png", Juego.ANCHO_DE_COMBATE+10, Juego.ALTO_DE_COMBATE);
		
		agregarRuta("nivel2", "/img/calle.jpg", Juego.ANCHO_DE_COMBATE+10, Juego.ALTO_DE_COMBATE);
		
		agregarRuta("fondoPresentacion", "/img/drApocalipsis.png", 562, 411);
		
		agregarRuta("ruinas", "/img/ruinas.gif", 785, 700);
		
		agregarRuta("plagueInc", "/img/plagueInc.PNG", 80, 130);
		
		agregarRuta("mapaDerecha", "/img/fondoDerecho_desierto_reDimensionado.png", Juego.DECORADO_DERECHO, Juego.ALTO_DE_COMBATE);
		
		agregarRuta("mapaIzquierda", "/img/fondoIzquierdo_desierto_reDimensionado.png", Juego.DECORADO_IZQUIERDO, Juego.ALTO_DE_COMBATE);
		
		agregarRuta("fondoIzquierda", "/img/fondoIzquierdo_desierto_reDimensionado.png", Juego.DECORADO_IZQUIERDO, Juego.ALTO_DE_COMBATE);
		
		agregarRuta("fondoDerecha", "/img/fondoDerecho_desierto_reDimensionado.png", Juego.DECORADO_DERECHO, Juego.ALTO_DE_COMBATE);
		
		agregarRuta("proyectilSanitario", "/img/Jeringa2.png", 20, 50);
		
		agregarRuta("superProyectilSanitario", "/img/Super_jeringa.png", 20, 50);
		
		agregarRuta("recargar", "/img/recargar.gif", 70, 50);
	
		agregarRuta("particula", "/img/particula.png", 20, 20);
		
		agregarRuta("particulaBeta", "/img/particulaBeta.png", 20, 20);
		
		agregarRuta("humano", "/img/Humano.png", 40, 60);
		
		agregarRuta("pocion","/img/pocion.png", 50, 50);
		
		agregarRuta("superArmaSanitaria","/img/ak47.png", 50, 20);
		
		agregarRuta("cuarentena","/img/cuarentena.png", 40, 40);
		
		agregarRuta("dialogo","/img/dialogo.png", 80, 40);

		agregarRuta("superProyectil","/img/Super_jeringa.png", 40, 40);

		agregarRuta("humanoCuarentena","/img/Humano_cuarentena.png", 40, 60);
		
		agregarRuta("humanoSuperArma","/img/Humano_superArma.png", 40, 60);
		
		agregarRuta("humanoPocion","/img/Humano_pocion.png", 40, 60);
		
		agregarRuta("humanoCorrer","/img/Humano_correr.png", 40, 60);
		
		agregarRuta("autoEnLlamas","/img/autoEnLlamas.gif", 75, 120);
		
		agregarRuta("InfectadoBeta","/img/infectadoBeta_caminar.gif", 40, 60);
		
		agregarRuta("Jugador_noqueado", "/img/personaje_noqueado.png", 70, 80);
		
		agregarRuta("Jugador_muerto", "/img/personaje_muerto.png", 80, 80);

	}
	
	private void agregarRuta(String clave, String ruta, int ancho, int alto) {
		ImageIcon icono = new ImageIcon(this.getClass().getResource(ruta));
		icono.setImage(icono.getImage().getScaledInstance(ancho, alto, 0));
		this.ruta.put(clave.hashCode(), icono);
		
	}

	public ImageIcon getImagen(String clave) {
		//System.out.println("Buscar imagen " + ruta + " " + this.contador++);
		return this.ruta.get(clave.hashCode());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "infectados";
	}
	
}
