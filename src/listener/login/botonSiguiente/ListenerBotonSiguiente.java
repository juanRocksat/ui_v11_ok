package listener.login.botonSiguiente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import interface_botones.Botones;


public class ListenerBotonSiguiente implements ActionListener,Botones
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
		verificarContrasenia(textField);
	}
	public void  verificarContrasenia( JTextField textField2){
		if(textField2.getText() == "admin1234"){
			JOptionPane.showMessageDialog(null,"------>Bienvenido!");
		}
		else{
			pedirReconfirmacionDeCampoContrasenia(textField2);
		}
	}
	public void pedirReconfirmacionDeCampoContrasenia( JTextField campoContrasenia){
		int loDeReconfirmacion = JOptionPane.showConfirmDialog(null,"Esta seguro?","Ok",JOptionPane.YES_NO_CANCEL_OPTION);
		if(loDeReconfirmacion ==0){
			mostrar("error de contraseña");
			campoContrasenia.setText("");
		}
		if(loDeReconfirmacion==1){
			campoContrasenia.setText("");
		}
		//2 cancelo y -1 si cerró la ventana 
	}
	private void mostrar(String s)
	{
		JOptionPane.showMessageDialog(null,s);
	}

}
