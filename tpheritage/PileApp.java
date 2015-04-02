

package tpheritage;
import java.util.*;

/**
 *
 * @author Phénix
 */
public class PileApp {
    public static void main(String[] args) 
    {
        Pile<Integer> p;
        p = new Pile<> ( new Integer[3] );
        Scanner s; 
        char reponse;
        s = new Scanner(System.in);
        int valeur;
        boolean ok;
        
        
        do
        {
            System.out.print("\n********************* GESTION DES PILES *******************\n\n"
                    + "Sélectionnez l'opération à réaliser : \n"
                    + "a : afficher les éléments de la pile\n"
                    + "e : empiler un élément au sommet de la pile\n"
                    + "d : dépiler un élément au sommet de la pile\n"
                    + "f : fin des opérations\n"
                    + "\tVotre choix : ");            
            
            reponse = s.nextLine().charAt(0);          
        
            switch(reponse)
            {
                case 'a':
                    System.out.print(p);
                    System.out.println("\nTapez sur ''Entrer'' pour continuer");
                    s.nextLine();
                    break;

                case 'e':
                    System.out.print("Veuillez entrer un entier à empiler : ");
                    do
                    {
                        try
                        {
                            ok = true;
                            valeur = s.nextInt();
                            p.empiler(valeur);
                        }
                        catch(InputMismatchException e)
                        {
                            ok = false;
                            System.out.print("Entrée invalide, merci de saisir un entier : ");
                        }
                        catch(Exception e)
                        {
                            ok = true;
                            System.out.print(e.getMessage());
                        }
                        s.nextLine();
                    }while (!ok);            
                 
                    System.out.println("\nTapez sur ''Entrer'' pour continuer");
                    s.nextLine();                    
                    break;

                case 'd':
                    try
                    {
                        p.depiler();
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("\nTapez sur ''Entrer'' pour continuer");
                    s.nextLine();
                    break;
                    
                case 'f':
                    System.out.println("************** FIN D'EXECUTION DU PROGRAMME ***********");
                    break;
                    
                default :
                    System.out.println("Commande incorrecte : Appuyez sur ''Entrer'' pour revenir au Menu");
                    s.nextLine();
                    break;
                    
            }
        }while(reponse != 'f');
    }    
}
    
    
    
    
    
    

