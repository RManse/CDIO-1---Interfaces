package operatørAdministration;
import java.util.*;

import bmi.Data;
import bmi.IData;
import exception.DALException;
import operatørAdministration.Data.OperatoerDTO;



public class OperatoerDAO implements IOperatoerDAO {

	public IData d = new Data();
	
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOperatoer(OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub
		
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
