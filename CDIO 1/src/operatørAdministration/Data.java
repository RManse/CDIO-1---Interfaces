package operatørAdministration;

import java.util.ArrayList;
import java.util.List;

import exception.DALException;

public class Data implements IData
{
	
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
		List<OperatoerDTO> myList;
		
		public Data() {
		myList = new ArrayList<OperatoerDTO>();
		        // Tilføj personer
			myList.add(new OperatoerDTO(12, "hej", "hej", "hej", "hej"));

		}
	


@Override
public String getNavn(String cpr) throws DALException {
	// TODO Auto-generated method stub
	return null;
}
}