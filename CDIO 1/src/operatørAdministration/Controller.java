package operatørAdministration;

import exception.DALException;

public class Controller {
	
	OperatoerDAO o = new OperatoerDAO();
	AutoPassword ap = new AutoPassword();
	Brugerflade b = new Brugerflade();
	
	public static void main(String args[]) throws DALException {
		new Controller();
	}
	
	public Controller() throws DALException {
		
		boolean running = true;
		while (running) {
			
			//Menu
			
			switch (b.menu()) {
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
				default:
					break;
			}
		}
		
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
