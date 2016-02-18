package operatørAdministration;

import exception.DALException;

public class Brugergraenseflade 
{
	private IOperatoerDAO o = new OperatoerDAO();
//	private IData d = new Data();
	java.util.Scanner skanner = new java.util.Scanner(System.in);
	public static void main(String[] args) 
	{
		new Brugergraenseflade();
	}
	public Brugergraenseflade()
	{
		
		
		boolean running = true;
		while(running)
		{
			System.out.println("Log ind som admin\nIndtast brugernavn");
			String brugernavn = skanner.nextLine();
			System.out.println("Indtast dit password:");
			String password = skanner.nextLine();
			if (brugernavn.equals("10") && password.equals("Abc02324"))
			{
				System.out.println("Du er genkendt som admin.\nDu har nu følgende muligheder:");
				while(running)
				{
				System.out.println("1. Opret en ny operatør\n2. Print operatører ud\n3. Slet en operatør\n4. Ændre på en operatør");
				String user = skanner.nextLine();
				
				
				switch (user)
				{
				case "1":
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
					
				case "2":
					try {
						System.out.println(o.getOperatoerList().toString());
					} catch (DALException e) {
						e.printStackTrace();
					}			
					
					break;
					
				case "3":
					System.out.println("Hvilken operatør vil du slette?");
					try {
						System.out.println(o.getOperatoerList().toString());
					} catch (DALException e) {
						e.printStackTrace();
					}
					int slet = skanner.nextInt();
					try {
						o.deleteOperatoer(slet);
					} catch (DALException e) {
						e.printStackTrace();
					}
					System.out.println("Du har blah"+slet);
					try {
						System.out.println(o.getOperatoerList().toString());
					} catch (DALException e) {
						e.printStackTrace();
					}
					break;
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
//					o.updateOperatoer(changePassword);
					System.out.println("Tillykke, dit nye password er nu ændret til"+newPassword);
				}
				if (user.equals("Exit"))
				{
					running = false;
				}
				break;
				
				}
				}
			}
			else
			{
				System.out.println("Brugernavn eller password er forkert.");
			}
					
			
			
			
			
		}
	}
}
