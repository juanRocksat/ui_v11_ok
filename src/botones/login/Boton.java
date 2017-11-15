package botones.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import listener.login.botonSiguiente.ListenerBotonSiguiente;


@SuppressWarnings("serial")
public class Boton extends JButton 
{
	//Login login = ((Login)login).Login();
//	JButton btnIngresar = new JButton("Ingresar");
//	public static 
	//ActionListener listener = (ActionListener)new listener.login.botonSiguiente.ListenerBotonSiguiente() ;
	public Boton()
	{
		// TODO Auto-generated constructor stub
	}
	public Boton(String s)
	{
		super(s);
//		addActionListener(listener);

	}
	@Override
	public void addActionListener(ActionListener l)
	{
		super.addActionListener(l);
	}
	
}
//al dope , lo que IMPORTO FUE EL LISTENER
