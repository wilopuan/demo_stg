package co.com.rm;

public class TestInitialRevert {
	
	private static class Workflow implements Runnable {
		private static int effort = 20;

		private String name;

		public Workflow(String name) {
			this.name = name;
		}

		@Override
		public void run() {

			for (Integer i = 1; i < 50; i++) {
				try {
					Thread.sleep((new Double(Math.random() * effort + 1).longValue()));
				} catch (InterruptedException e) {
					System.out.println("hilo workflow ");
					e.printStackTrace();
				}
				InitialRevert.doInitialRevert(new DataRevertManager(this.name + i.toString(), 0));
			}

		}

	}
	
	
	public static void main(String[] args) {


		Workflow workflow1 = new Workflow("WF1_:");
		Thread threadTrace = new Thread(workflow1);
		threadTrace.start();
		
		Workflow workflow2 = new Workflow("WF2_:");
		threadTrace = new Thread(workflow2);
		threadTrace.start();

		Workflow workflow3 = new Workflow("WF3_:");
		threadTrace = new Thread(workflow3);
		threadTrace.start();
		
		Workflow workflow4 = new Workflow("WF4_:");
		threadTrace = new Thread(workflow4);
		threadTrace.start();
		
		
	}
	
	

}
