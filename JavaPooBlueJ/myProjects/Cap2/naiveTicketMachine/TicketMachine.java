public class TicketMachine{
	
	//Preço do bilhete desta máquina.
	private int preco;
	//Valor inserido nesta máquina pelo cliente.
	private int saldo;
	//Montante das vendas da desta máquina.
	private int total;
	
	/* Construtor responsável pela inicialização dos valores
	 * nos campos da classe. */
	public TicketMachine(int custoDoBilhete){
		
		this.preco = custoDoBilhete;
		this.saldo = 0;
		this.total = 0;
	}
	//Retorna o valor do bilhete desta máquina.
	public int getPreco(){	
		
		return this.preco;
	}
	//Retorna o valor do saldo destea máquina.
	public int getSaldo(){
		
		return this.saldo;
	}
	//Armazena na máquina o dinheiro recebido do cliente pelo bilhete.
	public void inserirDinheiro(int dinheiro){
	
		this.saldo += dinheiro;
	}
	//Imprime o bilhete que o cliente comprou.
	public void imprimirBilhete(){
		
		System.out.println("##############################################");
		System.out.println("     Bilhete vendido com sucesso!!");
		System.out.println("   Preco do bilhete: "+this.preco+" centavos.");
		System.out.println("##############################################");
		this.total += this.saldo;
		this.saldo = 0;
	}
}
