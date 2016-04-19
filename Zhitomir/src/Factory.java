import java.util.HashSet;
import java.util.Set;

public class Factory {

	private Set<String> robotsType = new HashSet<>();

	public void addType(Robot robot) {
		robotsType.add(robot.getClass().getName());
	}

	public Robot getRobot(String robotClass) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			if(robotsType.contains(robotClass)) {
			Robot robot = (Robot) Class.forName(robotClass).newInstance();
			return robot;
		}
		return null;
	}
	
	public Robot[] getRobot(String robotClass, int number) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		if(robotsType.contains(robotClass)) {
			Robot[] robots = new Robot[number];
			for (int i = 0; i < robots.length; i++) {
				robots[i] = (Robot) Class.forName(robotClass).newInstance();
			}
			return robots;
		}
		return null;
	}
	//http://stackoverflow.com/questions/7495785/java-how-to-instantiate-a-class-from-string
	//how to create class from string name
	
	public Robot[] getRobot(Robot robot, int number) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String robotClass = robot.getClass().getName();
		if(robotsType.contains(robotClass)) {
			Robot[] robots = new Robot[number];
			for (int i = 0; i < robots.length; i++) {
				robots[i] = (Robot) Class.forName(robotClass).newInstance();
			}
			return robots;
		}
		return null;
	}
	//http://stackoverflow.com/questions/7495785/java-how-to-instantiate-a-class-from-string
	//how to create class from string name
	
//http://www.tutorialspoint.com/design_pattern/factory_pattern.htm
//	public Robot getRobot(String robotType) {
//		if (robotType == null) {
//			return null;
//		} else if (robotType.equalsIgnoreCase("RobotA")) {
//			return new RobotA();
//		} else if (robotType.equalsIgnoreCase("RobotB")) {
//			return new RobotB();
//		}
//		return null;
//	}
//
//	public Robot[] getRobot(String robotType, int nuber) {
//		if (robotType == null) {
//			return null;
//		}
//		Robot[] robots = new Robot[nuber];
//		for (int i = 0; i < robots.length; i++) {
//			if (robotType.equalsIgnoreCase("RobotA")) {
//				robots[i] = new RobotA();
//			} else if (robotType.equalsIgnoreCase("RobotB")) {
//				robots[i] = new RobotB();
//			}
//		}
//		return null;
//	}

	// Robot a;
	// Robot b;
	//
	// Robot [] h1;
	// Robot [] h2;
	//
	// UnionRobot h3;
	//
	//
	// public Robot [] createMyHydra1(){
	// Robot [] h1 = new Robot[5];
	//
	//
	// for (int i = 0; i < 5; i ++){
	//
	//
	// h1 [i] = new RobotA();
	// }
	// return h1;
	// }
	//
	// public Robot [] createMyHydra2(){
	// Robot [] h2 = new Robot[2];
	//
	//
	// for (int i = 0; i < 2; i ++){
	//
	//
	// h2 [i] = new RobotB();
	// }
	// return h2;
	// }
	//
	// public static void mesage(Robot [] h1){
	// for(int i = 0; i != h1.length; i ++){
	// System.out.println(h1[i].toString());
	// }
	//
	//
	// }

}
