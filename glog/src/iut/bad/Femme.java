package iut.bad;

public class Femme extends Humain {
   
    private String nom;
    private String prenom;
    private int age;
    
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
 
  
    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }

    
    public static void main(String[] args) {
        Homme homme = new Homme("Dupont", "Jean", 30);
        homme.afficherInfos();
    }
}
