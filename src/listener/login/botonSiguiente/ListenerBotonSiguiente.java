package listener.login.botonSiguiente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ui_login.Login;

public class ListenerBotonSiguiente implements ActionListener
{
	JTextField textField ; 

	//Login login = new ui_login.Login();
	public ListenerBotonSiguiente()
	{
		super();// TODO Auto-generated constructor stub
	}
	public ListenerBotonSiguiente(JTextField textField_password_)
	{
		textField = textField_password_;
	}

	public void actionPerformed(ActionEvent e)
	{
		if(textField.getText() !="admin1234"){
			JOptionPane.showConfirmDialog(null,"Pass incorecta");
		}
		else{
			JOptionPane.showMessageDialog(null,"------>Bienvenido!");
		}
		
	}

}
