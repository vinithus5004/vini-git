import java.util.ArrayList;
/*	Um modelo simples de um leilão. Esta classe mantém
 *  uma lista de lotes de tamanho atbitrário.
 * */
public class Auction{
	
	//Lista de lotes deste leilão;
	private ArrayList<Lot> lots;
	//Número que será dado ao próximo lote.
	private int nextLotNumber;

	//Cria um novo leilão.
	public Auction(){
		
		lots = new ArrayList<Lot>();
		nextLotNumber = 1;
	}
	//Insere um novo lote para leilão.
	public void enterLot(String description){
		
		lots.add(new Lot(nextLotNumber,description));
		nextLotNumber++;
	}
	//Mostra uma lista completa dos lotes deste leilão.
	public void showLots(){
		
		for(Lot lot : lots){
			System.out.println(lot.toString());
		}
	}
	/*	Lance para um lote. Uma mensagem indicando se o lance foi
	 *  bem-sucedido ou não, é impressa.
	 * */
	public void bidFor(int lotNumber,Person bidder, long value){
		
		Lot selectedLot = getLot(lotNumber);
		if(selectedLot != null){
			
			boolean successful = selectedLot.bidFor(new Bid(bidder,value));
			if(successful){
				
				System.out.println("The bid for lot number "+lotNumber+" was successful");
			}
			else{
				
				Bid highestBid = selectedLot.getHighestBid();
				System.out.println("Lot number "+lotNumber+" already has a bid of: "
				+ highestBid.getValue());
			}
		}
	}
	// Retorna o lote com o dado número. Retorna null se o lote não existir.
	public Lot getLot(int lotNumber){
		
		if((lotNumber>=1) && (lotNumber < nextLotNumber)){
			
			Lot selectedLot = lots.get(lotNumber - 1);
			//inclua uma verificação de segurança para ter certeza de que temos o lote certo.
			if(selectedLot.getNumber() != lotNumber){
				
				System.out.println("Internal error: Lot number " +
                                   selectedLot.getNumber() +
                                   " was returned instead of " +
                                   lotNumber);
				//Não retorna um lote inválido.
                selectedLot = null;
			}
			return selectedLot;
		}
		else{
			System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
			return null;
		}
		
	}
	//Fecha os lotes do leilão. Aqueles que houverem pelo menos 
	//um lance serão considerados como vendidos.
	public void close(){
		
		for(Lot lot : lots){
			
			if(lot.getHighestBid() == null){
				
				System.out.println(lot.getNumber()+": Unsold lot.");
			}
			else{
				
				System.out.println(lot.getNumber()+": Lot sold successfully.");
				System.out.println("Bidder: ");
				System.out.println("Bid amount: ");
			}
		}
	}
	//Retorna uma lista dos lostes não vendidos.
	public ArrayList<Lot> getUnsold(){
		
		ArrayList<Lot> unsold = new ArrayList<Lot>();
		for(Lot lot : lots){
			
			if(lot.getHighestBid() == null){
				
				unsold.add(lot);
			}
		}
		return unsold;
	}
	
	/*	Remove o lote com o número de lote dado.
	 *  @param number O número do lote a ser removido.
	 *  @return O lote com número dado ou null se não houver esse lot.
	 * */
	public Lot removeLot(int number){
		
		if(lots.size()>0){
			
			Lot lot = lots.get(number - 1);
			lots.remove(number - 1);
			
			return lot;
		}
		else{
			return null;
		}	
	}
	
}












