package observer;

public class Test {

    public static void main(String[] args) {
        final Eleve eleve = new Eleve();

        new ObserveurMediane(eleve);
        new ObserveurMoyenne(eleve);

        System.out.println("\nAjout note 1");
        eleve.ajouterNote(13.0d);
        System.out.println("la moyenne est de : " + eleve.getMoyenne());
        System.out.println("la médiane est de : " + eleve.getMediane());

        System.out.println("\nAjout note 2");
        eleve.ajouterNote(8.0d);
        System.out.println("la moyenne est de : " + eleve.getMoyenne());
        System.out.println("la médiane est de : " + eleve.getMediane());

        System.out.println("\nAjout note 3");
        eleve.ajouterNote(11.0d);
        System.out.println("la moyenne est de : " + eleve.getMoyenne());
        System.out.println("la médiane est de : " + eleve.getMediane());

        System.out.println("\nAjout note 4");
        eleve.ajouterNote(17.0d);
        System.out.println("la moyenne est de : " + eleve.getMoyenne());
        System.out.println("la médiane est de : " + eleve.getMediane());

        System.out.println("\nAjout note 5");
        eleve.ajouterNote(7.0d);
        System.out.println("la moyenne est de : " + eleve.getMoyenne());
        System.out.println("la médiane est de : " + eleve.getMediane());
    }
}
