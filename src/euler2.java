
public class euler2 {
	
	private double numSteps;
	private double stepSize;
	private double initialX;
	private double initialY;
	private double finalX;
	private double currentX;
	private double currentY;
	
	public euler2(double stepSize, double initialX, double initialY, double finalX) {
		
		this.stepSize = stepSize;
		this.initialX = initialX;
		this.initialY = initialY;
		this.finalX = finalX;
		currentY = initialY;
		
		numSteps = (finalX-initialX)/stepSize;
	}
	
	public double DFQ(double x, double y) {
		return 4/(x*x+1);
	}
	
	public void generateTable() {
		System.out.println("Step Size = " + stepSize);
		System.out.println("");
		System.out.println("1 " + initialX + " " + initialY);
		for (int i = 0; i<numSteps; i++) {
			double yNext = currentY + stepSize*DFQ(currentX, currentY);
			currentX += stepSize;
			currentY = yNext;
			System.out.printf(i + " " + currentX + " " + "%.2f\n",currentY);
		}
	}
	

	public static void main(String[] args) {
		
		euler2 myApprox = new euler2(0.0005,0.0,0,1.0);
		myApprox.generateTable();
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
