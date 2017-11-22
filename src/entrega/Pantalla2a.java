package entrega;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import javax.swing.JTable;

public class Pantalla2a extends JFrame
{

	private JPanel contentPane;
	static Pantalla0 pantallaSiguiente=new Pantalla0();
	private JTable table;
	
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
					Pantalla2a frame=new Pantalla2a(pantallaSiguiente);
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
//	public Pantalla2a()
//	{
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100,100,450,300);
//		contentPane=new JPanel();
//		contentPane.setBorder(new EmptyBorder(5,5,5,5));
//		setContentPane(contentPane);
//		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		contentPane.setLayout(gbl_contentPane);
//		
//		JButton btnSiguiente = new JButton("Siguiente");
//		btnSiguiente.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
//		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
//		gbc_btnSiguiente.gridx = 4;
//		gbc_btnSiguiente.gridy = 4;
//		contentPane.add(btnSiguiente, gbc_btnSiguiente);
//	}


	public Pantalla2a(Pantalla0 pantallaAnterior_)
	{
		pantallaSiguiente=pantallaAnterior_;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pantallaSiguiente.toFront();
				
			}
		});
		btnSiguiente.setVisible(true);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.insets = new Insets(0, 0, 5, 5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 2;
		gbc_table.gridy = 2;
		contentPane.add(table, gbc_table);
		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
		gbc_btnSiguiente.insets = new Insets(0, 0, 5, 5);
		gbc_btnSiguiente.gridx = 4;
		gbc_btnSiguiente.gridy = 4;
		contentPane.add(btnSiguiente, gbc_btnSiguiente);
		setVisible(true);
		setTitle("Pantalla2");
	}
	
	public JPanel getContentPane()
	{
		return contentPane;
	}

	public void setContentPane(JPanel contentPane)
	{
		this.contentPane=contentPane;
	}

	public Pantalla0 getPantallaSiguiente()
	{
		return pantallaSiguiente;
	}

	public void setPantallaSiguiente(Pantalla0 pantallaSiguiente)
	{
		this.pantallaSiguiente=pantallaSiguiente;
	}


}
