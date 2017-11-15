package ui_login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import botones.login.Boton;
import interface_botones.Botones;
import listener.login.botonSiguiente.ListenerBotonSiguiente;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements Botones
{

	private JPanel contentPane;
	private JTextField textField_user;
	public JTextField textField_password;
	private JButton btnSalir;
	
	
	private JPasswordField txtadmin;
	private String contraseña =new String();

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Login frame=new Login();
					frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login()
	{
		setTitle("title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblUser = new JLabel("Legajo : ");
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.anchor = GridBagConstraints.EAST;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 4;
		gbc_lblUser.gridy = 1;
		contentPane.add(lblUser, gbc_lblUser);
		
		textField_user = new JTextField();
		GridBagConstraints gbc_textField_user = new GridBagConstraints();
		gbc_textField_user.insets = new Insets(0, 0, 5, 0);
		gbc_textField_user.anchor = GridBagConstraints.WEST;
		gbc_textField_user.gridx = 6;
		gbc_textField_user.gridy = 1;
		contentPane.add(textField_user, gbc_textField_user);
		textField_user.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pass: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_password = new JPasswordField();
		GridBagConstraints gbc_textField_password = new GridBagConstraints();
		gbc_textField_password.insets = new Insets(0, 0, 5, 0);
		gbc_textField_password.anchor = GridBagConstraints.WEST;
		gbc_textField_password.gridx = 6;
		gbc_textField_password.gridy = 2;
		contentPane.add(textField_password, gbc_textField_password);
		textField_password.setColumns(10);
		
		btnSalir = new JButton("SALIR!!");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ListenerBotonSiguiente(textField_password) );
		GridBagConstraints gbc_btnIngresar = new GridBagConstraints();
		gbc_btnIngresar.insets = new Insets(0, 0, 0, 5);
		gbc_btnIngresar.gridx = 4;
		gbc_btnIngresar.gridy = 4;
		contentPane.add(btnIngresar, gbc_btnIngresar);
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.gridx = 6;
		gbc_btnSalir.gridy = 4;
		contentPane.add(btnSalir, gbc_btnSalir);
		
		
		hacerloPresionableConEnter(btnIngresar);
		hacerloPresionableConEnter(btnSalir);
	}


}
