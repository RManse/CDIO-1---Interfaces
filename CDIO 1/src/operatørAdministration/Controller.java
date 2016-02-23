package operatørAdministration;

import java.util.ArrayList;
import java.util.List;

import exception.DALException;

public class Controller {

	Data d = new Data();
	OperatoerDAO o = new OperatoerDAO(d);
	AutoPassword ap = new AutoPassword();
	Brugerflade b = new Brugerflade();
	
	public static void main(String args[]) throws DALException {
		new Controller();
	}
	
	public Controller() throws DALException {
		
		boolean running = true;
		while (running) {
			
			boolean loggetInd = false;
			
			if (d.getMyList().get(indexFraID(b.menu())).getPassword().equals(autoriser()))
				loggetInd = true;

				
			while (loggetInd) 
			//Menu
			
			switch (b.adminMenu()) {
				case 1:
					opretOperator();
					break;
				case 2:
					System.out.println(o.getOperatoerList());
					break;
				case 3:
					deleteOperatoer();
					break;
				case 4:
					System.out.println(getOperatoer());
					break;
				case 5:
					deleteOperatoer();
					break;
				case 6:
					updateOperatoer();
					break;
				case 7:
					loggetInd = false;
				default:
					break;
			}
			
			

		}
		
	}
	
	public int indexFraID(int oprId) throws DALException {
		//Den virker kun for sysadmin, den kan ikke finde andre en plads 0
		//try catch med ArrayIndexOutOfBounds virker ikke
		
		//Følgende linje afslører at størrelsen på listen ikke øges
		System.out.println("Størrelse: "+d.getMyList().size());
		//Selv når en ekstra tilføjes operatør, er "size" stadig = 1
		
		for (int i=0; i<d.getMyList().size(); i++) 
			if (d.getMyList().get(i).getOprID() == oprId) {
				System.out.println("Indexet er: "+i); //Blot en test
				return i;
			}
		//Følgende skal helst fjernes, eller aldrig forekomme:
		System.out.println("Bruger ikke fundet, venligst log ind som sysadmin, eller tryk enter for at prøve igen");
		return 0;
	}
	
	public String autoriser() throws DALException {
		return b.password();
	}
	
	public void updateOperatoer() throws DALException {
		int oprID = b.oprID();
		String oprNavn = b.oprNavn();
		String ini = b.ini();
		String cpr = b.cpr();
		String password = ap.newPassword();
		int adminStatus = b.adminStatus();
		OperatoerDTO opr = new OperatoerDTO(oprID, oprNavn, ini, cpr, password, adminStatus);	
		o.updateOperatoer(opr);
	}
	
	public OperatoerDTO getOperatoer() throws DALException {
		int oprID = b.oprID();
		return o.getOperatoer(oprID);
	}
	
	public void deleteOperatoer() throws DALException {
		OperatoerDTO opr = getOperatoer();
		o.deleteOperatoer(opr);
	}
	
	public void opretOperator() throws DALException {
		int oprID = b.oprID();
		String oprNavn = b.oprNavn();
		String ini = b.ini();
		String cpr = b.cpr();
		String password = ap.newPassword();
		int adminStatus = b.adminStatus();
		OperatoerDTO opr = new OperatoerDTO(oprID, oprNavn, ini, cpr, password, adminStatus);		
		o.createOperatoer(opr);
	}
	
	public void printOperator() throws DALException {
		
	}
	
	
	
	
}
