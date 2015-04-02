package exo1;

import java.util.Scanner;

public class VoyageReduit extends Voyage {

	public VoyageReduit()
	{
		super();
		tauxPromotion = new ReelContraint(0.00f,0.99f);
	}
	
	
	
	public void saisirVoyage()
	{
		super.saisirVoyage();
		System.out.println("Saisir la valeur de la réduction");
		Scanner sc = new Scanner(System.in);
		n = sc.nextFloat();
		
	}
	
	
	
	ReelContraint tauxPromotion;
}
