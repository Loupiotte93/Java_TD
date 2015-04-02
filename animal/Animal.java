/**
 * Animal.java pour la gestion des animaux domestiques
 *
 * Auteur : M.RAMBURRUN
 *
 */
package animal;

// l'interface Comparable n'est présente que parcequ'on veut
// illustrer le concept de tri d'un conteneur
public abstract class Animal implements Comparable<Animal> {

    protected String nom; // éventuellement ddn, couleur, etc...

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() // accès au nom en dehors du package
    {
        return nom;
    }

    abstract void cri(); // méthode abstraite (virtuelle en C++)

    @Override
    public int compareTo(Animal a) {
        return (this.nom.compareTo(a.nom));
    }

    @Override
    public String toString() {
        return nom; // peut être une chaîne plus complète
    }
} //fin Animal

