public class Main{
	
	public static void main(String args[]){
		
		Student s1 = new Student("John Lennon","254895");
		Student s2 = new Student("Paul McCartney","02");
		Student s3 = new Student("Ringo Star","320078");
		Student s4 = new Student("George Harrison","0035698");
		Student s5 = new Student("Rui Teobaldo","356248");
		
		//(*Obs) System.out.println(s5.getLoginName());
		
		LabClass lab = new LabClass(4);
		
		lab.setInstructor("Son Goku");
		lab.setRoom("Game room number 06");
		lab.setTimeAndDate("Monday - 15:00");
		lab.enrollStudent(s3);
		lab.enrollStudent(s1);
		lab.enrollStudent(s2);
		lab.enrollStudent(s4);
		lab.enrollStudent(s5);
		lab.printList();
	}
}
