package operatørAdministration;

import java.util.*;
import exception.DALException;
//import operatørAdministration.Data.OperatoerDTO;

public class Data implements IData
{
	int BrugerI = 10;
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
			String s = "\nBrugernavn: "+oprID+", Navn: "+oprNavn+", CPR: "+cpr+", Initialer: "+ini+", Password: "+password+"   ";
			return s;
		}
		public String getPassword()
		{
			return this.password;
		}
		
	}
		List<OperatoerDTO> myList;
		
		public Data() {
			myList = new ArrayList<OperatoerDTO>();
			myList.add(new OperatoerDTO(10, "sysadmin", "sysadm", "111111-1111", "Abc02324"));
		}

		@Override
		public void createOperatoer(String oprNavn, String ini, String cpr) throws DALException {
			BrugerI++;
			myList.add(new OperatoerDTO(BrugerI, oprNavn, ini, cpr, AutoPassword.newPassword()));
			System.out.println(myList.size());
		}

		@Override
		public List<OperatoerDTO> getOperatoerList() throws DALException {
			return myList;
		}
		
		@Override
		public void updateOperatoer(String changePassword) 
		{
			
		}

		@Override
		public void deleteOperatoer(int oprID) {
			int found = -1;
			for(int i=0; i<myList.size(); i++){
				if (myList.get(i).oprID == oprID){
					found = i;
				}
			}
			myList.remove(found);
//			try {
//				slet = 0;
//			} catch (DALException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		}

		@Override
		public OperatoerDTO getOperatoer(int oprId) throws DALException {
			// TODO Auto-generated method stub
			return null;
		}
}






