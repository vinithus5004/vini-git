import java.util.*;

public class LabClass{
	
	/* A classe LabClass representa uma lista de inscrição para aulas
	 * de laboratório. Ela armazena o dia e horário do curso, sala, participantes,
	 * capacidade de alunos e também o nome do instrutor.
	 * */ 
	private String timeAndDay;
	private String room;
	private List<Student> students;
	private int capacity;
	private String instructor;
	 
	/* Cria uma aula de laboratório com a capacidade máxima dele.
	 * Todos os outros valores são definidos como padrão.  */
	public LabClass(int capacity){
		
		this.capacity = capacity;
		room = "uknown";
		timeAndDay = "uknown";
		instructor = "uknown";
		students = new ArrayList<Student>();
	}
	//Realiza a inscrição do estudante.
	public void enrollStudent(Student student){
			
		if(students.size()<capacity){
			students.add(student);
		}
		else{
			System.out.println("The class is full, you cannot enroll.");
		}
	}
	//Define dia e horário da aula.
	public void setTimeAndDate(String timeAndDay){
		
		this.timeAndDay = timeAndDay;
	}
	//Define o nome do instrutor.
	public void setInstructor(String instructor){
		
		this.instructor = instructor;
	}
	//Define a sala do laboratório.
	public void setRoom(String room){
		
		this.room = room;
	}
	//acessa o número de estudantes da sala.
	public int numberOfStudents(){
	
		return students.size();
	}
	//Imprime as informações da aula.
	public void printList(){
	
		System.out.println("Room: "+room);
		System.out.println("Instructor: "+instructor);
		System.out.println("Day and time: "+timeAndDay);
		System.out.println("Total Students: "+students.size()+"/"+capacity);
		System.out.println();
		System.out.println("Student list:");
		for(Student student : students){
			System.out.print("   ");
			student.print();
		}
	}
	 	
}
