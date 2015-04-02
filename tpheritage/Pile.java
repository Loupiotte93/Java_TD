/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpheritage;



/**
 *
 * @author Phénix
 * @param <T>
 */
public class Pile<T> 
{
    protected T []pile;
    protected int sommet;
    
    public Pile(T [] pile) //constructeur de la pile
    {
        this.pile = pile;
        sommet = -1; 
    }
    public void empiler(T valeur) throws Exception //fonction servant à empiler un élément passé en paramètre
    {
        if(sommet + 1 < pile.length) // vérification que la pile n'est pas pleine
        {
            System.out.print("*************** Etat avant l'empilage ***********************\n" + toString());
            sommet++;
            pile[sommet]= valeur; 
            System.out.print("*************** Etat après l'empilage ***********************\n" + toString());
            
        }
        else
        {
            throw new Exception("La Pile est pleine, impossible d'empiler davatange\n");  //Pile pleine, gestion de l'exception 
            
        }
        
    }
    public T depiler() throws Exception
    {
        if (sommet == -1) //vérification que la pile n'est pas vide
        {
            throw new Exception("Pile vide, impossible de dépiler\n");
            // si la pile est vide, gestion de l'exception
        }
        else
        {
            T valeur;
            valeur = pile[sommet];
            System.out.print("*************** Etat avant le dépilage ***********************\n" + toString());            
            sommet--; // le sommet est décrémenté puisque la donnée est sensée être retirée de la pile
            System.out.print("*************** Etat après le dépilage ***********************\n" + toString());
            System.out.println("Valeur depilée : " + valeur +"\n"); // affichage de la valeur dépilée
            return valeur; // la fonction retourne la valeur dépilée afin qu'elle soit exploitée
        }
        
    }
    public boolean isEmpty() // fonction permettant de controle si la pile est vide ou non
    {
        if(sommet == -1){return true;}
        else {return false;}
    }
    
    public int size() // retourne comme valeur la taille de la pile, soit le nombre d'éléments qu'elle contient
    {
        return sommet + 1;
    }
      
    @Override
    public String toString() //redéfinition de la sortie selon les besoins d'une pile
    {
        if (sommet == -1) //vérification si la pile est vide ou non
        {
            return("La pile est vide, aucune donnée à afficher\n"); 
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
            return("La pile contient : \n"+ phrase + "\n");
        }
        
    }

        
    
    
}
