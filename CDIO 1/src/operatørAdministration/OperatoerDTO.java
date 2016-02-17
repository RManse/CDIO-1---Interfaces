package operatørAdministration;

public class OperatoerDTO {
	int    oprID;   	//Operatør ID                     
	String oprNavn;     //Operatør navn
	String ini;         //Wat        
	String cpr;         //Operatør CPR        
	String password;    //Operatør password, skal autogenereres
	
	private OperatoerDTO(int oprID, String oprNavn, String ini, String cpr, String password) {
		super();
		this.oprID = oprID;
		this.oprNavn = oprNavn;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password;
	}
	
}
	// I skal selv færdiggøre klasseerklæringen og -definitionen med setter- og getter metoder.
