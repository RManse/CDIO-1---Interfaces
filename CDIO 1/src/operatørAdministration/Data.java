package operatørAdministration;

import java.util.*;

public class Data
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


}






