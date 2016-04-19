
public class RobotB extends Robot{

	private String mesage = "Hello I am B";
	
	@Override
	public String toString() {
		return getMesage() + ", my mass is " + getMassa()+ ", my speed is" + getSpeed() + ", my height is" + getHeight();
	}

		public String getMesage() {
				return mesage;
		}

		public void setMesage(String mesage) {
			this.mesage = mesage;
		}

		public RobotB() {
			super();
			// TODO Auto-generated constructor stub
		}
			
			
}


