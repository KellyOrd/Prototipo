package ec.edu.ups.VentanaVerLibros;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class VerLibros {
	public static void main(String[] args) {
		Frame MiMarco = new Frame();

		Dialog ventanaEmergente = new Dialog(MiMarco, "Ver libros", true);
		ventanaEmergente.setSize(500, 300);
		ventanaEmergente.setLayout(new BorderLayout());

		// Agregar texto
		Panel panelTexto = new Panel(new FlowLayout(FlowLayout.CENTER));
		panelTexto.add(new Label("Ver libros:"));
		panelTexto.add(new Label("Las aventuras de Tom Sawyer de Mark Twain."));
		panelTexto.add(new Label("Robbie y otros relatos de Isaac Asimov."));
		panelTexto.add(new Label("El ritual de los Musgrave y otros relatos de A. Conan Doyle."));
		panelTexto.add(new Label("Relatos Espectrales de H.P. Lovecraft."));
		panelTexto.add(new Label("Madame Bovary de Gustave Flaubert."));
		panelTexto.add(new Label("Relatos de Humor de varios autores."));
		panelTexto.add(new Label("Poesía de Antonio Machado."));
		panelTexto.add(new Label("Metamorfosis de Ovidio."));
		panelTexto.add(new Label("Tres sombreros de copa de Miguel Mihura."));
		panelTexto.add(new Label("El fantasma de Canterville y otros cuentos de Oscar Wilde."));

		ventanaEmergente.setTitle("Biblioteca Virtual");
		ventanaEmergente.add(panelTexto, BorderLayout.CENTER);
		ventanaEmergente.setVisible(true);
	}
}
