/**
 * Animal.java pour la gestion des animaux domestiques
 *
 * Auteur : M.RAMBURRUN
 *
 */
package animal;

// l'interface Comparable n'est pr�sente que parcequ'on veut
// illustrer le concept de tri d'un conteneur
public abstract class Animal implements Comparable<Animal> {

    protected String nom; // �ventuellement ddn, couleur, etc...

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() // acc�s au nom en dehors du package
    {
        return nom;
    }

    abstract void cri(); // m�thode abstraite (virtuelle en C++)

    @Override
    public int compareTo(Animal a) {
        return (this.nom.compareTo(a.nom));
    }

    @Override
    public String toString() {
        return nom; // peut �tre une cha�ne plus compl�te
    }
} //fin Animal

