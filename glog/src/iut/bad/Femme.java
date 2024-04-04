package iut.bad;

public class Femme {
   
    private String nom;
    private String prenom;
    private int age;

   
    public Femme() {
        
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

  
    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

   
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

   
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

  
    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }

    
    public static void main(String[] args) {
        Homme homme = new Homme("Dupont", "Jean", 30);
        homme.afficherInfos();
    }
}
