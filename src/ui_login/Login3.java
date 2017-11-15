package ui_login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import botones.login.Boton;
import interface_botones.Botones;
import interface_files.Archivos;
import listener.login.botonSiguiente.ListenerBotonSiguiente;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;

public class Login3 extends JFrame implements Botones,Archivos 
{

	private JPanel contentPane;
	private JTextField textField_legajo;
	public JTextField textField_password;
	private JButton btnSalir;
	
	
	private JPasswordField txtadmin;
	private String contraseña =new String();

	private String titulo ="titulo";
	public JButton btnIngresar;
	private JMenuBar menuBar;
	private JMenu mnAyuda;
	private JMenuItem mntmVerDocumentacion;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JLabel lblNombre;
	private JTextField textField_nombre;
	private JMenuItem mntmAbrirFilePara;
	private JMenuItem mntmVolverALogin;
	
	String label_legajo="legajo",label_contrasenia="contrasenia",label_nombre="nombre" ; 
	String botonSiguiente="siguiente",botonSalir="Salir";
	
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
					Login3 frame=new Login3();
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
	public Login3()
	{
		setTitle(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,330,211);
		
		menuBar = crearMenuBar();
		setJMenuBar(menuBar);
		mnArchivo = crearMenuArchivo();
		menuBar.add(mnArchivo);
		
		
		
		mntmAbrirFilePara = crearJMenuItemParaAbrirFile();
		mnArchivo.add(mntmAbrirFilePara);
		
		mntmVolverALogin = crearJMenuItemReiniciar();
		mntmSalir = crearSubMenuDeArchivo();
		mnArchivo.add(mntmVolverALogin);
		mnArchivo.add(mntmSalir);
		
		mnAyuda = new JMenu("Ayuda!");
		menuBar.add(mnAyuda);
		
		mntmVerDocumentacion = crearJMenuItemParaAbrirDocumentacion();
		mnAyuda.add(mntmVerDocumentacion);
		contentPane= crearJPanel();
		setContentPane(contentPane);
		
		btnIngresar = new JButton("Ingresar");
		
		lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		textField_nombre = new JTextField();
		GridBagConstraints gbc_textField_nombre = new GridBagConstraints();
		gbc_textField_nombre.anchor = GridBagConstraints.WEST;
		gbc_textField_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_textField_nombre.gridx = 5;
		gbc_textField_nombre.gridy = 1;
		contentPane.add(textField_nombre, gbc_textField_nombre);
		textField_nombre.setColumns(10);
		
		JLabel lblUser = new JLabel("Legajo : ");
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.anchor = GridBagConstraints.EAST;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 3;
		gbc_lblUser.gridy = 2;
		contentPane.add(lblUser, gbc_lblUser);
		
		textField_legajo = new JTextField();
		GridBagConstraints gbc_textField_legajo = new GridBagConstraints();
		gbc_textField_legajo.insets = new Insets(0, 0, 5, 5);
		gbc_textField_legajo.anchor = GridBagConstraints.WEST;
		gbc_textField_legajo.gridx = 5;
		gbc_textField_legajo.gridy = 2;
		contentPane.add(textField_legajo, gbc_textField_legajo);
		textField_legajo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pass: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 3;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_password = new JPasswordField();
		GridBagConstraints gbc_textField_password = new GridBagConstraints();
		gbc_textField_password.insets = new Insets(0, 0, 5, 5);
		gbc_textField_password.anchor = GridBagConstraints.WEST;
		gbc_textField_password.gridx = 5;
		gbc_textField_password.gridy = 3;
		contentPane.add(textField_password, gbc_textField_password);
		textField_password.setColumns(10);
		btnIngresar.addActionListener(new ListenerBotonSiguiente(textField_password) );
		GridBagConstraints gbc_btnIngresar = new GridBagConstraints();
		gbc_btnIngresar.insets = new Insets(0, 0, 0, 5);
		gbc_btnIngresar.gridx = 3;
		gbc_btnIngresar.gridy = 4;
		contentPane.add(btnIngresar, gbc_btnIngresar);
		
		
		hacerloPresionableConEnter(btnIngresar);
		
		btnSalir = new JButton("SALIR!!");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalir.gridx = 5;
		gbc_btnSalir.gridy = 4;
		contentPane.add(btnSalir, gbc_btnSalir);
		hacerloPresionableConEnter(btnSalir);
	}
	private JMenuBar crearMenuBar()
	{
		menuBar = new JMenuBar();

		return  menuBar;
	}
	private JMenu crearMenuArchivo()
	{
		// TODO Auto-generated method stub
		mnArchivo = new JMenu("Archivo");
		mnArchivo.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent e) {
				System.exit(0);
			}
			public void menuKeyReleased(MenuKeyEvent e) {
			}
			public void menuKeyTyped(MenuKeyEvent e) {
			}
		});

		return mnArchivo;
	}
	private JMenuItem crearSubMenuDeArchivo()
	{
		mntmSalir = new JMenuItem("Salir!");
		mntmSalir.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent e) {
			}
			public void menuKeyReleased(MenuKeyEvent e) {
			}
			public void menuKeyTyped(MenuKeyEvent e) {
			}
		});
		return mntmSalir;
	}
	private JMenuItem crearJMenuItemParaAbrirFile()
	{
		mntmAbrirFilePara = new JMenuItem("Abrir File para Huffman ");
		return mntmAbrirFilePara;
		// TODO Auto-generated method stub
	}
	private JMenuItem crearJMenuItemReiniciar()
	{
		mntmVolverALogin = new JMenuItem("reiniciar");
		mntmVolverALogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//setear los labels 
			}
		});
		return mntmVolverALogin;
	}
	private JMenuItem crearJMenuItemParaAbrirDocumentacion()
	{
		mntmVerDocumentacion = new JMenuItem("Ver documentacion");
		mntmVerDocumentacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dirWord = "C:\\Program Files\\Microsoft Office\\Office15\\WINWORD.EXE";
				String dirDeEstaClase = this.getClass().getProtectionDomain().getCodeSource().getLocation().toString();

				//abrir un word 
				//String dirFile = (new File(".")).getCanonicalPath();//direcion de este direcorio actual
//				String dirFile = direccionActual();
			//	
//				//Process word = Runtime.getRuntime().exec(dirWord+dirFile);
//				Process word = Runtime.getRuntime().exec(dirWord+" "+dirFile); 
			}
		});
		return mntmVerDocumentacion;
	}
	private JPanel crearJPanel()
	{
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(crearGridBagLayaoutParaJPanel());
		return contentPane;
	}
	private GridBagLayout crearGridBagLayaoutParaJPanel()
	{
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};

		return gbl_contentPane;
	}
}
