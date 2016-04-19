
public class RobotA extends Robot {

	
	@Override
	public String toString() {
		return getMesage() + ", my mass is " + getMassa()+ ", my speed is" + getSpeed() + ", my height is" + getHeight();
	}

	private String mesage = "Hello I am robot A";

		public String getMesage() {
			return mesage;
		}

		public void setMesage(String mesage) {
			this.mesage = mesage;
		}

		public RobotA() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	}


