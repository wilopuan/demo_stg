package co.com.rm;

/**
 * Clase demo, externa que simula un trabajo aut?nomo runable de reverso
 * 
 * @author wilop
 *
 */
public class RevertWork implements Runnable {

	/**
	 * Data demo
	 */
	private DataRevertManager datademo;

	@Override
	public void run() {

		try {
			while (InitialRevert.haveMoreWork()) {
				Thread.sleep(10);
				datademo = InitialRevert.getNextPetition();
				System.out.println("RVT_" + datademo.getTrazabilityCode());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
