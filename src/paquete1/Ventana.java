package paquete1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Marc
 */
public class Ventana 
{
  
	private JFrame ventana;
	
	/**
	 * constructor de la clase Ventana
	 */
	public Ventana() 
	{

	}	
	
	/**
     * Create la ventana y sus componentes.
     */
    public void construirVentana(String nombreVentana)
    {
    	ventana = new JFrame(nombreVentana);
    	construirBarraMenus(ventana);
    	
    	Container panelContenedor = ventana.getContentPane();
        panelContenedor.setLayout(new BorderLayout());//dispone el contenido en partes para poder ir añadiendolos
        
        
    	ventana.pack();
        ventana.setVisible(true);
    }
    
    /**
     * Crea la barra de menus de la ventana principal
     * @param ventana   La ventana donde se mostrar la barra de menus
     */
    private void construirBarraMenus(JFrame ventana)
    {
    	JMenuBar barraDeMenus = new JMenuBar();
        ventana.setJMenuBar(barraDeMenus);
        
        //----------------------------------crea el menu Archivo
        
        JMenu menuArchivo = new JMenu("Archivo");
        barraDeMenus.add(menuArchivo);
        
        //--------------------------------crea los items de Archivo
        {
        	JMenuItem itemNuevoArchivo = new JMenuItem("Nuevo archivo");
        	itemNuevoArchivo.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) { 
        			nuevoArchivo(); 
        		}
        	});
        
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
        	menuArchivo.add(itemGuardarArchivo);

        	JMenuItem itemSalir = new JMenuItem("Salir");
        	itemSalir.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) { 
        			salir(); 
        		}
        	});
        	menuArchivo.add(itemSalir);
        }
    }
    
    /**
     * Funcion nuevo. crea un nuevo archivo
     */
    private void nuevoArchivo()
    {
    	
    }
    
    /**
     * Funcion Abrir. Abre un archivo
     */
    private void abrirArchivo()
    {
    	
    }
    
    /**
     * Funcion guardar. guarda un archivo
     */
    private void guardarArchivo()
    {
    	
    }
    
    /**
     * Funcion Salir: Sale de la aplicacion.
     */
    private void salir()
    {
        if(mostrarSalirSiNo() == 0){
            guardarArchivo();
        }
        else if(mostrarSalirSiNo() == 1){
        	System.exit(0);
        }
    }
    
    /**
     * comprueba si la persona realmente desea salir
     */
    private int mostrarSalirSiNo()
    {
        int opcion = JOptionPane.showConfirmDialog(ventana, 
                    "No ha guardado la liga, desea hacerlo ahora?",
                    "Liga Futbol",
                    JOptionPane.YES_NO_CANCEL_OPTION);
        return opcion;
    }

}
