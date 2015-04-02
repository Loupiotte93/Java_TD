/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpheritage;

import java.util.*;

/**
 *
 * @author Phénix
 */
public class FileDAtteneApp {
    
    public static void main(String[] args)
    {
        FileDAttente<Integer> f;                
        f = new FileDAttente<> ( new Integer[3] );        
        Scanner s;         
        s = new Scanner(System.in);
        char reponse;
        int valeur;
        boolean ok;
        
        
        do
        {
            System.out.print("\n********************* GESTION DES FILES D'ATTENTE *******************\n\n"
                    + "Sélectionnez l'opération à réaliser : \n"
                    + "a : afficher les éléments de la file d'attente\n"
                    + "e : empiler un élément en fin de la file d'attente\n"
                    + "d : dépiler un élément en tête de la pile\n"
                    + "f : fin des opérations\n"
                    + "\tVotre choix : ");            
            
            reponse = s.nextLine().charAt(0);          
        
            switch(reponse)
            {
                case 'a':
                    System.out.print(f);
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
                            f.empiler(valeur);
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
                        f.depiler();
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("\nTapez sur ''Entrer'' pour continuer");
                    s.nextLine();
                    break;
                    
                case 'f':
                    System.out.print("************** FIN D'EXECUTION DE LA FILE ***********");
                    break;
                    
                default :
                    System.out.println("Commande incorrecte : Appuyez sur ''Entrer'' pour revenir au Menu");
                    s.nextLine();
                    break;
                    
            }
        }while(reponse != 'f');
    }
}
