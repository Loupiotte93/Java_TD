/**
 * Chat.java
 *
 * Auteur : M.RAMBURRUN
 *
 */
package animal;

public class Chat extends Animal {

    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void cri() {
        System.out.println(" : Miaulement");
    }
} //fin Chat

