package Formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Bean.Usuario;
import mtto.GestionUsers;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrml extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrml frame = new LoginFrml();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrml() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 11, 61, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 36, 61, 14);
		contentPane.add(lblContrasea);
		
		txtUser = new JTextField();
		txtUser.setBounds(81, 8, 86, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(81, 33, 86, 20);
		contentPane.add(txtContraseña);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salir ();
			}
		});
		btnExit.setBounds(10, 92, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnSingIn = new JButton("Sing in");
		btnSingIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingresar();
			}
		});
		btnSingIn.setBounds(109, 92, 89, 23);
		contentPane.add(btnSingIn);
	}

	protected void Ingresar() {
		
		String usuario = txtUser.getText();
		String Contraseña = String.copyValueOf(txtContraseña.getPassword());
		
		GestionUsers gestionUsu = new GestionUsers();
		
		Usuario User2 = new Usuario();
		
		User2.setIdUsername (usuario);
		User2.setIdContraseña (Contraseña);
		
		Usuario User = gestionUsu.obtenUser (User2);
		
		if(User != null) {
			JOptionPane.showMessageDialog (contentPane, "Welcome");
			
			this.dispose();
			
			FormWelcm Bienvenida = new FormWelcm ();
			Bienvenida.setVisible(true);
		} else {
			JOptionPane.showMessageDialog (contentPane, "Dato invalido", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void salir() {
		System.exit(0);
	}
}
