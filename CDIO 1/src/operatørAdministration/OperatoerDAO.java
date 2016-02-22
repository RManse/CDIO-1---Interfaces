package operatørAdministration;
import java.util.*;
import exception.DALException;


public class OperatoerDAO implements IOperatoerDAO {
	Data d = new Data();
	
	@Override
	public operatørAdministration.OperatoerDTO getOperatoer(int oprId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<operatørAdministration.OperatoerDTO> getOperatoerList() throws DALException {
		return d.getMyList();
	}

	@Override
	public void createOperatoer(operatørAdministration.OperatoerDTO opr) throws DALException {
		d.getMyList().add(opr);
		
	}

	@Override
	public void updateOperatoer(operatørAdministration.OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOperatoer(operatørAdministration.OperatoerDTO opr) throws DALException {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
//	private IData d = new Data();
//	int i = 10;
//	
//	@Override
//	public OperatoerDTO getOperatoer(int oprId) throws DALException {
//		return d.getOperatoer(oprId);
//	}
//	
//	@Override
//	public List<OperatoerDTO> getOperatoerList() throws DALException {
//		return d.getOperatoerList();
//	}
//
//	@Override
//	public void createOperatoer(String oprNavn, String ini, String cpr) throws DALException {
//		d.createOperatoer(oprNavn, ini, cpr);
//	}
//	
//
//	@Override
//	public void updateOperatoer(String changePassword) throws DALException
//	{
//		
//	}
//	
//
//	@Override
//	public void deleteOperatoer(int oprID) throws DALException 
//	{
//		d.deleteOperatoer(oprID);
//	}

	
}
