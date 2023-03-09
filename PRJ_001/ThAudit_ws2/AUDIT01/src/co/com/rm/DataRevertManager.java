package co.com.rm;

public class DataRevertManager {

	/**
	 * Registro de reintento
	 */
	private String trazabilityCode;

	/**
	 * Reintentos programados
	 */
	private int programRetry;

	public String getTrazabilityCode() {
		return trazabilityCode;
	}

	public void setTrazabilityCode(String trazabilityCode) {
		this.trazabilityCode = trazabilityCode;
	}

	public int getProgramRetry() {
		return programRetry;
	}

	public void setProgramRetry(int programRetry) {
		this.programRetry = programRetry;
	}
	
	public void programRetryDecrease() {
		this.programRetry--;
	}
	

	public DataRevertManager(String trazabilityCode, int programRetry) {
		this.trazabilityCode = trazabilityCode;
		this.programRetry = programRetry;
	}

}
