package observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Classe Eleve.
 */
public class Eleve {
    private final Set<ObserveurEleve> observeurs;
    private final List<Double> notes;
    private double moyenne;
    private double mediane;

    public Eleve() {
        observeurs = new HashSet<>();
        notes = new ArrayList<>();
    }

    public List<Double> getNotes() {
        return notes;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(final double moyenne) {
        this.moyenne = moyenne;
    }

    public double getMediane() {
        return mediane;
    }

    public void setMediane(final double mediane) {
        this.mediane = mediane;
    }

    public void ajouterNote(final double nouvelleNote) {
        notes.add(nouvelleNote);
        notifierObserveurs();
    }

    public void ajouterObserveur(final ObserveurEleve observeur) {
        observeurs.add(observeur);
    }

    private void notifierObserveurs() {
        observeurs.forEach(ObserveurEleve::update);
    }
}
