package observer;

public class ObserveurMoyenne extends ObserveurEleve {

    public ObserveurMoyenne(final Eleve eleve) {
        this.eleve = eleve;
        this.eleve.ajouterObserveur(this);
    }

    @Override
    public void update() {
        final double total = eleve.getNotes().stream().reduce(0d, Double::sum);
        final double moyenne = total / eleve.getNotes().size();

        eleve.setMoyenne(moyenne);
    }
}
