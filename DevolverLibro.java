package ec.edu.ups.VentanaDevolverLibro;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class DevolverLibro {
	public static void main(String[] args) {
		Label Titulo = new Label("Devolver Libro     ");
		Label Titulo3 = new Label("   Buscar el libro que deseas devolver en tu biblioteca");
		
		Frame MiMarco = new Frame();
		Panel EntradaDeDatos = new Panel(new BorderLayout());
		
		Panel tituloPanel = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloPanel.add(Titulo);
		tituloPanel.add(Titulo3);
		
		EntradaDeDatos.add(tituloPanel, BorderLayout.NORTH);
		
		
		Panel usuarioPanel = new Panel(new FlowLayout());
		usuarioPanel.add(new TextField(15));
		EntradaDeDatos.add(usuarioPanel, BorderLayout.CENTER);
		
		MiMarco.add(EntradaDeDatos);
		MiMarco.setSize(500, 200);
		MiMarco.setTitle("Biblioteca Virtual");
		MiMarco.setVisible(true);
	}
}
