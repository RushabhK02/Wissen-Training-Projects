package chain_of_responsibility;

public class COR_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmSystem Atm = new StandardAtmSystem();
		System.out.println(Atm.generateChange(1950));
	}

}
