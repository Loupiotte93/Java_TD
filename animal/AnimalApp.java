/**
 * AnimalApp.java
 *
 * Auteur : M.RAMBURRUN
 *
 */
package animal;

public class AnimalApp {

    public static void main(String[] args) {
        Animal[] menagerie = {
            new Chat("Poueet"),
            new Chien("Snoopy"),
            new Oiseau("Piaf")
        };

        for (Animal a : menagerie) // pour chaque animal a de la menagerie
        {
            System.out.printf("Cri de %-10s", a);
            if (a instanceof Chat) {
                System.out.printf("%-10s", "(Chat)");
            } else if (a instanceof Chien) {
                System.out.printf("%-10s", "(Chien)");
            } else if (a instanceof Oiseau) {
                System.out.printf("%-10s", "(Oiseau)");
            }
            a.cri();
        }

        /* AUTRE SOLUTION en utilisant un indice classique
         Animal a=null; //a:référence sur Animal servant de variable de travail
         for(int i=0; i < menagerie.length;i++)
         {
         a = menagerie[i];
         System.out.printf("Cri de %-10s",a);
         if ( a instanceof Chat ) System.out.printf("%-10s","(Chat)");
         else if ( a instanceof Chien ) System.out.printf("%-10s","(Chien)");
         else if (a instanceof Oiseau ) System.out.printf("%-10s","(Oiseau)");
         a.cri();
         }
         */
    }// fin main
}//fin AnimalApp

