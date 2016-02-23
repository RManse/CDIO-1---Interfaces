package operatørAdministration;

import exception.DALException;

public class Brugerflade {

	java.util.Scanner skanner = new java.util.Scanner(System.in);
//	Data d = new Data();
//	
//	public Brugerflade(Data d) {
//		this.d = d;
//	}
	
	Data d;
	
	public Brugerflade(Data d) {
		this.d = d;
	}
	

	
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
	
	public int adminMenu(int oprIndex) {
		try {
			System.out.println("\nVelkommen "+d.getMyList().get(oprIndex).getOprNavn()
					+ "\n1. Opret operatør,"
					+ "\n2. Print listen over brugere");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
			return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return adminMenu(oprIndex);
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
			if (a == 1 || a == 2)
				return a;
			else
				return adminStatus();
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return adminStatus();
	}
	
	public double tara() {
		try {
			System.out.println("Indtast tara vægt kg");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
				return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return tara();
	}
	
	public double brutto() {
		try {
			System.out.println("Indtast brutto vægt kg");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
				return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return brutto();
	}
	
	
	

	
	
	
	
}
