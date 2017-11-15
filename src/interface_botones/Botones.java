package interface_botones;

import java.awt.event.KeyEvent;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public interface Botones
{
	public default void hacerloPresionableConEnter(JButton boton)
	{
		InputMap map = new InputMap();
		 
		map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
		map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");
		 
		boton.setInputMap(0, map);
	}
	public default void  verificarContraseña( JTextField campoContrasenia){
		if(campoContrasenia.getText() !="admin1234"){
			pedirReconfirmacionDeCampoContrasenia(campoContrasenia);
		}
		else{
			JOptionPane.showMessageDialog(null,"------>Bienvenido!");
		}
	}
	public default void pedirReconfirmacionDeCampoContrasenia( JTextField campoContrasenia){
		int loDeReconfirmacion = JOptionPane.showConfirmDialog(null,"Esta seguro?","Ok",JOptionPane.YES_NO_CANCEL_OPTION);

		if(loDeReconfirmacion ==0){
			JOptionPane.showMessageDialog(null,"Bienvenido");
		}
		if(loDeReconfirmacion==1){
			verificarContraseña(campoContrasenia);
		}
		//2 cancelo y -1 si cerró la ventana 
	}
	
//	private void hacerloPresionableConEnter2(JButton boton)
//	{
//		 if ( teclaPresionada(null)== KeyEvent.VK_ENTER) {
//			 boton.doClick();
//         }
//	}
//	private char teclaPresionada(KeyEvent e)
//	{
//		return e.getKeyChar();
//	}
}
