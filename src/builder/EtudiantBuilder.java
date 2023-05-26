package builder;

/**
 * Design Pattern Builder permettant de construire un {@link Etudiant}.
 */
public class EtudiantBuilder {
    private final Etudiant etudiant;

    private EtudiantBuilder() {
        this.etudiant = new Etudiant();
    }

    public static EtudiantBuilder creerEtudiant() {
        return new EtudiantBuilder();
    }

    public EtudiantBuilder avecNom(final String nom) {
        etudiant.setNom(nom);
        return this;
    }

    public EtudiantBuilder avecPrenom(final String prenom) {
        etudiant.setPrenom(prenom);
        return this;
    }

    public EtudiantBuilder avecPromo(final String promo) {
        etudiant.setPromo(promo);
        return this;
    }

    public EtudiantBuilder avecAge(final int age) {
        etudiant.setAge(age);
        return this;
    }

    public Etudiant build() {
        return etudiant;
    }
}
