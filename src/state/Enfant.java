package state;

public class Enfant implements EtatHumain {
    @Override
    public void action(final Humain humain) {
        System.out.println("L'enfant devient ado");
        humain.setEtat(new Ado());
    }
}
