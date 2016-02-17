package operatørAdministration;
import exception.DALException;

public interface IData {
	public String getNavn(String cpr) throws DALException;
}
