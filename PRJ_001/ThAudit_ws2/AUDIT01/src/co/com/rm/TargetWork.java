package co.com.rm;

import java.util.Random;

/**
 * Clase temporal para la ejecuci�n aleatoria de reversos o notificaciones
 * 
 * @author wilop
 *
 */
public class TargetWork {

	public static boolean isAlreadyDone(String Keyproc) {
		boolean result;
		Random rd = new Random();
		result = rd.nextBoolean();
		System.out.println("R_"+Keyproc+":"+result);
		return result;
	}

	public static boolean doNotify(String Keyproc) {
		Random rd = new Random();
		return rd.nextBoolean();
	}

}