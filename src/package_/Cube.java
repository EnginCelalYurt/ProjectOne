package package_;

public class Cube {
	//Attributes
	private int verticalForce;
	private int horizontalForce;
	private int upperForce;
	private int downForce;
	private int leftForce;
	private int rightForce;
	
	//Constructor
	public Cube(int verticalForce, int horizontalForce) {
		this.horizontalForce = horizontalForce;
		this.verticalForce = verticalForce;
		if(horizontalForce<10) {
			leftForce = 0;
			rightForce = horizontalForce%10;
		}
		else {
			leftForce = horizontalForce/10;
			rightForce = horizontalForce%10;
		}
		if(verticalForce<10) {
			upperForce = 0;
			downForce = verticalForce%10;
		}
		else {
			upperForce = verticalForce/10;
			downForce = verticalForce%10;
		}
	}
	
	//Getters and Setters
	public int getVerticalForce() {
		return verticalForce;
	}
	public void setVerticalForce(int verticalForce) {
		this.verticalForce = verticalForce;
	}
	public int getHorizontalForce() {
		return horizontalForce;
	}
	public void setHorizontalForce(int horizontalForce) {
		this.horizontalForce = horizontalForce;
	}
	public int getUpperForce() {
		return upperForce;
	}
	public void setUpperForce(int upperForce) {
		this.upperForce = upperForce;
	}
	public int getDownForce() {
		return downForce;
	}
	public void setDownForce(int downForce) {
		this.downForce = downForce;
	}
	public int getLeftForce() {
		return leftForce;
	}
	public void setLeftForce(int leftForce) {
		this.leftForce = leftForce;
	}
	public int getRightForce() {
		return rightForce;
	}
	public void setRightForce(int rightForce) {
		this.rightForce = rightForce;
	}
	
	
	public String textFirstLine() {
		return String.format(" %s ",upperForce);
	}
	public String textSecondLine() {
		return String.format("%s %s",leftForce,rightForce);
	}
	public String textThirdLine() {
		return String.format(" %s ",downForce);
	}
}
