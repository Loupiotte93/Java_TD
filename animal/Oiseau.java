/**
 * Oiseau.java
 *
 * Auteur : M.RAMBURRUN
 *
 */
package animal;

public class Oiseau extends Animal {

    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void cri() {
        System.out.println(" : Gazouillement");
    }
} //fin Oiseau

