public class Student{
	//A classe Student representa um estudante em um sistema administrativo estudantil.
	
	//nome do estudante.
	private String name;
	//identificação do estudante.
	private String id; 
	//crédito obtidos pelo estudante através de tarefas de classe.
	private int credits;
	
	//Construtor da classe Student.
	public Student(String name,String id){
		
		this.name = name;
		this.id = id;
		credits = 0;
	}
	//retorna o nome do estudante.
	public String getName(){
		return name;
	}
	//retorna a identificação do estudante.
	public String getId(){
		return id;
	}
	//retorna a quatidade atual de créditos do estudante.
	public int getCredits(){
		return credits;
	}
	//Altera o nome do estudante.
	public void setName(String name){
		this.name = name;
	}
	//Adiciona créditos ao estudante.
	public void addCredits(int credits){
		this.credits += credits;
	}
	//retorna o nome de login do estudante. 
	public String getLoginName(){
		if(name.length()<4 && id.length()<3){
			return name.substring(0,name.length()) + id.substring(0,id.length());
		}
		else if(name.length()<4 && id.length()>3){
			return name.substring(0,name.length()) + id.substring(0,3);
		}
		else if(name.length()>4 && id.length()<3){
			return name.substring(0,4) + id.substring(0,id.length());
		}
		else{
			return name.substring(0,4) + id.substring(0,3);
		}
		
	}
	//imprime o nome e o id do estudante.
	public void print(){
		System.out.println(name+"("+id+")");
	}
	
}
