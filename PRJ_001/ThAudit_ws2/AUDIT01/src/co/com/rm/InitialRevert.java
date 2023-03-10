package co.com.rm;

import java.util.Stack;

/**
 * Manejador del proceso inicial de reverso. Tiene como objetivos hacer el
 * primer intento de reverso de no resolverse .Puede recibir peticiones de inicio concurrentes.
 * 
 * @author wilop
 *
 */
public class InitialRevert {

	static private Stack<DataRevertManager> petitStack = null;

	/**
	 * Hilo Obrero para la operación de ejecucion del reverrso
	 */
	private static RevertWork runnaWorker = new RevertWork();

	/**
	 * Hilo Monitor para la administración del Hilo runnaWorker (Hilos obreros)
	 */
	private static Thread threadMonitor = null;

	/**
	 * Constructor de la Clase
	 */

	static {
		petitStack = new Stack<DataRevertManager>();
		threadMonitor = new Thread(runnaWorker);
	}

	/**
	 * Realiza el encolamiento del reverso inicial
	 * 
	 * @param dataRecord
	 */
	public static void doInitialRevert(DataRevertManager dataRecord) {

		petitStack.push(dataRecord);

		/**
		 * Asigna Hilo Obrero al Monitor-thread, si no hay hilos Obrero trabajando
		 */
		if (!threadMonitor.isAlive()) {
			threadMonitor = new Thread(runnaWorker);
			threadMonitor.start();
		}

	}

	/**
	 * Retorna estado del trabajo pendiente
	 * 
	 * @return
	 */
	public static boolean haveMoreWork() {
		if (petitStack.isEmpty()) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	/**
	 * Retorna la siguiente peticion de reverso inicial
	 * 
	 * @return
	 */
	public static DataRevertManager getNextPetition() {
		if (haveMoreWork()) {
			synchronized (petitStack) {
				return petitStack.pop();
			}
		}
		return null;
	}
}
