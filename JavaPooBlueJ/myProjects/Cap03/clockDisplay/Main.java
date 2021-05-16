public class Main{
	
	public static void main(String args[]){
		
		ClockDisplay clock = new ClockDisplay(21,57);
		System.out.println(clock.getTime());
		clock.tick();
		System.out.println(clock.getTime());
		clock.tick();
		System.out.println(clock.getTime());
		clock.tick();
		System.out.println(clock.getTime());
	}
}
