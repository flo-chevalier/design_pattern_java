package state;

public class Humain {
    private EtatHumain etat;

    public Humain() {
        this.etat = new Bebe();
    }

    public EtatHumain getEtat() {
        return etat;
    }

    public void setEtat(final EtatHumain etat) {
        this.etat = etat;
    }

    public void vieillir() throws Exception {
        etat.action(this);
    }
}
