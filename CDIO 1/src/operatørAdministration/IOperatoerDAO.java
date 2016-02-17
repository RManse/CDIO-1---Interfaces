package operatørAdministration;
import java.util.*;
import exception.DALException;

public interface IOperatoerDAO 
{
	Data.OperatoerDTO getOperatoer(int oprId) throws DALException;
	List<Data.OperatoerDTO> getOperatoerList() throws DALException;
	void createOperatoer(Data.OperatoerDTO opr) throws DALException;
	void updateOperatoer(Data.OperatoerDTO opr) throws DALException;
	void deleteOperatoer(Data.OperatoerDTO opr) throws DALException;
}

//test 


