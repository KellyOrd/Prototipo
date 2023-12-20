package ec.edu.ups.VentanaPrincipal;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Principal {
	public static void main(String[] args) {
		Label Titulo = new Label("Opciones para interactuar con los libros: ");
		
		Frame VentanaPrincipal = new Frame();
		Panel miPanel = new Panel();
		FlowLayout posicion1 = new FlowLayout();
		miPanel.add(Titulo);
		Button botonAgregarLibro = new Button("Agregar libro");
		Button botonRegistrarse = new Button("Registarse");
		Button botonBuscarLibro = new Button("Buscar libro");
		Button botonPedirLibro = new Button("Pedir libro");
		miPanel.setLayout(posicion1);
		VentanaPrincipal.add(miPanel);
		miPanel.add(Titulo, BorderLayout.NORTH);
		miPanel.add(botonAgregarLibro, BorderLayout.SOUTH);
		miPanel.add(botonRegistrarse, BorderLayout.SOUTH);
		miPanel.add(botonBuscarLibro, BorderLayout.SOUTH);
		miPanel.add(botonPedirLibro, BorderLayout.SOUTH);
		VentanaPrincipal.setSize(300, 200);
		VentanaPrincipal.setTitle("Biblioteca Virtual");
		VentanaPrincipal.setVisible(true);
	}
}
