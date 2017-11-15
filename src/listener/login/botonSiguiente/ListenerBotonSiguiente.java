package listener.login.botonSiguiente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import interface_botones.Botones;


public class ListenerBotonSiguiente implements ActionListener,Botones
{
	JPasswordField textField ; 

	//Login login = new ui_login.Login();
	public ListenerBotonSiguiente()
	{
		super();// TODO Auto-generated constructor stub
	}
	public ListenerBotonSiguiente(JPasswordField textField_password_)
	{
		textField = textField_password_;
	}
	public void actionPerformed(ActionEvent e)
	{
		verificarContrasenia();
	}
	public void  verificarContrasenia( ){
		if(textField.getPassword() == "admin1234".toCharArray()){
			JOptionPane.showMessageDialog(null,"------>Bienvenido!");
		}
		else{
			pedirReconfirmacionDeCampoContrasenia();
		}
	}
	public void pedirReconfirmacionDeCampoContrasenia( ){
		int loDeReconfirmacion = JOptionPane.showConfirmDialog(null,"Esta seguro?","Ok",JOptionPane.YES_NO_CANCEL_OPTION);
		if(loDeReconfirmacion ==0){
			mostrarDialogo("error de contraseña");
			textField.setText("");
		}
		if(loDeReconfirmacion==1){
			textField.setText("");
		}
		//2 cancelo y -1 si cerró la ventana 
	}
	private void mostrarDialogo(String s)
	{
		JOptionPane.showMessageDialog(null,s);
	}

}
