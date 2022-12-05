package org.perscholas.exercise;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {

		KidUsers kids1 = new KidUsers();
		KidUsers kids2 = new KidUsers();

		kids1.setAge(10);
		kids1.setBookType("kids");

		kids2.setAge(18);
		kids2.setBookType("Fiction");

		kids1.registerAccount();
		kids1.requestBook();
		
		
		kids2.registerAccount();	
		kids2.requestBook();
		
		
		
		AdultUser adult1 = new AdultUser();
		AdultUser adult2 = new AdultUser();

		adult1.setAge(5);
		adult1.setBookType("Kids");
		
		adult2.setAge(23);
		adult2.setBookType("Fiction");
//
		adult1.registerAccount();
		adult1.requestBook();
		
		adult2.registerAccount();	
		adult2.requestBook();

	}

}
