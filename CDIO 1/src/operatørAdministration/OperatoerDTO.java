package operatørAdministration;

public class OperatoerDTO {
	int    oprID;   	//Operatør ID                     
	String oprNavn;     //Operatør navn
	String ini;         //initialer
	String cpr;         //Operatør CPR        
	String password;    //Operatør password, skal autogenereres
	int	   adminStatus; //1=system admin, 2=operatør
	

	public OperatoerDTO(int oprID, String oprNavn, String ini, String cpr, String password, int adminStatus) {
		super();
		this.oprID = oprID;
		this.oprNavn = oprNavn;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password;
		this.adminStatus = adminStatus;
	}
	
	public String toString() {
		String s = "Brugernavn: "+oprID+", Navn: "+oprNavn+", CPR: "+cpr+", Initialer: "+ini+", Password: "+password+", admin status: "+adminStatus+"   \n";
		return s;
	}

	public int getOprID() {
		return oprID;
	}

	public void setOprID(int oprID) {
		this.oprID = oprID;
	}

	public String getOprNavn() {
		return oprNavn;
	}

	public void setOprNavn(String oprNavn) {
		this.oprNavn = oprNavn;
	}

	public String getIni() {
		return ini;
	}

	public void setIni(String ini) {
		this.ini = ini;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdminStatus() {
		return adminStatus;
	}

	public void setAdminStatus(int adminStatus) {
		this.adminStatus = adminStatus;
	}
}