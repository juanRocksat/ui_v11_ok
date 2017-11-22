package entrega;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import algoii.tp.db.estudiantes.EstudiantesDB;

import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla0 extends JFrame
{
	JComboBox comboBox;
	Pantalla2b pantallaSiguiente;//=new Pantalla2a();
	private JPanel contentPane;
	Pantalla0 pantallaActual=this;

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
					Pantalla0 frame=new Pantalla0();
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
	public Pantalla0()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 2;
		contentPane.add(comboBox, gbc_comboBox);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				siguiente=new Pantalla2a(pantallaActual);//aqui el this corresponde al listener
//				siguiente.setPantallaSiguiente(this);
				//pantallaSiguiente.setPantallaSiguiente(new Pantalla2b());
				pantallaSiguiente=new Pantalla2b();
				pantallaSiguiente.toFront();
				
			}
		});
		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
		gbc_btnSiguiente.gridx = 2;
		gbc_btnSiguiente.gridy = 3;
		contentPane.add(btnSiguiente, gbc_btnSiguiente);
		agregarDatosAComboBoxPorLegajo();
		setTitle("Pantalla1");
	}
	private void agregarDatosAComboBox()
	{
		for(int i=1;i<=3;i++){
			comboBox.addItem(EstudiantesDB.buscarEstudiante(i).getNombre());
		}
	}
	private void agregarDatosAComboBoxPorLegajo()
	{
		for(int i=1;i<=3;i++){
			comboBox.addItem(EstudiantesDB.buscarEstudiante(i).getLegajo());
		}
	}


}
