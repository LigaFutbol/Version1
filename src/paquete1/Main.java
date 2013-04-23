/**
 * 
 */
package paquete1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Marc
 *
 */
public class Main {
		
	private static JFrame ventana;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		construirVentana();
	}
	
	/**
   	 * Create la ventana y sus componentes.
         */
 	private static void construirVentana()
   	{
    		ventana = new JFrame("");
    		construirBarraMenus(ventana);
   	}
    
    	/**
     	 * Crea la barra de men�s de la ventana principal
     	 * @param ventana   La ventana donde se mostrar� la barra de men�s
    	 */
    	private void construirBarraMenus(JFrame ventana)
    	{
    		JMenuBar barraDeMenus = new JMenuBar();
    	   	ventana.setJMenuBar(barraDeMenus);
        
        	//----------------------------------crea el men� Archivo
        
        	JMenu menuArchivo = new JMenu("Archivo");
        	barraDeMenus.add(menuArchivo);
        	
        	//--------------------------------crea los items de Archivo
        
        	JMenuItem itemAbrirArchivo = new JMenuItem("Abrir");
        	itemAbrirArchivo.addActionListener(new ActionListener() {
            		public void actionPerformed(ActionEvent e) { 
                		abrirArchivo(); 
            		}
        	});
        	menuArchivo.add(itemAbrirArchivo);
        
        	JMenuItem itemGuardarArchivo = new JMenuItem("Guardar");
        	itemGuardarArchivo.addActionListener(new ActionListener() {
           		public void actionPerformed(ActionEvent e) { 
                		guardarArchivo(); 
            		}
        	});
        	menuArchivo.add(itemAbrirArchivo);

        	JMenuItem itemSalir = new JMenuItem("Salir");
        	itemSalir.addActionListener(new ActionListener() {
            		public void actionPerformed(ActionEvent e) { 
                	salir(); 
            		}
        	});
        	menuArchivo.add(itemSalir);
    	}
    
    	/**
     	 * Funci�n Abrir. Abre un archivo
     	 */
    	private void abrirArchivo()
    	{
    				
    	}
    
    	/**
    	 * Funci�n guardar. guarda un archivo
    	 */
    	private void guardarArchivo()
    	{
    	
    	}
    
    	/**
    	 * Funci�n Salir: Sale de la aplicaci�n.
    	 */
   	private void salir()
    	{
       		if(mostrarSalirSiNo() == 0){
            		System.exit(0);
        	}
    	}
    
    	/**
     	 * comprueba si la persona realmente desea salir
    	 */
    	private int mostrarSalirSiNo()
   	{
        	int opcion = JOptionPane.showConfirmDialog(ventana, 
                    	"realmente quiere salir?",
                    	"",
                    	JOptionPane.YES_NO_OPTION);
        	return opcion;
    	}

}
