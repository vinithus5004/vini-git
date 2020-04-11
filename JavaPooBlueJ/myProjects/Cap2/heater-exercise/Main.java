public class Main{
	
	public static void main(String args[]){
		
		Heater heater = new Heater(-5,25);
		
		heater.setIncrement(1);
		for(int i=0;i<9;i++){
			heater.warmer();
		}
		heater.setIncrement(2);
		heater.warmer();
		System.out.println(heater.getTemperature());

	}
}
