package operatørAdministration;

import java.util.*;
import exception.DALException;
//import operatørAdministration.Data.OperatoerDTO;

public class Data implements IData
{
	int i = 10;
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
		
		public String toString() {
			String s = "\nBrugernavn: "+oprID+", Navn: "+oprNavn+", CPR: "+cpr+", Initialer: "+ini+", Password: "+password;
			return s;
		}
		
	}
		List<OperatoerDTO> myList;
		
		public Data() {
			myList = new ArrayList<OperatoerDTO>();
			myList.add(new OperatoerDTO(10, "sysadmin", "sysadm", "111111-1111", "Abc02324"));
		}

		@Override
		public void createOperatoer(String oprNavn, String ini, String cpr, String password) throws DALException {
			i++;
			myList.add(new OperatoerDTO(i, oprNavn, ini, cpr, password));

		}

		@Override
		public List<OperatoerDTO> getOperatoerList() throws DALException {
			return myList;
		}
		
		@Override
		public void updateOperatoer(OperatoerDTO opr) 
		{
//			password =
			
			
		}
		
		
}






