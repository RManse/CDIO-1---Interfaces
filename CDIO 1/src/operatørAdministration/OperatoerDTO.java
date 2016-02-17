package operatørAdministration;

import java.util.ArrayList;
import java.util.List;

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
	
	List<OperatoerDTO> myList = new ArrayList<OperatoerDTO>();
	
	
	
	
}
	// I skal selv færdiggøre klasseerklæringen og -definitionen med setter- og getter metoder.
