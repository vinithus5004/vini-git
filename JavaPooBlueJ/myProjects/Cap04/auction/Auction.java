import java.util.ArrayList;
import java.util.Iterator;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<Lot>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }
    /**
     * Remove o lote com o número de lote dado.
     * @param number O número do lote a ser removido.
     * @return O lote com o número dado ou null caso não
     * houver este lote.
     */
    public Lot removeLot(int number)
    {
        Lot lot = getLot(number);
        if(lot != null){
            Iterator<Lot> it = lots.iterator();
            while(it.hasNext()){
                if(it.next() == lot){
                    it.remove();
                }
            }
        }
        return lot;
    }
    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Bid for a lot.
     * A message indicating whether the bid is successful or not
     * is printed.
     * @param number The lot number being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void bidFor(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            boolean successful = selectedLot.bidFor(new Bid(bidder, value));
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        if((lotNumber >= 1) && (lotNumber < nextLotNumber)) {
            // The number seems to be reasonable.
            Iterator<Lot> it = lots.iterator();
            Lot selectedLot = null;
            while(it.hasNext()){
                Lot lot = it.next();
                if(lot.getNumber() == lotNumber){
                    selectedLot = lot;
                }
            }
            // Include a confidence check to be sure we have the
            // right lot.
            if(selectedLot.getNumber() != lotNumber) {
                System.out.println("Internal error: Lot number " +
                                   selectedLot.getNumber() +
                                   " was returned instead of " +
                                   lotNumber);
                // Don't return an invalid lot.
                selectedLot = null;
            }
            return selectedLot;
        }
        else {
            System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
            return null;
        }
    }
    
    /**
     * Encerra o Leilão, imprimindo os lotes bem-sucedidos,o nome do arrematador
     * com o valor do lance do mesmo e também os lotes não sucedidos. Qualquer
     * lote que contenha pelo menos 1 lance, será considerado como bem-sucedido.
     */
    public void close()
    {
        for(Lot lot : lots){
            Bid detail = lot.getHighestBid();
            System.out.println("Lote"+lot.getNumber()+" : "+lot.getDescription());
            if(lot.getHighestBid() != null){
                System.out.println("    Lote bem-sucedido.");
                System.out.println("    Arrematador: "
                                            + detail.getBidder().getName());
                System.out.println("    Lance vencedor :"+ detail.getValue());
            }
            else{
                System.out.println("    Lote não vendido");
            }
        }
    }
    /**
     * Retorna uma lista de lotes não vendidos.
     */
    public ArrayList<Lot> getUnsold()
    {
        ArrayList<Lot> unsold = new ArrayList<Lot>();
        for(Lot lot : lots){
            if(lot.getHighestBid() == null){
                unsold.add(lot);
            }
        }
        return unsold;
    }
}
