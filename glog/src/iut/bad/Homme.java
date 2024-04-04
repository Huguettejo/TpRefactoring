package iut.bad;

public class Homme {
    // Champs de la classe
    private String nom;
    private String prenom;
    private int age;

    // Constructeur sans paramètre
    public Homme() {
        // Initialisation avec des valeurs par défaut
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }

    // Constructeur avec tous les paramètres
    public Homme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Méthodes getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    // Méthodes setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Méthode pour afficher les infos de l'Homme
    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }

    // Point d'entrée pour tester la classe
    public static void main(String[] args) {
        Homme homme = new Homme("Dupont", "Jean", 30);
        homme.afficherInfos();
    }
}
