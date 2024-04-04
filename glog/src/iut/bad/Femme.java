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
        Homme homme = new Homme("Jean", "Dupont", 30);
        Femme femme = new Femme("Marie", "Curie", 28);

        homme.ami(femme); 

       
        homme.afficherAmis();
        femme.afficherAmis(); 
    }
}
