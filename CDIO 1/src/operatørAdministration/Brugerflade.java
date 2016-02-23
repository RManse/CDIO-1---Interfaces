package operatørAdministration;

import exception.DALException;

public class Brugerflade {

	java.util.Scanner skanner = new java.util.Scanner(System.in);
	Data d = new Data();
	

	
	public int menu() throws DALException {
		try {
			System.out.println("Velkommen, indtast dit ID for at logge ind");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
			return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return menu();
	}
	
	public int adminMenu() {
		try {
			System.out.println("Velkommen "+d.getMyList().get(0).getOprNavn()+","
					+ "\ntryk 1 for at oprette operatør,"
					+ "2 for at printe listen");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
			return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return adminMenu();
	}
	
	public int operatorMenu() {
		System.out.println();
		String s = skanner.nextLine();
		int a = Integer.parseInt(s);
		return a;
	}
	
	public int oprID() throws DALException {
		try { 
			System.out.println("Indtast ID: ");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
			return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return oprID();
	}
	
	public String oprNavn() {
		System.out.println("Indtast navn: ");
		return skanner.nextLine();
	}
	
	public String ini() {
		System.out.println("Indtast Initialer: ");
		return skanner.nextLine();
	}
	
	public String cpr() {
		System.out.println("Indtast CPR: ");
		return skanner.nextLine();
	}
	
	public String password() {
		System.out.println("Indtast password: ");
		return skanner.nextLine();
	}
	
	public int adminStatus() {
		try {
			System.out.println("Indtast admin status: \n1. System admin\n2. Operatør");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
			return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return adminStatus();
	}
}
