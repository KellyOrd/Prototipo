package ec.edu.ups.VentanaAcceder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Acceder {
	public static void main(String[] args) {
		Label Titulo = new Label("Acceder     ");
		Label Titulo3 = new Label("   Usa tu usuario y contraseña");
		Label Titulo1 = new Label("Usuario");
		Label Titulo2 = new Label("Contraseña");
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
		
		Panel passwordPanel = new Panel(new FlowLayout());
		passwordPanel.add(Titulo2);
		passwordPanel.add(new TextField(15));
		EntradaDeDatos.add(passwordPanel, BorderLayout.SOUTH);
		
		MiMarco.add(EntradaDeDatos);
		MiMarco.setSize(500, 200);
		MiMarco.setTitle("Biblioteca Virtual");
		MiMarco.setVisible(true);
	}
}