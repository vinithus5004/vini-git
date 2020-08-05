/*	A classe Bid representa um lance no leilão.
 *  Ela contém o nome da pessoa que fez o lance
 *  e também o valor ofertado. */

public class Bid{
	
	//Pessoa que fez o lance.
	private final Person bidder;
	//Valor do lance.
	private final long value;
	
	//Construtor
	public Bid(Person bidder,long value){
		
		this.bidder = bidder;
		this.value = value;
	}
	
	//Retorna a pessoa que fez o lance.
	public Person getBidder(){
		
		return bidder; 
	}
	//Retorna o valor do lance.
	public long getValue(){
		
		return value;
	}
}
