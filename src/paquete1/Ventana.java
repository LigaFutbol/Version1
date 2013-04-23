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
	 * @param args
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
     * Crea la barra de menús de la ventana principal
     * @param ventana   La ventana donde se mostrará la barra de menús
     */
    private void construirBarraMenus(JFrame ventana)
    {
    	JMenuBar barraDeMenus = new JMenuBar();
        ventana.setJMenuBar(barraDeMenus);
        
        //----------------------------------crea el menú Archivo
        
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
        menuArchivo.add(itemGuardarArchivo);

        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                salir(); 
            }
        });
        menuArchivo.add(itemSalir);
    }
    
    /**
     * Función Abrir. Abre un archivo
     */
    private void abrirArchivo()
    {
    	
    }
    
    /**
     * Función guardar. guarda un archivo
     */
    private void guardarArchivo()
    {
    	
    }
    
    /**
     * Función Salir: Sale de la aplicación.
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
