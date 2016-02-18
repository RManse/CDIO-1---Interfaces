package operatørAdministration;
import java.util.*;
import exception.DALException;

public interface IOperatoerDAO 
{
	Data.OperatoerDTO getOperatoer(int oprId) throws DALException;
	List<Data.OperatoerDTO> getOperatoerList() throws DALException;
	void createOperatoer(String oprNavn, String ini, String cpr, String password) throws DALException;
	void updateOperatoer(String changePassword) throws DALException;
	void deleteOperatoer(int oprID) throws DALException;
}


