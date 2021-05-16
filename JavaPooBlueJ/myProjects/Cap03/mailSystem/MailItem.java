/* A classe MailItem repersenta um item de correio,
 * no caso uma carta. Como padrão teremos, nesse item
 * de correio, um remetente, um destinatário e uma mensagem
 * de texto.
 * */

public class MailItem{
	
	//Este campo irá guardar o nome do remetente.
	private String from;
	//Este campo irá guardar o nome do detinatário.
	private String to;
	//Este campo irá guardar a mensagem de texto.
	private String message;
	
	//Construtor da classe MailItem.
	public MailItem(String from, String to, String message){
		
		this.from = from;
		this.to = to;
		this.message = message;
	}
	
	//Métodos
	public String getTo(){
		
		return to;
	}
	public void print(){
		
		System.out.println("From: "+ from);
		System.out.println("To: "+ to);
		System.out.println("Message:"+ message);
	}	
}

