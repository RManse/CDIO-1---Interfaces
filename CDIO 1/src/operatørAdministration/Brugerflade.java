package operatørAdministration;

import exception.DALException;

public class Brugerflade {

	java.util.Scanner skanner = new java.util.Scanner(System.in);
	
	Data d;
	
	public Brugerflade(Data d) {
		this.d = d;
	}
	

	
	public int logIndMenu() throws DALException {
		try {
			System.out.println("Velkommen, indtast dit ID for at logge ind");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
			return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return logIndMenu();
	}
	
	public int adminMenu(int oprIndex) {
		try {
			System.out.println("\nVelkommen "+d.getMyList().get(oprIndex).getOprNavn()
					+ "\n1. Afvejning"
					+ "\n2. Opret bruger"
					+ "\n3. Opdater bruger"
					+ "\n4. Slet bruger"
					+ "\n5. Print brugerliste"
					+ "\n6. Log ud");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
			return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return adminMenu(oprIndex);
	}
	
	public int operatorMenu(int oprIndex) {
		System.out.println("\nVelkommen "+d.getMyList().get(oprIndex).getOprNavn()
				+ "\n1. Afvejning"
				+ "\n2. Log ud");
		String s = skanner.nextLine();
		int a = Integer.parseInt(s);
		return a;
	}
	
	public int oprID() throws DALException {
		try { 
			System.out.println("Indtast ID: ");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
			for (int i=0; i<d.getMyList().size(); i++) 
				if (d.getMyList().get(i).getOprID() == a || a < 10 || a > 99){
					return a;
				}
			System.out.println("Bruger ikke fundet, prøv igen");
			return oprID();
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return oprID();
	}
	
	public int nytOprID() throws DALException {
		try { 
			System.out.println("Opret ny bruger\n----------\nIndtast ID: ");
			String s = skanner.nextLine();
			int a = Integer.parseInt(s);
			for (int i=0; i<d.getMyList().size(); i++) 
				if (d.getMyList().get(i).getOprID() == a || a < 10 || a > 99){
					System.out.println("Operator ID er allerede i brug, eller opfylder ikke kravene, prøv igen.\nOperator ID skal have et nummer mellem 11 og 99");
					return nytOprID();
				}
			return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return nytOprID();
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
