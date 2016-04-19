
public class UnionRobot extends Robot {

	//private Robot[] robots;

	public UnionRobot() {
		super();
	}
	
	public UnionRobot(Robot[] robots) {
		super(getGrossMassa(robots), getMinSpeed(robots), getGrossHeight(robots));
		//this.robots = robots;
	}
	
	public void addRobot(Robot robot) {
		super.setHeight(super.getHeight() + robot.getHeight());
		super.setMassa(super.getMassa() + robot.getMassa());
		
		if(super.getSpeed() > robot.getSpeed()){
			super.setSpeed(robot.getSpeed());
		}
		
	}

	private static double getMinSpeed(Robot[] robots) {
		double min = robots[0].getSpeed();
		for (int i = 0; i < robots.length; i++) {
			if (min > robots[i].getSpeed()) {
				min = robots[i].getSpeed();
			}
		}
		return min;
	}

	private static double getGrossMassa(Robot[] robots) {
		double grossMassa = 0;
		for (int i = 0; i < robots.length; i++) {
			grossMassa += robots[i].getMassa();
		}
		return grossMassa;
	}

	private static double getGrossHeight(Robot[] robots) {
		double grossHeight = 0;
		for (int i = 0; i < robots.length; i++) {
			grossHeight = grossHeight + robots[i].getHeight();
		}
		return grossHeight;
	}
	
	@Override
	public void message() {
		System.out.println("I am Union Robot");
	}

}