
public abstract class Robot {
	private double massa;
	private double speed;
	private double height;
	
	public Robot(double massa, double speed, double height) {
		super();
		this.massa = massa;
		this.speed = speed;
		this.height = height;
	}
	public Robot() {
		super();
		this.massa = Math.random()*100.0;
		this.speed = Math.random()*100.0;
		this.height = Math.random()*100.0;
	}
	public double getMassa() {
		return massa;
	}
	public void setMassa(double massa) {
		this.massa = massa;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

}
