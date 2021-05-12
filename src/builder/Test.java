package builder;

public class Test {

    public static void main(String[] args) {
        Etudiant etudiant = EtudiantBuilder.creerEtudiant()
                                           .avecPrenom("Bob")
                                           .avecNom("Dylan")
                                           .avecAge(23)
                                           .avecPromo("DUT AS")
                                           .build();

        System.out.println(etudiant);
    }
}
