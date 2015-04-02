

package personnel;


public class Subordonne extends Employe 
{
    
    public static final double primeSub = 100;
    
    public boolean aUnDirecteur;
    
    //Constructeur subordonné qui utilise le constructeur employe et l'implemente d'un booleen
    public Subordonne(String nom, String specialite, double salaire)
    {
        super(nom, specialite, salaire);// appel le constructeur employe
        aUnDirecteur=false;
    }
        
    @Override
   public double getPrime()             // surdefinition de getPrime employe
   {
       return primeSub;
   }
   
   public void chgtDirecteur()          // permet de passer aUnDirecteur de True à False et inversement.
   {
       aUnDirecteur = aUnDirecteur != true;
       
   }
   
   @Override
   public String toString()             // affichage du subordonne
   {
       //utilisation de super pour appeler toString d'employe
       return (super.toString() + "et son salaire est de " + salaire + " Euros\navec une prime de      " + primeSub + " Euros.\n");
   }
    
    
}
