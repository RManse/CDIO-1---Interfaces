package operatørAdministration;
import java.util.*;

import exception.DALException;
import operatørAdministration.Data.OperatoerDTO;



public class OperatoerDAO implements IOperatoerDAO {

	public IData d = new Data();
	
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		
		return null;
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		
		return null;
	}

	@Override
	public void createOperatoer(OperatoerDTO opr) throws DALException {
		
		
	}

	@Override
	public void updateOperatoer(OperatoerDTO opr) throws DALException {
		
		
	}

	@Override
	public void deleteOperatoer(OperatoerDTO opr) throws DALException {
		
		
	}
	
}
