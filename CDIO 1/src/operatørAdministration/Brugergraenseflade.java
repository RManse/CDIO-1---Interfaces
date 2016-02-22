package operatørAdministration;

import exception.DALException;

public class Brugergraenseflade 
{
//	private IOperatoerDAO o = new OperatoerDAO();
//	private IData d = new Data();
//	java.util.Scanner skanner = new java.util.Scanner(System.in);
//	public static void main(String[] args) 
//	{
//		new Brugergraenseflade();
//	}
//	public Brugergraenseflade()
//	{
//		
//		
//		boolean running = true;
//		while(running)
//		{
//			System.out.println("Log ind som admin\nIndtast brugernavn: ");
//			String brugernavn = skanner.nextLine();
////			int oprIDlogind = Integer.parseInt(brugernavn);
//			
//			System.out.println("Indtast dit password:");
//			String password = skanner.nextLine();
//			
//			if (brugernavn.equals("10") && password.equals("Abc02324"))	// 
////			if (password.equals(d.getPassword(oprIDlogind)))
//			{
//				System.out.println("Du er genkendt som admin.\nDu har nu følgende muligheder:");
//				
//				boolean loggetInd = true;
//				while(loggetInd)
//				{
//					System.out.println("\n1. Opret en ny operatør\n2. Print operatører ud\n3. Slet en operatør\n4. Ændre på en operatør\n5. Foretag en afvejning\n6. Print enkel operator\n7. Log ud");
//					String user = skanner.nextLine();
//				
//				
//					switch (user) {
//					case "1":
//						System.out.println("Indtast navn");
//						String oprNavn = skanner.nextLine();
//						System.out.println("Indtast initialer");
//						String ini = skanner.nextLine();
//						System.out.println("Indtast cpr-nummer");
//						String cpr = skanner.nextLine();
//						
//						try {
//							o.createOperatoer(oprNavn, ini, cpr);
//						} catch (DALException e) {
//							e.printStackTrace();
//						}
//						break;	
//						
//					case "2":
//						try {
//							System.out.println(o.getOperatoerList().toString());
//						} catch (DALException e) {
//							e.printStackTrace();
//						}			
//						break;
//						
//					case "3":
//						System.out.println("Hvilken operatør vil du slette?");
//						try {
//							System.out.println(o.getOperatoerList().toString());
//						} catch (DALException e) {
//							e.printStackTrace();
//						}	
//						int slet = skanner.nextInt();
//						try {
//							o.deleteOperatoer(slet);
//						} catch (DALException e) {
//							e.printStackTrace();
//						}
//						System.out.println("Du har slettet bruger nr: "+slet);
//						try {
//							System.out.println(o.getOperatoerList().toString());
//						} catch (DALException e) {
//							e.printStackTrace();
//						}
//						break;
//						
//					case "4":
//						System.out.println("Velkommen Bruger. Her kan du ændre dit password \nIndtast bruger ID:");
//						String brugerID = skanner.nextLine();
//						System.out.println("Indtast dit gamle password:");
//						String oldPassword = skanner.nextLine();
//						System.out.println("Indtast dit nye password");
//						String newPassword = skanner.nextLine();
//						System.out.println("Indtast dit nye password igen");
//						String newPassword2 = skanner.nextLine();
//						if (newPassword.equals(newPassword2))
//							System.out.println("Tillykke, dit nye password er nu ændret til"+newPassword);
//						if (user.equals("Exit"))
//							running = false;
//						break;
//						
//					case "5":
//						//Password protection her:
//						System.out.println("Afvejning:\nIndtast dit password: ");
//						password = skanner.nextLine();
//						if (password.equals(" ")) { //indsæt password virker her
//							//Afvejning, virker
//							System.out.println("Indtast Tara vægt: ");
//							int tara = skanner.nextInt();
//							System.out.println("Indtast brutto vægt: ");
//							int brutto = skanner.nextInt();
//							System.out.println("Nettovægt: "+(brutto-tara));
//						}
//						else
//							System.out.println("Forkert password");
//						
//					case "6":
//						System.out.println("Skriv oprID");
//						int oprID = skanner.nextInt();
//						try {
//							System.out.println(o.getOperatoer(oprID));
//						} catch (DALException e) {
//							e.printStackTrace();
//						}
//						
//					case "7":
//						loggetInd = false;
//						System.out.println("Du er logget ud korrekt");
//						break;
//						
//						//Test case der printer passwordet tilhørende brugernavnet der skrives ind
//					case "8":
//						oprID = skanner.nextInt();
//						System.out.println(d.getPassword(oprID));
//					}
//				}
//			}
//			else
//			{
//				System.out.println("Brugernavn eller password er forkert.");
//			}
//					
//			
//			
//			
//			
//		}
//	}
}
