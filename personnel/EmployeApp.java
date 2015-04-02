

package personnel;

import java.util.*;

public class EmployeApp {
    
    public static void main(String[] args) throws Exception
    {
        Scanner s;        
        s = new Scanner(System.in);
        ArrayList<Employe> personnel;
        personnel = new ArrayList<>();
        
        Directeur king, leroy;
        king = new Directeur ("KING","Directeur d'études", 7000.00, 1);
        personnel.add(king);
        leroy = new Directeur ("LEROY","Chef de Projet", 8000.00, 2);
        personnel.add(leroy);
        
        
        Subordonne dupont, durand, mathieu, martin;
        dupont = new Subordonne("DUPONT", "Ingénieur Conseil", 6000.00);
        personnel.add(dupont);
        durand = new Subordonne("DURAND", "Technicien de maintenance", 5000.00);
        personnel.add(durand);
        mathieu = new Subordonne("MATHIEU", "Web Master", 6500.00);
        personnel.add(mathieu);
        martin = new Subordonne("MARTIN", "Analyste", 6000.00);
        personnel.add(martin);
        
        
        //Tentative pour ajouter un subordonne à un directeur
        System.out.println("************ AJOUT D'UN SUBORDONNE ****************\n******** AVANT L'OPERATION *********\n" + king);
        try
        {
            king.ajouterSubordonne(dupont);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("******** APRES L'OPERATION *********\n" + king + "\nAppuyez sur ''ENTRER'' pour continuer ");
        s.nextLine();
        
        
        //Tentative pour retirer un subordonné à un directeur 
        System.out.println("************ RETRAIT D'UN SUBORDONNE ****************\n******** AVANT L'OPERATION *********\n" + king);
        try
        {
            king.retirerSubordonne(dupont);
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("******** APRES L'OPERATION *********\n" + king + "\nAppuyez sur ''ENTRER'' pour continuer ");
        s.nextLine();
        
        
        //Tentative pour retirer un subordonné à un directeur alors que le directeur en question ne compte aucun subordonne
        System.out.println("************ RETRAIT D'UN SUBORDONNE AVEC LISTE VIDE "
                + "****************\n******** AVANT L'OPERATION *********\n" + king);
        try
        {
            king.retirerSubordonne(dupont);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("******** APRES L'OPERATION *********\n" + king + "\nAppuyez sur ''ENTRER'' pour continuer ");
        s.nextLine();
        
        
        //Tentative pour ajouter un subordonné à un directeur
        System.out.println("************ AJOUT D'UN SUBORDONNE(1ere étape de l'exception suivante) "
                + "****************\n******** AVANT L'OPERATION *********\n" + king);
        try
        {
            king.ajouterSubordonne(dupont);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("******** APRES L'OPERATION *********\n" + king + "\nAppuyez sur ''ENTRER'' pour continuer ");
        s.nextLine();
        
        //Tentative pour ajouter un subordonné déjà assigné à ce directeur
        System.out.println("************ AJOUT D'UN SUBORDONNE DEJA ASSIGNE A CE DIRECTEUR"
                + "****************\n******** AVANT L'OPERATION *********\n" + king);
        try
        {
            king.ajouterSubordonne(dupont);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("******** APRES L'OPERATION *********\n" + king + "\nAppuyez sur ''ENTRER'' pour continuer ");
        s.nextLine();
        
        //Tentative pour ajouter un subordonné à un directeur
        System.out.println("************ AJOUT D'UN SUBORDONNE (1ere étape de l'exception suivante) "
                + "****************\n******** AVANT L'OPERATION *********\n" + king);
        try
        {
            king.ajouterSubordonne(durand);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("******** APRES L'OPERATION *********\n" + king + "\nAppuyez sur ''ENTRER'' pour continuer ");
        s.nextLine();
              
        
        // tentative d'ajout d'un Subordonne alors qu'il a déjà un directeur
        System.out.println("************ AJOUT D'UN SUBORDONNE DEJA ASSIGNE A UN AUTRE DIRECTEUR "
                + "****************\n******** AVANT L'OPERATION *********\n" + king);
        try
        {
            leroy.ajouterSubordonne(durand);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("******** APRES L'OPERATION *********\n" + king + "\nAppuyez sur ''ENTRER'' pour continuer ");
        s.nextLine();
        
        System.out.println("\n\n\n************** AFFICHAGE INTEGRAL DU PERSONNEL **************"
                + "\nAppuyez sur ''ENTRER'' pour continuer \n");
        s.nextLine();        
        for(int i =0; i < personnel.size();i++)
        {
            System.out.print(personnel.get(i) + "\nAppuyez sur ''ENTRER'' pour continuer \n");
            s.nextLine();
            
        }       
       
       System.out.println("********************** FIN D'EXECUTION DU PROGRAMME, MERCI D'AVOIR JOUE **********************");       
    }
    
}
