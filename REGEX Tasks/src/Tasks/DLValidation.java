package Tasks;

public class DLValidation {
	public static void main(String[] args) {
		
		String DL="J-123-456-789-012";
		if(DL.matches("[A-Z]{1}-[0-9]{3}-[0-9]{3}-[0-9]{3}-[0-9]{3}")) {
			System.out.println("Valid Driver's License ");
		}else {
			System.out.println("Invalid Driver's License ");
		}
	}
	}


