package iut.bad;
import java.util.HashMap;
import java.util.Map;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;
    private Map<Humain, Integer> amis = new HashMap<>(); 
    
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }
    
    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }
    
    public void ami(Humain humain, int dureeJours) {
        if (humain != null && !this.amis.containsKey(humain)) {
            this.amis.put(humain, dureeJours);
            humain.amis.put(this, dureeJours);  
        }
    }

    
    public void ami(Humain humain) {
        this.ami(humain, 100); 
    }

    public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }

    // Méthode adaptée pour afficher les amis et la durée de l'amitié à partir d'une Map
    public void afficherAmis() {
        System.out.println(nom + " a " + amis.size() + " ami(s).");
        for (Map.Entry<Humain, Integer> entry : amis.entrySet()) {
            Humain ami = entry.getKey();
            Integer duree = entry.getValue();
            System.out.println(ami.nom + " " + ami.prenom + " depuis " + duree + " jours");
        }
    }
}
