
public class Factory {
	
	
	Robot a;
	Robot b;
	
	Robot [] h1;
	Robot [] h2;
	
	RobotHudra h3;
	
	
	public Robot [] createMyHydra1(){
		Robot [] h1 = new Robot[5];
		
		
		for (int i = 0; i < 5; i ++){
			
		
		    h1 [i] = new RobotA();
		} 
		return h1;
	}
	
	public Robot [] createMyHydra2(){
		Robot [] h2 = new Robot[2];
		
		
		for (int i = 0; i < 2; i ++){
			
		
		    h2 [i] = new RobotB();
		} 
		return h2;
	}
	
	public static void mesage(Robot [] h1){
		for(int i = 0; i != h1.length; i ++){
			System.out.println(h1[i].toString());
		}
		
		
	}

}


