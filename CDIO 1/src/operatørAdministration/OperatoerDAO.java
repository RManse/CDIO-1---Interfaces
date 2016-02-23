package operatørAdministration;
import java.util.*;
import exception.DALException;


public class OperatoerDAO implements IOperatoerDAO {
	Data d;
	
	public OperatoerDAO(Data d) {
		this.d = d;
	}
	
	@Override
	public OperatoerDTO getOperatoer(int oprId) throws DALException {
		for (int i=0; i<d.getMyList().size(); i++)
			if (d.getMyList().get(i).getOprID() == oprId) {
				OperatoerDTO opr = d.getMyList().get(i);
				return opr;
			}
		return null;
	}

	@Override
	public List<OperatoerDTO> getOperatoerList() throws DALException {
		return d.getMyList();
	}

	@Override
	public void createOperatoer(OperatoerDTO opr) throws DALException {
		d.getMyList().add(opr);
	}

	@Override
	public void updateOperatoer(OperatoerDTO opr) throws DALException {
		OperatoerDTO opr1 = getOperatoer(opr.getOprID());
		deleteOperatoer(opr1);
		d.getMyList().add(opr);
	}

	@Override
	public void deleteOperatoer(OperatoerDTO opr) throws DALException {
		d.getMyList().remove(opr);
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
