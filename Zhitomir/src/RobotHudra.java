
public class RobotHudra {

	
	public Robot [] h1;
	
	 private double grossMassa;
	 private double minSpeed;
	 private double grossHeight;
	 private String hMessage =  "I am hudra";
	
		public RobotHudra(Robot[]a) {
			
		
			this.grossMassa = getGrossMassa(a);
			this.minSpeed = getMinSpeed(a);
			this.grossHeight = getGrossHeight(a);
		
		}
		
		public double getMinSpeed(Robot[]a){
		
			double min = a[0].getSpeed();
			for(int i = 0; i != a.length; i ++){
		            if(min>a[i].getSpeed());
		            min = a[i].getSpeed();
			}
	
			return min; 
			}		
		
		
		public double getGrossMassa(Robot[]a){
			
			double gr = 0;
			    for(int i=0; i<a.length; i++) {
			        gr=gr+a[i].getMassa();
			    }
	
			return gr; 
			}		
		
		
		public double getGrossHeight(Robot[]a){
			
			double he=0;
			
			for(int i = 0; i<a.length; i ++){
				he =he+ a[i].getHeight();
			}
	
			return he; 
			
			}		
		
		@Override
		public String toString() {
			return hMessage + ", my mass is " + grossMassa+ ", my speed is" +minSpeed + ", my height is" + grossHeight;
		}

		
		
}