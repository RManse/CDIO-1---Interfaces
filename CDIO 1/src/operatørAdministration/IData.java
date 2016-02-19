package operatørAdministration;
import java.util.List;

import exception.DALException;
import operatørAdministration.Data.OperatoerDTO;

public interface IData {
	OperatoerDTO getOperatoer(int oprId) throws DALException;
	void createOperatoer(String oprNavn, String ini, String cpr) throws DALException;
	List<Data.OperatoerDTO> getOperatoerList() throws DALException;
	void updateOperatoer(String changePassword);
	void deleteOperatoer(int oprID) throws DALException;
	String getPassword(int oprID) ;//throws DALException;
	boolean oprIDexist(int oprID) ;// throws DALException;
}
