package state;

public class Adulte implements EtatHumain {
    @Override
    public void action(final Humain humain) {
        System.out.println("L'adulte devient sénior");
        humain.setEtat(new Senior());
    }
}
