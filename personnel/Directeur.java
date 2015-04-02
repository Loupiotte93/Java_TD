

package personnel;

import java.util.*;


public class Directeur extends Employe {
    
    public final static double PRIMEPARSUB = 500;    
    public int numeroDept;
    ArrayList<Subordonne> sesSubordonnes;  // creation d'un tableau pour classer les subordonnées de chaque directeur
    
    /* constructeur de directeur qui utilise le constructructeur employe, et construit des variables propres*/
    public Directeur(String nom, String specialite, double salaire, int numeroDept)
    {
        super(nom, specialite, salaire);        
        this.numeroDept = numeroDept;  
        sesSubordonnes = new ArrayList<>();
    }
    
    
    @Override
    public double getPrime()                // surdefinition de getprime employe
    {
        return PRIMEPARSUB * sesSubordonnes.size();
    }
    
    public void ajouterSubordonne(Subordonne s) throws Exception
    {
               
            
            if(!sesSubordonnes.contains(s))  // verifie que le subordonne n'est pas dans la liste du directeur
            {
                if(!s.aUnDirecteur)         // test si s a un directeur. 
                {                   
                    sesSubordonnes.add(s);  //s'il n'en a pas, on peut l'ajouter au tableau sesSubordonnes, 
                    s.chgtDirecteur();      //et on passe le booléen aUnDirecteur à True
                }
                else
                {
                    throw new Exception("Cet employé est déjà assigné à un autre directeur !\n");
                                            // s'il est déjà dans la liste d'un autre directeur, on propage l'exception
                }           
            }
            else
            {
                throw new Exception("Cet employé existe déjà !\n");
                                            // s'il est déjà dans cette liste, on propage l'exception
            }       
        }
       
         
    
    
    public void retirerSubordonne(Subordonne s) throws Exception
    {
        
        if (!sesSubordonnes.isEmpty())       //verifie que le tableau n'est pas vide
        {
                   
            if ( sesSubordonnes.contains(s)) // verifie que s est bien un subordonne
            {
                sesSubordonnes.remove(s);    // retire le subordonné du tableau sesSubordonnes
                s.chgtDirecteur();           // passe aUnDirecteur de True à False    
            }
            else
            {
                throw new Exception("Cet employé n'est pas assigné à ce directeur !\n");
                                            // on propage l'erreur quand il n'existe pas dans cette liste de subordonnés
            }       
        }
        else
        {
            throw new Exception("Ce directeur ne dispose d'aucun subordonne, impossible d'en retirer !\n");
                                            // on propage l'erreur car aucun subordonné
        }
         
    }
    
    @Override
    public String toString()                //affichage
    {
        return ("Le Directeur se nomme " + nom + ", sa spécialité est "
                + specialite + ".\nIl est reponsable du département num. " + numeroDept + " avec " + sesSubordonnes.size()
                + " employé(s) sous sa responsabilité. \nSon salaire est de " + salaire + " Euros\navec une prime de     "
                + getPrime() + " Euro(s).\n");
    }
    
}
