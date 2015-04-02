/*tp M.LESTAEVEL et S.CALVIGNAC
 */

package personnel;

/*
creation classe abstraite personnel classe mère de Directeur et Subordonne
 */
public abstract class Employe {

    protected String nom;
    protected String specialite;
    protected double salaire;
    
    public Employe(String nom, String specialite, double salaire)// constructeur 
    {
        this.nom = nom;
        this.specialite= specialite;
        this.salaire = salaire;
    }
    
    abstract double getPrime();// fonction getPrime surdefinie dans Directeur et Subordonne
    
    @Override
    public String toString()
    {
        return ("-->L'employé se nomme " + nom + ", sa spécialité est "
                + specialite + "\n");
    }  
    
}
