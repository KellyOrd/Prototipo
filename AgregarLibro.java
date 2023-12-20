package ec.edu.ups.VentanaAgregarLibro;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class AgregarLibro {
	public static void main(String[] args) {
		Label Titulo = new Label("Agregar Libro     ");
		Label Titulo3 = new Label("   Datos del libro");
		Label Titulo1 = new Label("Autor");
		Label Titulo2 = new Label("Nombre");
		Label Titulo4 = new Label("Año de publicación");
		Frame MiMarco = new Frame();
		Panel EntradaDeDatos = new Panel(new BorderLayout());
		
		Panel tituloPanel = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloPanel.add(Titulo);
		tituloPanel.add(Titulo3);
		
		EntradaDeDatos.add(tituloPanel, BorderLayout.NORTH);
		
		
		Panel usuarioPanel = new Panel(new FlowLayout());
		usuarioPanel.add(Titulo1);
		usuarioPanel.add(new TextField(15));
		EntradaDeDatos.add(usuarioPanel, BorderLayout.CENTER);
		
		Panel rPanel = new Panel(new FlowLayout());
		rPanel.add(Titulo4);
		rPanel.add(new TextField(15));
		EntradaDeDatos.add(rPanel, BorderLayout.WEST);
		
		Panel dPanel = new Panel(new FlowLayout());
		dPanel.add(Titulo2);
		dPanel.add(new TextField(15));
		EntradaDeDatos.add(dPanel, BorderLayout.SOUTH);
		
		
		
		MiMarco.add(EntradaDeDatos);
		MiMarco.setSize(500, 200);
		MiMarco.setTitle("Biblioteca Virtual");
		MiMarco.setVisible(true);
	}
}
