package ec.edu.ups.VentanaBuscarPedirLibro;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class BuscarPedirLibro {
	public static void main(String[] args) {
		Label Titulo = new Label("Acceder     ");
		
		Label Titulo1 = new Label("Buscar");
		Frame MiMarco = new Frame();
		Panel EntradaDeDatos = new Panel(new BorderLayout());
		
		Panel tituloPanel = new Panel(new FlowLayout(FlowLayout.CENTER));
		tituloPanel.add(Titulo);

		EntradaDeDatos.add(tituloPanel, BorderLayout.NORTH);
		
		Panel usuarioPanel = new Panel(new FlowLayout());
		usuarioPanel.add(Titulo1);
		usuarioPanel.add(new TextField(15));
		EntradaDeDatos.add(usuarioPanel, BorderLayout.CENTER);
		
		MiMarco.add(EntradaDeDatos);
		MiMarco.setSize(500, 200);
		MiMarco.setTitle("Biblioteca Virtual");
		MiMarco.setVisible(true);
	}
}
