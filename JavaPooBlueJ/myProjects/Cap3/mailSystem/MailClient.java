/* Uma classe para modelar um simples email Client. O Client
 * é executado por um usuário particular, e envia e recebe
 * correios através de um servidor particular.
 * */
public class MailClient{
	
	// O servidor utilizado para mandar e receber mensagens de correio.
	private MailServer server;
	// O usuário que estará executando o Client.
	private String user;
	
	//Método contrutor da classe MailClient.
	public MailClient(MailServer server, String user){
		
		this.server = server;
		this.user = user;
	}
	// Retorna o próximo item de correio, se houver, para este usuário.
	public MailItem getNextMailItem(){
		return server.getNextMailItem(user);
	}
	// Imprime o próximo item de correio que houver para este usuário.
	public void printNextMailItem(){
		
		MailItem item = server.getNextMailItem(user);
		if(item == null){
			System.out.println("No new mail");
		}
		else{
			item.print();
		}
	}
	/* Envia uma dada mensagem para um dado destinatário através
	 * da mensagem em anexo do servidor de correio.
	*/
	public void sendMailItem(String to, String message){
		
		MailItem item = new MailItem(user,to,message);
		server.post(item);
	}


}
