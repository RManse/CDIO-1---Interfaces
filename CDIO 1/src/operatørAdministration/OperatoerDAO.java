package operatørAdministration;
import java.util.*;
import exception.DALException;
import operatørAdministration.Data.OperatoerDTO;



public class OperatoerDAO implements IOperatoerDAO {
	
	private IData d = new Data();
	int i = 10;
	
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {

		return null;
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		return d.getOperatoerList();
	}

	@Override
	public void createOperatoer(String oprNavn, String ini, String cpr, String password) throws DALException {
		d.createOperatoer(oprNavn, ini, cpr, password);
	}
	

	

	@Override
	public void updateOperatoer(String changePassword) throws DALException
	{
		
	}
	

	@Override
	public void deleteOperatoer(OperatoerDTO opr) throws DALException 
	{
		
		
	}

	
}
