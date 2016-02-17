package operatørAdministration;
import java.util.*;
import exception.DALException;
import operatørAdministration.Data.OperatoerDTO;



public class OperatoerDAO implements IOperatoerDAO {
	
	private IData d = new Data();
	
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {

		return null;
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOperatoer(String oprNavn, String ini, String cpr, String password) throws DALException {
		d.createOperatoer(oprNavn, ini, cpr, password);
		
	}

	@Override
	public void updateOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub
		
	}

	
}
