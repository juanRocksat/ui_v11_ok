package interface_files;

import java.io.File;
import java.io.IOException;

public interface Archivos
{
	public default String direccionActual() throws IOException
	{
		File miDir = new File (".");
	     try {
	       return "Directorio actual: " + miDir.getCanonicalPath();
	       }
	     catch(Exception e) {
	       e.printStackTrace();
	       }
		return "Directorio actual: " + miDir.getCanonicalPath();
	     
	}
}
