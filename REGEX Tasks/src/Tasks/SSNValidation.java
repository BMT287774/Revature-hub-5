package Tasks;

public class SSNValidation {
	public static void main(String[] args) {
		
		String SSN="100481738";
		if(SSN.matches("[0-9]{9}")) {
			System.out.println("Valid SSN Number");
		}else {
			System.out.println("Invalid SSN Number");
		}
	}

}
