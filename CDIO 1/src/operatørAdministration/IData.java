package operatørAdministration;
import java.util.List;

import exception.DALException;
import operatørAdministration.Data.OperatoerDTO;

public interface IData {
	void createOperatoer(String oprNavn, String ini, String cpr, String password) throws DALException;
	List<Data.OperatoerDTO> getOperatoerList() throws DALException;
	void updateOperatoer(String changePassword);
	void deleteOperatoer(int oprID);
}
