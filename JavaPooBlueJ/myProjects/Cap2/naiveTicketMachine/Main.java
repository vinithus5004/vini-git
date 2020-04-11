public class Main{
	
	public static void main(String args[]){
		
		TicketMachine maquina1 = new TicketMachine(560);
		TicketMachine maquina2 = new TicketMachine(650);
		
		System.out.println(maquina1.getPreco());
		System.out.println(maquina1.getSaldo());
		maquina1.inserirDinheiro(560);
		System.out.println(maquina1.getSaldo());
		maquina1.imprimirBilhete();
		System.out.println(maquina1.getSaldo());
		
		maquina2.inserirDinheiro(450);
		maquina2.imprimirBilhete();
		System.out.println(maquina1.getSaldo());
	}
}
