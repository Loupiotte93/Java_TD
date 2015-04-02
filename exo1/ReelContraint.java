package exo1;

import java.util.Scanner;

public class ReelContraint
{

	public float n;
	
	ReelContraint (float bornesup, float borneinf)
	{
		System.out.println("Valeur de la réduction (entre "+borneinf+" et "+bornesup+ " : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextFloat();
	}
	
	
}
