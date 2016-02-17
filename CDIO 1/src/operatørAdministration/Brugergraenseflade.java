package operatørAdministration;


public class Brugergraenseflade 
{
	private IOperatoerDAO o = new OperatoerDAO();
	
	public static void main(String[] args) 
	{
		new Brugergraenseflade();
	}
	public Brugergraenseflade()
	{
		boolean running = true;
		while(running)
		{
			System.out.println("Hej, velkommen. Er du admin eller bruger? \n1. Admin\n2. Bruger\nSkriv 'Exit' hvis de ønsker at logge ud.");
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
				
				
			case "3":
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
