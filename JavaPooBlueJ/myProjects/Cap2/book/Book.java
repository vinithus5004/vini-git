/* Uma classe que mantém as informações sobre um livro.
 * Isso talvez faça parte de uma aplicação maior como um
 * sistema de biblioteca, por exemplo.
 * 
 * @author Vinicius Gabriel
 * version 2020.04.02   
 * */

public class Book{

	private String author;
	private String title;
	private String refNumber;
	private int pages;
	private int borrowed;
	
	
	public Book(String bookAuthor,String bookTitle,int pages){
		
		author = bookAuthor;
		title = bookTitle;
		this.pages = pages;
		refNumber = "";
	}
	public String getAuthor(){
		return author;
	}
	public String getTitle(){
		return title;
	}
	public int getPages(){
		return pages;
	}
	public String getRefNumber(){
		return refNumber;
	}
	public int getBorrowed(){
		return borrowed;
	}
	public void setRefNumber(String refNumber){
		if(refNumber.length()<3){
			System.out.println("Erro!!");
		}
		else{
			this.refNumber = refNumber;
		}
	}
	public void borrow(){
		borrowed += 1;
	}
	public void printDetails(){
		
		System.out.println("Author: "+getAuthor());
		System.out.println("Title : "+getTitle());
		System.out.println("Pages : "+getPages());
		if(refNumber.length()>0){
			System.out.println("Ref   : "+getRefNumber());
		}
		else{
			System.out.println("Ref   : zzz");
		}
		System.out.println("Borrowed: "+getBorrowed()+" time(s)");
		System.out.println();
	}	
	
	
	
	
	
	
	
}
