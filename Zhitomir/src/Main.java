
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Factory a = new Factory();
		Robot[]xe=a.createMyHydra1();
		a.mesage(xe);
		RobotHudra y = new RobotHudra(xe);
		System.out.println(y.toString());
	}

}
