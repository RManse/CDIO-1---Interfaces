package operatørAdministration;
import java.util.*;


public class AutoPassword {
	
////Til test:
//	public static void main(String args[]) {
//	    System.out.println(newPassword());
//	}
    
	public String newPassword() {
		Random randomizer = new Random();
	    
	    int[] tegnArray = new int[7];
	    tegnArray[0]=33; tegnArray[1]=43;
	    tegnArray[2]=45; tegnArray[3]=46;
	    tegnArray[4]=61; tegnArray[5]=63;
	    tegnArray[6]=95;
	    
	    char[] password = new char[9];
	    
	    for (int i=0; i<9; i++) {
	    	int k = (int) ((Math.random()*7)+1);
	    	if (k==1 || k==5)
	    		password[i] = (char) (randomizer.nextInt(26) + 'A');
	    	else if (k==2 || k==6)
	    		password[i] = (char) (randomizer.nextInt(26) + 'a');
	    	else if (k==3 || k==7 || k==4)
	    		password[i] = (char) (randomizer.nextInt(10) + '0');
	    	else if (k==8) {
	    		int p = (int) ((Math.random()*7));
	    		password[i] = (char) tegnArray[p];
	    	}
	    }
		
	    boolean stortBogstav=false, lilleBogstav=false, etTal=false, etTegn=false;
	    
	    for (int i=0; i<password.length; i++) {
	    	int x = password[i];
	    	if (x >= 65 && x <= 90)
	    		stortBogstav=true;
	    	else if (x >= 97 && x <= 122)
	    		lilleBogstav=true;
	    	else if (x >= 48 && x <= 57)
	    		etTal=true;
	    	else
	    		etTegn=true;
	    }
	    
	    String b = new String(password);
	    
	    if ((stortBogstav && lilleBogstav && etTal) || (stortBogstav && lilleBogstav && etTegn) || (stortBogstav && etTal && etTegn) || (lilleBogstav && etTal && etTegn))
			return b;
	    else
	    	return newPassword();
	}
}
