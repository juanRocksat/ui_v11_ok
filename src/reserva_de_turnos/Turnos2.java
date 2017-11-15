package reserva_de_turnos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Turnos2 extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable jTable;

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
					Turnos frame=new Turnos();
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
	public Turnos2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		
		JMenuBar jMenuBarPrincipal = new JMenuBar();
		jMenuBarPrincipal.setToolTipText("menuPrincipal\r\n");
		setJMenuBar(jMenuBarPrincipal);
		
		JMenu mnArchivo = new JMenu("Archivo");
		jMenuBarPrincipal.add(mnArchivo);
		
		JMenuItem mntmAbrirArchivoPara = new JMenuItem("Abrir Archivo para Huffman");
		mnArchivo.add(mntmAbrirArchivoPara);
		
		JMenuItem mntmSalir = new JMenuItem("Salir!");
		mnArchivo.add(mntmSalir);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		jMenuBarPrincipal.add(mnAyuda);
		
		JMenuItem mntmVerDocumentacion = new JMenuItem("ver Documentacion");
		mnAyuda.add(mntmVerDocumentacion);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(32, 14, 44, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(86, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido: ");
		lblNewLabel_1.setBounds(32, 39, 44, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//cuando presiona se acerca el mause 
			}
		});
		textField_1.setBounds(86, 42, 86, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel lblNroDeAfiliado = new JLabel("Nro. de Afiliado : ");
		lblNroDeAfiliado.setBounds(216, 14, 86, 14);
		contentPane.add(lblNroDeAfiliado);
		
		textField_2 = new JTextField();
		textField_2.setBounds(303, 11, 121, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(248, 39, 46, 14);
		contentPane.add(lblNumero);
		
		textField_3 = new JTextField();
		textField_3.setBounds(303, 39, 121, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTipoDeDoc = new JLabel("Tipo de Doc. : ");
		lblTipoDeDoc.setBounds(32, 81, 70, 14);
		contentPane.add(lblTipoDeDoc);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DNI", "DNI en tramite"}));
		comboBox.setBounds(125, 78, 77, 20);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(289, 95, 135, 128);
		contentPane.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		JTextArea txtrTextArea = new JTextArea();
		scrollPane.setViewportView(txtrTextArea);
		txtrTextArea.setText("a label le puse Italic ");
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblObservaciones.setBounds(289, 81, 86, 14);
		contentPane.add(lblObservaciones);
		
		JRadioButton rdbtnRadiobutton1 = new JRadioButton("RadioButton1");
		rdbtnRadiobutton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// listener de este radioButton 
			}
		});
		rdbtnRadiobutton1.setBounds(6, 116, 109, 23);
		contentPane.add(rdbtnRadiobutton1);
		
		JRadioButton rdbtnRadiobutton2 = new JRadioButton("radioButton2");
		rdbtnRadiobutton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// evento de este radioButton
			}
		});
		rdbtnRadiobutton2.setBounds(6, 148, 109, 23);
		contentPane.add(rdbtnRadiobutton2);
		
		jTable = new JTable();
		jTable.setBounds(148, 120, 115, 103);
		contentPane.add(jTable);
		
	}
}
