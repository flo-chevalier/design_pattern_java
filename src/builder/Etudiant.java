package builder;

public class Etudiant {
    private String nom;
    private String prenom;
    private String promo;
    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(final String promo) {
        this.promo = promo;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", promo='" + promo + '\'' +
                ", age=" + age +
                '}';
    }
}
