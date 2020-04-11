public class Heater{
	
	private int temperature;
	private int min;
	private int max;
	private int increment;
	
	public Heater(int min,int max){
		
		temperature = 15;
		increment = 5;
		this.min = min;
		this.max = max;
	}
	public void setIncrement(int increment){
		
		if(increment>0){
			this.increment = increment;
		}
		else{
			System.out.println("Apenas valores positivos!");
		}
	}
	//parte que mais me levou tempo.
	public void warmer(){
		if((temperature+increment)<=max){
			temperature += increment;
		}
	}
	//parte que mais me levou tempo.
	public void cooler(){
		if((temperature-increment)>=min){
			temperature -= increment;
		}
	}
	public int getTemperature(){
		return temperature;
	}

}
