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
	public int howManyMailItems(String who){
		
		int cont = 0;
		for(MailItem item : items){
			if(item.getTo().equals(who)){
				cont++;
			}
		}
		return cont;
	}
	/* Retorna o próximo item de correio para certo destinatário. Caso não haja
	   nenhum item para esse destinatário o retorno é nulo.
	*/
	public MailItem getNextMailItem(String who){
		
		Iterator<MailItem> it = items.iterator();
		while(it.hasNext()){
			MailItem item = it.next();
			if(item.getTo().equals(who)){
				it.remove();
				return item;
			}
		}
		return null;
		
	}
	//Adiciona um novo item de correio na lista de mensagens.
	public void post(MailItem item){
		
		items.add(item);
	}
	
}

