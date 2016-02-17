package operatørAdministration;
import java.util.*;
import exception.DALException;

public interface IOperatoerDAO 
{
	Data.OperatoerDTO getOperatoer(int oprId) throws DALException;
	List<Data.OperatoerDTO> getOperatoerList() throws DALException;
	void createOperatoer(String oprNavn, String ini, String cpr, String password) throws DALException;
	void updateOperatoer(Data.OperatoerDTO opr) throws DALException;
	void deleteOperatoer(Data.OperatoerDTO opr) throws DALException;
}


