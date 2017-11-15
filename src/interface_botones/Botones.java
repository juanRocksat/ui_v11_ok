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
