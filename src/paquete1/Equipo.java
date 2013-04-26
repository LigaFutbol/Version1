/**
 * 
 */
package paquete1;

import java.util.ArrayList;

/**
 * @author Marc
 *
 */
public class Equipo {
	
	private String nombre;
	private int puntos;
	private int pg;
	private int pp;
	private int pe;
	private ArrayList<String> JugadoresConRoja;//Jugadores que no Jugaran el siguiente partido
	
	
	/**
	 * constructor de la clase equipo.
	 * @param nombre nombre del equipo
	 */
	public Equipo(String nombre)
	{
		JugadoresConRoja = new ArrayList<String>();
		this.nombre = nombre;
		puntos = 0;
		pg = 0;
		pp = 0;
		pe = 0;
	}
	
	/**
	 * Calcula el numero de puntos del equipo
	 */
	private void calcularPuntos()
	{
		puntos = pg*3 + pe*1;
	}
	
	/**
	 * Devuelve el nombre 
	 * @return nombre El nombre del equipo
	 */
	public String getNombre()
	{
		return nombre;
	}
	
	/**
	 * Permite cambiar el nombre
	 * @param nombre El nombre del equipo
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve los puntos 
	 * @return Los puntos del equipo.
	 */
	public int getPuntos()
	{
		calcularPuntos();
		return puntos;
	}
	
	/**
	 * Devuelve los partidos perdidos 
	 * @return los partidos perdidos
	 */
	public int getPp()
	{
		return pp;
	}
	
	/**
	 * Permite cambiar los partidos perdidos
	 * @param pp Partidos perdidos
	 */
	public void setPp(int pp)
	{
		this.pp = pp;
	}
	
	/**
	 * Devuelve los partidos empate 
	 * @return Los partidos empate
	 */
	public int getPe()
	{
		return pe;
	}
	
	/**
	 * Permite cambiar los partidos empate
	 * @param pe Partidos empatados
	 */
	public void setPe(int pe)
	{
		this.pe = pe;
	}
	
	/**
	 * Devuelve los partidos ganados 
	 * @return pg Los partidos Ganados
	 */
	public int getPg()
	{
		return pg;
	}
	
	/**
	 * Permite cambiar los partidos cambiados
	 * @param pg Partidos ganados
	 */
	public void setPg(int pg)
	{
		this.pg = pg;
	}
	
	/**
	 * Permite poner una tarjeta roja a un Jugador, 
	 * el cual no jugara el siguiente partido
	 */
	public void ponerRoja(String jugador)
	{
		JugadoresConRoja.add(jugador);
	}
	
	/**
	 * Permite resetear las rojas de los jugadores
	 * y pasar los nuevos a los viejos
	 */
	public void resetearRojas()
	{
		JugadoresConRoja.clear();
	}
	
	/**
	 * Devuelve la lista de jugadores con roja
	 * @return La lista de jugadores con roja
	 */
	public ArrayList<String> getRojasJugadores()
	{
		return JugadoresConRoja;
	}
}
