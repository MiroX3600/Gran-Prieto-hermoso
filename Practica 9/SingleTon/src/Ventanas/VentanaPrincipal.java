package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Controlador.Controlador;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {
	
	private JPanel ContentPane;
	
	public VentanaPrincipal() {
		
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setBounds (100, 100, 450, 82);
		ContentPane = new JPanel ();
		ContentPane.setBorder(new EmptyBorder (5, 5, 5, 5));
		setContentPane (ContentPane);
		ContentPane.setLayout (new FlowLayout (FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton ("Crear Controlador");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed (ActionEvent arg0) {
				Controlador c = Controlador.getControlador ();
				System.out.println(c);
			}
			
		});
		ContentPane.add(btnNewButton);
	}
}
