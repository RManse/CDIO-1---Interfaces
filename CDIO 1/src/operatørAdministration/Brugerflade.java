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
					+ "\n6. Print bestemt bruger"
					+ "\n7. Log ud");
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
			System.out.println("\nIndtast ID: ");
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
			System.out.println("\nOpret ny bruger\n----------\nIndtast ID: ");
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
		System.out.println("\nIndtast navn: ");
		return skanner.nextLine();
	}
	
	public String ini() {
		System.out.println("\nIndtast Initialer: ");
		return skanner.nextLine();
	}
	
	public String cpr() {
		System.out.println("\nIndtast CPR-nummer:\nFødselsdato og løbenummer skal være adskilt af bindestreg\nEksempel: 123456-7890");
		String a = skanner.nextLine();
		if (a.length() == 11 && a.indexOf("-") == 6)
			return a;
		else {
			System.out.println("Indtastet CPR-nummer har en forkert længde, prøv igen.");
			return cpr();
		}
	}
	
	public String password() {
		System.out.println("\nIndtast password: ");
		return skanner.nextLine();
	}

	public String nuvaerendePassword() {
		System.out.println("\nIndtast dit nuværende password: ");
		return skanner.nextLine();
	}
	
	public String nytPassword() {
		System.out.println("\nIndtast nyt password: ");
		return skanner.nextLine();
	}
	
	public String skiftPassword(int oprID) {
		String oldPass = nuvaerendePassword();
		for (int i=0; i<d.getMyList().size(); i++) 
			if (d.getMyList().get(i).getOprID() == oprID) {
				if (oldPass.equals(d.getMyList().get(i).getPassword())) {
					String newPassword = nytPassword();
					if (newPassword.equals(nytPassword()))
						return newPassword;
				}
				else {
					System.out.println("Indtastning matcher ikke dit password, prøv igen.");
					return skiftPassword(oprID);
				}
			}
		System.out.println("De indtastede passwords stemmer ikke overens, prøv igen.");
		return skiftPassword(oprID);
	}
	
	
	public int adminStatus() {
		try {
			System.out.println("\nIndtast admin status: \n1. System admin\n2. Operatør");
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
			System.out.println("\nIndtast tara vægt kg");
			String s = skanner.nextLine();
			double a = Double.parseDouble(s);
				return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return tara();
	}
	
	public double brutto() {
		try {
			System.out.println("\nIndtast brutto vægt kg");
			String s = skanner.nextLine();
			double a = Double.parseDouble(s);
				return a;
		} catch (NumberFormatException e) {
			System.out.println("Fejl, kun tal understøttes, prøv igen");
		}
		return brutto();
	}
	
	
	

	
	
	
	
}
