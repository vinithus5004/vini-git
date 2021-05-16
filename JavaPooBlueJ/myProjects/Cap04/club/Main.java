public class Main{
	
	public static void main(String args[]){
		
		Membership m1 = new Membership("membro1",2,2014);
		Membership m2 = new Membership("membro2",3,2014);
		Membership m3 = new Membership("membro3",3,2014);
		Membership m4 = new Membership("membro4",3,2014);
		Membership m5 = new Membership("membro5",5,2015);
		Membership m6 = new Membership("membro6",5,2015);
		Membership m7 = new Membership("membro7",12,2016);
		Membership m8 = new Membership("membro8",12,2016);
		Membership m9 = new Membership("membro9",12,2017);
		Membership m10 = new Membership("membro10",12,2017);
		Membership m11 = new Membership("membro11",12,2019);
		
		Club clube = new Club();
		
		clube.join(m1);
		clube.join(m2);
		clube.join(m3);
		clube.join(m4);
		clube.join(m5);
		clube.join(m6);
		clube.join(m7);
		clube.join(m8);
		clube.join(m9);
		clube.join(m10);
		clube.join(m11);
		
		System.out.println(clube.numberOfMembers());
		System.out.println(clube.joinedInMonth(28));
		System.out.println(clube.purge(12,2017));
		System.out.println(clube.numberOfMembers());
		
	}
}
