package operatørAdministration;

import java.util.*;

public class Data //implements IData
{
		private List<OperatoerDTO> myList;
		
		public Data() {
			myList = new ArrayList<OperatoerDTO>();
			myList.add(new OperatoerDTO(10, "sysadmin", "sysadm", "111111-1111", "Abc02324", 1));
		}

		public List<OperatoerDTO> getMyList() {
			return myList;
		}

		public void setMyList(List<OperatoerDTO> myList) {
			this.myList = myList;
		}


//		@Override
//		public void createOperatoer(String oprNavn, String ini, String cpr) throws DALException {
//			brugerI++;
//			myList.add(new OperatoerDTO(brugerI, oprNavn, ini, cpr, AutoPassword.newPassword(), 2));
////			System.out.println(myList.size());
//		}
//
//		@Override
//		public List<OperatoerDTO> getOperatoerList() throws DALException {
//			return myList;
//		}
//		
//		@Override
//		public void updateOperatoer(String changePassword) {
//			
//		}
//
//		@Override
//		public void deleteOperatoer(int oprID) throws DALException {
//			try {
//			int found = -1;
//			for(int i=0; i<myList.size(); i++){
//				if (myList.get(i).oprID == oprID){
//					found = i;
//				}
//			}
//			myList.remove(found);
//			} catch (IndexOutOfBoundsException e) {
//				throw new DALException();
//			}
//			
//		}
//
//		@Override
//		public OperatoerDTO getOperatoer(int oprId) throws DALException {
//			try {
//			for (int i=0; i<myList.size(); i++)
//				if (myList.get(i).oprID == oprId)
//					return myList.get(i);
//			return null;
//			} catch (IndexOutOfBoundsException e) {
//				throw new DALException();
//		 	}
//		}
//		
//		@Override
//		public String getPassword(int oprID) {// throws DALException{
////			try {
//				for (int i=0; i<myList.size(); i++) {
//					if (myList.get(i).oprID == oprID)
//						return myList.get(i).password;
//				}
//				return null;
////				} catch (IndexOutOfBoundsException e) {
////					throw new DALException();
////			 	}
//		}
//		
//		@Override
//		public boolean oprIDexist(int oprID) { //throws DALException {
////			try {
//				for (int i=0; i<myList.size(); i++)
//					if (myList.get(i).oprID == oprID)
//						return true;
//				return false;
////				} catch (IndexOutOfBoundsException e) {
////					throw new DALException();
////			 	}
//		}
//
//		@Override
//		public void createOperatoer(OperatoerDTO opr) throws DALException {
//			brugerI++;
//			myList.add(new OperatoerDTO(brugerI, opr.getNavn, ini, cpr, AutoPassword.newPassword(), 2));
//			
//		}
//		
//		
//		
		
}






