package operatørAdministration;

import java.util.*;

import exception.DALException;

public class Data implements IData
{
	int brugerI = 10;
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
		
		
	}
		List<OperatoerDTO> myList;
		
		public Data() {
			myList = new ArrayList<OperatoerDTO>();
			myList.add(new OperatoerDTO(10, "sysadmin", "sysadm", "111111-1111", "Abc02324"));
		}

		@Override
		public void createOperatoer(String oprNavn, String ini, String cpr) throws DALException {
			brugerI++;
			myList.add(new OperatoerDTO(brugerI, oprNavn, ini, cpr, AutoPassword.newPassword()));
//			System.out.println(myList.size());
		}

		@Override
		public List<OperatoerDTO> getOperatoerList() throws DALException {
			return myList;
		}
		
		@Override
		public void updateOperatoer(String changePassword) {
			
		}

		@Override
		public void deleteOperatoer(int oprID) throws DALException {
			try {
			int found = -1;
			for(int i=0; i<myList.size(); i++){
				if (myList.get(i).oprID == oprID){
					found = i;
				}
			}
			myList.remove(found);
			} catch (IndexOutOfBoundsException e) {
				throw new DALException();
			}
			
		}

		@Override
		public OperatoerDTO getOperatoer(int oprId) throws DALException {
			try {
			for (int i=0; i<myList.size(); i++)
				if (myList.get(i).oprID == oprId)
					return myList.get(i);
			return null;
			} catch (IndexOutOfBoundsException e) {
				throw new DALException();
		 	}
		}
		
		@Override
		public String getPassword(int oprID) {// throws DALException{
//			try {
				for (int i=0; i<myList.size(); i++) {
					if (myList.get(i).oprID == oprID)
						return myList.get(i).password;
				}
				return null;
//				} catch (IndexOutOfBoundsException e) {
//					throw new DALException();
//			 	}
		}
		
		@Override
		public boolean oprIDexist(int oprID) { //throws DALException {
//			try {
				for (int i=0; i<myList.size(); i++)
					if (myList.get(i).oprID == oprID)
						return true;
				return false;
//				} catch (IndexOutOfBoundsException e) {
//					throw new DALException();
//			 	}
		}
		
		
		
		
}






