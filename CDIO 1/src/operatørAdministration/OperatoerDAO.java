package operatørAdministration;
import java.util.*;
import exception.DALException;
import operatørAdministration.Data.OperatoerDTO;



public class OperatoerDAO implements IOperatoerDAO {
	
	private IData d = new Data();
	int i = 10;
	
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		return d.getOperatoer(oprId);
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		return d.getOperatoerList();
	}

	@Override
	public void createOperatoer(String oprNavn, String ini, String cpr) throws DALException {
		d.createOperatoer(oprNavn, ini, cpr);
	}
	

	@Override
	public void updateOperatoer(String changePassword) throws DALException
	{
		
	}
	

	@Override
	public void deleteOperatoer(int oprID) throws DALException 
	{
		d.deleteOperatoer(oprID);
	}

	
}
