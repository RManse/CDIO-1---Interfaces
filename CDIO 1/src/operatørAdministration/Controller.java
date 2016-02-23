package operatørAdministration;

import exception.DALException;

public class Controller {

	Data d = new Data();
	OperatoerDAO o = new OperatoerDAO(d);
	AutoPassword ap = new AutoPassword();
	Brugerflade b = new Brugerflade(d);
	
	public static void main(String args[]) throws DALException {
		new Controller();
	}
	
	public Controller() throws DALException {
		
		boolean running = true;
		while (running) {
			
			boolean loggetInd = false;
			int indexet = indexFraID(b.menu());
			if (d.getMyList().get(indexet).getPassword().equals(autoriser()))
				loggetInd = true;

//			int menu = 0;	
			while (loggetInd) 
			//Menu
			
//				if (d.getMyList().get(indexet).adminStatus == 1)
//					menu = b.adminMenu();
//				else if (d.getMyList().get(indexet).adminStatus == 2)
//					menu = b.operatorMenu();
				
				
			switch (b.adminMenu(indexet)) {
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
					printOperator();
					break;
				case 5:
					deleteOperatoer();
					break;
				case 6:
					updateOperatoer();
					break;
				case 7:
					loggetInd = false;
					break;
				case 8:
					afvejning();
					break;
				default:
					break;
			}
			
			

		}
		
	}
	
	public int indexFraID(int oprId) throws DALException {
		for (int i=0; i<d.getMyList().size(); i++) 
			if (d.getMyList().get(i).getOprID() == oprId) {
				return i;
			}
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
		String password = b.password();
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
		System.out.println(getOperatoer());
	}
	
	public void afvejning() throws DALException {
		System.out.println("");
		if (d.getMyList().get(indexFraID(b.oprID())).getPassword().equals(autoriser())) {
			double tara = b.tara();
			double brutto = b.brutto();
			double netto = brutto-tara;
			System.out.println("Nettovægten er: "+netto);
		}
	}
	
	
	//afvejning skal tilføjes:
	//Når der afvejes skal password passende til connected operatør skrives først
	//Da skal programmet bede om "tara vægt i kg", herefter "brutto i kg", og den udskriver så:
	//brutto=netto+tara, altså skal vi udskrive netto=brutto-tara
	
	
}
