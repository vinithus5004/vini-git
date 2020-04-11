public class TicketMachine{
	
	//valor do ticket desta máquina.
	private int preco;
	//saldo desta máquina.
	private int saldo;
	//total contido nesta máquina.
	private int total;
	
	//Construtor da classse TicketMachine.
	public TicketMachine(int preco){
		
		this.preco = preco;
		saldo = 0;
		total = 0;
	}
	//Construtor da classse TicketMachine.
	public TicketMachine(){
		
		preco = 1000;
		saldo = 0;
		total = 0;
	}
	//modifica o preço do ticket desta máquina.
	public void setPreco(int preco){
		this.preco = preco;
	}
	//acessa o preço do ticket desta máquina.
	public int getPreco(){
		return preco;
	}
	//acessa o saldo desta máquina.
	public int getSaldo(){
		return saldo;
	}
	//acessa a quantia total desta máquina.
	public int getTotal(){
		return total;
	}
	//Recebe uma quantia de dinheiro do cliente.
	public void inserirDinheiro(int dinheiro){
		if(dinheiro>=0){
			saldo += dinheiro;
		}
		else{
			System.out.println("Valor Incorreto!!");
		}
	}
	//imprime o ticket.
	public void imprimirTicket(){
		if(saldo >= preco){
			System.out.println("#############################");
			System.out.println("Ticket Impresso com sucesso!!");
			System.out.println("Valor : "+preco+" cents.");
			System.out.println("#############################");
			System.out.println();
			total += preco;
			saldo -= preco;
		}
		else{
			System.out.println("Saldo insuficiente!!");
			System.out.println("Incremente "+(preco-saldo)+" cents a mais para imprimir o ticket.");
		}
	}
	//aplica o reembolso para o cliente que deseja retirar dinheiro do seu saldo.
	public int reembolso(){
		int reembolso = saldo;
		saldo = 0;
		return reembolso;
	}	
	
}
