package co.com.rm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Manejador de notificaciones de reverso. Implementado desde Nov 24/2020
 * 
 * @author wilop
 *
 */
public class NotifyManager {

	/**
	 * Coleccion de registros a notificar
	 */
	private static Stack<String> notifyCollect = null;

	/**
	 * Constructor de la Clase
	 */

	static {
		notifyCollect = new Stack<String>();
	}

	/**
	 * Hay registros para notificar
	 * 
	 * @return
	 */
	public static boolean thereIsMoreWork() {
		if (notifyCollect.isEmpty()) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	/**
	 * Metodo por UNA SOLA VEZ una lista de los registros a notificar
	 */
	public static List<String> getNotified() {

		List<String> resulList = new ArrayList<String>();

		try {
			synchronized (notifyCollect) {
				while (!notifyCollect.isEmpty()) {
					resulList.add(notifyCollect.pop());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resulList;

	}

	/**
	 * Programa las notificaciones
	 */
	public static void programNotify(String target) {

		notifyCollect.add(target);

	}

}
