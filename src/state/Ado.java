package state;

public class Ado implements EtatHumain {
    @Override
    public void action(final Humain humain) {
        System.out.println("L'ado devient adulte");
        humain.setEtat(new Adulte());
    }
}
