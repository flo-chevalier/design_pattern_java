package observer;

import java.util.List;
import java.util.stream.Collectors;

public class ObserveurMediane extends ObserveurEleve {

    public ObserveurMediane(final Eleve eleve) {
        this.eleve = eleve;
        this.eleve.ajouterObserveur(this);
    }

    @Override
    public void update() {
        final List<Double> listeTriee = eleve.getNotes().stream().sorted().collect(Collectors.toList());
        final int taille = listeTriee.size();
        double mediane = 0;

        if (estPaire(taille)) {
            final double noteGauche = listeTriee.get((taille / 2) - 1);
            final double noteDroite = listeTriee.get(taille / 2);
            mediane = (noteGauche + noteDroite) / 2;
        } else {
            mediane = listeTriee.get(taille / 2);
        }

        eleve.setMediane(mediane);
    }

    private boolean estPaire(final int entier) {
        return entier % 2 == 0;
    }
}
