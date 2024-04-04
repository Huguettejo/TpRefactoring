package iut.bad;
import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
    protected String nom;
    protected String prenom;
    protected int age;
    private List<Humain> amis;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.amis = new ArrayList<>();
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

    public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }
    public void afficherAmis() {
        System.out.println(nom + " a " + amis.size() + " ami(s).");
        for (Humain ami : amis) {
            System.out.println(ami.nom + " " + ami.prenom);
        }
    }
    public void ami(Humain humain) {
        if (humain != null && !this.amis.contains(humain)) {
            this.amis.add(humain);
            humain.amis.add(this); // Ajoute une amitié mutuelle
        }
    }
    
}
