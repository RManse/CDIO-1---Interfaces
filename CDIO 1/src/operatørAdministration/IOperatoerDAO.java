package operatørAdministration;
import java.util.*;
import exception.DALException;

public interface IOperatoerDAO 
{
	OperatoerDTO getOperatoer(int oprId) throws DALException;
	List<OperatoerDTO> getOperatoerList() throws DALException;
	
	
	void createOperatoer(OperatoerDTO opr) throws DALException;
//	void createOperatoer(String oprNavn, String ini, String cpr) throws DALException;
	
	
	void updateOperatoer(OperatoerDTO opr) throws DALException;
//	void updateOperatoer(String changePassword) throws DALException;
	
	void deleteOperatoer(OperatoerDTO opr) throws DALException;
//	void deleteOperatoer(int oprID) throws DALException;
}

