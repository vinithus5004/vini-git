import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

/* A classe MailServer representa um servidor de correios, o qual será
 * responsável por armazenar objetos da classe MailItem.
 * */
public class MailServer{
	
	//Variável do tipo List que armazenará objetos do tipo MailItem;
	private List<MailItem> items;
	
	/* O construtor instacia um objeto do tipo ArrayList que irá armazenar
	 * objetos do tipo MailItem. */ 
	public MailServer(){
		
		items = new ArrayList<MailItem>();
	}
	//Quantos itens de correio estão disponível para o destinatário.
	public int howManyMailItems(String Who){
		
		int cont = 0;
		Iterator<MailItem> it = items;
	}
	
}




