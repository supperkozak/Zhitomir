
public class Main {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.println("Hello world");

		Factory a = new Factory();

		// Robot robot1 = a.getRobot("robotA");
		// Robot robot2 = a.getRobot("robotB");
		//
		// robot1.message();
		// System.out.println(robot1);
		// RobotA robotA = (RobotA) robot1;
		// robotA.test();
		//
		// robot2.message();
		// System.out.println(robot2);
		//
		//
		// 

		Robot robotA = a.getRobot("RobotA");
		System.out.println(robotA);
		a.addType(new RobotA());
		robotA = a.getRobot("RobotA");
		System.out.println(robotA);
		Robot robotB = a.getRobot("RobotB");
		System.out.println(robotB);
		a.addType(new RobotB());
		robotB = a.getRobot("RobotB");
		System.out.println(robotB);
		UnionRobot unionRobot = new UnionRobot();
		System.out.println(unionRobot);
		unionRobot.addRobot(robotA);
		System.out.println(unionRobot);
		unionRobot.addRobot(robotB);
		System.out.println(unionRobot);
		Robot [] robotAM = a.getRobot(robotA, 15);
		UnionRobot unionRobotA = new UnionRobot(robotAM);
		System.out.println(unionRobotA);

	}

}
