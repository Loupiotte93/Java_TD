/**
 * Chien.java
 *
 * Auteur : M.RAMBURRUN
 *
 */
package animal;

public class Chien extends Animal {

    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void cri() {
        System.out.println(" : Aboiement");
    }
} //fin Chien

