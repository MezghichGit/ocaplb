package chapter4.part1;

public class CompteBancaire {
	
	int id;
	private double solde;  // solde <-1000;
	
	public void debiter(double montant)
	{
		this.solde -=montant;
		// this.solde = this.solde - montant;
	}

	public int getId() {
		return id;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		if(solde <-1000)
		{
			System.out.println("Valeur invalide, vous n'avez pas le droit !!!");
		    return;
		}
		else
		{
			this.solde = solde;
			System.out.println("Mise à jour avec succès");
		}
		
	}

}
