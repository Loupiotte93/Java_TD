/**
 * AnimalApp2.java utilisant un conteneur de type ArrayList qu'on va trier
 * suivant le critère défini dans la méthode compareTo de l'interface Comparable
 *
 * Auteur : M.RAMBURRUN
 *
 */
package animal;

public class AnimalApp2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        java.util.ArrayList<Animal> menagerie;
        menagerie = new java.util.ArrayList<>();

        menagerie.add(new Chat("Poueet"));
        menagerie.add(new Chien("Snoopy"));
        menagerie.add(new Oiseau("Piaf"));

        java.util.Collections.sort(menagerie);// résultat du tri dans menagerie

        System.out.println("APRES TRI suivant les noms des animaux :\n");

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

        /* AUTRE SOLUTION en passant par un itérateur
         java.util.Iterator<Animal> i = menagerie.iterator(); 
         // définition d'un itérateur
         Animal a = null; 
         // a : référence sur Animal servant de variable de travail
         while ( i.hasNext() )
         {
         a = i.next(); // a : animal couramment référencé par  i
         System.out.printf("Cri de %-10s",a);
         if ( a instanceof Chat ) System.out.printf("%-10s","(Chat)");
         else if ( a instanceof Chien ) System.out.printf("%-10s","(Chien)");
         else if (a instanceof Oiseau ) System.out.printf("%-10s","(Oiseau)");
         a.cri();
         }
         */

        /* AUTRE SOLUTION en utilisant un indice classique
         Animal a = null; 
         // a : référence sur Animal servant de variable de travail
         for( int j=0; j < menagerie.size(); j++ )
         {
         a = menagerie.get(j);
         System.out.printf("Cri de %-10s",a);
         if ( a instanceof Chat ) System.out.printf("%-10s","(Chat)");
         else if ( a instanceof Chien ) System.out.printf("%-10s","(Chien)");
         else if (a instanceof Oiseau ) System.out.printf("%-10s","(Oiseau)");
         a.cri();
         }
         */

    }// fin main
}//fin AnimalApp2
