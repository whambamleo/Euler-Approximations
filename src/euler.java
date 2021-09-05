
public class euler {
	
	private double STEP_SIZE;
	private int INITIAL_VALUE;
	private int APPROX_VALUE;
	private double x;
	private double y;
	
	public euler(int INITIAL_VALUE, int APPROX_VALUE,double STEP_SIZE) {
		this.STEP_SIZE = STEP_SIZE;
		this.INITIAL_VALUE = INITIAL_VALUE;
		this.APPROX_VALUE = APPROX_VALUE;
	}
	
	public double dfqOutput(double x,double y) {
		return y;
		
	}
	
	public void generateTable() {
		x = 0;
		double yCurrent = INITIAL_VALUE;
		for (int i = 0; i<=((APPROX_VALUE-INITIAL_VALUE)/STEP_SIZE); i++) {
			double yNext = yCurrent + STEP_SIZE*(dfqOutput(x,yCurrent));
			System.out.println(x + " " + yCurrent);
			yCurrent = yNext;
			x += STEP_SIZE;
			
			
		}
	}

	public static void main(String[] args) {
		euler myApprox = new euler(1,2, 0.5);
		myApprox.generateTable();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
