package operatørAdministration;

import exception.DALException;

public class Brugergraenseflade 
{
	private IOperatoerDAO o = new OperatoerDAO();
	private IData d = new Data();
	
	public static void main(String[] args) 
	{
		new Brugergraenseflade();
	}
	public Brugergraenseflade()
	{
		boolean running = true;
		while(running)
		{
			System.out.println("1. Log in som admin\n2. Opret bruger\n3. Print operatører ud\n4. Ændre dit password\n'Exit' for at afslutte");
			java.util.Scanner skanner = new java.util.Scanner(System.in);
			String user = skanner.nextLine();
			switch (user)
			{
			case "1":
				System.out.println("Indtast dit brugernavn:");
				String brugernavn = skanner.nextLine();
				System.out.println("Indtast dit password:");
				String password = skanner.nextLine();
			if (brugernavn.equals("10") && password.equals("Abc02324"))
			{
				System.out.println("Du er genkendt som admin.");
				
			}
			else
			{
				System.out.println("Brugernavn eller password er forkert.");
			}
			break;	
				
			case "2":
				
				System.out.println("Indtast navn");
				String oprNavn = skanner.nextLine();
				System.out.println("Indtast initialer");
				String ini = skanner.nextLine();
				System.out.println("Indtast cpr-nummer");
				String cpr = skanner.nextLine();
				System.out.println("indtast ønskede password");
				String passwordNewOpr = skanner.nextLine();
				
				try {
					o.createOperatoer(oprNavn, ini, cpr, passwordNewOpr);
				} catch (DALException e) {
					e.printStackTrace();
				}
				
				break;
				
			case "3":
				try {
					d.getOperatoerList();
				} catch (DALException e) {
					e.printStackTrace();
				}
			case "4":
				System.out.println("Velkommen Bruger. Her kan du ændre dit password \nIndtast bruger ID:");
				String brugerID = skanner.nextLine();
				System.out.println("Indtast dit gamle password:");
				String oldPassword = skanner.nextLine();
				System.out.println("Indtast dit nye password");
				String newPassword = skanner.nextLine();
				System.out.println("Indtast dit nye password igen");
				String newPassword2 = skanner.nextLine();
			if (newPassword.equals(newPassword2))
			{
				System.out.println("Tillykke, dit nye password er nu ændret til"+newPassword);
			}
			break;
				
			
			}
			
			
			if (user.equals("Exit"))
			{
				running = false;
			}
			
			
			
			
			
			
		}
	}
}
