/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpheritage;



/**
 *
 * @author Phenix
 * @param <T>
 */
public class FileDAttente<T> extends Pile<T>
{
   public FileDAttente(T [] pile) //constructeur de la file
    {
        super(pile);
        
    }
    
    @Override
     public void empiler(T valeur) throws Exception //fonction servant à empiler un élément passé en paramètre
    {
        if(sommet + 1 < pile.length) // vérification que la file n'est pas pleine
        {
            System.out.print("*************** Etat avant le placement en file d'attente ***********************\n" + toString());          
            sommet++;            
            pile[sommet]= valeur;
            System.out.print("*************** Etat après le placement en file d'attente ***********************\n" + toString());
            
        }
        else
        {
            throw new Exception("La File est pleine, impossible d'empiler davatange\n"); //File pleine, gestion de l'exception
        }
    }
        
    /**
     *
     * @return
     * @throws Exception
     */
    @Override
     public T depiler() throws Exception
    {
        if (sommet == -1) //vérification que la file n'est pas vide
        {
            throw new Exception("File vide, impossible de dépiler\n"); // si la file est vide, gestion de l'exception
        }
        else
        {
            T valeur;
            valeur = pile[0];
            System.out.print("*************** Etat avant le dépilage ***********************\n" + toString());            
            for(int i = 1; i <= sommet; i++)
            {
                pile[i-1] = pile[i];
            }
            sommet--;
            System.out.print("*************** Etat après le dépilage ***********************\n" + toString());
            System.out.println("Valeur depilée " + valeur +"\n");
            return valeur; // la fonction retourne la valeur dépilée afin qu'elle soit exploitée
        }
    }       
    
     @Override
    public String toString() 
    {
        if (sommet == -1)
        {
            return("La file est vide, aucune donnée à afficher\n");
        }
        else
        {
            String phrase;
            phrase = "";
            int i;           
            for (i = 0; i <= sommet; i++)
            {
                phrase = phrase + pile[i] + "    ";
            }
            return("La file contient : \n"+ phrase + "\n");
        }
    }
    
}
