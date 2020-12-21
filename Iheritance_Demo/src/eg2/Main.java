package eg2;

public class Main {

	public static void main(String[] args) {
	
		Project p1=new Project(9000, "Abc Corp", "Abc Corp Some Client");
		
		Address a1=new Address(23,"405 churchill lane", "Hoboken, New Jersey", 07030); //permanent address
		Address a2=new Address(40, "208 Tex Street", "Austin, Texas", 73301); //present address
		
		Employee e1=new Employee(100, "Sachin", "Manager", 23333.44, p1, a1, a2 );
		System.out.println("e1");
		System.out.println(e1);
		
		Employee e2=new Employee(101, "Richard", "Associate", 2000.33,p1, a1 , a2 );
		System.out.println("e2");
		System.out.println(e2);
		
		Project p2=new Project(9001, "SMS", "Revature");
		Employee e3=new Employee(102, "Tushar", "Manager", 33000.33, p2, a1, a2);
		System.out.println("e3");
		System.out.println(e3);
		
		Team t1 =new Team(27, "Eagles", "Doug Pederson");
		Player plr1= new Player(11, "Carson Wentz", 36, t1);
		System.out.println("t1");
		System.out.println(t1);
		System.out.println("plr1");
		System.out.println(plr1);
		
		
		
		

	}

} //Complete Address, Player and Team
