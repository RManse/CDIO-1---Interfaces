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
			int indexet = indexFraID(b.logIndMenu());
			int status = d.getMyList().get(indexet).adminStatus;
			if (d.getMyList().get(indexet).getPassword().equals(autoriser()))
				loggetInd = true;

//			int menu = 0;	
			while (loggetInd) 
			//Menu
			
//				if (status == 1)
//					menu = 1;
//				else if (status == 2)
//					menu = 2;
			
			switch (b.adminMenu(indexet)) {
				case 1:
					if (status == 1 || status == 2)
						afvejning();
					else
						ingenAdgang();
					break;
				case 2:
					if (status == 1)
						opretOperator();		
					else
						ingenAdgang();
					break;
				case 3:
					if (status == 1)
						updateOperatoer();
					else
						ingenAdgang();
					break;
				case 4:
					if (status == 1)
						deleteOperatoer();
					else
						ingenAdgang();
					break;
				case 5:
					if (status == 1)
						printAlle();
					else
						ingenAdgang();
					break;
				case 6:
					loggetInd = false;
					indexet = 0;
					break;
				default:
					break;
			}

//				switch (b.adminMenu(indexet)) {
//				case 1:
//					afvejning();
//					break;
//				case 2:
//					loggetInd = false;
//					indexet = 0;
//					break;
//				default:
//					break;
//			}
	
						
		
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
		int oprID = b.nytOprID();
		String oprNavn = b.oprNavn();
		String ini = b.ini();
		String cpr = b.cpr();
		String password = ap.newPassword();
		int adminStatus = b.adminStatus();
		OperatoerDTO opr = new OperatoerDTO(oprID, oprNavn, ini, cpr, password, adminStatus);		
		o.createOperatoer(opr);
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
	
	public void printAlle() throws DALException {
		System.out.println(o.getOperatoerList());
	}
	
	public void ingenAdgang() throws DALException {
		System.out.println("\nDenne bruger har ikke adgang til denne del af programmet");
	}
	

	
	
}
