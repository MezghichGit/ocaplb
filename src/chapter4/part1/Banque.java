package chapter4.part1;

public class Banque {

	public static void main(String[] args) {

		CompteBancaire cb = new CompteBancaire();
		//cb.solde = -2000;
		cb.setSolde(200);
		System.out.println(cb.getSolde());

	}

}
