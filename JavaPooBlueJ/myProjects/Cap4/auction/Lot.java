/*	A classe Lot representa o item ou conjunto de itens
 *  no leilão: um lote.
 * */
public class Lot{
	
	//Número de identificação única deste lote.
	private final int number;
	//Uma breve descrição deste lote.
	private String description;
	//O maior lance atual para este lote.
	private Bid highestBid;
	
	//Construtor.
	public Lot(int number,String description){
		
		this.number = number;
		this.description = description;
	}
	/*	Tentativa de lance para este lote. Um lance bem-sucedido
	 *  deve ter um valor maior do que o lance já existente.
	 *  Se for bem-sucedido retornará true, caso contrário irá
	 *  retornar false.
	 * */
	public boolean bidFor(Bid bid){
		 
		if((highestBid == null) || (bid.getValue()>highestBid.getValue())){
			
			highestBid = bid;
			return true;
		}
		else{
			return false;
		}	
	}
	//Retorna uma representação em Strings dos detalhes deste lote.
	public String toString(){
		
		String details = number+ ": " +description;
		if(highestBid != null){
			
			details += "	Bid: " +highestBid.getValue();
		}
		else{
			
			details += "	(No Bid)";
		}
		return details;
	}
	
	//Retorna o numero deste lote.
	public int getNumber(){
		
		return number;
	}
	//Retorna a descrição deste lote.
	public String getDescription(){
		
		return description;
	}
	/*	Retorna o maior lance para este lote. O retorno
	 *  pode ser nulo, caso não houver nenhum lance atualmente.
	 * */
	public Bid getHighestBid(){
		
		return highestBid;
	} 
	
}










