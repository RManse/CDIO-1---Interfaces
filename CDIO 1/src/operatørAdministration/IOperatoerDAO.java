package operatørAdministration;
import exception.DALException;

public interface IOperatoerDAO 
{
	OperatoerDTO getOperatoer(int oprId) throws DALException;
	List<OperatoerDTO> getOperatoerList() throws DALException;
	void createOperatoer(OperatoerDTO opr) throws DALException;
	void updateOperatoer(OperatoerDTO opr) throws DALException;
	void deleteOperatoer(OperatoerDTO opr) throws DALException;
}

//Hej mcfggt, virker det?

