import java.io.IOException;
import java.util.Scanner;

public class MaquinaA{
	
	/* Uma máquina que vende tickets já pré-definidos, onde o único trabalho
	 * do cliente é apenas escolher o ticket desejado a partir do menu mostrado
	 * no display da máquina de tickets.
	 * */
	
	//método para limpar o console.
	static void clear()throws IOException, InterruptedException{
		
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}
	//método para dar continuidade no display da máquina.
	static void enter()throws IOException, InterruptedException{

		System.out.println("Pressione enter para continuar.");
		Scanner t = new Scanner(System.in);
		String c = t.nextLine();
		clear();
	}
	//Opções da máquina disponíveis apenas para administradores.
	static void recursoAdmin(){}
	
	//Opcões da máquina disponíveis aos clientes.
	static void opcaoMaquina(int preco,TicketMachine maq)throws IOException, InterruptedException{
		
		int i;
		Scanner t = new Scanner(System.in);
		maq.setPreco(preco);
		System.out.println("Voce escolheu a opcao Tickets de "+preco+" cents.");
		System.out.printf("Escolha uma das opcoes abaixo:\n\n\n");
		do{
			System.out.println("(1)Inserir dinheiro");
			System.out.println("(2)Acessar saldo");
			System.out.println("(3)Imprimir ticket");
			System.out.println("(4)Reembolso");
			System.out.println("(0)Sair");
			System.out.printf("\n\nEscolha uma das opcoes acima: ");
			i = t.nextInt();
			clear();
			switch(i){
				
				case 1: 
					System.out.print("Insira uma quantia de dinheiro: ");
					int dinheiro = t.nextInt();
					maq.inserirDinheiro(dinheiro);
					clear();
					break;
				case 2: 
					System.out.println("Saldo disponivel: "+maq.getSaldo()+" cents.");
					enter();
					break;
				case 3:
					maq.imprimirTicket();
					enter();
					break;
				case 4:					
					System.out.println("Seu reembolso foi de "+maq.reembolso()+" cents.");
					enter();
					break;
				case 0 : 
					break;
				default: System.out.println("Opcao invalida!!");
				enter();
				
			}
		}while(i != 0);
		
	}
	
	public static void main(String[] args)throws IOException, InterruptedException{
		
		TicketMachine maquinaA = new TicketMachine();
		Scanner teclado = new Scanner(System.in);
		int num;
		do{
			//Menu inicial que aparece no display da máquina.
			System.out.println("             ============================");
			System.out.println("                  Maquina de Tickets");
			System.out.println("             ============================");
			System.out.printf("\n\nEscolha uma da opcoes no menu abaixo:\n\n"); 
	
			System.out.println("        Ticket de 450 cents.(pressione 1)");
			System.out.println("        Ticket de 560 cents.(pressione 2)");
			System.out.println("        Ticket de 600 cents.(pressione 3)");
			System.out.println("        Ticket de 780 cents.(pressione 4)");
			System.out.println("        Ticket de 900 cents.(pressione 5)");
			System.out.printf("\n[Sair].(pressione 0)");
			System.out.printf("\n[Recurso de Administrador].(pressione 99)\n\n");
			System.out.print("Pressione uma das teclas correspondentes: ");
			num = teclado.nextInt();
			clear();
			switch(num){
			
			case 1: 
				opcaoMaquina(450,maquinaA);
				break;
			case 2: 
				opcaoMaquina(560,maquinaA);
				break;
			case 3: 
				opcaoMaquina(600,maquinaA);
				break;
			case 4: 
				opcaoMaquina(780,maquinaA);
				break;
			case 5: 
				opcaoMaquina(900,maquinaA);
				break;
			case 99: 
				recursoAdmin();
				break;
			case 0: 
				System.out.println("O display foi fechado");
				break;
			default: 
				System.out.println("Opcao invalida!!");
				enter();
			}
		}while(num != 0);
		
	}
}
