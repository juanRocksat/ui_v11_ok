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

public class Turnos extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
					Turnos2 frame=new Turnos2();
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
	public Turnos()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(5, 8, 44, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(76, 5, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido: ");
		lblNewLabel_1.setBounds(5, 33, 44, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 30, 86, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel lblNroDeAfiliado = new JLabel("Nro. de Afiliado : ");
		lblNroDeAfiliado.setBounds(172, 8, 86, 14);
		contentPane.add(lblNroDeAfiliado);
		
		textField_2 = new JTextField();
		textField_2.setBounds(273, 5, 121, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero: ");
		lblNumero.setBounds(171, 33, 46, 14);
		contentPane.add(lblNumero);
		
		textField_3 = new JTextField();
		textField_3.setBounds(273, 30, 121, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTipoDeDoc = new JLabel("Tipo de Doc. : ");
		lblTipoDeDoc.setBounds(5, 75, 70, 14);
		contentPane.add(lblTipoDeDoc);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DNI", "DNI en tramite"}));
		comboBox.setBounds(85, 72, 77, 20);
		contentPane.add(comboBox);
	}
}
